package com.touresBalon.b2c.B2Cbusinesscapabilities.consumer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.touresBalon.b2c.B2Cbusinesscapabilities.entities.Product;

@Repository("PRODUCT")
public interface IProductRepositoryConsumer extends JpaRepository<Product, String> {
//	Product consumeProductConsult(FindProductRequest request);
//
//	List<Product> consumeProductListConsult();
}
