package com.scyb.aisweather.webservice.bo;

/**
 * Created by foo on 2015/6/15.
 */
public class Picture {
    private String picTime;
    private String picPath;

    public String getPicTime() {
        return picTime;
    }

    public void setPicTime(String picTime) {
        this.picTime = picTime;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Picture picture = (Picture) o;

        if (picTime != null ? !picTime.equals(picture.picTime) : picture.picTime != null) return false;
        if (picPath != null ? !picPath.equals(picture.picPath) : picture.picPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = picTime != null ? picTime.hashCode() : 0;
        result = 31 * result + (picPath != null ? picPath.hashCode() : 0);
        return result;
    }
}
