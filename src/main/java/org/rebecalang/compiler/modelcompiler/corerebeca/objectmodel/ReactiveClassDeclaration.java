//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.03 at 05:55:03 PM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="knownRebecs" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}FieldDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="statevars" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}FieldDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="constructors" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}ConstructorDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="msgsrvs" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}MsgsrvDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="synchMethods" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}SynchMethodDeclaration" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="annotations" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="queueSize" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="character" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="endLineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="endCharacter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "knownRebecs",
    "statevars",
    "constructors",
    "msgsrvs",
    "synchMethods",
    "annotations"
})
@XmlRootElement(name = "ReactiveClassDeclaration")
public class ReactiveClassDeclaration {

    protected List<FieldDeclaration> knownRebecs;
    protected List<FieldDeclaration> statevars;
    protected List<ConstructorDeclaration> constructors;
    protected List<MsgsrvDeclaration> msgsrvs;
    protected List<SynchMethodDeclaration> synchMethods;
    protected List<Annotation> annotations;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "queueSize")
    protected Integer queueSize;
    @XmlAttribute(name = "lineNumber")
    protected Integer lineNumber;
    @XmlAttribute(name = "character")
    protected Integer character;
    @XmlAttribute(name = "endLineNumber")
    protected Integer endLineNumber;
    @XmlAttribute(name = "endCharacter")
    protected Integer endCharacter;

    /**
     * Gets the value of the knownRebecs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownRebecs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownRebecs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDeclaration }
     * 
     * 
     */
    public List<FieldDeclaration> getKnownRebecs() {
        if (knownRebecs == null) {
            knownRebecs = new ArrayList<FieldDeclaration>();
        }
        return this.knownRebecs;
    }

    /**
     * Gets the value of the statevars property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statevars property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatevars().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldDeclaration }
     * 
     * 
     */
    public List<FieldDeclaration> getStatevars() {
        if (statevars == null) {
            statevars = new ArrayList<FieldDeclaration>();
        }
        return this.statevars;
    }

    /**
     * Gets the value of the constructors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the constructors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConstructors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConstructorDeclaration }
     * 
     * 
     */
    public List<ConstructorDeclaration> getConstructors() {
        if (constructors == null) {
            constructors = new ArrayList<ConstructorDeclaration>();
        }
        return this.constructors;
    }

    /**
     * Gets the value of the msgsrvs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the msgsrvs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgsrvs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MsgsrvDeclaration }
     * 
     * 
     */
    public List<MsgsrvDeclaration> getMsgsrvs() {
        if (msgsrvs == null) {
            msgsrvs = new ArrayList<MsgsrvDeclaration>();
        }
        return this.msgsrvs;
    }

    /**
     * Gets the value of the synchMethods property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchMethods property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchMethods().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SynchMethodDeclaration }
     * 
     * 
     */
    public List<SynchMethodDeclaration> getSynchMethods() {
        if (synchMethods == null) {
            synchMethods = new ArrayList<SynchMethodDeclaration>();
        }
        return this.synchMethods;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * 
     * 
     */
    public List<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<Annotation>();
        }
        return this.annotations;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the queueSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQueueSize() {
        return queueSize;
    }

    /**
     * Sets the value of the queueSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQueueSize(Integer value) {
        this.queueSize = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineNumber(Integer value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the character property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCharacter() {
        return character;
    }

    /**
     * Sets the value of the character property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCharacter(Integer value) {
        this.character = value;
    }

    /**
     * Gets the value of the endLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndLineNumber() {
        return endLineNumber;
    }

    /**
     * Sets the value of the endLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndLineNumber(Integer value) {
        this.endLineNumber = value;
    }

    /**
     * Gets the value of the endCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndCharacter() {
        return endCharacter;
    }

    /**
     * Sets the value of the endCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndCharacter(Integer value) {
        this.endCharacter = value;
    }

}
