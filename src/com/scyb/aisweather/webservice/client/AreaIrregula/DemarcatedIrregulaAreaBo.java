
package com.scyb.aisweather.webservice.client.AreaIrregula;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>demarcatedIrregulaAreaBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="demarcatedIrregulaAreaBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}broadcastMMSIBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dateTime1" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dateTime2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="latitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="longitudeList" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "demarcatedIrregulaAreaBo", propOrder = {
    "dateTime1",
    "dateTime2",
    "latitudeList",
    "longitudeList",
    "type"
})
public class DemarcatedIrregulaAreaBo
    extends BroadcastMMSIBo
{

    protected Long dateTime1;
    protected Long dateTime2;
    @XmlElement(nillable = true)
    protected List<Integer> latitudeList;
    @XmlElement(nillable = true)
    protected List<Integer> longitudeList;
    protected int type;

    public void setLatitudeList(List<Integer> latitudeList) {
        this.latitudeList = latitudeList;
    }

    public void setLongitudeList(List<Integer> longitudeList) {
        this.longitudeList = longitudeList;
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
