package cn.edu.ruc.lab505.client.model;

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
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hotelId")
    private int id;
    
    @Column(name = "hotelName")
    @NotEmpty(message = "*Please provide hotel name")
    private String name;
    
    @Column(name = "hotelPhone")
    @NotEmpty(message = "*Please provide your phone numebr")
    private String phone;
    
    @Column(name = "hotelState")
    @NotEmpty(message = "*Please provide your the state of hotel")
    private String hotelState;
    
    @Column(name = "hotelCity")
    @NotEmpty(message = "*Please provide your the city of hotel")
    private String hotelCity;
    
    @Column(name = "hotelAddress")
    @NotEmpty(message = "*Please provide your hotel Address")
    private String address;


	@Column(name = "appintmentTime")
    @NotEmpty(message = "*Please provide your appintmeng time")
    private String appintmentTime;
    
    @Column(name = "hotelRemaining")
    @NotEmpty(message = "*Please provide your hotel remaining")
    private int hotelRemaining;
    
    @Column(name = "hotelStar")
    @NotEmpty(message = "*Please provide your hotel star")
    private int hotelStar;
    
    @Column(name = "hotelComment")
    @NotEmpty(message = "*Please provide your hotel comment")
    private int hotelComment;
    
    @Column(name = "hotelPrice")
    @NotEmpty(message = "*Please provide your hotel price")
    private long hotelPrice;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getHotelState() {
		return hotelState;
	}

	public void setHotelState(String hotelState) {
		this.hotelState = hotelState;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAppintmentTime() {
		return appintmentTime;
	}

	public void setAppintmentTime(String appintmentTime) {
		this.appintmentTime = appintmentTime;
	}

	public int getHotelRemaining() {
		return hotelRemaining;
	}

	public void setHotelRemaining(int hotelRemaining) {
		this.hotelRemaining = hotelRemaining;
	}

	public int getHotelStar() {
		return hotelStar;
	}

	public void setHotelStar(int hotelStar) {
		this.hotelStar = hotelStar;
	}

	public int getHotelComment() {
		return hotelComment;
	}

	public void setHotelComment(int hotelComment) {
		this.hotelComment = hotelComment;
	}

	public long getHotelPrice() {
		return hotelPrice;
	}

	public void setHotelPrice(long hotelPrice) {
		this.hotelPrice = hotelPrice;
	}

}
