# Decorator

## Intención

Adjunte responsabilidades adicionales a un objeto dinámicamente. Los decoradores proporcionan una alternativa flexible a las subclases para ampliar la funcionalidad.

## Aplicabilidad

Use decorador

• Agregar responsabilidades a objetos individuales de forma dinámica y transparente, es decir, sin afectar a otros objetos.

• Por responsabilidades que pueden ser retiradas.

• Cuando la extensión mediante subclases no es práctica. En ocasiones, es posible un gran número de extensiones independientes y produciría una explosión de subclases para admitir todas las combinaciones. O una definición de clase puede estar oculta o no disponible para subclases

## Estructura

![screenshot from 2018-09-28 19 39 46](https://user-images.githubusercontent.com/34853850/46236702-70179e80-c356-11e8-93c8-401c718cfe5b.png)

## Participantes

• Component : Define la interfaz para los objetos que pueden tener responsabilidades añadidas dinámicamente.

• ConcreteComponent : Define un objeto al que se pueden adjuntar responsabilidades adicionales.

• Decorator : Mantiene una referencia a un objeto Component y define una interfaz que se ajusta a la interfaz de Component.

• ConcreteDecorator: Agrega responsabilidades al componente.

## Colaboraciones

• El decorador reenvía las solicitudes a su objeto Componente. Opcionalmente, puede realizar operaciones adicionales antes y después de reenviar la solicitud.

## Consecuencias

1. Más flexibilidad que la herencia estática. El patrón Decorador proporciona una forma más flexible de agregar responsabilidades a los objetos que las que se pueden tener con la herencia estática (múltiple). Con los decoradores, las responsabilidades se pueden agregar y eliminar en tiempo de ejecución simplemente adjuntándolas y separándolas. Por el contrario, la herencia requiere crear una nueva clase para cada responsabilidad adicional

2. Evita las clases cargadas de características en lo alto de la jerarquía. Decorator ofrece un método de pago por uso para agregar responsabilidades. En lugar de intentar admitir todas las características previsibles en una clase compleja y personalizable, puede definir una clase simple y agregar funcionalidades de forma incremental con los objetos Decorator. La funcionalidad se puede componer de piezas simples. Como resultado, una aplicación no necesita pagar por las características que no usa. También es fácil definir nuevos tipos de decoradores independientemente de las clases de objetos que extienden, incluso para extensiones imprevistas. La extensión de una clase compleja tiende a exponer detalles no relacionados con las responsabilidades que está agregando.

3. Un decorador y su componente no son idénticos. Un decorador actúa como un recinto transparente. Pero desde el punto de vista de la identidad del objeto, un componente decorado no es idéntico al componente en sí. Por lo tanto, no debes confiar en la identidad del objeto cuando usas decoradores.

4. Un montón de pequeños objetos. Un diseño que usa Decorator a menudo resulta en sistemas. compuesto de muchos pequeños objetos que se parecen todos. Los objetos solo difieren
en la forma en que están interconectados, no en su clase o en el valor de sus variables. Aunque estos sistemas son fáciles de personalizar por aquellos que
entiéndelos, pueden ser difíciles de aprender y depurar.
