
package com.scyb.aisweather.webservice.client.AreaIrregula;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>irregulaAreaBroadcastService complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="irregulaAreaBroadcastService"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="arg0" type="{http://webservice.aisweather.scyb.com/}demarcatedIrregulaAreaBo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "irregulaAreaBroadcastService", propOrder = {
    "arg0"
})
public class IrregulaAreaBroadcastService {

    protected DemarcatedIrregulaAreaBo arg0;

    /**
     * ��ȡarg0���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DemarcatedIrregulaAreaBo }
     *     
     */
    public DemarcatedIrregulaAreaBo getArg0() {
        return arg0;
    }

    /**
     * ����arg0���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DemarcatedIrregulaAreaBo }
     *     
     */
    public void setArg0(DemarcatedIrregulaAreaBo value) {
        this.arg0 = value;
    }

}
