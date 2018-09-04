package com.touresBalon.b2c.B2Cbusinesscapabilities.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductMapper;
@Service
public class ProductMapper implements IProductMapper {

	@Override
	public BaseProductResponse buildProductResponse(Product productInfoResponse) {
		BaseProductResponse productResponse = new BaseProductResponse();
		productResponse.setCode(productInfoResponse.getCode());
		productResponse.setArrival_date(productInfoResponse.getArrival_date().toString());
		productResponse.setDeparture_date(productInfoResponse.getDeparture_date().toString());
		productResponse.setDescription(productInfoResponse.getDescription());
		productResponse.setImage_ref(productInfoResponse.getImage_ref());
		productResponse.setLogying_type(productInfoResponse.getLogying_type());
		productResponse.setName(productInfoResponse.getName());
		productResponse.setSource_city(productInfoResponse.getSource_city()!=0 ? "Bogota":"N/A");
		productResponse.setSpectacle_date(productInfoResponse.getSpectacle_date().toString());
		productResponse.setSpectacle_type(productInfoResponse.getSpectacle_type());
		productResponse.setTarget_city(productInfoResponse.getTarget_city()!=0 ? "Medellin":"N/A");
		productResponse.setTransport_type(productInfoResponse.getTransport_type());
		
		return productResponse;
	}

	@Override
	public List<BaseProductResponse> buildProductListResponse(List<Product> productsList) {
		List<BaseProductResponse> productList= new ArrayList<>();
		
		for(Product productInfoResponse: productsList) {
			BaseProductResponse productResponse = new BaseProductResponse();
			productResponse.setCode(productInfoResponse.getCode());
			productResponse.setArrival_date(productInfoResponse.getArrival_date().toString());
			productResponse.setDeparture_date(productInfoResponse.getDeparture_date().toString());
			productResponse.setDescription(productInfoResponse.getDescription());
			productResponse.setImage_ref(productInfoResponse.getImage_ref());
			productResponse.setLogying_type(productInfoResponse.getLogying_type());
			productResponse.setName(productInfoResponse.getName());
			productResponse.setSource_city(productInfoResponse.getSource_city()!=0 ? "Bogota":"N/A");
			productResponse.setSpectacle_date(productInfoResponse.getSpectacle_date().toString());
			productResponse.setSpectacle_type(productInfoResponse.getSpectacle_type());
			productResponse.setTarget_city(productInfoResponse.getTarget_city()!=0 ? "Medellin":"N/A");
			productResponse.setTransport_type(productInfoResponse.getTransport_type());
			productList.add(productResponse);
			
		}
		return productList;
	}

}
