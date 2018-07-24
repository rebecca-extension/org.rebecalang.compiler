//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.24 at 04:06:05 PM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FieldDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FieldDeclaration">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Statement">
 *       &lt;sequence>
 *         &lt;element name="variableDeclarators" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}VariableDeclarator" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Type"/>
 *         &lt;element name="accessModifier" type="{http://rebecalang.org/compiler/modelcompiler/corerebeca}AccessModifier"/>
 *         &lt;element name="annotations" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Annotation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldDeclaration", propOrder = {
    "variableDeclarators",
    "type",
    "accessModifier",
    "annotations"
})
public class FieldDeclaration
    extends Statement
{

    protected List<VariableDeclarator> variableDeclarators;
    @XmlElement(required = true)
    protected Type type;
    @XmlElement(required = true)
    protected AccessModifier accessModifier;
    protected List<Annotation> annotations;

    /**
     * Gets the value of the variableDeclarators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variableDeclarators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariableDeclarators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariableDeclarator }
     * 
     * 
     */
    public List<VariableDeclarator> getVariableDeclarators() {
        if (variableDeclarators == null) {
            variableDeclarators = new ArrayList<VariableDeclarator>();
        }
        return this.variableDeclarators;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    /**
     * Gets the value of the accessModifier property.
     * 
     * @return
     *     possible object is
     *     {@link AccessModifier }
     *     
     */
    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    /**
     * Sets the value of the accessModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessModifier }
     *     
     */
    public void setAccessModifier(AccessModifier value) {
        this.accessModifier = value;
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

}
