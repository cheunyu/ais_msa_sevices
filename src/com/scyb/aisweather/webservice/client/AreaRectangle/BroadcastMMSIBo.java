
package com.scyb.aisweather.webservice.client.AreaRectangle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>broadcastMMSIBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="broadcastMMSIBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="destination_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="source_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "broadcastMMSIBo", propOrder = {
    "destinationId",
    "sourceId"
})
@XmlSeeAlso({
    DemarcatedAreaBo.class
})
public class BroadcastMMSIBo {

    @XmlElement(name = "destination_id")
    protected int destinationId;
    @XmlElement(name = "source_id")
    protected int sourceId;

    /**
     * ��ȡdestinationId���Ե�ֵ��
     * 
     */
    public int getDestinationId() {
        return destinationId;
    }

    /**
     * ����destinationId���Ե�ֵ��
     * 
     */
    public void setDestinationId(int value) {
        this.destinationId = value;
    }

    /**
     * ��ȡsourceId���Ե�ֵ��
     * 
     */
    public int getSourceId() {
        return sourceId;
    }

    /**
     * ����sourceId���Ե�ֵ��
     * 
     */
    public void setSourceId(int value) {
        this.sourceId = value;
    }

}
