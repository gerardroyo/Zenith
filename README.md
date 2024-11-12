# Selenium GRP Framework

## Índice
- [Descripción](#descripción)
- [Características principales](#características-principales)
- [Requisitos previos](#requisitos-previos)
- [Instalación](#instalación)
- [Uso](#uso)
- [Estructura del proyecto](#estructura-del-proyecto)
- [Contribuciones](#contribuciones)
- [Licencia](#licencia)
- [Contacto](#contacto)
- [Planes futuros](#planes-futuros)

## Descripción
**Selenium GRP Framework** es un framework de automatización personalizado diseñado para agilizar el proceso de configuración y preparación en proyectos de QA. Este framework está listo para ser clonado desde GitHub y comenzar a automatizar sin necesidad de configuraciones adicionales, sirviendo también como plantilla para futuros proyectos.

El objetivo principal es ahorrar tiempo en la preparación y configuración del entorno de pruebas, permitiendo a los equipos de QA enfocarse en la automatización desde el primer momento.

## Características principales
- **Uso de Cucumber**: Permite escribir pruebas en lenguaje Gherkin, haciendo los tests más legibles y comprensibles para personas sin conocimientos de programación.
- **Estructura simplificada**: Todo el código reside dentro de una sola carpeta `Test`, facilitando la comprensión de la infraestructura y evitando posibles conflictos con dependencias.
- **Espera implícita en locators**: Implementación de esperas para manejar elementos dinámicos en la página, reduciendo fallos por tiempos de carga inesperados.
- **Integración con TestNG**: Generación de scripts de código fáciles de leer y generación de informes de prueba personalizados.
- **Actualización automática de WebDriver**: Uso de WebDriverManager para mantener el driver de Chrome actualizado automáticamente según la versión instalada en el sistema.
- **Gestión de dependencias con Gradle**: Simplifica la construcción del proyecto y la gestión de dependencias, evitando el uso de Maven.

## Requisitos previos
- **Java**: Versión 22.0.2 o superior.

  ```bash
  java version "22.0.2" 2024-07-16
  Java(TM) SE Runtime Environment (build 22.0.2+9-70)
  Java HotSpot(TM) 64-Bit Server VM (build 22.0.2+9-70, mixed mode, sharing)
