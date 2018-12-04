package cn.edu.ruc.lab505.client.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
@Table(name = "car_rental")
public class CarRental {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "carId")
    private int id;
    
    @Column(name = "carPlate")
    @NotEmpty(message = "Please provide car plate!")
    private String carPlate;
    
    @Column(name = "carBrand")
    @NotEmpty(message = "*Please provide car brand")
    private String brand;
    
    
    @Column(name = "carName")
    @NotEmpty(message = "*Please provide car name")
    private String name;
    
    @Column(name = "cartype")
    @NotNull(message = "*Please provide car type, 0 for ")
    private int carType;
    
    public String getCarPlate() {
		return carPlate;
	}
	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	public int getCarType() {
		return carType;
	}
	public void setCarType(int carType) {
		this.carType = carType;
	}
	@Column(name = "rentalLoc")
    @NotEmpty(message = "*Please provide car rental location")
    private String rentalLoc;
    
    @Column(name = "returnLoc")
    @NotEmpty(message = "*Please provide car return location")
    private String returnLoc;
    
    @Column(name = "carRemaining")
    @NotNull(message = "*Please provide car Remaining")
    private int carRemaining;
    
    @Column(name = "carPrice")
    @NotNull(message = "*Please provide car price")
    private long carPrice;
    
    public void setId(int id) {
    	this.id = id;
    }
    public int getId() {
    	return id;
    }
    
    public void setBrand(String brand) {
    	this.brand = brand;
	}
    public String getBrand() {
		return brand;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    public String getName() {
    	return name;
    }
    
    public void setType(int type) {
		this.carType = type;
	}
    public int getType() {
		return carType;
	}
    
    public void setRentalLoc(String loc) {
		this.rentalLoc = loc;
	}
    public String getRentalLoc() {
		return rentalLoc;
	}
    
    public void setReturnLoc(String loc) {
		this.returnLoc = loc;
	}
    public String getReturnLoc() {
		return returnLoc;
	}
    
    public void setCarRemaining(int remaining) {
		this.carRemaining = remaining;
	}
    public int getCarRemaining() {
		return carRemaining;
	}
    
    public void setCarPrice(long price) {
		this.carPrice = price;
	}
    public long getCarPrice() {
		return carPrice;
	}
}
