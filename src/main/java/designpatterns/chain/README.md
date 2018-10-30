# Chain of resposibility

## Intención

Evite acoplar el remitente de una solicitud a su receptor al darle a más de un objeto la oportunidad de manejar la solicitud. Encadene los objetos receptores y pase la solicitud a lo largo de la cadena hasta que un objeto lo maneje.

## Aplicabilidad

Usa la Cadena de Responsabilidad cuando

• Más de un objeto puede manejar una solicitud, y el manejador no se conoce a priori. El manejador debe ser comprobado automáticamente.

• Desea emitir una solicitud a uno de varios objetos sin especificar explícitamente el receptor.

• El conjunto de objetos que pueden manejar una solicitud debe especificarse dinámicamente.

## Estructura

![captura de pantalla_2018-10-30_16-00-29](https://user-images.githubusercontent.com/34853850/47743482-f416bc00-dc5d-11e8-8afe-ed06c7559aef.png)
