
package com.scyb.aisweather.webservice.client.Navigation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>navigationBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡfarther���Ե�ֵ��
     * 
     */
    public int getFarther() {
        return farther;
    }

    /**
     * ����farther���Ե�ֵ��
     * 
     */
    public void setFarther(int value) {
        this.farther = value;
    }

    /**
     * ��ȡlatitude���Ե�ֵ��
     * 
     */
    public int getLatitude() {
        return latitude;
    }

    /**
     * ����latitude���Ե�ֵ��
     * 
     */
    public void setLatitude(int value) {
        this.latitude = value;
    }

    /**
     * ��ȡlongitude���Ե�ֵ��
     * 
     */
    public int getLongitude() {
        return longitude;
    }

    /**
     * ����longitude���Ե�ֵ��
     * 
     */
    public void setLongitude(int value) {
        this.longitude = value;
    }

    /**
     * ��ȡradius���Ե�ֵ��
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
     * ����radius���Ե�ֵ��
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
     * ��ȡtime1���Ե�ֵ��
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
     * ����time1���Ե�ֵ��
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
     * ��ȡtime2���Ե�ֵ��
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
     * ����time2���Ե�ֵ��
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
     * ��ȡtype���Ե�ֵ��
     * 
     */
    public int getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     */
    public void setType(int value) {
        this.type = value;
    }

}
