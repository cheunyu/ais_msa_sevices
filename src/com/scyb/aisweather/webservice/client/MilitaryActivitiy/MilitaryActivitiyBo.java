
package com.scyb.aisweather.webservice.client.MilitaryActivitiy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>militaryActivitiyBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="militaryActivitiyBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="activitiyTheme" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateTime1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateTime2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="durationType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="longitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="precautions" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "militaryActivitiyBo", propOrder = {
    "activitiyTheme",
    "dateTime1",
    "dateTime2",
    "durationType",
    "latitudeList",
    "longitudeList",
    "precautions"
})
public class MilitaryActivitiyBo
    extends BroadcastMMSIBo
{

    protected int activitiyTheme;
    protected Long dateTime1;
    protected Long dateTime2;
    protected int durationType;
    @XmlElement(nillable = true)
    protected List<Integer> latitudeList;
    @XmlElement(nillable = true)
    protected List<Integer> longitudeList;
    protected int precautions;

    public void setLatitudeList(List<Integer> latitudeList) {
        this.latitudeList = latitudeList;
    }

    public void setLongitudeList(List<Integer> longitudeList) {
        this.longitudeList = longitudeList;
    }

    /**
     * 获取activitiyTheme属性的值。
     * 
     */
    public int getActivitiyTheme() {
        return activitiyTheme;
    }

    /**
     * 设置activitiyTheme属性的值。
     * 
     */
    public void setActivitiyTheme(int value) {
        this.activitiyTheme = value;
    }

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
     * 获取durationType属性的值。
     * 
     */
    public int getDurationType() {
        return durationType;
    }

    /**
     * 设置durationType属性的值。
     * 
     */
    public void setDurationType(int value) {
        this.durationType = value;
    }

    /**
     * Gets the value of the latitudeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the latitudeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLatitudeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLatitudeList() {
        if (latitudeList == null) {
            latitudeList = new ArrayList<Integer>();
        }
        return this.latitudeList;
    }

    /**
     * Gets the value of the longitudeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the longitudeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLongitudeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getLongitudeList() {
        if (longitudeList == null) {
            longitudeList = new ArrayList<Integer>();
        }
        return this.longitudeList;
    }

    /**
     * 获取precautions属性的值。
     * 
     */
    public int getPrecautions() {
        return precautions;
    }

    /**
     * 设置precautions属性的值。
     * 
     */
    public void setPrecautions(int value) {
        this.precautions = value;
    }

}
