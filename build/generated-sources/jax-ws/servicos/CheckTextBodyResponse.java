
package servicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentSummary" type="{http://ws.cdyne.com/}DocumentSummary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentSummary"
})
@XmlRootElement(name = "CheckTextBodyResponse")
public class CheckTextBodyResponse {

    @XmlElement(name = "DocumentSummary", required = true, nillable = true)
    protected DocumentSummary documentSummary;

    /**
     * Gets the value of the documentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSummary }
     *     
     */
    public DocumentSummary getDocumentSummary() {
        return documentSummary;
    }

    /**
     * Sets the value of the documentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSummary }
     *     
     */
    public void setDocumentSummary(DocumentSummary value) {
        this.documentSummary = value;
    }

}
