package com.touresBalon.b2c.B2Cbusinesscapabilities.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FindProductRequestTest {

	@Test
	public void createContactPhoneEmptyConstructor() {
		// setup
		FindProductRequest findProductRequest;
		// execution
		findProductRequest = new FindProductRequest();
		// assertions
		assertNotNull(findProductRequest);
	}
	
	@Test
    public void getContactPhoneWithDataBySetters() {
        // setup
		FindProductRequest findProductRequest;

        // execution
		findProductRequest = new FindProductRequest();

		findProductRequest.setIdProduct(123);
		findProductRequest.setNameProduct("final copa del rey");
		findProductRequest.setDescription("partido final");
		findProductRequest.setFiltered(true);
		
        // assertions
        assertNotNull(findProductRequest);
        assertEquals(123, findProductRequest.getIdProduct());
        assertEquals("final copa del rey", findProductRequest.getNameProduct());
        assertEquals("partido final", findProductRequest.getDescription());
        assertEquals(true, findProductRequest.isFiltered());
    }
	
	

}
