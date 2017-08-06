
package com.scyb.aisweather.webservice.client.ShiftAidsMarkedDynamic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>shiftDynamicBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="shiftDynamicBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}aidsMarkedDynamicBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitudeEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="latitudeStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="longitudeEnd" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="longitudeStart" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "shiftDynamicBo", propOrder = {
    "latitudeEnd",
    "latitudeStart",
    "longitudeEnd",
    "longitudeStart",
    "type"
})
public class ShiftDynamicBo
    extends AidsMarkedDynamicBo
{

    protected Integer latitudeEnd;
    protected Integer latitudeStart;
    protected Integer longitudeEnd;
    protected Integer longitudeStart;
    protected int type;

    /**
     * 获取latitudeEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLatitudeEnd() {
        return latitudeEnd;
    }

    /**
     * 设置latitudeEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLatitudeEnd(Integer value) {
        this.latitudeEnd = value;
    }

    /**
     * 获取latitudeStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLatitudeStart() {
        return latitudeStart;
    }

    /**
     * 设置latitudeStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLatitudeStart(Integer value) {
        this.latitudeStart = value;
    }

    /**
     * 获取longitudeEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongitudeEnd() {
        return longitudeEnd;
    }

    /**
     * 设置longitudeEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongitudeEnd(Integer value) {
        this.longitudeEnd = value;
    }

    /**
     * 获取longitudeStart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLongitudeStart() {
        return longitudeStart;
    }

    /**
     * 设置longitudeStart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLongitudeStart(Integer value) {
        this.longitudeStart = value;
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
