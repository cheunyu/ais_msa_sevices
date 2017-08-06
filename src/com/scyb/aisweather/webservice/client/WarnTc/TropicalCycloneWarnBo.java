
package com.scyb.aisweather.webservice.client.WarnTc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tropicalCycloneWarnBo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="tropicalCycloneWarnBo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://webservice.aisweather.scyb.com/}marineWeatherWarnBo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="windPower" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tropicalCycloneWarnBo", propOrder = {
    "direction",
    "speed",
    "type",
    "windPower"
})
public class TropicalCycloneWarnBo
    extends MarineWeatherWarnBo
{

    protected int direction;
    protected int speed;
    protected int type;
    protected int windPower;

    /**
     * 获取direction属性的值。
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * 获取speed属性的值。
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * 设置speed属性的值。
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
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

    /**
     * 获取windPower属性的值。
     * 
     */
    public int getWindPower() {
        return windPower;
    }

    /**
     * 设置windPower属性的值。
     * 
     */
    public void setWindPower(int value) {
        this.windPower = value;
    }

}
