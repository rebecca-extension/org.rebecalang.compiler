//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.05.29 at 10:12:22 PM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockStatement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Statement">
 *       &lt;sequence>
 *         &lt;element name="statements" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Statement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="endLineNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="endCharacter" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockStatement", propOrder = {
    "statements"
})
public class BlockStatement
    extends Statement
{

    protected List<Statement> statements;
    @XmlAttribute(name = "endLineNumber")
    protected Integer endLineNumber;
    @XmlAttribute(name = "endCharacter")
    protected Integer endCharacter;

    /**
     * Gets the value of the statements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Statement }
     * 
     * 
     */
    public List<Statement> getStatements() {
        if (statements == null) {
            statements = new ArrayList<Statement>();
        }
        return this.statements;
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
