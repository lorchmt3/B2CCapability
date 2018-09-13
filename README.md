# B2CCapability

Servicio contiene operaciones con los productos

# Firmas del producto

# Firma búsqueda de productos (..../b2c/api/getProductList)

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

# Firma búsqueda de producto (..../b2c/api/getProduct)

1. 
{
	"idProduct": 2
}


