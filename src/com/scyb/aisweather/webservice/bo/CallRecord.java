package com.scyb.aisweather.webservice.bo;

import java.sql.Timestamp;

/**
 * Created by foo on 2015/6/11.
 */
public class CallRecord {
    private String guid;
    private String username;
    private Timestamp calltime;
    private String servername;
    private String serverparams;
    private String vdl;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getCalltime() {
        return calltime;
    }

    public void setCalltime(Timestamp calltime) {
        this.calltime = calltime;
    }

    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername;
    }

    public String getServerparams() {
        return serverparams;
    }

    public void setServerparams(String serverparams) {
        this.serverparams = serverparams;
    }

    public String getVdl() {
        return vdl;
    }

    public void setVdl(String vdl) {
        this.vdl = vdl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CallRecord that = (CallRecord) o;

        if (guid != null ? !guid.equals(that.guid) : that.guid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (calltime != null ? !calltime.equals(that.calltime) : that.calltime != null) return false;
        if (servername != null ? !servername.equals(that.servername) : that.servername != null) return false;
        if (serverparams != null ? !serverparams.equals(that.serverparams) : that.serverparams != null) return false;
        if (vdl != null ? !vdl.equals(that.vdl) : that.vdl != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = guid != null ? guid.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (calltime != null ? calltime.hashCode() : 0);
        result = 31 * result + (servername != null ? servername.hashCode() : 0);
        result = 31 * result + (serverparams != null ? serverparams.hashCode() : 0);
        result = 31 * result + (vdl != null ? vdl.hashCode() : 0);
        return result;
    }
}
