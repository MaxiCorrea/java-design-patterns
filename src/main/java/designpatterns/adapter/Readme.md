# Adapter

## Intención

Convierta la interfaz de una clase en otra interfaz que los clientes esperan. Adapter permite que las clases funcionen juntas, lo que de otra forma no podría ser debido a interfaces incompatibles.

## Aplicabilidad

Use el patrón Adapter cuando

• Desea utilizar una clase existente y su interfaz no coincide con la que necesita.

• Desea crear una clase reutilizable que coopera con clases no relacionadas o imprevistas, es decir, clases que no necesariamente tienen interfaces compatibles.

• (Solo adaptador de objeto) necesita usar varias subclases existentes, pero no es práctico adaptar su interfaz subclasificando cada una de ellas. Un adaptador de objeto puede adaptar la interfaz de su clase padre.

## Estructura

![screenshot from 2018-09-21 00 23 55](https://user-images.githubusercontent.com/34853850/45858674-fb7ca880-bd34-11e8-8027-c85f8f33768f.png)
![screenshot from 2018-09-21 00 28 25](https://user-images.githubusercontent.com/34853850/45858774-56ae9b00-bd35-11e8-8376-78f883a6d093.png)

## Participantes

• Target: Define la interfaz específica del dominio que usa el Client.

• Client: Colabora con objetos que se ajustan a la interfaz de Target.

• Adaptee: Define una interfaz existente que necesita adaptación.

• Adapter: Adapta la interfaz de Adaptee a la interfaz de Target.

## Colaboraciones

• Los clientes llaman operaciones en una instancia de Adapter. A su vez, el Adapter llama a las operaciones de Adaptee que llevan a cabo el request.

## Consecuencias

Un adaptador de clase

• Permite que el adaptador anule algunos de los comportamientos de Adaptee, ya que el adaptador es una subclase de Adaptee.

• Introduce solo un objeto, y no se necesita direccionamiento adicional del puntero para llegar al adaptador.

Un adaptador de objeto

• Permite que un solo Adapter funcione con muchos Adaptados, es decir, el Adaptee mismo y todas sus subclases (si corresponde). El Adapter también puede agregar funcionalidad a todos los Adaptados a la vez.

• Hace más difícil anular el comportamiento del Adaptee. Requerirá subclasificar a Adaptee y hacer que el Adapter haga referencia a la subclase en lugar de al Adaptee mismo.
