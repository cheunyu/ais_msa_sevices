
package com.scyb.aisweather.webservice.client.AreaRectangle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>demarcatedAreaBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="demarcatedAreaBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateTime2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="farther" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "demarcatedAreaBo", propOrder = {
    "dateTime1",
    "dateTime2",
    "farther",
    "feature",
    "type"
})
@XmlSeeAlso({
    DemarcatedRectangleBo.class
})
public class DemarcatedAreaBo
    extends BroadcastMMSIBo
{

    protected Long dateTime1;
    protected Long dateTime2;
    protected int farther;
    protected int feature;
    protected int type;

    /**
     * 获取dateTime1属性的值。
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
     * 设置dateTime1属性的值。
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
     * 获取dateTime2属性的值。
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
     * 设置dateTime2属性的值。
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
     * 获取feature属性的值。
     * 
     */
    public int getFeature() {
        return feature;
    }

    /**
     * 设置feature属性的值。
     * 
     */
    public void setFeature(int value) {
        this.feature = value;
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
