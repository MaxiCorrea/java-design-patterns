# Composite

## Intención

Componga objetos en estructuras de árbol para representar jerarquías de partes enteras. Composite permite a los clientes tratar objetos individuales y composiciones de objetos de manera uniforme.

## Aplicabilidad

Use el patrón Composite cuando

• Desea representar jerarquías de objetos todo-parte.

• Desea que los clientes puedan ignorar la diferencia entre composiciones de objetos y objetos individuales. Los clientes tratarán todos los objetos en la estructura compuesta uniformemente.

## Estructura

![screenshot from 2018-09-27 08 26 40](https://user-images.githubusercontent.com/34853850/46143070-3e57e800-c22f-11e8-933c-98f6ed355a76.png)

## Participantes

• Component

- Declara la interfaz para objetos en la composición.
- Implementa el comportamiento predeterminado para la interfaz común a todas las clases, según corresponda.
- Declara una interfaz para acceder y administrar sus componentes secundarios.
- (opcional) define una interfaz para acceder al elemento principal de un componente en la estructura recursiva, y la implementa si es apropiado.

• Leaf
 
- Representa objetos de hoja en la composición. Una hoja no tiene hijos.
- Define el comportamiento para objetos primitivos en la composición.

• Composite

- Define el comportamiento de los componentes que tienen hijos.
- Almacena componentes secundarios.
- Implementa operaciones relacionadas con los hijos en la interfaz del Componente.

• Client
- Manipula objetos en la composición a través de la interfaz del component.

## Colaboraciones

• Los clientes usan la interfaz de la clase Component para interactuar con objetos en la estructura compuesta. Si el destinatario es un Leaf, entonces la solicitud se maneja directamente. Si el destinatario es un Compuesto, generalmente reenvía las solicitudes a sus componentes secundarios, posiblemente realizando operaciones adicionales antes o después del reenvío.

## Consecuencias

El patrón Composite

• Define jerarquías de clases que consisten en objetos primitivos y objetos compuestos. Los objetos primitivos se pueden componer en objetos más complejos, que a su vez se pueden componer, y así sucesivamente de forma recursiva. Siempre que el código del cliente espera un objeto primitivo, también puede tomar un objeto compuesto.

• Hace que el cliente sea simple. Los clientes pueden tratar estructuras compuestas y objetos individuales de manera uniforme. Los clientes normalmente no saben (y no les debe importar) si se trata de una hoja o un componente compuesto. Esto simplifica el código de cliente, ya que evita tener que escribir funciones de estilo de declaración de mayúsculas y minúsculas sobre las clases que definen la composición.

• Hace que sea más fácil agregar nuevos tipos de componentes. Las subclases Composite o Leaf recién definidas funcionan automáticamente con las estructuras existentes y el código del cliente. Los clientes no tienen que ser cambiados por nuevas clases de Componente.

• Puede hacer que su diseño sea excesivamente general. La desventaja de facilitar la incorporación de nuevos componentes es que dificulta la restricción de los componentes de un compuesto. A veces quieres que un compuesto tenga solo ciertos componentes. Con Composite, no puede confiar en el sistema de tipo para aplicar esas restricciones por usted. En su lugar, tendrá que usar verificaciones en tiempo de ejecución.
