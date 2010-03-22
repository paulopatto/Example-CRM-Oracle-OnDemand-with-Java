
package servicos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MisspelledWord" type="{http://ws.cdyne.com/}Words" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MisspelledWordCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentSummary", propOrder = {
    "misspelledWord",
    "ver",
    "body",
    "misspelledWordCount"
})
public class DocumentSummary {

    @XmlElement(name = "MisspelledWord")
    protected List<Words> misspelledWord;
    protected String ver;
    protected String body;
    @XmlElement(name = "MisspelledWordCount")
    protected int misspelledWordCount;

    /**
     * Gets the value of the misspelledWord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the misspelledWord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMisspelledWord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Words }
     * 
     * 
     */
    public List<Words> getMisspelledWord() {
        if (misspelledWord == null) {
            misspelledWord = new ArrayList<Words>();
        }
        return this.misspelledWord;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        return ver;
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the misspelledWordCount property.
     * 
     */
    public int getMisspelledWordCount() {
        return misspelledWordCount;
    }

    /**
     * Sets the value of the misspelledWordCount property.
     * 
     */
    public void setMisspelledWordCount(int value) {
        this.misspelledWordCount = value;
    }

}
