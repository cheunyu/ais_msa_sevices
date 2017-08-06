
package com.scyb.aisweather.webservice.client.ConstructionWork;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>constructionWorkBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="constructionWorkBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateTime2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="latitudeEnd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitudeStart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitudeEnd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitudeStart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shipMmsi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "constructionWorkBo", propOrder = {
    "dateTime1",
    "dateTime2",
    "latitudeEnd",
    "latitudeStart",
    "longitudeEnd",
    "longitudeStart",
    "radius",
    "shipMmsi",
    "shipType",
    "type"
})
public class ConstructionWorkBo
    extends BroadcastMMSIBo
{

    protected Long dateTime1;
    protected Long dateTime2;
    protected int latitudeEnd;
    protected int latitudeStart;
    protected int longitudeEnd;
    protected int longitudeStart;
    protected Double radius;
    protected int shipMmsi;
    protected int shipType;
    protected int type;

    /**
     * 获取dateTime1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDateTime1() {
        return dateTime1;
    }

    /**
     * 设置dateTime1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDateTime1(Long value) {
        this.dateTime1 = value;
    }

    /**
     * 获取dateTime2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDateTime2() {
        return dateTime2;
    }

    /**
     * 设置dateTime2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDateTime2(Long value) {
        this.dateTime2 = value;
    }

    /**
     * 获取latitudeEnd属性的值。
     * 
     */
    public int getLatitudeEnd() {
        return latitudeEnd;
    }

    /**
     * 设置latitudeEnd属性的值。
     * 
     */
    public void setLatitudeEnd(int value) {
        this.latitudeEnd = value;
    }

    /**
     * 获取latitudeStart属性的值。
     * 
     */
    public int getLatitudeStart() {
        return latitudeStart;
    }

    /**
     * 设置latitudeStart属性的值。
     * 
     */
    public void setLatitudeStart(int value) {
        this.latitudeStart = value;
    }

    /**
     * 获取longitudeEnd属性的值。
     * 
     */
    public int getLongitudeEnd() {
        return longitudeEnd;
    }

    /**
     * 设置longitudeEnd属性的值。
     * 
     */
    public void setLongitudeEnd(int value) {
        this.longitudeEnd = value;
    }

    /**
     * 获取longitudeStart属性的值。
     * 
     */
    public int getLongitudeStart() {
        return longitudeStart;
    }

    /**
     * 设置longitudeStart属性的值。
     * 
     */
    public void setLongitudeStart(int value) {
        this.longitudeStart = value;
    }

    /**
     * 获取radius属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRadius() {
        return radius;
    }

    /**
     * 设置radius属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRadius(Double value) {
        this.radius = value;
    }

    /**
     * 获取shipMmsi属性的值。
     * 
     */
    public int getShipMmsi() {
        return shipMmsi;
    }

    /**
     * 设置shipMmsi属性的值。
     * 
     */
    public void setShipMmsi(int value) {
        this.shipMmsi = value;
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
