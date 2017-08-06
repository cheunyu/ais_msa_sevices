
package com.scyb.aisweather.webservice.client.WarnFog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fogWarnBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fogWarnBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}marineWeatherWarnBo">
 *       &lt;sequence>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fogWarnBo", propOrder = {
    "visibility"
})
public class FogWarnBo
    extends MarineWeatherWarnBo
{

    protected int visibility;

    /**
     * Gets the value of the visibility property.
     * 
     */
    public int getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     */
    public void setVisibility(int value) {
        this.visibility = value;
    }

}
