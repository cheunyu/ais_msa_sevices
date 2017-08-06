
package com.scyb.aisweather.webservice.client.AreaRectangle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>demarcatedRectangleBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="demarcatedRectangleBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}demarcatedAreaBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitudeNw" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitudeSe" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitudeNw" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="longitudeSe" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "demarcatedRectangleBo", propOrder = {
    "latitudeNw",
    "latitudeSe",
    "longitudeNw",
    "longitudeSe"
})
public class DemarcatedRectangleBo
    extends DemarcatedAreaBo
{

    protected int latitudeNw;
    protected int latitudeSe;
    protected int longitudeNw;
    protected int longitudeSe;

    /**
     * ��ȡlatitudeNw���Ե�ֵ��
     * 
     */
    public int getLatitudeNw() {
        return latitudeNw;
    }

    /**
     * ����latitudeNw���Ե�ֵ��
     * 
     */
    public void setLatitudeNw(int value) {
        this.latitudeNw = value;
    }

    /**
     * ��ȡlatitudeSe���Ե�ֵ��
     * 
     */
    public int getLatitudeSe() {
        return latitudeSe;
    }

    /**
     * ����latitudeSe���Ե�ֵ��
     * 
     */
    public void setLatitudeSe(int value) {
        this.latitudeSe = value;
    }

    /**
     * ��ȡlongitudeNw���Ե�ֵ��
     * 
     */
    public int getLongitudeNw() {
        return longitudeNw;
    }

    /**
     * ����longitudeNw���Ե�ֵ��
     * 
     */
    public void setLongitudeNw(int value) {
        this.longitudeNw = value;
    }

    /**
     * ��ȡlongitudeSe���Ե�ֵ��
     * 
     */
    public int getLongitudeSe() {
        return longitudeSe;
    }

    /**
     * ����longitudeSe���Ե�ֵ��
     * 
     */
    public void setLongitudeSe(int value) {
        this.longitudeSe = value;
    }

}
