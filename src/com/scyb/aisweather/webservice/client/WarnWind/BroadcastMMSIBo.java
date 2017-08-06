
package com.scyb.aisweather.webservice.client.WarnWind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for broadcastMMSIBo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="broadcastMMSIBo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="source_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "broadcastMMSIBo", propOrder = {
    "destinationId",
    "sourceId"
})
@XmlSeeAlso({
    MarineWeatherWarnBo.class
})
public class BroadcastMMSIBo {

    @XmlElement(name = "destination_id")
    protected int destinationId;
    @XmlElement(name = "source_id")
    protected int sourceId;

    /**
     * Gets the value of the destinationId property.
     * 
     */
    public int getDestinationId() {
        return destinationId;
    }

    /**
     * Sets the value of the destinationId property.
     * 
     */
    public void setDestinationId(int value) {
        this.destinationId = value;
    }

    /**
     * Gets the value of the sourceId property.
     * 
     */
    public int getSourceId() {
        return sourceId;
    }

    /**
     * Sets the value of the sourceId property.
     * 
     */
    public void setSourceId(int value) {
        this.sourceId = value;
    }

}
