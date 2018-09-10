# Template Method

## Intención

Defina el esqueleto de un algoritmo en una operación, difiriendo algunos pasos a subclases. El método de plantilla permite a las subclases redefinir ciertos pasos de un algoritmo sin cambiar la estructura del algoritmo.

## Aplicabilidad

Usaremos el patron Template Method cuando.

• Queremos implementar las partes invariables de un algoritmo una vez y dejarlo en manos
subclases para implementar el comportamiento que puede variar.

• Cuando se debe factorizar y localizar el comportamiento común entre las subclases en una clase común para evitar la duplicación de código. Primero identificamos las diferencias en el código existente y luego separamos el diferencias en nuevas operaciones. Finalmente, reemplazamos el código que difiere con un método de plantilla que llama a una de estas nuevas operaciones.

• Queremos controlar extensiones de subclases. Podemos definir un método de plantilla que llame
operaciones de "enlace" en puntos específicos, permitiendo de ese modo
extensiones solo en esos puntos.

## Estructura

![screenshot from 2018-09-10 14 12 15](https://user-images.githubusercontent.com/34853850/45313161-6f80aa80-b504-11e8-8c37-155b3a203802.png)

## Participantes

• AbstractClass: define operaciones primitivas abstractas que las subclases concretas definen para implementar pasos de un algoritmo. Implementa un método de plantilla que define el esqueleto de un algoritmo. El método de plantilla llama a las operaciones primitivas así como a las operaciones definidas en AbstractClass o las de otros objetos.

• ConcreteClass: implementa las operaciones primitivas para llevar a cabo los pasos específicos de la subclase del algoritmo.

## Colaboraciones

• ConcreteClass se basa en AbstractClass para implementar los pasos invariables del algoritmo.

## Consecuencias

Los métodos de plantilla son una técnica fundamental para la reutilización de código. Son particularmente importantes en las bibliotecas de clase, porque son el medio para factorizar el comportamiento común en las clases de la biblioteca. Los métodos de plantilla conducen a una estructura de control invertida que a veces se denomina "el principio de Hollywood", es decir, "No nos llames, te llamaremos". Esto se refiere a cómo una clase padre llama a las operaciones de una subclase y no al revés.
