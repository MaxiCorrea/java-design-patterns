# Factory Method

## Intención.

Defina una interfaz para crear un objeto, pero deje que las subclases decidan a qué clase instanciar. El método de fábrica permite que una clase difiera la instanciación a subclases.

## Aplicabilidad

Use el patrón Factory Method cuando.

• Una clase no puede anticipar la clase de objetos que debe crear.

• Una clase quiere que sus subclases especifiquen los objetos que crea.

• Las clases delegan la responsabilidad en una de varias subclases auxiliares, y desea localizar el conocimiento de qué subclase auxiliar es el delegado.

## Estructura

![screenshot from 2018-09-17 04 13 39](https://user-images.githubusercontent.com/34853850/45609877-31b5e180-ba30-11e8-84b1-b4bf86b6e1b2.png)

## Participantes

• AbstractProduct: Define la interfaz de los objetos que crea el método de fábrica.

• ConcreteProduct: Implementa la interfaz del AbstractProduct.

• AbstractCreator: Declara el método de fábrica, que devuelve un objeto de tipo AbstractProduct. El creador también puede definir una implementación predeterminada del método de fábrica que devuelve un objeto ConcreteProduct predeterminado. Puede llamar al método de fábrica para crear un objeto AbstractProduct.

• ConcreteCreator: Anula el método de fábrica para devolver una instancia de ConcreteProduct.

## Colaboraciones

• El AbstractCreator confía en sus subclases para definir el método de fábrica para que devuelva una instancia del ConcreteProduct apropiado.

## Consecuencias

Los métodos de fábrica eliminan la necesidad de vincular clases específicas de la aplicación en su código. El código solo trata con la interfaz AbstractProduct; por lo tanto, puede funcionar con cualquier clase de ConcreteProduct definida por el usuario.

Una posible desventaja de los métodos de fábrica es que los clientes pueden tener que subclasificar la clase AbstractCreator solo para crear un objeto concreto ConcreteProduct. La subclasificación está bien cuando el cliente tiene que subclasificar la clase AbstractCreator de todos modos, pero de lo contrario el cliente ahora debe lidiar con otro punto de evolución.

Aquí hay dos consecuencias adicionales del patrón Método de fábrica:

1. Proporciona ganchos para subclases. Crear objetos dentro de una clase con un método de fábrica siempre es más flexible que crear un objeto directamente. El método de fábrica proporciona a las subclases un gancho para proporcionar una versión extendida de un objeto.

2. Conecta jerarquías de clases paralelas. Las jerarquías de clases paralelas resultan cuando una clase delega algunas de sus responsabilidades en una clase separada. Considere figuras gráficas que puedan ser manipuladas de forma interactiva; es decir, pueden estirarse, moverse o rotarse con el mouse. Implementar tales interacciones no siempre es fácil. A menudo requiere almacenar y actualizar información que registra el estado de la manipulación en un momento dado. Este estado es necesario solo durante la manipulación; por lo tanto, no es necesario que se guarde en el objeto figura. Además, las diferentes figuras se comportan de manera diferente cuando el usuario las manipula. Por ejemplo, estirar una figura de línea puede tener el efecto de mover un punto final, mientras que estirar una figura de texto puede cambiar el espaciado entre líneas. Con estas restricciones, es mejor usar un objeto Manipulador separado que implemente la interacción y haga un seguimiento de cualquier estado específico de manipulación que se necesite. Diferentes figuras usarán diferentes subclases Manipulator para manejar interacciones particulares

