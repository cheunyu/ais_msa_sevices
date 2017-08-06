
package com.scyb.aisweather.webservice.client.AreaRectangle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>demarcatedRectangleBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取latitudeNw属性的值。
     * 
     */
    public int getLatitudeNw() {
        return latitudeNw;
    }

    /**
     * 设置latitudeNw属性的值。
     * 
     */
    public void setLatitudeNw(int value) {
        this.latitudeNw = value;
    }

    /**
     * 获取latitudeSe属性的值。
     * 
     */
    public int getLatitudeSe() {
        return latitudeSe;
    }

    /**
     * 设置latitudeSe属性的值。
     * 
     */
    public void setLatitudeSe(int value) {
        this.latitudeSe = value;
    }

    /**
     * 获取longitudeNw属性的值。
     * 
     */
    public int getLongitudeNw() {
        return longitudeNw;
    }

    /**
     * 设置longitudeNw属性的值。
     * 
     */
    public void setLongitudeNw(int value) {
        this.longitudeNw = value;
    }

    /**
     * 获取longitudeSe属性的值。
     * 
     */
    public int getLongitudeSe() {
        return longitudeSe;
    }

    /**
     * 设置longitudeSe属性的值。
     * 
     */
    public void setLongitudeSe(int value) {
        this.longitudeSe = value;
    }

}
