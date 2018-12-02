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
@Table(name = "guides")
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "guideId")
    private long id;
    
    @Column(name = "guideGender")
    @NotEmpty(message = "*Please provide guide gender,1:male,2:female")
    private boolean gender;
    
    @Column(name = "guideAge")
    @NotEmpty(message = "*Please provide guide age")
    private int age;
    
    @Column(name = "guideName")
    @NotEmpty(message = "*Please provide guide name")
    private String name;
    
    
    @Column(name = "guidePhone")
    @NotEmpty(message = "*Please provide guide phone")
    private String phone;
    
    @Column(name = "guideState")
    @NotEmpty(message = "*Please provide guide state")
    private String state;
    
    @Column(name = "guideCity")
    @NotEmpty(message = "*Please provide guide city")
    private String city;
    
    @Column(name = "guideAttractionId")
    @NotEmpty(message = "*Please provide the Attraction Id which guide is familar with")
    private long attractionId;
    
    @Column(name = "guideComment")
    @NotEmpty(message = "*Please provide guide comment")
    private int comment;
    
    @Column(name = "guidePrice")
    @NotEmpty(message = "*Please provide guide price for this attraction")
    private int price; 
    
    
    public void setId(long id) {
		this.id = id;
	}
    public long getId() {
		return id;
	}
    
    public void setGender(boolean gender) {
		this.gender = gender;
	}
    public boolean getGender() {
		return gender;
	}
    
    public void setAge(int age) {
		this.age = age;
	}
    public int getAge() {
		return age;
	}
    
    public void setName(String name) {
		this.name = name;
	}
    public String getName() {
		return name;
	}
    
    public void setPhone(String phone) {
		this.phone = phone;
	}
    public String getPhone() {
		return phone;
	}
    
    public void setState(String state) {
		this.state = state;
	}
    public String getState() {
		return state;
	}
    
    public void setCity(String city) {
		this.city = city;
	}
    public String getCity() {
		return city;
	}
    
    public void setAttractionId(long AttractionId) {
		this.attractionId = AttractionId;
	}
    public long getAttractionId() {
		return attractionId;
	}
    
    public void setComment(int comment) {
		this.comment = comment;
	}
    
    public int getComment() {
		return comment;
	}
    
    public void setPrice(int price) {
    	this.price = price;
	}
    public int getPrice() {
		return price;
	}
}
