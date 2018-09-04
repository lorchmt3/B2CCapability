package com.touresBalon.b2c.B2Cbusinesscapabilities.consumer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;
import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;
import com.touresBalon.b2c.B2Cbusinesscapabilities.interfaces.IProductConsumer;

@Component
public class ProductBDConsumer implements IProductConsumer {

	@Override
	public Product consumeProductConsult(FindProductRequest request) {
		// aqui va la conexion de BD

		// mientras tanto se mapea objeto Producto
		Product product = new Product((long) 1233, "hotel Zuana", new Date(), new Date(), new Date(), 2, 3, 4,
				"ubicacion Santa Marta", "H001", "image.png", 5, 5);
		return product;
	}

	@Override
	public List<Product> consumeProductListConsult() {
		// aqui va la conexion de BD

		// mientras tanto se mapea objeto Producto
		List<Product> productList = new ArrayList<>();
		Product product = new Product((long) 1233, "hotel Zuana", new Date(), new Date(), new Date(), 2, 3, 4,
				"ubicacion Santa Marta", "H001", "image.png", 5, 5);
		productList.add(product);
		Product product2 = new Product((long) 1244, "hotel Decameron", new Date(), new Date(), new Date(), 2, 1, 5,
				"ubicacion Santa Marta", "H001", "image.png", 7, 1);
		productList.add(product2);
		return productList;
	}

}
