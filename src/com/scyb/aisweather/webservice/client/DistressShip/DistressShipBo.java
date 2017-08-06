
package com.scyb.aisweather.webservice.client.DistressShip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>distressShipBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="distressShipBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="described" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="farther" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="range" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="shipType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "distressShipBo", propOrder = {
    "dateTime",
    "described",
    "farther",
    "latitude",
    "longitude",
    "range",
    "shipType",
    "type"
})
public class DistressShipBo
    extends BroadcastMMSIBo
{

    protected Long dateTime;
    protected int described;
    protected int farther;
    protected int latitude;
    protected int longitude;
    protected int range;
    protected int shipType;
    protected int type;

    /**
     * 获取dateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDateTime() {
        return dateTime;
    }

    /**
     * 设置dateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDateTime(Long value) {
        this.dateTime = value;
    }

    /**
     * 获取described属性的值。
     * 
     */
    public int getDescribed() {
        return described;
    }

    /**
     * 设置described属性的值。
     * 
     */
    public void setDescribed(int value) {
        this.described = value;
    }

    /**
     * 获取farther属性的值。
     * 
     */
    public int getFarther() {
        return farther;
    }

    /**
     * 设置farther属性的值。
     * 
     */
    public void setFarther(int value) {
        this.farther = value;
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
     * 获取shipType属性的值。
     * 
     */
    public int getShipType() {
        return shipType;
    }

    /**
     * 设置shipType属性的值。
     * 
     */
    public void setShipType(int value) {
        this.shipType = value;
    }

    /**
     * 获取type属性的值。
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

}
