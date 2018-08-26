package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Despues usamos JPA para la generacion de estas clases
@Entity
public class Product {
	
	 	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
	    private String name;
	    private Date spectacle_date;
	    private Date arrival_date;
	    private Date departure_date;
		private int transport_type;
		private int spectacle_type;
		private int logying_type;
		private String description;
		private String code;
		private String image_ref;
		private int source_city;
		private int target_city;
		
		public Product() {
		}
		
		
		public Product(Long id, String name, Date spectacle_date, Date arrival_date, Date departure_date,
				int transport_type, int spectacle_type, int logying_type, String description, String code,
				String image_ref, int source_city, int target_city) {
			super();
			this.id = id;
			this.name = name;
			this.spectacle_date = spectacle_date;
			this.arrival_date = arrival_date;
			this.departure_date = departure_date;
			this.transport_type = transport_type;
			this.spectacle_type = spectacle_type;
			this.logying_type = logying_type;
			this.description = description;
			this.code = code;
			this.image_ref = image_ref;
			this.source_city = source_city;
			this.target_city = target_city;
		}



		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Date getSpectacle_date() {
			return spectacle_date;
		}
		public void setSpectacle_date(Date spectacle_date) {
			this.spectacle_date = spectacle_date;
		}
		public Date getArrival_date() {
			return arrival_date;
		}
		public void setArrival_date(Date arrival_date) {
			this.arrival_date = arrival_date;
		}
		public Date getDeparture_date() {
			return departure_date;
		}
		public void setDeparture_date(Date departure_date) {
			this.departure_date = departure_date;
		}
		public int getTransport_type() {
			return transport_type;
		}
		public void setTransport_type(int transport_type) {
			this.transport_type = transport_type;
		}
		public int getSpectacle_type() {
			return spectacle_type;
		}
		public void setSpectacle_type(int spectacle_type) {
			this.spectacle_type = spectacle_type;
		}
		public int getLogying_type() {
			return logying_type;
		}
		public void setLogying_type(int logying_type) {
			this.logying_type = logying_type;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getImage_ref() {
			return image_ref;
		}
		public void setImage_ref(String image_ref) {
			this.image_ref = image_ref;
		}
		public int getSource_city() {
			return source_city;
		}
		public void setSource_city(int source_city) {
			this.source_city = source_city;
		}
		public int getTarget_city() {
			return target_city;
		}
		public void setTarget_city(int target_city) {
			this.target_city = target_city;
		}
		
		

}
