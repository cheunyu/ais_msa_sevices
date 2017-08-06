package com.scyb.aisweather.webservice.bo;

/**
 * Created by foo on 2015/4/9.
 */
public class BroadcastMMSIBo {
    private int source_id;

    private int destination_id;

    public int getSource_id() {
        return source_id;
    }

    public void setSource_id(int source_id) {
        this.source_id = source_id;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public void setDestination_id(int destination_id) {
        this.destination_id = destination_id;
    }

    public BroadcastMMSIBo(int source_id, int destination_id) {
        this.source_id = source_id;
        this.destination_id = destination_id;
    }

    public BroadcastMMSIBo() {
    }

    @Override
    public String toString() {
        return "BroadcastMMSIBo{" +
                "source_id=" + source_id +
                ", destination_id=" + destination_id +
                '}';
    }
}
