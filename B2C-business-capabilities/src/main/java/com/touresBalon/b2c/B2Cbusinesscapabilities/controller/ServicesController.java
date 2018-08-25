package com.touresBalon.b2c.B2Cbusinesscapabilities.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
@RequestMapping("${adl.endpoint.base}")
@CrossOrigin(origins = "*", exposedHeaders ="dato1, dato2" )
public class ServicesController {

//  @Autowired private Interfaz interfaz;
	
//	este es la clase que recibe 

  @RequestMapping(
      value = "/getProducts",
      method = RequestMethod.POST,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Object> metodo(String parametros) {
	  return null;
  }

}
