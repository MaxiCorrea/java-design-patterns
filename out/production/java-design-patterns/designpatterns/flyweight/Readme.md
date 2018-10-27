# Flyweight

## Intención

Utilice para admitir compartir grandes cantidades de objetos de grano fino de manera eficiente.

## Aplicabilidad

La efectividad del patrón de Flyweight depende en gran medida de cómo y dónde se usa. Aplique el patrón Flyweight cuando todo lo siguiente sea verdadero:

• Una aplicación utiliza una gran cantidad de objetos.

• Los costos de almacenamiento son altos debido a la gran cantidad de objetos.

• La mayoría del estado del objeto puede ser extrínseco.

• Muchos grupos de objetos pueden ser reemplazados por relativamente pocos objetos compartidos una vez que se elimina el estado extrínseco.

• La aplicación no depende de la identidad del objeto. Dado que los objetos Flyweight pueden ser compartidos, las pruebas de identidad devolverán verdadero para objetos conceptualmente distintos.

# Estructura

![screenshot from 2018-10-02 16 54 42](https://user-images.githubusercontent.com/34853850/46373262-ecb2c180-c663-11e8-9f9b-9f6581f3ab70.png)

## Participantes

• Flyweight
- declara una interfaz a través de la cual los Flyweight pueden recibir y actuar en estado extrínseco.

• ConcreteFlyweight
- implementa la interfaz Flyweight y agrega almacenamiento para el estado intrínseco, si lo hay. Un objeto ConcreteFlyweight debe ser compartible. Cualquier estado que almacene debe ser intrínseco; es decir, debe ser independiente del contexto del objeto ConcreteFlyweight.

• UnsharedConcreteFlyweight
- No todas las subclases de Flyweight necesitan ser compartidas. La interfaz Flyweight permite compartir; no lo hace cumplir. Es común que los objetos UnsharedConcreteFlyweight tengan objetos ConcreteFlyweight en algún nivel en la estructura de los objetos de Flyweight.

• FlyweightFactory
- Crea y gestiona objetos Flyweight.
- Asegura que los Flyweight sean compartidos adecuadamente. Cuando un cliente solicita un Flyweight, el objeto FlyweightFactory suministra una instancia existente o crea uno, si no existe ninguno.

## Colaboraciones

• Indique que un Flyweight debe funcionar debe ser caracterizado como intrínseco o extrínseco. El estado intrínseco se almacena en el objeto ConcreteFlyweight; El estado extrínseco es almacenado o computado por los objetos del Cliente. Los clientes pasan este estado al Flyweight cuando invocan sus operaciones.

• Los clientes no deben crear una instancia de ConcreteFlyweights directamente. Los clientes deben obtener objetos ConcreteFlyweight exclusivamente del objeto FlyweightFactory para asegurarse de que se compartan correctamente.

## Consecuencias

Los Flyweights pueden introducir costos de tiempo de ejecución asociados con la transferencia, el hallazgo y / o el cálculo del estado extrínseco, especialmente si se almacenó anteriormente como estado intrínseco. Sin embargo, dichos costos se compensan con el ahorro de espacio, que aumenta a medida que se comparten más Flyweights.

Los ahorros de almacenamiento son una función de varios factores:

• La reducción en el número total de instancias que proviene de compartir.

• La cantidad de estado intrínseco por objeto.

• Si el estado extrínseco es computado o almacenado.
