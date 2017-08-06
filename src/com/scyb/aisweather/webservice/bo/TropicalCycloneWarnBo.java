/**     
 * @Title: TropicalCycloneWarn.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月11日 下午2:28:24    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

/**
 *      @ClassName: TropicalCycloneWarn   
 *  @Description: TODO(这里用一句话描述这个类的作用)     @author cheunyu xiaoyuuii@hotmail.com
 *  @date 2014年12月11日 下午2:28:24           
 */
public class TropicalCycloneWarnBo extends MarineWeatherWarnBo {

	/**
	 *      @Fields type : TODO(气旋类型)   
	 */
	private int type;

	/**
	 *      @Fields speed : TODO(移动速度)   
	 */
	private int speed;

	/**
	 *      @Fields direction : TODO(移动方向)   
	 */
	private int direction;

	/**
	 *      @Fields windPower : TODO(中心风力)   
	 */
	private int windPower;

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the direction
	 */
	public int getDirection() {
		return direction;
	}

	/**
	 * @param direction
	 *            the direction to set
	 */
	public void setDirection(int direction) {
		this.direction = direction;
	}

	/**
	 * @return the windPower
	 */
	public int getWindPower() {
		return windPower;
	}

	/**
	 * @param windPower
	 *            the windPower to set
	 */
	public void setWindPower(int windPower) {
		this.windPower = windPower;
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 */
	public TropicalCycloneWarnBo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param longitude
	 * @param latitude
	 * @param rad
	 * @param dateTime
	 * @param range
	 * @param type
	 */
	public TropicalCycloneWarnBo(int longitude, int latitude, int rad, long dateTime, int range, int type) {
		super(longitude, latitude, rad, dateTime, range, type);
		// TODO Auto-generated constructor stub
	}

	/**
	 * <p>
	 * Title:
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param type
	 * @param speed
	 * @param direction
	 * @param windPower
	 */
	public TropicalCycloneWarnBo(int type, int speed, int direction, int windPower) {
		super();
		this.type = type;
		this.speed = speed;
		this.direction = direction;
		this.windPower = windPower;
	}

	/**
	 *  (非 Javadoc)     
	 * <p>
	 * Title: toString
	 * </p>
	 *     
	 * <p>
	 * Description: 
	 * </p>
	 *     @return     @see java.lang.Object#toString()   
	 */
	@Override
	public String toString() {
		return "TropicalCycloneWarn [type=" + type + ", speed=" + speed + ", direction=" + direction + ", windPower=" + windPower + "]";
	}

}
