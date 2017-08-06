
package com.scyb.aisweather.webservice.client.HydrologyWeatherForecast;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>hydrologyWeatherForecastBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="hydrologyWeatherForecastBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="highTideTime" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="latitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="longitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lowTideTime" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tide" type="{http://www.w3.org/2001/XMLSchema}double" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hydrologyWeatherForecastBo", propOrder = {
    "highTideTime",
    "latitudeList",
    "longitudeList",
    "lowTideTime",
    "tide",
    "time"
})
public class HydrologyWeatherForecastBo
    extends BroadcastMMSIBo
{

    @XmlElement(nillable = true)
    protected List<Long> highTideTime;
    @XmlElement(nillable = true)
    protected List<Integer> latitudeList;
    @XmlElement(nillable = true)
    protected List<Integer> longitudeList;
    @XmlElement(nillable = true)
    protected List<Long> lowTideTime;
    @XmlElement(nillable = true)
    protected List<Double> tide;
    protected int time;

    /**
     * Gets the value of the highTideTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the highTideTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHighTideTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getHighTideTime() {
        if (highTideTime == null) {
            highTideTime = new ArrayList<Long>();
        }
        return this.highTideTime;
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
     * Gets the value of the lowTideTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lowTideTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLowTideTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getLowTideTime() {
        if (lowTideTime == null) {
            lowTideTime = new ArrayList<Long>();
        }
        return this.lowTideTime;
    }

    /**
     * Gets the value of the tide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTide().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getTide() {
        if (tide == null) {
            tide = new ArrayList<Double>();
        }
        return this.tide;
    }

    public void setHighTideTime(List<Long> highTideTime) {
        this.highTideTime = highTideTime;
    }

    public void setLatitudeList(List<Integer> latitudeList) {
        this.latitudeList = latitudeList;
    }

    public void setLongitudeList(List<Integer> longitudeList) {
        this.longitudeList = longitudeList;
    }

    public void setLowTideTime(List<Long> lowTideTime) {
        this.lowTideTime = lowTideTime;
    }

    public void setTide(List<Double> tide) {
        this.tide = tide;
    }

    /**
     * 获取time属性的值。
     * 
     */
    public int getTime() {
        return time;
    }

    /**
     * 设置time属性的值。
     * 
     */
    public void setTime(int value) {
        this.time = value;
    }

}
