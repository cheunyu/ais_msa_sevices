
package com.scyb.aisweather.webservice.client.WarnWind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for windWarnBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="windWarnBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}marineWeatherWarnBo">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="maxPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="minPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "windWarnBo", propOrder = {
    "direction",
    "maxPower",
    "minPower"
})
public class WindWarnBo
    extends MarineWeatherWarnBo
{

    protected int direction;
    protected int maxPower;
    protected int minPower;

    /**
     * Gets the value of the direction property.
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * Gets the value of the maxPower property.
     * 
     */
    public int getMaxPower() {
        return maxPower;
    }

    /**
     * Sets the value of the maxPower property.
     * 
     */
    public void setMaxPower(int value) {
        this.maxPower = value;
    }

    /**
     * Gets the value of the minPower property.
     * 
     */
    public int getMinPower() {
        return minPower;
    }

    /**
     * Sets the value of the minPower property.
     * 
     */
    public void setMinPower(int value) {
        this.minPower = value;
    }

}
