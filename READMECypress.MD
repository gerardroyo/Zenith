# Proyecto de pruebas para Vueling

Este documento describe el trabajo realizado para la prueba técnica de Vueling. Se han desarrollado dos áreas principales:

- **Test Plan Manual:**  
  Documento detallado para validar las reglas de negocio en la venta de billetes (especialmente las restricciones de viaje para menores), elaborado siguiendo los requerimientos del enunciado y los lineamientos del ISTQB.

- **Pruebas Automatizadas en Cypress:**  
  Automatización de dos casos de prueba para la validación de tarifas de seguros (Basic y Premium) en el sistema de alquiler de coches.

---

# Índice

1. [Test Plan Manual](#test-plan-manual)   
2. [Tecnologías y Dependencias](#tecnologías-y-dependencias)  
3. [Instalación y Configuración](#instalación-y-configuración)  
4. [Ejecución de las Pruebas](#ejecución-de-las-pruebas)  
5. [Reportes y Consola](#reportes-y-consola)  
6. [Pruebas Automatizadas en Cypress](#pruebas-automatizadas-en-cypress)  
7. [Integración CI/CD](#integración-cicd)  
8. [Comandos Relevantes](#comandos-relevantes)  
9. [Conclusiones](#conclusiones)

---

# 1. Test plan manual

### 1.1. Descripción
El Test Plan Manual se ha elaborado haciendo especial énfasis en las restricciones de viaje para menores de edad. Se desarrolló siguiendo los requerimientos exactos del enunciado y basándose en los lineamientos del ISTQB.

### 1.2. Estructura del Test Plan
El documento se organiza en las siguientes secciones:
- **Datos del Proyecto:** Información básica y contexto del sistema.
- **Introducción y Objetivos:** Se definen el contexto y los objetivos, como verificar que la aplicación impida reservas incorrectas y ofrezca mensajes claros.
- **Alcance de las Pruebas:** Se detalla qué funcionalidades se validan (por ejemplo, las restricciones de acompañamiento para menores) y qué aspectos quedan fuera (por ejemplo, rendimiento o seguridad).
- **Estrategia y Enfoque:** Se describen las metodologías utilizadas (pruebas funcionales, de valores límite y exploratorias basadas en técnicas de caja negra).
- **Planificación y Gestión de Riesgos:** Se presenta el cronograma, hitos clave y estrategias de mitigación ante cambios o incidencias en el entorno.
- **Definición de Casos de Prueba:** Cada caso se documenta con un identificador, precondiciones, pasos detallados, resultados esperados y observaciones, garantizando trazabilidad y claridad en el proceso de validación.

> **Nota**: <br>
Normally, detailed test case definitions are documented in a separate file or through a test case management tool such as Jira or 
TestRail, which allows for a modular and scalable structure. In this Test Plan, the manual test cases are included directly to facilitate 
review and understanding of the testing scope and strategy in the context of this technical test. 
It is recommended that in larger projects, these cases be maintained in a separate document or system and linked within the Test 
Plan to ease maintenance and traceability. 

### 1.3. ¿Por qué se diseñó de esta manera?
El Test Plan Manual se diseñó siguiendo estrictamente las indicaciones del enunciado, asegurando:

- **Cumplimiento de Requisitos:**  
  Cada regla de negocio se valida minuciosamente para garantizar que la aplicación impida reservas incorrectas y notifique de forma clara al usuario.

- **Documentación Detallada:**  
  La estructura facilita la revisión, auditoría y seguimiento de incidencias, siendo esencial para asegurar la calidad del proceso de validación.

- **Transparencia y Control:**  
  Permite realizar sesiones de revisión con el equipo de QA y stakeholders, asegurando que cualquier cambio en los requisitos se documente y se revalide de forma oportuna.

---

# Pruebas automatizadas en Cypress

# 2. Tecnologías y dependencias

- [**Cypress:**](https://www.cypress.io) Framework de automatización para pruebas end-to-end.
- [**Moment.js:**](https://momentjs.com) Manejo y formateo de fechas.
- [**cypress-mochawesome-reporter:**](https://github.com/LironEr/cypress-mochawesome-reporter) Genera reportes HTML interactivos con capturas de pantalla embebidas.
- [**Mochawesome Merge & Marge:**](https://github.com/adamgruber/mochawesome-report-generator) Para unir resultados y generar reportes finales.
- *(Opcional)* **Herramientas CI/CD:**<br>
Se recomienda integrar estos tests en un pipeline de CI/CD, por ejemplo, utilizando ``Azure DevOps`` o ``GitHub Actions``, para ejecutar las pruebas de forma automática con cada commit y obtener reportes actualizados.
  - **¿Por qué CI/CD?**<br>
  Permite validar la calidad del código de forma continua, detectar errores tempranamente y mantener la estabilidad del sistema en entornos de producción.
  - **Herramientas recomendadas:**<br>
  Azure DevOps Pipelines, GitHub Actions, Jenkins, etc.

---

# 3. Instalación y configuración

### Requisitos Previos
- [Node.js](https://nodejs.org/es) (incluye npm) instalado.
- Acceso al repositorio de código (clonado en tu máquina local).

### Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_REPOSITORIO>

2. **Instalar las dependencias:**

   ```bash
    npm install

3. **Estructura del Proyecto**

La estructura del proyecto se organiza de la siguiente manera:

    TECHNICAL TEST VUELING GERARD ROYO/
    ├── cypress/
    │   ├── downloads/
    │   │   └── downloads.htm
    │   ├── e2e/
    │   │   └── carRental.spec.js
    │   ├── fixtures/
    │   │   └── data.json
    │   ├── reports
    │   │   └── mochawesome
    │   │       └── index_001.html
    │   ├── screenshots
    │   │   └── screenshot.png
    │   └── support/
    │       ├── e2e.js
    │       ├── commands.js
    │       └── pages/
    │           ├── carPage.js
    │           ├── helpers.js
    │           ├── insurancePage.js
    │           ├── listCarPage.js
    │           ├── paymentPage.js
    │           └── searchCarPage.js
    ├── cypress.config.js
    ├── package.json
    ├── package-lock.json
    ├── cypress_log.txt
    ├── TestPlan_Vueling_Restrictions_v1.0(Technical Test - Gerard Royo).pdf
    └── TestPlan_Vueling_Restrictions_v1.0(Technical Test - Gerard Royo).MD


# 4. Ejecución de las pruebas

### Modo Interactivo
Para abrir la interfaz gráfica de Cypress:

    npx cypress open

Desde la interfaz, podrás seleccionar y ejecutar los tests y ver el "Command Log" en tiempo real.

### Modo Headless
Para ejecutar los tests desde la línea de comandos:

    npx cypress run --headed --browser chrome

> **Nota:** Se ha configurado el viewport a 430x932 para simular un entorno móvil, tal como lo requiere la prueba técnica.

---

# 5. Generación de Reportes con Mochawesome

El proyecto utiliza ``cypress-mochawesome-reporter`` para generar reportes interactivos en formato HTML con capturas de pantalla embebidas.

### Configuración del Reporter en ``cypress.config.js``:

    const { defineConfig } = require('cypress');
    const mochawesomeReporter = require('cypress-mochawesome-reporter/plugin');

    module.exports = defineConfig({
        e2e: {
            setupNodeEvents(on, config) {
                console.log("cypress-mochawesome-reporter setup called");
                mochawesomeReporter(on, config);
                return config;
            },
            specPattern: "cypress/e2e/**/*.{js,jsx,ts,tsx}",
            reporter: "cypress-mochawesome-reporter",
            reporterOptions: {
                reportDir: "cypress/reports/mochawesome",
                overwrite: false,
                html: true,
                json: true,
                embeddedScreenshots: true,
                inlineAssets: true
            },
            screenshotOnRunFailure: true,
            viewportWidth: 430,
            viewportHeight: 932
        },
    });

### Generación Automática del Reporte

Para automatizar la generación del reporte HTML tras ejecutar los tests, se han configurado scripts en el ``package.json``:

    {
      "scripts": {
        "test": "npx cypress run --headed --browser chrome && npm run generate-report",
        "generate-report": "npx marge mochawesome.json -o cypress/reports/mochawesome && start cypress/reports/mochawesome/mochawesome.html"
      }
    }

Con este comando, al ejecutar ``npm run test`` se ejecutarán los tests, se fusionarán los archivos JSON y se generará el reporte HTML que se abrirá automáticamente en el navegador.

---

# 6. Comandos relevantes

- **Abrir Cypress en modo interactivo:**
    ```
    npx cypress open
- **Ejecutar tests en modo headless:**
    ```
    npx cypress run --headed --browser chrome
- **Limpiar caché de Cypress:**
    ```
    npx cypress cache clear
- **Generar reporte Mochawesome (si no se automatiza en el script):**
    ```
    npx marge mochawesome.json -o cypress/reports/mochawesome
---

# 7. Comandos de Consola Relevantes

La automatización de pruebas con Cypress es ideal para integrarse en un pipeline de CI/CD. La integración continua permite:

- **Ejecución Continua:**<br>
Permite ejecutar los tests automáticamente en cada commit o pull request, detectando errores antes de que se integren en producción.
- **Consistencia y Calidad:**<br>
Garantiza que el código se pruebe de forma consistente y se mantenga la calidad en cada iteración.
- **Herramientas Recomendadas:**
  - **Azure DevOps Pipelines:** Configurable para ejecutar Cypress y generar reportes con Mochawesome.+
  - **GitHub Actions:** Una opción popular para integrar pruebas automatizadas en repositorios de GitHub.
  - **Jenkins, CircleCI, etc.:** Alternativas válidas según el entorno.
- **¿Por qué hacerlo?**
Automatizar la ejecución de pruebas en un pipeline CI/CD ayuda a:
  - Reducir el tiempo de feedback.
  - Minimizar el riesgo de introducir errores en producción.
  - Facilitar el seguimiento de la calidad del software a lo largo del tiempo.

---

# 8. Resumen de lo Automatizado

- **Flujo de Búsqueda de Alquiler de Coches:**
  - Navegación a la URL, aceptación de cookies y llenado de formulario (ubicación, fechas, rango de edad).
  - Ejecución de búsqueda y validación de la selección del coche (filtrado por SUV).
  - Validación de la selección de la tarifa de seguro (Basic o Premium) y navegación a la página de información del conductor.
  - Captura automática de screenshots en caso de fallo y generación de reportes detallados con Mochawesome.
- **Mejores Prácticas Aplicadas:**
  - **Page Object Model (POM):** Separar la lógica de interacción con la UI en objetos.
  - **Funciones Helpers:** Centralizar los pasos comunes del flujo.
  - **Uso de Fixtures:** Para manejar datos de prueba de forma centralizada.
  - **Configuración de Reportes:** Integración con cypress-mochawesome-reporter para generar reportes interactivos.
  - **Manejo de Errores:** Configuración de ``screenshotOnRunFailure`` y manejo global de excepciones.
  - **Configuración Móvil:** Uso de ``viewport`` para simular dispositivos móviles según lo solicitado.

---