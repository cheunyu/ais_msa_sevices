
package com.scyb.aisweather.webservice.client.MarineWeatherForecast;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for marineWeatherForecastBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marineWeatherForecastBo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo">
 *       &lt;sequence>
 *         &lt;element name="latitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="longitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pressureList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="temperatureList" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="visibilityList" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weatherPhenomena" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="windDirectionList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="windSpeedList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marineWeatherForecastBo", propOrder = {
    "latitudeList",
    "longitudeList",
    "pressureList",
    "temperatureList",
    "time",
    "visibilityList",
    "weatherPhenomena",
    "windDirectionList",
    "windSpeedList"
})
public class MarineWeatherForecastBo
    extends BroadcastMMSIBo
{

    @XmlElement(nillable = true)
    protected List<Integer> latitudeList;
    @XmlElement(nillable = true)
    protected List<Integer> longitudeList;
    @XmlElement(nillable = true)
    protected List<Integer> pressureList;
    @XmlElement(nillable = true)
    protected List<Double> temperatureList;
    protected int time;
    @XmlElement(nillable = true)
    protected List<Double> visibilityList;
    @XmlElement(nillable = true)
    protected List<Integer> weatherPhenomena;
    @XmlElement(nillable = true)
    protected List<Integer> windDirectionList;
    @XmlElement(nillable = true)
    protected List<Integer> windSpeedList;

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
     * Gets the value of the pressureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pressureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPressureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getPressureList() {
        if (pressureList == null) {
            pressureList = new ArrayList<Integer>();
        }
        return this.pressureList;
    }

    public void setLatitudeList(List<Integer> latitudeList) {
        this.latitudeList = latitudeList;
    }

    public void setLongitudeList(List<Integer> longitudeList) {
        this.longitudeList = longitudeList;
    }

    public void setPressureList(List<Integer> pressureList) {
        this.pressureList = pressureList;
    }

    public void setTemperatureList(List<Double> temperatureList) {
        this.temperatureList = temperatureList;
    }

    public void setVisibilityList(List<Double> visibilityList) {
        this.visibilityList = visibilityList;
    }

    public void setWeatherPhenomena(List<Integer> weatherPhenomena) {
        this.weatherPhenomena = weatherPhenomena;
    }

    public void setWindDirectionList(List<Integer> windDirectionList) {
        this.windDirectionList = windDirectionList;
    }

    public void setWindSpeedList(List<Integer> windSpeedList) {
        this.windSpeedList = windSpeedList;
    }

    /**
     * Gets the value of the temperatureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperatureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperatureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTemperatureList() {
        if (temperatureList == null) {
            temperatureList = new ArrayList<Double>();
        }
        return this.temperatureList;
    }

    /**
     * Gets the value of the time property.
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

    /**
     * Gets the value of the visibilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visibilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisibilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getVisibilityList() {
        if (visibilityList == null) {
            visibilityList = new ArrayList<Double>();
        }
        return this.visibilityList;
    }

    /**
     * Gets the value of the weatherPhenomena property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weatherPhenomena property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeatherPhenomena().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getWeatherPhenomena() {
        if (weatherPhenomena == null) {
            weatherPhenomena = new ArrayList<Integer>();
        }
        return this.weatherPhenomena;
    }

    /**
     * Gets the value of the windDirectionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windDirectionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindDirectionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getWindDirectionList() {
        if (windDirectionList == null) {
            windDirectionList = new ArrayList<Integer>();
        }
        return this.windDirectionList;
    }

    /**
     * Gets the value of the windSpeedList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the windSpeedList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWindSpeedList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getWindSpeedList() {
        if (windSpeedList == null) {
            windSpeedList = new ArrayList<Integer>();
        }
        return this.windSpeedList;
    }

}
