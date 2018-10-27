# Bridge

## Intención

Desacople una abstracción de su implementación para que ambas puedan variar de forma independiente.

## Aplicabilidad

Use el patrón Bridge cuando

• Desea evitar un enlace permanente entre una abstracción y su implementación. Este podría ser el caso, por ejemplo, cuando la implementación debe ser seleccionada o conmutada en tiempo de ejecución.

• Tanto las abstracciones como sus implementaciones deberían ser extensibles mediante subclases. En este caso, el patrón Bridge le permite combinar las diferentes abstracciones e implementaciones y ampliarlas de forma independiente.

• Los cambios en la implementación de una abstracción no deberían tener impacto en los clientes; es decir, su código no debería tener que ser recompilado.

• Desea compartir una implementación entre múltiples objetos.

## Estructura

![screenshot from 2018-09-22 03 27 15](https://user-images.githubusercontent.com/34853850/45914170-81712000-be17-11e8-9fe6-425dc5230097.png)

## Participantes

• Abstraction: Define la interfaz de la abstracción. Mantiene una referencia a un objeto de tipo Implementor.

• RefinedAbstraction: Amplía la interfaz definida por Abstraction.

• Implementor: Define la interfaz para las clases de implementación. Esta interfaz no tiene que corresponderse exactamente con la interfaz de Abstraction; de hecho, las dos interfaces pueden ser bastante diferentes. Normalmente, la interfaz del implementador proporciona solo operaciones primitivas, y la abstracción define operaciones de nivel superior basadas en estas primitivas.

• Concretelmplementor: Implementa la interfaz del implementador y define su implementación concreta.

## Colaboraciones

• La abstracción reenvía las solicitudes del cliente a su objeto Implementor.

## Consecuencias

El patrón Bridge tiene las siguientes consecuencias:

1. Desacoplamiento de implementación. Una implementación no está vinculada permanentemente a una interfaz. La implementación de una abstracción se puede configurar en tiempo de ejecución. Incluso es posible que un objeto cambie su implementación en tiempo de ejecución.
Desacoplamiento de abstracción e Implementador también elimina las dependencias de tiempo de compilación en la implementación. Cambiar una clase de implementación no requiere recompilar la clase Abstracción y sus clientes.

2. Extensibilidad mejorada. Puede ampliar las jerarquías Abstracción e Implementador de forma independiente.

3. Ocultar los detalles de implementación de los clientes. Puede proteger a los clientes de los detalles de implementación, como compartir los objetos del implementador y el mecanismo de recuento de referencia que lo acompaña (si corresponde).
