package com.touresBalon.b2c.B2Cbusinesscapabilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Transport", schema = "dbo")
public class Transport  {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
 	@Column(name = "idTransport")
	private int idTransport;
	@Column(name = "money")
	private float money;
	@Column(name = "name")
	private String name;
	
	public Transport() {
	}

	public Transport(int idTransport, float money, String name) {
		super();
		this.idTransport = idTransport;
		this.money = money;
		this.name = name;
	}

	public int getIdTransport() {
		return idTransport;
	}

	public void setIdTransport(int idTransport) {
		this.idTransport = idTransport;
	}

	public float getMoney() {
		return money;
	}

	public void setMoney(float money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
