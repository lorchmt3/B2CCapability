package com.touresBalon.b2c.B2Cbusinesscapabilities.consumer;

import java.util.Date;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductConsumer;

public class ProductBDConsumer implements IProductConsumer{

	@Override
	public Product consumeProductConsult(FindProductRequest request) {
		// aqui va la conexion de BD
		
		//mientras tanto se mapea objeto Producto
		Product product = new Product((long) 1233,"hotel Zuana",new Date(),new Date(),new Date(),2,3,4,"ubicacion Santa Marta","H001","image.png",5,5);
		return product;
	}

	
}
