# Singleton

## Intención

Asegúrese de que una clase solo tenga una instancia y proporcione un punto de acceso global a ella.

## Aplicabilidad

Use el patrón Singleton cuando

• Debe haber exactamente una instancia de una clase, y debe ser accesible para los clientes desde un punto de acceso bien conocido.

## Estructura

![screenshot from 2018-09-19 01 27 35](https://user-images.githubusercontent.com/34853850/45731049-e32d5200-bbab-11e8-8e19-b80a212d1fdc.png)

## Participantes

• Singleton: Define una operación responsable de crear su propia instancia única.

## Consecuencias

• Viola el Principio de Responsabilidad Unica (SRP) al controlar su propia creación y ciclo de vida.

• Alienta el uso de una instancia compartida global que impida que un objeto y los recursos utilizados por este objeto sean desasignados.

• Hace que sea casi imposible crear una subclase de Singleton.
