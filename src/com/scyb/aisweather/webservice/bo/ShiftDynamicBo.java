/**     
 * @Title: ShiftDynamicBo.java    
 * @Package com.scyb.aisweather.webservice.bo   
 * @Description: TODO(用一句话描述该文件做什么)    
 * @author A18ccms A18ccms_gmail_com     
 * @date 2014年12月15日 下午2:31:54    
 * @version V1.0    
 */
package com.scyb.aisweather.webservice.bo;

import java.util.List;

/**
 *      @ClassName: ShiftDynamicBo     @Description: TODO(助航标注动态移位)   
 *  @author cheunyu xiaoyuuii@hotmail.com  @date 2014年12月15日 下午2:31:54      
 *     
 */
public class ShiftDynamicBo extends AidsMarkedDynamicBo {

	/**
	 *      @Fields longitude1 : TODO(经度)   
	 */
	private Integer longitudeStart;

	/**
	 *      @Fields latitude1 : TODO(纬度)   
	 */
	private Integer latitudeStart;

	/**
	 *      @Fields longitude2 : TODO(经度)   
	 */
	private Integer longitudeEnd;

	/**
	 *      @Fields latitude2 : TODO(纬度)   
	 */
	private Integer latitudeEnd;

	/**
	 *      @Fields type : TODO(航标类型)   
	 */
	private int type;

	public ShiftDynamicBo() {
	}

	public ShiftDynamicBo(Integer longitudeStart, Integer latitudeStart, Integer longitudeEnd, Integer latitudeEnd, int type) {
		this.longitudeStart = longitudeStart;
		this.latitudeStart = latitudeStart;
		this.longitudeEnd = longitudeEnd;
		this.latitudeEnd = latitudeEnd;
		this.type = type;
	}

	public ShiftDynamicBo(int range, int status, Integer longitudeStart, Integer latitudeStart, Integer longitudeEnd, Integer latitudeEnd, int type) {
		super(range, status);
		this.longitudeStart = longitudeStart;
		this.latitudeStart = latitudeStart;
		this.longitudeEnd = longitudeEnd;
		this.latitudeEnd = latitudeEnd;
		this.type = type;
	}

	public ShiftDynamicBo(int source_id, int destination_id, int range, int status, Integer longitudeStart, Integer latitudeStart, Integer longitudeEnd, Integer latitudeEnd, int type) {
		super(source_id, destination_id, range, status);
		this.longitudeStart = longitudeStart;
		this.latitudeStart = latitudeStart;
		this.longitudeEnd = longitudeEnd;
		this.latitudeEnd = latitudeEnd;
		this.type = type;
	}

	public Integer getLongitudeStart() {
		return longitudeStart;
	}

	public void setLongitudeStart(Integer longitudeStart) {
		this.longitudeStart = longitudeStart;
	}

	public Integer getLatitudeStart() {
		return latitudeStart;
	}

	public void setLatitudeStart(Integer latitudeStart) {
		this.latitudeStart = latitudeStart;
	}

	public Integer getLongitudeEnd() {
		return longitudeEnd;
	}

	public void setLongitudeEnd(Integer longitudeEnd) {
		this.longitudeEnd = longitudeEnd;
	}

	public Integer getLatitudeEnd() {
		return latitudeEnd;
	}

	public void setLatitudeEnd(Integer latitudeEnd) {
		this.latitudeEnd = latitudeEnd;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ShiftDynamicBo{" +
				"longitudeStart=" + longitudeStart +
				", latitudeStart=" + latitudeStart +
				", longitudeEnd=" + longitudeEnd +
				", latitudeEnd=" + latitudeEnd +
				", type=" + type +
				'}';
	}
}
