
package com.scyb.aisweather.webservice.client.AreaIrregula;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>irregulaAreaBroadcastService complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取arg0属性的值。
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
     * 设置arg0属性的值。
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
