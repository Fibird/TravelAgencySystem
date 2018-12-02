package cn.edu.ruc.lab505.client.model;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

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
    @Column(name = "airlineid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "departure")
    @NotEmpty(message = "*Please provide airline departure")
    private String departure;
    
    @Column(name = "destination")
    @NotEmpty(message = "*Please provide airline destination")
    private String destination;
    
    @Column(name = "departureTime")
//    @NotNull(message = "*Please provide airline departureTime")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm") 
    private String departureTime;
    
    @Column(name = "arrivalTime")
//    @NotNull(message = "*Please provide airline arrivalTime")
//    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private String arrivalTime;
    
    @Column(name = "airlinePrice")
    @NotNull(message = "*Please provide your airline price")
    private float airlinePrice;
    
    @Column(name = "remainNum")
    @NotNull(message = "*Please provide airline remaining")
    private float remainNum;
    
    @Column(name = "duration")
    @NotNull(message = "*Please provide airline duration")
    private float duration;

    @Column(name = "status")
    @NotNull(message = "*Please provide airline status,1-normal,2-offline,3-delete")
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
    @Override
	public String toString() {
		return "Airline [id=" + id + ", departure=" + departure + ", destination=" + destination + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + ", airlinePrice=" + airlinePrice + ", remainNum="
				+ remainNum + ", duration=" + duration + ", status=" + status + "]";
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
    
    public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}
    public String getDepartureTime() {
		return departureTime;
	}
    
    public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
    public String getArrivalTime() {
		return arrivalTime;
	}
    
    public void setAirlinePrice(float airlinePrice) {
		this.airlinePrice = airlinePrice;
	}
    public float getAirlinePrice() {
		return airlinePrice;
	}
    
    public void setRemainNum(float remainNum) {
		this.remainNum = remainNum;
	}
    public float getRemainNum() {
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
