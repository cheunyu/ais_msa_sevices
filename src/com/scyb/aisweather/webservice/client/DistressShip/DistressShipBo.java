
package com.scyb.aisweather.webservice.client.DistressShip;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>distressShipBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdateTime���Ե�ֵ��
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
     * ����dateTime���Ե�ֵ��
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
     * ��ȡdescribed���Ե�ֵ��
     * 
     */
    public int getDescribed() {
        return described;
    }

    /**
     * ����described���Ե�ֵ��
     * 
     */
    public void setDescribed(int value) {
        this.described = value;
    }

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
     * ��ȡrange���Ե�ֵ��
     * 
     */
    public int getRange() {
        return range;
    }

    /**
     * ����range���Ե�ֵ��
     * 
     */
    public void setRange(int value) {
        this.range = value;
    }

    /**
     * ��ȡshipType���Ե�ֵ��
     * 
     */
    public int getShipType() {
        return shipType;
    }

    /**
     * ����shipType���Ե�ֵ��
     * 
     */
    public void setShipType(int value) {
        this.shipType = value;
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
