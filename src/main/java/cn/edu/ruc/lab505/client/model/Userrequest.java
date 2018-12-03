package cn.edu.ruc.lab505.client.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import org.hibernate.validator.constraints.*;

import java.sql.Timestamp;
import java.util.Set;


public class Userrequest {

	    private int aim;

	    private Timestamp departure_time;

	    private Timestamp return_time;

	    private String depature_point;

	    private int cost;

		public int getAim() {
			return aim;
		}

		public Timestamp getDeparture_time() {
			return departure_time;
		}

		public Timestamp getReturn_time() {
			return return_time;
		}

		public String getDepature_point() {
			return depature_point;
		}

		public int getCost() {
			return cost;
		}
	
}
