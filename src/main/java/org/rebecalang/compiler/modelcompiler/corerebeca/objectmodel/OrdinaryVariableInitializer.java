//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.03 at 05:55:03 PM IRDT 
//


package org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrdinaryVariableInitializer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinaryVariableInitializer">
 *   &lt;complexContent>
 *     &lt;extension base="{http://rebecalang.org/compiler/modelcompiler/corerebeca}VariableInitializer">
 *       &lt;sequence>
 *         &lt;element name="value" type="{http://rebecalang.org/compiler/modelcompiler/corerebecaexpression}Expression"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdinaryVariableInitializer", propOrder = {
    "value"
})
public class OrdinaryVariableInitializer
    extends VariableInitializer
{

    @XmlElement(required = true)
    protected Expression value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Expression }
     *     
     */
    public Expression getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Expression }
     *     
     */
    public void setValue(Expression value) {
        this.value = value;
    }

}
