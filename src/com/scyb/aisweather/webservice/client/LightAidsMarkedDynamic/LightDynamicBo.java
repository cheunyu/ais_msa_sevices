
package com.scyb.aisweather.webservice.client.LightAidsMarkedDynamic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>lightDynamicBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取lightColor属性的值。
     * 
     */
    public int getLightColor() {
        return lightColor;
    }

    /**
     * 设置lightColor属性的值。
     * 
     */
    public void setLightColor(int value) {
        this.lightColor = value;
    }

    /**
     * 获取lightCycle属性的值。
     * 
     */
    public int getLightCycle() {
        return lightCycle;
    }

    /**
     * 设置lightCycle属性的值。
     * 
     */
    public void setLightCycle(int value) {
        this.lightCycle = value;
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
     * 获取rhythmName属性的值。
     * 
     */
    public int getRhythmName() {
        return rhythmName;
    }

    /**
     * 设置rhythmName属性的值。
     * 
     */
    public void setRhythmName(int value) {
        this.rhythmName = value;
    }

    /**
     * 获取rhythmParameters属性的值。
     * 
     */
    public int getRhythmParameters() {
        return rhythmParameters;
    }

    /**
     * 设置rhythmParameters属性的值。
     * 
     */
    public void setRhythmParameters(int value) {
        this.rhythmParameters = value;
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
