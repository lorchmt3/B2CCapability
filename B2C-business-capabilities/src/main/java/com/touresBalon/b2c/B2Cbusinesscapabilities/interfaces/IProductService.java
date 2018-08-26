package com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;

public interface IProductService {
	BaseProductResponse findProductById (FindProductRequest request);
	

}
