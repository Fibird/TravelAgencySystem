package cn.edu.ruc.lab505.client.model;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "airlines")
public class Airline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "airlineid")
    private long id;
    
    @Column(name = "departure")
    @NotEmpty(message = "*Please provide airline departure")
    private String departure;
    
    @Column(name = "destination")
    @NotEmpty(message = "*Please provide airline destination")
    private String destination;
    
    @Column(name = "departureTime")
    @NotEmpty(message = "*Please provide airline departureTime")
    private Timestamp departureTime;
    
    @Column(name = "arrivalTime")
    @NotEmpty(message = "*Please provide airline arrivalTime")
    private Timestamp arrivalTime;
    
    @Column(name = "airlinePrice")
    @NotEmpty(message = "*Please provide your airline price")
    private long airlinePrice;
    
    @Column(name = "remainNum")
    @NotEmpty(message = "*Please provide airline remaining")
    private int remainNum;
    
    @Column(name = "duration")
    @NotEmpty(message = "*Please provide airline duration")
    private float duration;

    @Column(name = "status")
    @NotEmpty(message = "*Please provide airline status,1-normal,2-offline,3-delete")
    private int status;
    
    public void setId(int id) {
		this.id = id;
	}
    public long getId() {
		return id;
	}
    
    public void setDeparture(String departure) {
		this.departure = departure;
	}
    public String getDeparture() {
		return departure;
	}
    
    public void setDestination(String destination) {
    	this.destination = destination;
    }
    public String getDestination() {
		return destination;
	}
    
    public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}
    public Timestamp getDepartureTime() {
		return departureTime;
	}
    
    public void setArrivalTime(Timestamp arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
    public Timestamp getArrivalTime() {
		return arrivalTime;
	}
    
    public void setAirlinePrice(long airlinePrice) {
		this.airlinePrice = airlinePrice;
	}
    public long getAirlinePrice() {
		return airlinePrice;
	}
    
    public void setRemainNum(int remainNum) {
		this.remainNum = remainNum;
	}
    public int getRemainNum() {
		return remainNum;
	}
    
    public void setDuration(float duration) {
		this.duration = duration;
	}
    public float getDuration() {
    	return duration;
	}
    
    public void setStatus(int status) {
		this.status = status;
	}
    public int getStatus() {
		return status;
	}
}
