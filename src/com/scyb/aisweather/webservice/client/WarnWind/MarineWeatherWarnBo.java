
package com.scyb.aisweather.webservice.client.WarnWind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for marineWeatherWarnBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marineWeatherWarnBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo">
 *       &lt;sequence>
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="typeWarn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marineWeatherWarnBo", propOrder = {
    "dateTime",
    "latitude",
    "longitude",
    "radius",
    "range",
    "typeWarn"
})
@XmlSeeAlso({
    WindWarnBo.class
})
public class MarineWeatherWarnBo
    extends BroadcastMMSIBo
{

    protected long dateTime;
    protected int latitude;
    protected int longitude;
    protected int radius;
    protected int range;
    protected int typeWarn;

    /**
     * Gets the value of the dateTime property.
     * 
     */
    public long getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     */
    public void setDateTime(long value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(int value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(int value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the radius property.
     * 
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Sets the value of the radius property.
     * 
     */
    public void setRadius(int value) {
        this.radius = value;
    }

    /**
     * Gets the value of the range property.
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     */
    public void setRange(int value) {
        this.range = value;
    }

    /**
     * Gets the value of the typeWarn property.
     * 
     */
    public int getTypeWarn() {
        return typeWarn;
    }

    /**
     * Sets the value of the typeWarn property.
     * 
     */
    public void setTypeWarn(int value) {
        this.typeWarn = value;
    }

}
