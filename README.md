Selenium GRP Framework

Índice
Descripción
Características principales
Requisitos previos
Instalación
Uso
Estructura del proyecto
Contribuciones
Licencia
Contacto
Planes futuros
Descripción
Selenium GRP Framework es un framework de automatización personalizado diseñado para agilizar el proceso de configuración y preparación en proyectos de QA. Este framework está listo para ser clonado desde GitHub y comenzar a automatizar sin necesidad de configuraciones adicionales, sirviendo también como plantilla para futuros proyectos.

El objetivo principal es ahorrar tiempo en la preparación y configuración del entorno de pruebas, permitiendo a los equipos de QA enfocarse en la automatización desde el primer momento.

Características principales
Uso de Cucumber: Permite escribir pruebas en lenguaje Gherkin, haciendo los tests más legibles y comprensibles para personas sin conocimientos de programación.

Estructura simplificada: Todo el código reside dentro de una sola carpeta Test, facilitando la comprensión de la infraestructura y evitando posibles conflictos con dependencias.

Espera implícita en locators: Implementación de esperas para manejar elementos dinámicos en la página, reduciendo fallos por tiempos de carga inesperados.

Integración con TestNG: Generación de scripts de código fáciles de leer y generación de informes de prueba personalizados.

Actualización automática de WebDriver: Uso de WebDriverManager para mantener el driver de Chrome actualizado automáticamente según la versión instalada en el sistema.

Gestión de dependencias con Gradle: Simplifica la construcción del proyecto y la gestión de dependencias, evitando el uso de Maven.

Requisitos previos
Java: Versión 22.0.2 o superior.

bash
Copiar código
java version "22.0.2" 2024-07-16
Java(TM) SE Runtime Environment (build 22.0.2+9-70)
Java HotSpot(TM) 64-Bit Server VM (build 22.0.2+9-70, mixed mode, sharing)
Dependencias incluidas (no es necesario instalarlas manualmente):

Selenium: selenium-java:4.26.0
WebDriverManager: webdrivermanager:5.9.2
TestNG: testng:7.10.2
Cucumber:
cucumber-java:7.20.1
cucumber-junit:7.20.1
Herramientas recomendadas:

Extensiones de Chrome:
SelectorsHub: Para copiar XPath relativos de manera eficiente.
Extensiones de VSCode:
Test Runner for Java
Cucumber
Cucumber (Gherkin) Full Support
Extension Pack for Java
Gradle Extension Pack
IntelliCode
Language Support for Java(TM) by Red Hat
Project Manager for Java
Instalación
Clonar el repositorio:
bash
Copiar código
git clone https://github.com/tu_usuario/selenium-grp-framework.git
Navegar al directorio del proyecto:
bash
Copiar código
cd selenium-grp-framework
Construir el proyecto con Gradle:
bash
Copiar código
gradle build
Nota: Si necesitas agregar más dependencias, edita el archivo build.gradle.

Uso
Ejecutar pruebas desde el Runner:

Navega al archivo TestRunner en la carpeta Runner y haz clic en el ícono de "Play".
Ejecutar pruebas desde la terminal:

bash
Copiar código
gradle test
Ejecutar pruebas desde VSCode:

Haz clic en el ícono de "Testing" (matraz Erlenmeyer) en la barra lateral.
Ejecuta el test que desees haciendo clic en el botón de "Play".
Estructura del proyecto
plaintext
Copiar código
selenium-grp-framework/
├── src/
│   └── test/
│       ├── java/
│       │   ├── pages/
│       │   │   └── [Clases de las páginas].java
│       │   ├── Runner/
│       │   │   └── TestRunner.java
│       │   └── Steps/
│       │       └── [StepDefinitions].java
│       └── resources/
│           └── features/
│               └── [Tests].feature
├── build.gradle
└── settings.gradle
pages/: Contiene las clases que representan cada página web, incluyendo métodos para interactuar con sus elementos.

Runner/: Incluye el TestRunner.java, necesario para ejecutar las pruebas.

Steps/: Contiene las definiciones de los pasos utilizados en los archivos .feature, llamando a los métodos de las clases en pages/.

resources/features/: Ubicación de los archivos .feature escritos en Gherkin, describiendo los casos de prueba de manera legible.

build.gradle y settings.gradle: Archivos de configuración de Gradle con las dependencias del proyecto.

Contribuciones
¡Las contribuciones son bienvenidas! Si deseas colaborar:

Fork el repositorio.
Crea una rama con una descripción clara de tu característica o arreglo.
bash
Copiar código
git checkout -b feature/nueva-funcionalidad
Realiza tus cambios y asegúrate de documentarlos adecuadamente.
Envía un Pull Request explicando el porqué de tus cambios.
Licencia
Este proyecto está licenciado bajo la MIT License.

Contacto
Autor: Guillermo Royo
Correo electrónico: g.royo1999@gmail.com
Planes futuros
Mejoras continuas: Implementar optimizaciones para aumentar la eficiencia y facilidad de uso del framework.

Funcionalidades adicionales: A medida que surjan nuevas necesidades, se agregarán características para adaptarse a diferentes tipos de proyectos.

Documentación ampliada: Proporcionar guías más detalladas y ejemplos para ayudar a nuevos usuarios y colaboradores.

¡Gracias por utilizar Selenium GRP Framework! Si tienes alguna sugerencia o encuentras algún problema, no dudes en contactar.