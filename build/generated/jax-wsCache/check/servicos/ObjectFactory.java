
package servicos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DocumentSummary_QNAME = new QName("http://ws.cdyne.com/", "DocumentSummary");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Words }
     * 
     */
    public Words createWords() {
        return new Words();
    }

    /**
     * Create an instance of {@link CheckTextBodyV2 }
     * 
     */
    public CheckTextBodyV2 createCheckTextBodyV2() {
        return new CheckTextBodyV2();
    }

    /**
     * Create an instance of {@link CheckTextBodyResponse }
     * 
     */
    public CheckTextBodyResponse createCheckTextBodyResponse() {
        return new CheckTextBodyResponse();
    }

    /**
     * Create an instance of {@link CheckTextBodyV2Response }
     * 
     */
    public CheckTextBodyV2Response createCheckTextBodyV2Response() {
        return new CheckTextBodyV2Response();
    }

    /**
     * Create an instance of {@link CheckTextBody }
     * 
     */
    public CheckTextBody createCheckTextBody() {
        return new CheckTextBody();
    }

    /**
     * Create an instance of {@link DocumentSummary }
     * 
     */
    public DocumentSummary createDocumentSummary() {
        return new DocumentSummary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentSummary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cdyne.com/", name = "DocumentSummary")
    public JAXBElement<DocumentSummary> createDocumentSummary(DocumentSummary value) {
        return new JAXBElement<DocumentSummary>(_DocumentSummary_QNAME, DocumentSummary.class, null, value);
    }

}
