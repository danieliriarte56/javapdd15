#Patrones de Diseño
##Visitor
<dl>
  <dt>Definición</dt>
</dl>  
>Construye operaciones a realizar en los elementos de un conjunto de objetos.
>Se pueden agregar nuevas operaciones sin modificar las clases de estos objetos. 

La idea básica es que se tiene un conjunto de clases elemento que conforman la estructura de un objeto. Cada una de estas clases elemento tiene un método aceptar (accept()) que recibe al objeto visitante (visitor) como argumento. El **visitante** es una interfaz que tiene un método visit diferente para cada clase elemento; por tanto habrá implementaciones de la interfaz visitor de la forma: visitorClase1,visitorClase2… visitorClaseN. El método accept de una clase elemento llama al método visit de su clase. Clases concretas de un visitante pueden entonces ser escritas para hacer una operación en particular.

Cada método visit de un visitante concreto puede ser pensado como un método que no es de una sola clase, sino de un par de clases: el visitante concreto y clase elemento particular. Así el patrón visitor simula el envío doble (en inglés éste término se conoce como Double-Dispatch) en un lenguaje convencional orientado a objetos de envío único (Single-Dispatch), como son Java o C++.

El patrón visitor también especifica cómo sucede la interacción en la estructura del objeto. En su versión más sencilla, donde cada algoritmo necesita iterar de la misma forma, el método accept de un elemento contenedor, además de una llamada al método visit del objeto visitor, también pasa el objeto visitor como argumento al llamar al método accept de todos sus elementos hijos.

Este patrón es ampliamente utilizado en intérpretes, compiladores y procesadores de lenguajes, en general.

##**Estructura**
![alt text](https://lh3.googleusercontent.com/_Xd3cyzJbgLtMIQZXf2jGTn67W6RUG8JukEHQkZw-JLTBrkwkdX8vLjoRXBot2L1ePqm-hTmp1n7iUd-S9neA0QKpGaUYfguFk_SdQQzh4y2xjnG_Q "Logo Title Text 1")

>**Donde**
>* **Visitor**: declara una operación de visita para cada uno de los elementos concretos de la estructura de objetos. Esto es, el método visit().
>- **VisitorConcreto** : implementa cada una de las operaciones declaradas por Visitor. 
>+ **Element**: define la operación que le permite aceptar la visita de un Visitor.
>* **ConcreteElement**: implementa el método accept() que se limita a invocar su correspondiente método del Visitor.
>- **ObjectStructure**: gestiona la estructura de objetos y puede ofrecer una interfaz de alto nivel para permitir a los Visitor visitar a sus elementos.
