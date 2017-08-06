
package com.scyb.aisweather.webservice.client.WarnTc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>tropicalCycloneWarnBo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡdirection���Ե�ֵ��
     * 
     */
    public int getDirection() {
        return direction;
    }

    /**
     * ����direction���Ե�ֵ��
     * 
     */
    public void setDirection(int value) {
        this.direction = value;
    }

    /**
     * ��ȡspeed���Ե�ֵ��
     * 
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * ����speed���Ե�ֵ��
     * 
     */
    public void setSpeed(int value) {
        this.speed = value;
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

    /**
     * ��ȡwindPower���Ե�ֵ��
     * 
     */
    public int getWindPower() {
        return windPower;
    }

    /**
     * ����windPower���Ե�ֵ��
     * 
     */
    public void setWindPower(int value) {
        this.windPower = value;
    }

}
