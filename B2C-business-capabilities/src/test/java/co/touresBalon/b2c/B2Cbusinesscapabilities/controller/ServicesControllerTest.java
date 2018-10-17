package co.touresBalon.b2c.B2Cbusinesscapabilities.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.touresBalon.b2c.B2Cbusinesscapabilities.controller.ServicesController;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.BaseProductResponse;
import com.touresBalon.b2c.B2Cbusinesscapabilities.dto.FindProductRequest;
import com.touresBalon.b2c.B2Cbusinesscapabilities.impl.ProductServiceImpl;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ServicesControllerTest {

	@Mock
	ProductServiceImpl service;

	@InjectMocks
	ServicesController controller;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	  public void testSimulateCredit() {
	    // setup
	    BaseProductResponse responseExpected;
	    responseExpected = new BaseProductResponse();
	    responseExpected.setCode("0");
	    responseExpected.setName("partido copa del rey");
	    
	    FindProductRequest findProductRequest =
		        new FindProductRequest(
		            123,
		            "copa del rey",
		            "partido final",
		            true);

	    when(service.findProductById(findProductRequest)).thenReturn(responseExpected);
	    
	    // execution
	    ResponseEntity<BaseProductResponse> response = controller.getProduct(findProductRequest);
	    // assertions
	    assertNotNull(response);
	    assertNotNull(responseExpected.getCode(), response.getBody().getCode());
	  }

}
