package com.touresBalon.b2c.B2Cbusinesscapabilities.dto;

public class FindProductRequest {
	private String idProduct;
	private String nameProduct;
	
	public FindProductRequest() {
		
	}
	
	public String getIdProduct() {
		return idProduct;
	}
	
	public String getNameProduct() {
		return nameProduct;
	}
	
	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}
	
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

}
