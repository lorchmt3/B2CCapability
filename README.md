# B2CCapability

Servicio contiene operaciones con los productos

## Firmas del producto

 Firma búsqueda de productos (..../b2c/api/getProductList)

1.  Se filtra por nombre o descripcion

{

	"nameProduct" : "partido",
	
	"description" : "evento",
	
	"filtered" : true
	
}

Los campos "nameProduct" y "description" son opcionales

2. Se requiere traer todos los productos

{

	"filtered" : false
	
}

>> Firma búsqueda de producto (..../b2c/api/getProduct)

1. 
{

	"idProduct": 2
	
}

FIRMA RESPONSE (EJEMPLO)

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


