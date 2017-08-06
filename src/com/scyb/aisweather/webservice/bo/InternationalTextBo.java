package com.scyb.aisweather.webservice.bo;

/**
 * Created by foo on 2015/4/13.
 */
public class InternationalTextBo extends BroadcastMMSIBo{

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public InternationalTextBo() {
    }

    public InternationalTextBo(int source_id, int destination_id, String content) {
        super(source_id, destination_id);
        this.content = content;
    }

    @Override
    public String toString() {
        return "InternationalText{" +
                "content='" + content + '\'' +
                '}';
    }
}
