
package com.scyb.aisweather.webservice.client.AreaRound;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>demarcatedRoundBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="demarcatedRoundBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}demarcatedAreaBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="radius" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demarcatedRoundBo", propOrder = {
    "latitude",
    "longitude",
    "radius"
})
public class DemarcatedRoundBo
    extends DemarcatedAreaBo
{

    protected int latitude;
    protected int longitude;
    protected Double radius;

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

}
