package com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;

public interface IProductConsumer {
	  Product consumeProductConsult(FindProductRequest request);
}
