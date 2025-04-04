# PROYECTO DE PRUEBAS PARA VUELING

Este repositorio contiene dos conjuntos de pruebas que forman parte de la prueba técnica para Vueling:

- **Test Plan Manual:**  
  Documento detallado para validar las reglas de negocio en la venta de billetes (especialmente las restricciones de viaje para menores), elaborado siguiendo los requerimientos del enunciado y los lineamientos del ISTQB.

- **Pruebas Automatizadas en Cypress:**  
  Automatización de dos casos de prueba para la validación de tarifas de seguros (Basic y Premium) en el sistema de alquiler de coches.

---

## ÍNDICE

- [Test Plan Manual](#test-plan-manual)
- [Descripción del Proyecto](#descripción-del-proyecto)
- [Tecnologías y Dependencias](#tecnologías-y-dependencias)
- [Instalación y Configuración](#instalación-y-configuración)
- [Ejecución de las Pruebas](#ejecución-de-las-pruebas)
- [Reportes y Consola](#reportes-y-consola)
- [Pruebas Automatizadas en Cypress](#pruebas-automatizadas-en-cypress)
- [Integración CI/CD](#integración-cicd)
- [Comandos Relevantes](#comandos-relevantes)
- [Conclusiones](#conclusiones)

---

## Test Plan Manual

### Descripción
El Test Plan Manual se ha elaborado para validar la correcta implementación de las reglas de negocio en el sistema de venta de billetes de Vueling, con especial énfasis en las restricciones de viaje para menores de edad. Se desarrolló siguiendo los requerimientos exactos del enunciado y basándose en los lineamientos del ISTQB.

### Estructura del Test Plan
El documento se organiza en las siguientes secciones:
- **Datos del Proyecto:** Información básica y contexto del sistema.
- **Introducción y Objetivos:** Se definen el contexto y los objetivos, como verificar que la aplicación impida reservas incorrectas y ofrezca mensajes claros.
- **Alcance de las Pruebas:** Se detalla qué funcionalidades se validan (por ejemplo, las restricciones de acompañamiento para menores) y qué aspectos quedan fuera (por ejemplo, rendimiento o seguridad).
- **Estrategia y Enfoque:** Se describen las metodologías utilizadas (pruebas funcionales, de valores límite y exploratorias basadas en técnicas de caja negra).
- **Planificación y Gestión de Riesgos:** Se establece un cronograma, hitos clave y estrategias de mitigación para cambios en requisitos o incidencias en el entorno.
- **Definición de Casos de Prueba:** Cada caso se documenta con un identificador, precondiciones, pasos detallados, resultados esperados y observaciones, garantizando trazabilidad y claridad en el proceso de validación.

### ¿Por qué se diseñó de esta manera?
El Test Plan Manual se diseñó siguiendo estrictamente las indicaciones del enunciado, asegurando:

- **Cumplimiento de Requisitos:**  
  Cada regla de negocio se valida minuciosamente para garantizar que la aplicación impida reservas incorrectas y notifique de forma clara al usuario.
  
- **Documentación Detallada:**  
  La estructura facilita la revisión, auditoría y seguimiento de incidencias, siendo esencial para asegurar la calidad del proceso de validación.
  
- **Transparencia y Control:**  
  Permite realizar sesiones de revisión con el equipo de QA y stakeholders, asegurando que cualquier cambio en los requisitos se documente y se revalide de forma oportuna.

---

## Descripción del Proyecto

El proyecto aborda dos áreas clave de pruebas para los sistemas de Vueling:

- **Venta de Billetes (Test Plan Manual):**  
  Validación manual de las restricciones de viaje para menores, asegurando que se cumplan las políticas de acompañamiento definidas.

- **Alquiler de Coches (Pruebas Automatizadas en Cypress):**  
  Automatización de pruebas para validar la selección de tarifas de seguros (Basic y Premium) y la navegación a la página de información del conductor.

---

## Tecnologías y Dependencias

- **Cypress:** Framework para pruebas end-to-end.
- **Moment.js:** Manejo y formateo de fechas.
- **cypress-mochawesome-reporter:** Genera reportes HTML interactivos con capturas de pantalla embebidas.
- **Mochawesome Merge & Marge:** Para unir resultados y generar reportes finales.
- *(Opcional)* **Herramientas CI/CD:** Azure DevOps Pipelines, GitHub Actions, etc.

---

## Instalación y Configuración

### Requisitos Previos
- Node.js (incluye npm)
- Clonar el repositorio en tu entorno local

### Pasos de Instalación

1. **Clonar el repositorio:**

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_REPOSITORIO>
