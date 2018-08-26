package com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;

public interface IProductMapper {

	BaseProductResponse buildProductResponse(Product productInfoResponse);

}
