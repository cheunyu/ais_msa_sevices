
package com.scyb.aisweather.webservice.client.Coastal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for coastal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="coastal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createDate" type="{http://webservice.aisweather.scyb.com/}timestamp" minOccurs="0"/>
 *         &lt;element name="forecastTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oceanName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phenomenon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="windDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="windPower" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coastal", propOrder = {
    "createDate",
    "forecastTime",
    "guid",
    "oceanName",
    "phenomenon",
    "visibility",
    "windDirection",
    "windPower"
})
public class Coastal {

    protected Timestamp createDate;
    protected String forecastTime;
    protected String guid;
    protected String oceanName;
    protected String phenomenon;
    protected Integer visibility;
    protected String windDirection;
    protected String windPower;

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link Timestamp }
     *     
     */
    public Timestamp getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Timestamp }
     *     
     */
    public void setCreateDate(Timestamp value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the forecastTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastTime() {
        return forecastTime;
    }

    /**
     * Sets the value of the forecastTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastTime(String value) {
        this.forecastTime = value;
    }

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the oceanName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOceanName() {
        return oceanName;
    }

    /**
     * Sets the value of the oceanName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOceanName(String value) {
        this.oceanName = value;
    }

    /**
     * Gets the value of the phenomenon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhenomenon() {
        return phenomenon;
    }

    /**
     * Sets the value of the phenomenon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhenomenon(String value) {
        this.phenomenon = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisibility(Integer value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the windDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindDirection() {
        return windDirection;
    }

    /**
     * Sets the value of the windDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindDirection(String value) {
        this.windDirection = value;
    }

    /**
     * Gets the value of the windPower property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindPower() {
        return windPower;
    }

    /**
     * Sets the value of the windPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindPower(String value) {
        this.windPower = value;
    }

    @Override
    public String toString() {
        return "Coastal{" +
                "createDate=" + createDate +
                ", forecastTime='" + forecastTime + '\'' +
                ", guid='" + guid + '\'' +
                ", oceanName='" + oceanName + '\'' +
                ", phenomenon='" + phenomenon + '\'' +
                ", visibility=" + visibility +
                ", windDirection='" + windDirection + '\'' +
                ", windPower='" + windPower + '\'' +
                '}';
    }
}
