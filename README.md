# Shopping Car
Shopping Car - Using multiple Maven modules based off typical project separation
 
**To build:**<br/>
You must have Java JDK 8, Maven installed
From this project's root directory (parent direcotry) type in the terminal:** mvn clean install** This will compile the project 

**To run:**</br>
Then Navigate to the parent's subproject directory: web directory and type: **mvn jetty:run**

** Then use the URL: http: // localhost: 8080 ** to see the project in the browser
 
NOTES:
------
The application is made with the Java language in its version 8, using a ZK Ria presentation framework, and in the persistence I use Mybatis, the database used is HSQLDB configured in memory, it uses SQL standard for greater ease for this test


MyBatis
-------

The files \*Mapper.xml contain the queries of each entity and each "Mapper" each of these has a file \*Mapper.java which is represented in as an interface, using the principle of convergence by configuration.

CategoryMapper.xml 		--> CategoryMapper.java
ProductMapper.xml		--> ProductMapper.java
ShoppingCarMapper.xml	--> ShoppingCarMapper.java


Each "Mapper" can be used by a service and this service in turn can have several "Mapper" in use

Spring
-------
With the spring framework I delegate the responsibility to inject the services, mapper and controllers of pages and transactions.

ZK
-------

In the presentation I use the ZK Ria framework with the MVVM archetypal pattern


# Carro de compras
Uso de múltiples módulos de Maven basados ​​en la separación típica de proyectos

** Para construir: ** <br/>
Debes  tener Java JDK 8, Maven instalado
Desde el directorio raíz de este proyecto escribe en el terminal: ** mvn clean install ** Esto compilará el proyecto

** Para ejecutar: ** </ br>
Luego navegue al directorio de subproyectos del padre: directorio *web* y escriba: ** mvn jetty: run **

** Luego usa la URL: http: // localhost: 8080 ** para ver el proyecto en el navegador

NOTAS:
------
La aplicación está hecha con el lenguaje Java en su versión 8, usando un marco de presentación ZK Ria, y en la persistencia que uso Mybatis, la base de datos utilizada es HSQLDB configurada en la memoria, utiliza el estándar SQL para una mayor facilidad para esta prueba.


MyBatis
-------

Los archivos \ * Mapper.xml contienen las consultas de cada entidad y cada "Mapper" tiene un archivo \ * Mapper.java que se representa en una interfaz, utilizando el principio de convergencia por configuración.

CategoryMapper.xml -> CategoryMapper.java
ProductMapper.xml -> ProductMapper.java
ShoppingCarMapper.xml -> ShoppingCarMapper.java


Cada "Mapper" puede ser utilizado por un servicio y este servicio a su vez puede tener varios "Mapper" en uso

Primavera
-------
Con Spring Framework delego la responsabilidad de inyectar los servicios, el asignador y los controladores de páginas y transacciones.

ZK
-------

En la presentación utilizo el framework ZK Ria con el patrón arquetípico MVVM

