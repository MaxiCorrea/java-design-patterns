# Abstract Factory

## Intención
Proporcionar una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.

## Aplicabilidad

Usaremos el patrón Abstract Factory cuando

• Nuestro sistema debe ser independiente de cómo se crean, componen y representan sus productos.

• Nuestro sistema debe configurarse con una de las múltiples familias de productos.

• La familia de objetos de productos relacionados está diseñada para usarse en conjunta, y necesitamos imponer esta restricción.

• Deseamos proporcionar una biblioteca de clases de productos, y revelar solo sus interfaces, no sus implementaciones.

## Estructura

![screenshot from 2018-09-06 06 15 09](https://user-images.githubusercontent.com/34853850/45147865-4ecef280-b19c-11e8-86fc-40cd86a88593.png)

## Participantes

• AbstractFactory: Declara una interfaz para operaciones que crean objetos de productos abstractos.

• ConcreteFactory: Implementa las operaciones para crear objetos concretos de productos.

• AbstractProduct: declara una interfaz para un tipo de objeto de producto.

• ConcreteProduct: define un objeto de producto creado por la fábrica de concreta correspondiente. Implementa la interfaz AbstractProduct.

• Client: Utiliza solo las interfaces declaradas por las clases AbstractFactory y AbstractProduct.

## Colaboraciones

• Normalmente, se crea una sola instancia de una clase ConcreteFactory en tiempo de ejecución. Esta fábrica concreta crea objetos de productos que tienen una implementación particular. Para crear diferentes objetos de producto, los clientes deben usar una fábrica de concreta diferente.

• AbstractFactory difiere la creación de objetos de producto a su subclase ConcreteFactory.

## Consecuencias

El patrón Abstract Factory tiene los siguientes beneficios y responsabilidades:

1. Aísla las clases concretas. El patrón Abstract Factory lo ayuda a controlar las clases de objetos que crea una aplicación. Debido a que una fábrica encapsula la responsabilidad y el proceso de creación de objetos de producto, aísla a los clientes de las clases de implementación. Los clientes manipulan instancias a través de sus interfaces abstractas. Los nombres de clase de producto están aislados en la implementación de la fábrica concreta; no aparecen en el código del cliente.

2. Facilita el intercambio de familias de productos. La clase de una fábrica concreta aparece solo una vez en una aplicación, es decir, donde se crea una instancia. Esto facilita cambiar la fábrica de concreto que utiliza una aplicación. Puede usar diferentes configuraciones de producto simplemente cambiando la fábrica concreta. Debido a que una fábrica abstracta crea una familia completa de productos, toda la familia de productos cambia a la vez.

3. Promueve la coherencia entre los productos. Cuando los objetos del producto en una familia están diseñados para funcionar juntos, es importante que una aplicación use objetos de una sola familia a la vez. AbstractFactory hace esto fácil de hacer cumplir.

4. Apoyar nuevos tipos de productos es difícil. La ampliación de fábricas abstractas para producir nuevos tipos de productos no es fácil. Esto se debe a que la interfaz AbstractFactory corrige el conjunto de productos que se pueden crear. El soporte de nuevos tipos de productos requiere extender la interfaz de fábrica, lo que implica cambiar la clase AbstractFactory y todas sus subclases.
