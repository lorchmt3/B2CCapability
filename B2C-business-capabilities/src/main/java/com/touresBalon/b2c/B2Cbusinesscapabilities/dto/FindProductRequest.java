package com.touresBalon.b2c.B2Cbusinesscapabilities.dto;

public class FindProductRequest {
	private int idProduct;
	private String nameProduct;
	private String description;
	private boolean filtered;
	
	public FindProductRequest() {
		
	}
	
	public int getIdProduct() {
		return idProduct;
	}
	
	public String getNameProduct() {
		return nameProduct;
	}
	
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isFiltered() {
		return filtered;
	}
	
	public void setFiltered(boolean filtered) {
		this.filtered = filtered;
	}

}
