
package com.scyb.aisweather.webservice.client.MilitaryActivitiy;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>militaryActivitiyBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡactivitiyTheme���Ե�ֵ��
     * 
     */
    public int getActivitiyTheme() {
        return activitiyTheme;
    }

    /**
     * ����activitiyTheme���Ե�ֵ��
     * 
     */
    public void setActivitiyTheme(int value) {
        this.activitiyTheme = value;
    }

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
     * ��ȡdurationType���Ե�ֵ��
     * 
     */
    public int getDurationType() {
        return durationType;
    }

    /**
     * ����durationType���Ե�ֵ��
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

}
