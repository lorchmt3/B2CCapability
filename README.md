# B2CCapability

Servicio contiene operaciones con los productos

## Firmas del producto

 Firma búsqueda de productos (..../b2c/api/getProductList)
 paginación(ejemplo-endpoint): /b2c/api/getProductList?page=0&size=4
1.  Se filtra por nombre o descripcion


```json
{
  "nameProduct" : "copa*",	
  "description" : "copa*",
  "filtered" : true
}
```

```json
{
  "nameProduct" : "*rey*",	
  "description" : "*libertadores*",
  "filtered" : true
}
```

Los campos "nameProduct" y "description" son opcionales

##### COMODINES

Ejemplos :


	1.1 Empieza con esta expresión: copa*
	1.2 Termina con esta expresión: *copa
	1.3 Cualquier valor que contenga esta expresión: *copa*
	

2. Se requiere traer todos los productos(sin filtro alguno) 
   paginación(ejemplo-endpoint): /b2c/api/getProductList?page=0&size=4

```json
{
  "filtered": false	
}
```

##### Firma búsqueda de UN producto (..../b2c/api/getProduct)

```json
{
  "idProduct": 2	
}
```


#### Firma Response:

```json
[
	{
		"name": "partido futbol 123",
		"price": 600000,
		"spectacle_date": "2018-09-09 19:21:01.0",
		"arrival_date": "2018-09-09 19:21:01.0",
		"departure_date": "2018-09-09 19:21:01.0",
		"transport_type": "aéreo",
		"spectacle_type": "deportes",
		"logying_type": 1,
		"description": "evento deportivo",
		"code": "PR001",
		"image_ref": "/img001.png",
		"source_city": "Bogota",
		"target_city": "Medellin",
		"id": 1
	},
	{
		"name": "tercer producto",
		"price": 800000,
		"spectacle_date": "2018-09-12 20:26:39.0",
		"arrival_date": "2018-09-12 20:26:39.0",
		"departure_date": "2018-09-12 20:26:39.0",
		"transport_type": "aéreo",
		"spectacle_type": "deportes",
		"logying_type": 1,
		"description": "partido barcelona",
		"code": "PR001",
		"image_ref": "/img003.png",
		"source_city": "Bogota",
		"target_city": "Medellin",
		"id": 3
	}
]
```

