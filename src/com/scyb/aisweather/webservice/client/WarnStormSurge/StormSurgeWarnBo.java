
package com.scyb.aisweather.webservice.client.WarnStormSurge;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stormSurgeWarnBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stormSurgeWarnBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}marineWeatherWarnBo">
 *       &lt;sequence>
 *         &lt;element name="increasWater" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tide" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stormSurgeWarnBo", propOrder = {
    "increasWater",
    "period",
    "tide"
})
public class StormSurgeWarnBo
    extends MarineWeatherWarnBo
{

    protected int increasWater;
    protected int period;
    protected int tide;

    /**
     * Gets the value of the increasWater property.
     * 
     */
    public int getIncreasWater() {
        return increasWater;
    }

    /**
     * Sets the value of the increasWater property.
     * 
     */
    public void setIncreasWater(int value) {
        this.increasWater = value;
    }

    /**
     * Gets the value of the period property.
     * 
     */
    public int getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     */
    public void setPeriod(int value) {
        this.period = value;
    }

    /**
     * Gets the value of the tide property.
     * 
     */
    public int getTide() {
        return tide;
    }

    /**
     * Sets the value of the tide property.
     * 
     */
    public void setTide(int value) {
        this.tide = value;
    }

}
