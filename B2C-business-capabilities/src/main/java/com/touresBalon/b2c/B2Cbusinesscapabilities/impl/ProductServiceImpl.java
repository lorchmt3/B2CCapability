package com.touresBalon.b2c.B2Cbusinesscapabilities.impl;

import java.util.List;

import org.hibernate.annotations.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touresBalon.b2c.B2Cbusinesscapabilities.consumer.IProductRepositoryConsumer;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductMapper;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductService;


@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductRepositoryConsumer otpConsumer;

	@Autowired
	private IProductMapper otpMapper;

	@Override
	public BaseProductResponse findProductById(FindProductRequest request) {
//		ValidateOTP validateOTPRequest = otpMapper.buildValidateOTPRequest(bankOTPValidationRequest);
//		Product productResponse = otpConsumer.consumeProductConsult(request);
		Product productResponse = otpConsumer.findById(request.getIdProduct());
		return otpMapper.buildProductResponse(productResponse);
	}

	@Override
	public List<BaseProductResponse> findAllProducts(FindProductRequest request) {
		List<Product> productsList;
		if(request.isFiltered()) {
			String productToChange = request.getNameProduct();
			String descriptionToChange = request.getDescription();
			 String product = productToChange.replace('*', '%');
			 String description = descriptionToChange.replace('*', '%');
			 productsList = otpConsumer.findByNameAndDescription(product, description);
//			 productsList = otpConsumer.findByNameAndDescription("%"+request.getNameProduct()+"%", "%"+request.getDescription()+"%");
		}else {
			 productsList = otpConsumer.findAll();
		}
		
		return otpMapper.buildProductListResponse(productsList);
	}
	
	
}
