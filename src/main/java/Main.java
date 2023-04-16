import com.github.javaparser.ParseResult;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.SourceRoot;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.hibernate.mappings.HbmHibernateMapping;
import org.hibernate.mappings.visitor.HbmNodeVisitor;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, JAXBException, XMLStreamException {
        // SourceRoot is a tool that read and writes Java files from packages on a certain root directory.
        // In this case the root directory is found by taking the root from the current Maven module,
        // with src/main/resources appended.
        SourceRoot sourceRoot = new SourceRoot(CodeGenerationUtils.mavenModuleRoot(Main.class).resolve("src/main/resources/java"));

        List<ParseResult<CompilationUnit>> compilUnitResults =  sourceRoot.tryToParse("org.hibernate.orm.test.jcache.domain");

        XMLInputFactory xif = XMLInputFactory.newFactory();
        xif.setProperty(XMLInputFactory.SUPPORT_DTD, false);
        XMLStreamReader xsr = xif.createXMLStreamReader(new InputStreamReader(Main.class.getClassLoader().getResourceAsStream("hbm/xml/Person.hbm.xml")));

        JAXBContext jaxbContext = JAXBContext.newInstance( HbmHibernateMapping.class );
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

//Overloaded methods to unmarshal from different xml sources
        HbmHibernateMapping hbmMapping = (HbmHibernateMapping) jaxbUnmarshaller.unmarshal(xsr);
        // Our sample is in the root of this directory, so no package name.
        CompilationUnit cu = sourceRoot.parse("org.hibernate.orm.test.jcache.domain", "Person.java");
//        for (ParseResult<CompilationUnit> parseResult : compilUnitResults) {
//            CompilationUnit cu = parseResult.getResult().get();
            HbmNodeVisitor visitor = new HbmNodeVisitor(cu);
            visitor.visit(hbmMapping);
//        }


        // This saves all the files we just read to an output directory.
        sourceRoot.saveAll(
                // The path of the Maven module/project which contains the LogicPositivizer class.
                CodeGenerationUtils.mavenModuleRoot(Main.class)
                        // appended with a path to "output"
                        .resolve(Paths.get("output")));
    }
}
