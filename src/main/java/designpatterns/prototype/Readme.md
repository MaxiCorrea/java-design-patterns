# Prototype

## Intención

Especifique los tipos de objetos para crear usando una instancia prototípica y cree nuevos objetos copiando este prototipo.

## Aplicabilidad

Utilice el patrón Prototype cuando un sistema debe ser independiente de cómo se crean, componen y representan sus productos.

• Cuando las clases para crear instancias se especifican en tiempo de ejecución, por ejemplo, mediante carga dinámica.

• Evitar construir una jerarquía de clases de fábricas que sea paralela a la jerarquía de clases de los productos.

• Cuando las instancias de una clase pueden tener una de las pocas combinaciones diferentes de estado. Puede ser más conveniente instalar una cantidad correspondiente de prototipos y clonarlos en lugar de crear una instancia de la clase manualmente, cada vez con el estado apropiado.

## Estructura

![screenshot from 2018-09-18 20 11 22](https://user-images.githubusercontent.com/34853850/45721617-17d6e480-bb7f-11e8-8b21-ffd5f7753c5f.png)

## Participantes

• Prototype : Declara una interfaz para la copia/clonacion.

• ConcretePrototype : Implementa una operación para la copia/clonación.

• Client : Crea un nuevo objeto pidiendo a un prototipo que se copie/clone a sí mismo.

## Colaboraciones

• Un cliente le pide a un prototipo que se copie / clone.

## Consecuencias

El prototipo tiene muchas de las mismas consecuencias que Abstract Factory y Builder tienen: Oculta las clases de productos concretas del cliente, reduciendo así la cantidad de nombres que los clientes conocen. Además, estos patrones permiten que un cliente trabaje con clases específicas de la aplicación sin modificación.

1. Agregar y eliminar productos en tiempo de ejecución. Los prototipos le permiten incorporar una nueva clase de producto concreto en un sistema simplemente registrando una instancia prototípica con el cliente. Eso es un poco más flexible que otros patrones creacionales, porque un cliente puede instalar y eliminar prototipos en tiempo de ejecución.

2. Subclases reducidas. El Factory Method a menudo produce una jerarquía de clases de Creator que es paralela a la jerarquía de clases de Products. El patrón Prototype le permite clonar/copiar un prototipo en lugar de pedirle a un método de fábrica que cree un nuevo objeto. Por lo tanto, no necesita una jerarquía de clase Creator en absoluto.

La principal responsabilidad del patrón Prototype es que cada subclase de Prototype debe implementar la operación clone/copy, lo que puede ser difícil. Por ejemplo, agregar clon/copia es difícil cuando las clases consideradas ya existen. La implementación del clon/copy puede ser difícil cuando sus partes internas incluyen objetos que no admiten la copia o tienen referencias circulares.
