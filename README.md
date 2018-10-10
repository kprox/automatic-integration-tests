# automatic-integration-tests

## About

Este proyecto es una idea y prueba inicial para la propuesta de tests automáticos para Supply.
Usa las siguientes tecnologías:

- Java 8
- Maven
- Spring
- JBehave

## Requirements

- JDK 8
- Maven > 3.3
- Firefox 33.0 ([Download](https://ftp.mozilla.org/pub/firefox/releases/33.0/))

## Installation

Para compilarlo con Maven sin correr los tests:

`mvn compile`

## Execution

Para correr todas las historias y escenarios:

`mvn install`

Para correr un Story en particular (ej. 'Modify'):

`mvn install -Dstory=Modify`

## Reports and Results

Luego de haber corrido los tests deseados, dentro de la siguiente ruta se encontrará el archivo HTML con el reporte de la corrida:

    + target
        + jbehave
            + view
                reports.html
                
## Support

kevin.prox@mercadolibre.com