# Proxy

## Intención

Proporcione un sustituto o un marcador de posición para que otro objeto controle el acceso a él.

## Aplicabilidad

El proxy es aplicable siempre que se necesite una referencia más versátil o sofisticada a un objeto que un simple puntero. Aquí hay varias situaciones comunes en las que el patrón Proxy es aplicable

1. Un proxy remoto proporciona un representante local para un objeto en un espacio de direcciones diferente.

2. Un proxy virtual crea objetos costosos bajo demanda.

3. Un proxy de protección controla el acceso al objeto original. Los proxies de protección son útiles cuando los objetos deben tener diferentes derechos de acceso.

4. Una referencia inteligente es un reemplazo de un puntero que realiza acciones adicionales cuando se accede a un objeto. Los usos típicos incluyen

- Contar el número de referencias al objeto real para que pueda liberarse automáticamente cuando no haya más referencias (también llamadas punteros inteligentes).

- Cargando un objeto persistente en la memoria cuando se hace referencia por primera vez.

- Verificar que el objeto real esté bloqueado antes de acceder para asegurar que ningún otro objeto pueda cambiarlo.

## Estructura

![screenshot from 2018-10-05 16 53 04](https://user-images.githubusercontent.com/34853850/46557124-3e0abd00-c8bf-11e8-9c32-5b8d7c10c0b0.png)

## Participantes

• Proxy

- Mantiene una referencia que le permite al proxy acceder al sujeto real. El proxy puede referirse a un Subject si las interfaces RealSubject y Asunto son las mismas.

- proporciona una interfaz idéntica a la de los Sujects, de modo que un proxy puede ser sustituido por el sujeto real.

- controla el acceso al RealSubject y puede ser responsable de crearlo y eliminarlo.

• Subject

- define la interfaz común para RealSubject y Proxy para que se pueda utilizar un Proxy en cualquier lugar donde se espera un RealSubject.

• RealSubject

- Define el objeto real que representa el proxy.

## Colaboraciones

• El proxy reenvía las solicitudes a RealSubject cuando sea apropiado, dependiendo del tipo de proxy.

## Consecuencias

El patrón Proxy introduce un nivel de direccionamiento indirecto al acceder a un objeto. La indirección adicional tiene muchos usos, dependiendo del tipo de proxy:

1. Un proxy remoto puede ocultar el hecho de que un objeto reside en un espacio de direcciones diferente.

2. Un proxy virtual puede realizar optimizaciones, como crear un objeto a pedido.

3. Tanto los proxies de protección como las referencias inteligentes permiten tareas de mantenimiento adicionales cuando se accede a un objeto.





