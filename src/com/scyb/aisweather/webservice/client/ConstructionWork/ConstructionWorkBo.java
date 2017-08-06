
package com.scyb.aisweather.webservice.client.ConstructionWork;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>constructionWorkBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdateTime1���Ե�ֵ��
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
     * ����dateTime1���Ե�ֵ��
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
     * ��ȡdateTime2���Ե�ֵ��
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
     * ����dateTime2���Ե�ֵ��
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
     * ��ȡlatitudeEnd���Ե�ֵ��
     * 
     */
    public int getLatitudeEnd() {
        return latitudeEnd;
    }

    /**
     * ����latitudeEnd���Ե�ֵ��
     * 
     */
    public void setLatitudeEnd(int value) {
        this.latitudeEnd = value;
    }

    /**
     * ��ȡlatitudeStart���Ե�ֵ��
     * 
     */
    public int getLatitudeStart() {
        return latitudeStart;
    }

    /**
     * ����latitudeStart���Ե�ֵ��
     * 
     */
    public void setLatitudeStart(int value) {
        this.latitudeStart = value;
    }

    /**
     * ��ȡlongitudeEnd���Ե�ֵ��
     * 
     */
    public int getLongitudeEnd() {
        return longitudeEnd;
    }

    /**
     * ����longitudeEnd���Ե�ֵ��
     * 
     */
    public void setLongitudeEnd(int value) {
        this.longitudeEnd = value;
    }

    /**
     * ��ȡlongitudeStart���Ե�ֵ��
     * 
     */
    public int getLongitudeStart() {
        return longitudeStart;
    }

    /**
     * ����longitudeStart���Ե�ֵ��
     * 
     */
    public void setLongitudeStart(int value) {
        this.longitudeStart = value;
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
     * ��ȡshipMmsi���Ե�ֵ��
     * 
     */
    public int getShipMmsi() {
        return shipMmsi;
    }

    /**
     * ����shipMmsi���Ե�ֵ��
     * 
     */
    public void setShipMmsi(int value) {
        this.shipMmsi = value;
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
