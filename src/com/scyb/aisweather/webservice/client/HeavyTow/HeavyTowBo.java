
package com.scyb.aisweather.webservice.client.HeavyTow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>heavyTowBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="heavyTowBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateTime2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="latitudeEnd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitudeStart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitudeEnd" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitudeStart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mmsi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="overallLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="precautions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "heavyTowBo", propOrder = {
    "dateTime1",
    "dateTime2",
    "latitudeEnd",
    "latitudeStart",
    "longitudeEnd",
    "longitudeStart",
    "mmsi",
    "overallLength",
    "precautions",
    "speed"
})
public class HeavyTowBo
    extends BroadcastMMSIBo
{

    protected Long dateTime1;
    protected Long dateTime2;
    protected int latitudeEnd;
    protected int latitudeStart;
    protected int longitudeEnd;
    protected int longitudeStart;
    protected int mmsi;
    protected int overallLength;
    protected int precautions;
    protected int speed;

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
     * ��ȡmmsi���Ե�ֵ��
     * 
     */
    public int getMmsi() {
        return mmsi;
    }

    /**
     * ����mmsi���Ե�ֵ��
     * 
     */
    public void setMmsi(int value) {
        this.mmsi = value;
    }

    /**
     * ��ȡoverallLength���Ե�ֵ��
     * 
     */
    public int getOverallLength() {
        return overallLength;
    }

    /**
     * ����overallLength���Ե�ֵ��
     * 
     */
    public void setOverallLength(int value) {
        this.overallLength = value;
    }

    /**
     * ��ȡprecautions���Ե�ֵ��
     * 
     */
    public int getPrecautions() {
        return precautions;
    }

    /**
     * ����precautions���Ե�ֵ��
     * 
     */
    public void setPrecautions(int value) {
        this.precautions = value;
    }

    /**
     * ��ȡspeed���Ե�ֵ��
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * ����speed���Ե�ֵ��
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
    }

}
