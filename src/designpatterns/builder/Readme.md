# Builder

## Intención

Separar la construcción de un objeto complejo de su representación para que el
el mismo proceso de construcción pueda crear diferentes representaciones.

## Aplicabilidad

Use el patrón Builder cuando.

• El algoritmo para crear un objeto complejo debe ser independiente de las partes que componen el objeto y cómo se ensamblan.

• El proceso de construcción debe permitir diferentes representaciones para el objeto que se construye.

## Estructura

![screenshot from 2018-09-15 20 14 21](https://user-images.githubusercontent.com/34853850/45591264-08a82a80-b924-11e8-80a5-8eddf2211b1d.png)


## Participantes

• Builder: Especifica una interfaz abstracta para crear partes de un objeto Product.

• ConcreteBuilder: Construye y ensambla partes del producto implementando la interfaz de Builder. Define y realiza un seguimiento de la representación que crea. Proporciona una interfaz para recuperar el producto.

• Director: Construye un objeto usando la interfaz de Builder.

• Product: Representa el objeto complejo en construcción. ConcreteBuilder construye la representación interna del producto y define el proceso mediante el cual se ensambla. Incluye clases que definen las partes constituyentes, incluidas las interfaces para ensamblar las partes en el resultado final.

## Colaboraciones

• El Client crea el objeto Director y lo configura con el objeto Builder deseado.

• El Director notifica al Builder cada vez que se debe construir una parte del Product.

• El Builder maneja las solicitudes del Director y agrega partes al Product.

• El Client recupera el Product del Builder.

## Consecuencias

Estas son las principales consecuencias del patrón Builder:

1. Le permite variar la representación interna de un Product. El objeto Builder proporciona al Director una interfaz abstracta para construir el Product. La interfaz permite que el Builder oculte la representación y la estructura interna del Product. También oculta cómo se ensambla el Product. Debido a que el Product se construye a través de una interfaz abstracta, todo lo que tiene que hacer para cambiar la representación interna del Product es definir un nuevo tipo de Builder.
2. Aísla el código para la construcción y la representación. El patrón Builder mejora la modularidad al encapsular la forma en que se construye y representa un objeto complejo. Los clientes no necesitan saber nada sobre las clases que definen la estructura interna del Product; tales clases no aparecen en la interfaz de Builder. Cada ConcreteBuilder contiene todo el código para crear y ensamblar un tipo particular de Product. El código está escrito una vez; luego diferentes Directores pueden reutilizarlo para construir variantes de Product a partir del mismo conjunto de partes.
3. Le da un control más fino sobre el proceso de construcción. A diferencia de los patrones de creación que construyen productos en una sola toma, el patrón Builder construye el Product paso a paso bajo el control del Director. Solo cuando el Product está terminado, el Director lo recupera del Builder. Por lo tanto, la interfaz de Builder refleja el proceso de construcción del producto más que otros patrones creacionales. Esto le da un control más fino sobre el proceso de construcción y, en consecuencia, la estructura interna del Product resultante.
