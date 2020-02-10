# language: es
 Característica: Compra de articulos

Esquema del escenario: Como usuario existente y habilitado en el portal quiero realizar la compra de varios articulos para que los envíen a mi código postal

Dado Un <usuario> con <contrasena> se autentique exitosamente
Cuando Confirma la compra de algunos articulos
Y La informacion de envio para <nombre> <apellido> en <codigoPostal>
Entonces Debe ver un mensaje de envio exitoso
 Ejemplos:
 |usuario|contrasena|nombre|apellido|codigoPostal|
 |standard_user|secret_sauce|Felipe|Perez|400100 |