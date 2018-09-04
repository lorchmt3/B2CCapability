package com.touresBalon.b2c.B2Cbusinesscapabilities.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductConsumer;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductMapper;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductService;


@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private IProductConsumer otpConsumer;

	@Autowired
	private IProductMapper otpMapper;

	@Override
	public BaseProductResponse findProductById(FindProductRequest request) {
//		ValidateOTP validateOTPRequest = otpMapper.buildValidateOTPRequest(bankOTPValidationRequest);
		Product productResponse = otpConsumer.consumeProductConsult(request);
		return otpMapper.buildProductResponse(productResponse);
	}

	@Override
	public List<BaseProductResponse> findAllProducts() {
		
		List<Product> productsList = otpConsumer.consumeProductListConsult();
		
		return otpMapper.buildProductListResponse(productsList);
	}
	
	
}
