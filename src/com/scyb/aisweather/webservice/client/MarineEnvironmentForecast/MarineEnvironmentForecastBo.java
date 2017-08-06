
package com.scyb.aisweather.webservice.client.MarineEnvironmentForecast;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for marineEnvironmentForecastBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marineEnvironmentForecastBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo">
 *       &lt;sequence>
 *         &lt;element name="forecastDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waterDirectionList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waterSpeedList" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waterTemperatureList" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waveDirectionList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="waveHsList" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marineEnvironmentForecastBo", propOrder = {
    "forecastDateTime",
    "latitudeList",
    "longitudeList",
    "waterDirectionList",
    "waterSpeedList",
    "waterTemperatureList",
    "waveDirectionList",
    "waveHsList"
})
public class MarineEnvironmentForecastBo
    extends BroadcastMMSIBo
{

    protected String forecastDateTime;
    @XmlElement(nillable = true)
    protected List<Integer> latitudeList;
    @XmlElement(nillable = true)
    protected List<Integer> longitudeList;
    @XmlElement(nillable = true)
    protected List<Integer> waterDirectionList;
    @XmlElement(nillable = true)
    protected List<Double> waterSpeedList;
    @XmlElement(nillable = true)
    protected List<Double> waterTemperatureList;
    @XmlElement(nillable = true)
    protected List<Integer> waveDirectionList;
    @XmlElement(nillable = true)
    protected List<Double> waveHsList;

    /**
     * Gets the value of the forecastDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForecastDateTime() {
        return forecastDateTime;
    }

    /**
     * Sets the value of the forecastDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForecastDateTime(String value) {
        this.forecastDateTime = value;
    }

    /**
     * Gets the value of the latitudeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latitudeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatitudeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLatitudeList() {
        if (latitudeList == null) {
            latitudeList = new ArrayList<Integer>();
        }
        return this.latitudeList;
    }

    /**
     * Gets the value of the longitudeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longitudeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongitudeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLongitudeList() {
        if (longitudeList == null) {
            longitudeList = new ArrayList<Integer>();
        }
        return this.longitudeList;
    }

    /**
     * Gets the value of the waterDirectionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterDirectionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterDirectionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getWaterDirectionList() {
        if (waterDirectionList == null) {
            waterDirectionList = new ArrayList<Integer>();
        }
        return this.waterDirectionList;
    }

    /**
     * Gets the value of the waterSpeedList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterSpeedList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterSpeedList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getWaterSpeedList() {
        if (waterSpeedList == null) {
            waterSpeedList = new ArrayList<Double>();
        }
        return this.waterSpeedList;
    }

    /**
     * Gets the value of the waterTemperatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waterTemperatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaterTemperatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getWaterTemperatureList() {
        if (waterTemperatureList == null) {
            waterTemperatureList = new ArrayList<Double>();
        }
        return this.waterTemperatureList;
    }

    /**
     * Gets the value of the waveDirectionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waveDirectionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaveDirectionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getWaveDirectionList() {
        if (waveDirectionList == null) {
            waveDirectionList = new ArrayList<Integer>();
        }
        return this.waveDirectionList;
    }

    /**
     * Gets the value of the waveHsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waveHsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaveHsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getWaveHsList() {
        if (waveHsList == null) {
            waveHsList = new ArrayList<Double>();
        }
        return this.waveHsList;
    }

    public void setLatitudeList(List<Integer> latitudeList) {
        this.latitudeList = latitudeList;
    }

    public void setLongitudeList(List<Integer> longitudeList) {
        this.longitudeList = longitudeList;
    }

    public void setWaterDirectionList(List<Integer> waterDirectionList) {
        this.waterDirectionList = waterDirectionList;
    }

    public void setWaterSpeedList(List<Double> waterSpeedList) {
        this.waterSpeedList = waterSpeedList;
    }

    public void setWaterTemperatureList(List<Double> waterTemperatureList) {
        this.waterTemperatureList = waterTemperatureList;
    }

    public void setWaveDirectionList(List<Integer> waveDirectionList) {
        this.waveDirectionList = waveDirectionList;
    }

    public void setWaveHsList(List<Double> waveHsList) {
        this.waveHsList = waveHsList;
    }
}
