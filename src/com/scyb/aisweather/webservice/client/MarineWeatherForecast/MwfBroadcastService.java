
package com.scyb.aisweather.webservice.client.MarineWeatherForecast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mwfBroadcastService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mwfBroadcastService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservice.aisweather.scyb.com/}marineWeatherForecastBo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mwfBroadcastService", propOrder = {
    "arg0"
})
public class MwfBroadcastService {

    protected MarineWeatherForecastBo arg0;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link MarineWeatherForecastBo }
     *     
     */
    public MarineWeatherForecastBo getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarineWeatherForecastBo }
     *     
     */
    public void setArg0(MarineWeatherForecastBo value) {
        this.arg0 = value;
    }

}
