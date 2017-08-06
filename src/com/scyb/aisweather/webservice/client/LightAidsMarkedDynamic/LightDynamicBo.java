
package com.scyb.aisweather.webservice.client.LightAidsMarkedDynamic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>lightDynamicBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="lightDynamicBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}aidsMarkedDynamicBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lightColor" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="lightCycle" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rhythmName" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="rhythmParameters" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "lightDynamicBo", propOrder = {
    "latitude",
    "lightColor",
    "lightCycle",
    "longitude",
    "rhythmName",
    "rhythmParameters",
    "type"
})
public class LightDynamicBo
    extends AidsMarkedDynamicBo
{

    protected int latitude;
    protected int lightColor;
    protected int lightCycle;
    protected int longitude;
    protected int rhythmName;
    protected int rhythmParameters;
    protected int type;

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
     * ��ȡlightColor���Ե�ֵ��
     * 
     */
    public int getLightColor() {
        return lightColor;
    }

    /**
     * ����lightColor���Ե�ֵ��
     * 
     */
    public void setLightColor(int value) {
        this.lightColor = value;
    }

    /**
     * ��ȡlightCycle���Ե�ֵ��
     * 
     */
    public int getLightCycle() {
        return lightCycle;
    }

    /**
     * ����lightCycle���Ե�ֵ��
     * 
     */
    public void setLightCycle(int value) {
        this.lightCycle = value;
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
     * ��ȡrhythmName���Ե�ֵ��
     * 
     */
    public int getRhythmName() {
        return rhythmName;
    }

    /**
     * ����rhythmName���Ե�ֵ��
     * 
     */
    public void setRhythmName(int value) {
        this.rhythmName = value;
    }

    /**
     * ��ȡrhythmParameters���Ե�ֵ��
     * 
     */
    public int getRhythmParameters() {
        return rhythmParameters;
    }

    /**
     * ����rhythmParameters���Ե�ֵ��
     * 
     */
    public void setRhythmParameters(int value) {
        this.rhythmParameters = value;
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
