
package com.scyb.aisweather.webservice.client.WarnTc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>marineWeatherWarnBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="marineWeatherWarnBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeWarn" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    TropicalCycloneWarnBo.class
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
     * 获取dateTime属性的值。
     * 
     */
    public long getDateTime() {
        return dateTime;
    }

    /**
     * 设置dateTime属性的值。
     * 
     */
    public void setDateTime(long value) {
        this.dateTime = value;
    }

    /**
     * 获取latitude属性的值。
     * 
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * 设置latitude属性的值。
     * 
     */
    public void setLatitude(int value) {
        this.latitude = value;
    }

    /**
     * 获取longitude属性的值。
     * 
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * 设置longitude属性的值。
     * 
     */
    public void setLongitude(int value) {
        this.longitude = value;
    }

    /**
     * 获取radius属性的值。
     * 
     */
    public int getRadius() {
        return radius;
    }

    /**
     * 设置radius属性的值。
     * 
     */
    public void setRadius(int value) {
        this.radius = value;
    }

    /**
     * 获取range属性的值。
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * 设置range属性的值。
     * 
     */
    public void setRange(int value) {
        this.range = value;
    }

    /**
     * 获取typeWarn属性的值。
     * 
     */
    public int getTypeWarn() {
        return typeWarn;
    }

    /**
     * 设置typeWarn属性的值。
     * 
     */
    public void setTypeWarn(int value) {
        this.typeWarn = value;
    }

}
