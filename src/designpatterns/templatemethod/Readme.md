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
