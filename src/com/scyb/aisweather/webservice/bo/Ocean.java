package com.scyb.aisweather.webservice.bo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by foo on 2015/6/15.
 */
public class Ocean {
    private String guid;
    private String oceanName;
    private String forecastTime;
    private String phenomenon;
    private String windDirection;
    private String windPower;
    private BigDecimal waveHigh;
    private Integer visibility;
    private Timestamp createDate;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getOceanName() {
        return oceanName;
    }

    public void setOceanName(String oceanName) {
        this.oceanName = oceanName;
    }

    public String getForecastTime() {
        return forecastTime;
    }

    public void setForecastTime(String forecastTime) {
        this.forecastTime = forecastTime;
    }

    public String getPhenomenon() {
        return phenomenon;
    }

    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWindPower() {
        return windPower;
    }

    public void setWindPower(String windPower) {
        this.windPower = windPower;
    }

    public BigDecimal getWaveHigh() {
        return waveHigh;
    }

    public void setWaveHigh(BigDecimal waveHigh) {
        this.waveHigh = waveHigh;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ocean ocean = (Ocean) o;

        if (guid != null ? !guid.equals(ocean.guid) : ocean.guid != null) return false;
        if (oceanName != null ? !oceanName.equals(ocean.oceanName) : ocean.oceanName != null) return false;
        if (forecastTime != null ? !forecastTime.equals(ocean.forecastTime) : ocean.forecastTime != null) return false;
        if (phenomenon != null ? !phenomenon.equals(ocean.phenomenon) : ocean.phenomenon != null) return false;
        if (windDirection != null ? !windDirection.equals(ocean.windDirection) : ocean.windDirection != null)
            return false;
        if (windPower != null ? !windPower.equals(ocean.windPower) : ocean.windPower != null) return false;
        if (waveHigh != null ? !waveHigh.equals(ocean.waveHigh) : ocean.waveHigh != null) return false;
        if (visibility != null ? !visibility.equals(ocean.visibility) : ocean.visibility != null) return false;
        if (createDate != null ? !createDate.equals(ocean.createDate) : ocean.createDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (oceanName != null ? oceanName.hashCode() : 0);
        result = 31 * result + (forecastTime != null ? forecastTime.hashCode() : 0);
        result = 31 * result + (phenomenon != null ? phenomenon.hashCode() : 0);
        result = 31 * result + (windDirection != null ? windDirection.hashCode() : 0);
        result = 31 * result + (windPower != null ? windPower.hashCode() : 0);
        result = 31 * result + (waveHigh != null ? waveHigh.hashCode() : 0);
        result = 31 * result + (visibility != null ? visibility.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Ocean{" +
                "oceanName='" + oceanName + '\'' +
                ", forecastTime='" + forecastTime + '\'' +
                ", phenomenon='" + phenomenon + '\'' +
                ", windDirection='" + windDirection + '\'' +
                ", windPower='" + windPower + '\'' +
                ", waveHigh=" + waveHigh +
                ", visibility=" + visibility +
                ", createDate=" + createDate +
                '}';
    }
}
