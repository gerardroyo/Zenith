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

Nota: Normally, detailed test case definitions are documented in a separate file or through a test case management tool such as Jira or 
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
- Node.js (incluye npm)
- Clonar el repositorio en tu entorno local

### Pasos de Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_REPOSITORIO>

2. **Instalar dependencias:**

   ```bash
    npm install

3. **Estructura del Proyecto**

    ```bash
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


# 4. Ejecución de pruebas

### Modo Interactivo
Para abrir Cypress en modo interactivo:

    npm

Desde la interfaz gráfica, selecciona y ejecuta los tests.

### Modo Interactivo
Para ejecutar los tests en modo headless:

    npx cypress run --headed --browser chrome

---

# 5. Reportes y consola

Las pruebas se integran con cypress-mochawesome-reporter para generar reportes HTML interactivos que incluyen capturas de pantalla en caso de fallo.

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

### Automatización de la Generación del Reporte

Se han configurado los siguientes scripts en el ``package.json`` para que, al ejecutar ``npm run test``, se ejecuten los tests, se fusionen los resultados y se abra el reporte HTML automáticamente:

    {
      "scripts": {
        "test": "npx cypress run --headed --browser chrome && npm run generate-report",
        "generate-report": "npx mochawesome-merge cypress/reports/mochawesome/*.json -o mochawesome.json && npx marge mochawesome.json -o cypress/reports/mochawesome && start cypress/reports/mochawesome/mochawesome.html"
      }
    }

Con estos comandos, al ejecutar ``npm run test`` se ejecutarán las pruebas, se fusionarán los resultados y se abrirá el reporte HTML automáticamente.

---

# 6. Integracion CI/CD

La automatización de pruebas con Cypress es ideal para integrarse en un pipeline de CI/CD. La integración continua permite:

- **Ejecución Continua:**  Automatizar la ejecución de pruebas en cada commit o pull request, detectando errores de forma temprana.
- **Consistencia y Calidad:**  Garantizar que los tests se ejecuten en entornos uniformes y reproducibles.
- **Herramientas Recomendadas:**
  - **Azure DevOps Pipelines:** Configurable para ejecutar Cypress y generar reportes con Mochawesome.+
  - **GitHub Actions:** Una opción popular para integrar pruebas automatizadas en repositorios de GitHub.
  - **Jenkins, CircleCI, etc.:** Alternativas válidas según el entorno.

---

# 7. Comandos relevantes

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
    npx mochawesome-merge cypress/reports/mochawesome/*.json -o mochawesome.json
    npx marge mochawesome.json -o cypress/reports/mochawesome
---