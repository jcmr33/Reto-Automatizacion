# Reto-Automatizacion
**Reto-Automatizacion**


**El proyecto tiene la siguiente estructura:**

- Un feature:ValidateProduct, con los pasos del casos de prueba.
- Un StepDefinition: ValidateProductStepDefinition, con la definición de los pasos de cada una de las tareas. 
- Un Runner: ValidateProductRunner, para ejecutar las pruebas
- Un Userinterface: MetroHomePage, para el mapeo de los objetos usados en la prueba
- Cuatro task: OpendBrowser, SearchProduct, AddProduct y ClicMinicart. Con cada una de las tareas de los pasos del caso de prueba.
- Una Question: TheResult, para tomar el nombre del producto agregado al carrito y validar que sea el mismo producto buscado. 

El  feature “ValidateProduct” que contiene el caso de prueba “Validar el producto agregado en el carrito”, con los siguientes pasos:

- Ingresar a la página www.metro.pe
- Busca un producto enviado por medio de Data Driven testing usando Example: escribe el producto en la barra de búsqueda y recorre la lista de los resultados de la búsqueda, cuando encuentra el producto abre el detalle del producto.
- Agregar el producto al carrito: desde el detalle del producto hace clic en el botón agregar al carrito.
- Abrir el carrito: clic para abrir el carrito 
- Validar producto agregado al carrito: valida que el producto agregado al carrito sea el mismo producto buscado. 

**Ejecución del caso de prueba:**

Se hace en el CMD, desde la ruta del proyecto, se debe usar este comando: 
gradle clean test --tests ValidateProductRunner aggregate  
 
**Detalle del comando:**
- gradle clean: Borra evidencias de la ejecución anterior.
- test --tests: para ejecutar los casos.
- ValidateProductRunner corresponde al Runner que se va a ejecutar
- aggregate: Crea las evidencias. 
