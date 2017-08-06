
package com.scyb.aisweather.webservice.client.Navigation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>navigationBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="navigationBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="farther" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="time1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="time2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
@XmlType(name = "navigationBo", propOrder = {
    "farther",
    "latitude",
    "longitude",
    "radius",
    "time1",
    "time2",
    "type"
})
public class NavigationBo
    extends BroadcastMMSIBo
{

    protected int farther;
    protected int latitude;
    protected int longitude;
    protected Double radius;
    protected Long time1;
    protected Long time2;
    protected int type;

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
     * 获取time1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTime1() {
        return time1;
    }

    /**
     * 设置time1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTime1(Long value) {
        this.time1 = value;
    }

    /**
     * 获取time2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTime2() {
        return time2;
    }

    /**
     * 设置time2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTime2(Long value) {
        this.time2 = value;
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
