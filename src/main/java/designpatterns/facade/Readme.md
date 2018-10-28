# Facade

## Intención

Proporcionar una interfaz unificada para un conjunto de interfaces en un subsistema. Facade define una interfaz de nivel superior que hace que el subsistema sea más fácil de usar.

## Aplicabilidad

Usa el patrón Facade cuando

• Desea proporcionar una interfaz simple a un subsistema complejo. Los subsistemas a menudo se vuelven más complejos a medida que evolucionan. La mayoría de los patrones, cuando se aplican, dan como resultado más clases y más pequeñas. Esto hace que el subsistema sea más reutilizable y fácil de personalizar, pero también se vuelve más difícil de usar para los clientes que no necesitan personalizarlo. Una fachada puede proporcionar una vista predeterminada simple del subsistema que sea lo suficientemente buena para la mayoría de los clientes. Solo los clientes que necesiten más personalización deberán mirar más allá de la fachada.

• Hay muchas dependencias entre los clientes y las clases de implementación de una abstracción. Introducir una fachada para desacoplar el subsistema de los clientes y otros subsistemas, promoviendo así la independencia y la portabilidad de los subsistemas.

• Desea aplicar capas a sus subsistemas. Use una fachada para definir un punto de entrada para cada nivel de subsistema. Si los subsistemas son dependientes, puede simplificar las dependencias entre ellos haciendo que se comuniquen entre sí únicamente a través de sus fachadas.

# Estructura

![screenshot from 2018-09-30 10 00 49](https://user-images.githubusercontent.com/34853850/46257871-d2c48380-c497-11e8-86c3-f0552e305b1f.png)

## Participantes

• Facade

- sabe qué clases de subsistemas son responsables de una solicitud.
- delega las solicitudes de los clientes a los objetos apropiados del subsistema.

• clases de subsistema

- implementar la funcionalidad del subsistema.
- manejar el trabajo asignado por el objeto Fachada.
- no tiene conocimiento de la fachada; es decir, no guardan ninguna referencia a este.

## Colaboraciones

• Los clientes se comunican con el subsistema enviando solicitudes a Facade, que los reenvía a los objetos del subsistema apropiado. Aunque los objetos del subsistema realizan el trabajo real, la fachada puede tener que trabajar por sí misma para traducir su interfaz a las interfaces del subsistema.

• Los clientes que usan la Facade no tienen que acceder directamente a sus objetos del subsistema.

## Consecuencias

El patrón Facade ofrece los siguientes beneficios:

1. Protege a los clientes de los componentes del subsistema, lo que reduce el número de objetos que los clientes manejan y hace que el subsistema sea más fácil de usar.

2. Promueve el acoplamiento débil entre el subsistema y sus clientes. A menudo, los componentes en un subsistema están fuertemente acoplados. El acoplamiento débil le permite variar los componentes del subsistema sin afectar a sus clientes. Las fachadas ayudan a la capa de un sistema y las dependencias entre los objetos. Pueden eliminar dependencias complejas o circulares. Esto puede ser una consecuencia importante cuando el cliente y el subsistema se implementan de manera independiente. La reducción de las dependencias de compilación es vital en los grandes sistemas de software. Desea ahorrar tiempo al minimizar la recompilación cuando cambian las clases del subsistema. La reducción de las dependencias de compilación con fachadas puede limitar la recompilación necesaria para un pequeño cambio en un subsistema importante. Una fachada también puede simplificar los sistemas de portabilidad a otras plataformas, porque es menos probable que construir un subsistema requiera construir todos los demás.

3. No impide que las aplicaciones utilicen clases de subsistemas si es necesario.
Por lo tanto, puede elegir entre facilidad de uso y generalidad.
