
package com.scyb.aisweather.webservice.client.WarnWave;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for waveWarnBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="waveWarnBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}marineWeatherWarnBo">
 *       &lt;sequence>
 *         &lt;element name="hs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "waveWarnBo", propOrder = {
    "hs",
    "period"
})
public class WaveWarnBo
    extends MarineWeatherWarnBo
{

    protected int hs;
    protected int period;

    /**
     * Gets the value of the hs property.
     * 
     */
    public int getHs() {
        return hs;
    }

    /**
     * Sets the value of the hs property.
     * 
     */
    public void setHs(int value) {
        this.hs = value;
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

}
