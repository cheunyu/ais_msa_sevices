
package com.scyb.aisweather.webservice.client.AreaRectangle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>rectangleAreaBroadcastService complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="rectangleAreaBroadcastService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://webservice.aisweather.scyb.com/}demarcatedRectangleBo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rectangleAreaBroadcastService", propOrder = {
    "arg0"
})
public class RectangleAreaBroadcastService {

    protected DemarcatedRectangleBo arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DemarcatedRectangleBo }
     *     
     */
    public DemarcatedRectangleBo getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DemarcatedRectangleBo }
     *     
     */
    public void setArg0(DemarcatedRectangleBo value) {
        this.arg0 = value;
    }

}
