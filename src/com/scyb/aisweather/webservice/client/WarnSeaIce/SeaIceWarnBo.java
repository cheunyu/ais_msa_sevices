
package com.scyb.aisweather.webservice.client.WarnSeaIce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for seaIceWarnBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seaIceWarnBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}marineWeatherWarnBo">
 *       &lt;sequence>
 *         &lt;element name="thickness" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seaIceWarnBo", propOrder = {
    "thickness"
})
public class SeaIceWarnBo
    extends MarineWeatherWarnBo
{

    protected int thickness;

    /**
     * Gets the value of the thickness property.
     * 
     */
    public int getThickness() {
        return thickness;
    }

    /**
     * Sets the value of the thickness property.
     * 
     */
    public void setThickness(int value) {
        this.thickness = value;
    }

}
