
package com.scyb.aisweather.webservice.client.WarnTc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>marineWeatherWarnBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdateTime���Ե�ֵ��
     * 
     */
    public long getDateTime() {
        return dateTime;
    }

    /**
     * ����dateTime���Ե�ֵ��
     * 
     */
    public void setDateTime(long value) {
        this.dateTime = value;
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
     */
    public int getRadius() {
        return radius;
    }

    /**
     * ����radius���Ե�ֵ��
     * 
     */
    public void setRadius(int value) {
        this.radius = value;
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
     * ��ȡtypeWarn���Ե�ֵ��
     * 
     */
    public int getTypeWarn() {
        return typeWarn;
    }

    /**
     * ����typeWarn���Ե�ֵ��
     * 
     */
    public void setTypeWarn(int value) {
        this.typeWarn = value;
    }

}
