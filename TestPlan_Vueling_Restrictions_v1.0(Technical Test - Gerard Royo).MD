# Test Plan – Travel Restrictions for Minors

**Technical Test – Gerard Royo**

---

## INDEX

1. [Project Data for Vueling’s Ticket Selling Web](#project-data-for-vuelings-ticket-selling-web)
2. [Introduction and Objectives](#introduction-and-objectives)
3. [Scope of Testing](#scope-of-testing)
4. [Testing Strategy and Approach](#testing-strategy-and-approach)
5. [Planning](#planning)
6. [Risk Forecasting and Management](#risk-forecasting-and-management)
7. [Definition of Manual Test Cases](#definition-of-manual-test-cases)
8. [Appendices and References](#appendices-and-references)
9. [Change History](#change-history)

---

## 1. Project Data for Vueling’s Ticket Selling Web

**Document Version:** 1.0  
**Date:** 01/04/2025  
**Author:** Gerard Royo  
**Stakeholders:** Vueling

**Project Description:**  
A web system for selling airline tickets, with specific rules regarding the travel of minors and the validation of insurance rate tariffs in the technical section.

**Executive Summary:**  
This document describes the manual test plan designed to validate the business rules implemented in the Vueling’s Ticket Selling Web system. The primary focus is to ensure that the restrictions related to booking tickets for minors are correctly enforced according to established policies. Additionally, acceptance criteria, scope, testing strategy, and the necessary planning for the successful execution of tests in the established environment are defined.

---

## 2. Introduction and Objectives

**Project Context:**  
The project consists of implementing and validating a reservation system for Vueling. Specifically, the system must enforce accompaniment rules for children and adolescents based on their age and nationality. This initiative aims to optimize safety and customer satisfaction, ensuring that bookings comply with current regulations and Vueling’s internal policies.

**Test Objectives:**

1. **Verify the Implementation of Business Rules:**  
   Ensure that the system prevents reservations that do not meet the accompaniment conditions established for each age group and nationality.

2. **Identify Input Validation Defects:**  
   Detect any inconsistencies in the system’s validation logic, both on the user interface and within the booking flow.

3. **Guarantee User Experience:**  
   Confirm that the application’s messages and behavior are clear and correctly guide the user when a reservation is not allowed due to the established restrictions.

---

## 3. Scope of Testing

### What is Tested

**Business Rules for Minors:**

- Verify that children under 12 can only book if they travel accompanied by an adult.
- Check that Italian children under 14, when traveling to or from Italy, always travel accompanied by an adult.
- Validate that Romanian passengers under 18, when traveling to or from Romania, have an adult present.
- Ensure that unaccompanied minors under 16 cannot book connecting flights.

**Booking Flow:**

- Validate that when data is entered that meets (or does not meet) the conditions, the system responds with clear informational messages and either allows or prevents the reservation accordingly.
- Confirm that the pages involved in the flow (data entry, booking confirmation, error messages) behave as expected.

**Messages and Notifications:**

- Verify that appropriate alert or error messages are displayed when a reservation does not comply with the established rules.

### What is Not Tested

**Performance Aspects:**

- Response time and server load will not be evaluated. The focus is on validating business rules and the correct functionality of the booking flow.

**Security Tests:**

- Vulnerability, authentication, or authorization tests will not be included unless specified in another phase of the project.

**Detailed Visual Design and Usability:**

- The aesthetics or in-depth user experience (e.g., graphic design or responsiveness on different devices) will not be evaluated unless they directly affect the validation of the rules.

**Integration with Other Systems:**

- Testing integrations with external systems (e.g., payment gateways or third-party systems) that are not directly related to the validation of the booking flow will not be covered.

**Other Booking Flows:**

- Tests related to booking flows not linked to the validation of the accompaniment rules for minors will be excluded.

---

## 4. Testing Strategy and Approach

### Manual Tests

**Functional Tests:**  
- *Description:* These tests focus on validating that the application meets the defined functional requirements.

**Boundary Value Tests:**  
- *Description:* This technique helps define test cases that cover different input groups (ages) and critical boundary values.

**Exploratory Tests:**  
- *Description:* These tests allow testers to interact freely with the application to discover unexpected behaviors or defects not covered by predefined cases.

### Future Automated Tests

Although this plan focuses on manual testing, it is recommended to evaluate the automation of regression tests in future iterations to improve efficiency and test coverage.

### Regression Tests

- *Description:* Each time changes are made to the validation logic, the selected CI/CD tool will re-execute the test cases to ensure no new errors are introduced.

### Methodology

**Black Box Techniques:**  
- *Description:* Techniques such as boundary value analysis are applied to define representative data sets without knowledge of the system’s internal code.

**Structuring and Documentation of Test Cases:**

- **Format:**  
  Each test case must include:
  - **Identifier:** A unique code that facilitates traceability (e.g., `TC_Rx_yyy.y`).
  - **Title:** A brief, clear description of the scenario to be validated.
  - **Preconditions:** The state or configurations required in the system before execution.
  - **Steps to Follow:** Detailed, numbered instructions that allow the scenario to be replicated without ambiguity.
  - **Expected Results:** The behavior expected from the system based on the defined requirements.
  - **Status and Observations:** A record of the actual result and comments on any deviations or issues encountered.

**Continuous Review and Validation:**  
- *Description:* Periodic sessions are recommended to review test cases and results with the team.

---

## 5. Planning

### Key Dates and Milestones

1. **Planning and Preparation**  
   - **Start of Testing Project:**  
     - **Date:** 01/04/2025  
     - **Activity:** Review documentation and initially define the test scope and objectives.
   - **Internal Approval of the Test Plan:**  
     - **Date:** 02/04/2025  
     - **Activity:** Internal review and validation of the document by the QA team.

2. **Development of Regression Tests and Execution of Manual Tests**  
   - **Start of Test Case Execution:**  
     - **Date:** 09/04/2025  
     - **Activity:** Begin executing all defined test cases.
   - **Completion of Test Execution:**  
     - **Date:** 11/04/2025  
     - **Activity:** Conclude execution of all cases and record the results.

3. **Results Logging and Analysis**  
   - **Review and Logging of Incidents:**  
     - **Date:** 12/04/2025  
     - **Activity:** Consolidate defects and perform an initial analysis to identify patterns or critical areas.
   - **Feedback Meeting:**  
     - **Date:** 13/04/2025  
     - **Activity:** Session with the team and/or stakeholders to discuss findings, validate results, and define improvement or re-test actions.

4. **Final Report and Closure**  
   - **Final Report Delivery and Test Cycle Closure:**  
     - **Date:** 14/04/2025  
     - **Activity:** Draft and distribute the final report with conclusions, metrics, and recommendations for the next phase or system adjustments.
   - **Note:** In case of critical incidents, the schedule may be adjusted.

---

## 6. Risk Forecasting and Management

**Last-Minute Changes in Requirements/Business Rules:**  
- **Policy Updates:**  
  If any business rule is modified during testing, the affected test cases must be updated and revalidated. These changes must be documented in the test plan and, if necessary, the tests rescheduled to ensure full coverage of the new rules.

**Environment Availability:**  
- **Testing Environment Issues:**  
  If the testing environment ([http://tickets.vueling.com](http://tickets.vueling.com) – PRE/DEV version) experiences unexpected downtime, connectivity issues, or slowness that prevent proper test execution, it is recommended to:
  - Establish direct communication with the infrastructure team to report and resolve the issue urgently.
  - Consider rescheduling test execution once normal operation is restored.
  - Evaluate using an alternative or simulated environment if available, to avoid completely halting validation.

---

## 7. Definition of Manual Test Cases

**Naming Legend:**  
`TC_Rx_yyy.y` → **TC** = Test Case, **x** = Business Rule, **yyy** = Test Case Number.

**Note:**  
Normally, detailed test case definitions are documented in a separate file or through a test case management tool such as Jira or TestRail, which allows for a modular and scalable structure. In this Test Plan, the manual test cases are included directly to facilitate review and understanding of the testing scope and strategy in the context of this technical test. It is recommended that in larger projects, these cases be maintained in a separate document or system and linked within the Test Plan for easier maintenance and traceability.

---

### Business Rule 1: Children Under 12 Must Travel Accompanied by an Adult

| ID         | Título                                             | Precondiciones                                                                         | Pasos                                                                                                                                                                                                                                                                      | Resultado Esperado                                            | Estado  | Observaciones                                                                                         |
|------------|----------------------------------------------------|----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|---------|-------------------------------------------------------------------------------------------------------|
| TC_R1_001  | Reserva exitosa para niño de 11 años acompañado     | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar el campo "Origen" y "Destino".<br>2. Seleccionar la fecha de vuelo.<br>3. Ingresar datos del pasajero: Nombre, Edad = 11, Nacionalidad (cualquiera).<br>4. Ingresar los datos del adulto acompañante (Nombre, Edad, relación).<br>5. Hacer clic en "Buscar vuelos". | La reserva procede sin errores.                              | ✅/❌   | Caso positivo: el sistema valida que el menor va acompañado. “En caso de defecto, indicar lo sucedido.” |
| TC_R1_002  | Bloqueo de reserva para niño de 11 años sin acompañante | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 11, Nacionalidad (cualquiera).<br>3. Omitir la sección de adulto acompañante.<br>4. Pulsar "Buscar vuelos".                        | Se muestra el mensaje "El pasajero debe viajar acompañado de un adulto" y la reserva se interrumpe. | ✅/❌   | Caso negativo: ausencia de acompañante provoca bloqueo.                                            |
| TC_R1_003  | Reserva límite: pasajero de 12 años sin acompañante   | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 12, Nacionalidad (cualquiera).<br>3. No ingresar información de adulto acompañante.<br>4. Pulsar "Buscar vuelos".                | La reserva continúa, asumiendo que la regla aplica para menores estrictamente menores de 12. | ✅/❌   | Caso de límite: se verifica el comportamiento en el límite de edad.                                  |

---

### Business Rule 2: Italian Children Under 14 Traveling To/From Italy Must Be Accompanied by an Adult

| ID           | Título                                                                    | Precondiciones                                                                         | Pasos                                                                                                                                                                                                                                                                                 | Resultado Esperado                                                     | Estado  | Observaciones                                                                     |
|--------------|---------------------------------------------------------------------------|----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|---------|-----------------------------------------------------------------------------------|
| TC_R2_004    | Reserva exitosa para italiano de 13 años acompañado (ida a Italia)          | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" (ej. Roma) y "Destino" (ej. Madrid) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 13, Nacionalidad = Italiana.<br>3. Ingresar datos de un adulto acompañante.<br>4. Pulsar "Buscar vuelos".                                     | La reserva continúa correctamente, mostrando opciones de vuelo.      | ✅/❌   | Caso positivo: se cumple la regla con acompañante (ida a Italia).                |
| TC_R2_004.1  | Reserva exitosa para italiano de 13 años acompañado (vuelta a Italia)       | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" (ej. Madrid) y "Destino" (ej. Roma) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 13, Nacionalidad = Italiana.<br>3. Ingresar datos de un adulto acompañante.<br>4. Pulsar "Buscar vuelos".                                  | La reserva continúa correctamente, mostrando opciones de vuelo.      | ✅/❌   | Caso positivo: se cumple la regla con acompañante (vuelta a Italia).             |
| TC_R2_005    | Bloqueo de reserva para italiano de 13 años sin acompañante                | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" con ciudades italianas (ej. Roma a Milán) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 13, Nacionalidad = Italiana.<br>3. Omitir la información del adulto.<br>4. Pulsar "Buscar vuelos".               | El sistema muestra "El pasajero debe viajar acompañado de un adulto" y bloquea la reserva. | ✅/❌   | Caso negativo: la ausencia de acompañante genera el error.                     |
| TC_R2_006    | Reserva límite: italiano de 14 años sin acompañante                        | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" (ej. Roma a Florencia) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 14, Nacionalidad = Italiana.<br>3. No ingresar datos de adulto.<br>4. Pulsar "Buscar vuelos".                                     | La reserva continúa, asumiendo que la regla aplica para menores estrictamente menores de 14. | ✅/❌   | Caso de límite: se evalúa el comportamiento en el límite de edad.               |

---

### Business Rule 3: Romanian Children Under 18 Traveling To/From Romania Must Be Accompanied by an Adult

| ID           | Título                                                                    | Precondiciones                                                                         | Pasos                                                                                                                                                                                                                                                                    | Resultado Esperado                                                     | Estado  | Observaciones                                                       |
|--------------|---------------------------------------------------------------------------|----------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|---------|---------------------------------------------------------------------|
| TC_R3_007    | Reserva exitosa para rumano de 17 años acompañado (ida a Rumania)           | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" (ej. Bucarest) y "Destino" (ej. Madrid) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 17, Nacionalidad = Rumana.<br>3. Ingresar datos de un adulto acompañante.<br>4. Pulsar "Buscar vuelos".              | La reserva continúa correctamente, mostrando opciones de vuelo.      | ✅/❌   | Caso positivo: validación correcta con acompañante.                  |
| TC_R3_007.1  | Reserva exitosa para rumano de 17 años acompañado (vuelta a Rumania)        | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" (ej. Madrid) y "Destino" (ej. Bucarest) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 17, Nacionalidad = Rumana.<br>3. Ingresar datos de un adulto acompañante.<br>4. Pulsar "Buscar vuelos".              | La reserva continúa correctamente, mostrando opciones de vuelo.      | ✅/❌   | Caso positivo: valida la regla con acompañante en vuelo de retorno.     |
| TC_R3_008    | Bloqueo de reserva para rumano de 17 años sin acompañante                  | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" (ej. Bucarest a Barcelona) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 17, Nacionalidad = Rumana.<br>3. Omitir datos de adulto acompañante.<br>4. Pulsar "Buscar vuelos".               | El sistema muestra "El pasajero debe viajar acompañado de un adulto" y bloquea la reserva. | ✅/❌   | Caso negativo: ausencia de acompañante provoca bloqueo.             |
| TC_R3_009    | Reserva límite: rumano de 18 años sin acompañante                          | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" (ej. Bucarest a París) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 18, Nacionalidad = Rumana.<br>3. No ingresar datos de adulto.<br>4. Pulsar "Buscar vuelos".                   | La reserva continúa, asumiendo que la regla aplica para menores estrictamente menores de 18. | ✅/❌   | Caso de límite: se evalúa el comportamiento en el límite de edad.      |

---

### Business Rule 4: Unaccompanied Minors Under 16 Cannot Book Connecting Flights

| ID           | Título                                                                      | Precondiciones                                                                         | Pasos                                                                                                                                                                                                                                                                | Resultado Esperado                                                         | Estado  | Observaciones                                                               |
|--------------|-----------------------------------------------------------------------------|----------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------|---------|-----------------------------------------------------------------------------|
| TC_R4_010    | Reserva exitosa para pasajero de 15 años sin acompañante en vuelo directo      | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" (ej. Valencia) y "Destino" (ej. Sevilla) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 15.<br>3. No ingresar datos de adulto.<br>4. Seleccionar un vuelo directo (sin conexión).<br>5. Pulsar "Buscar vuelos". | La reserva procede sin errores, ya que la restricción de vuelos con conexión no aplica. | ✅/❌   | Caso positivo: regla de vuelos con conexión no aplica para vuelos directos.  |
| TC_R4_011    | Bloqueo de reserva para pasajero de 15 años sin acompañante en vuelo con conexión | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" (ej. Valencia a París con escala) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 15.<br>3. No ingresar datos de adulto.<br>4. Seleccionar un vuelo con conexión.<br>5. Pulsar "Buscar vuelos".           | El sistema muestra "Connecting flights are not allowed for unaccompanied minors" y bloquea la reserva. | ✅/❌   | Caso negativo: la ausencia de acompañante activa la restricción de vuelos con conexión. |
| TC_R4_012    | Reserva límite: pasajero de 15 años con acompañante en vuelo con conexión       | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" (ej. Valencia a París) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 15.<br>3. Ingresar datos del adulto acompañante.<br>4. Seleccionar un vuelo con conexión.<br>5. Pulsar "Buscar vuelos".        | La reserva procede, ya que la restricción aplica únicamente a menores sin acompañante.         | ✅/❌   | Caso de límite: verifica que la presencia del adulto permite continuar.       |
| TC_R4_012.1  | Reserva límite: pasajero de 16 años sin acompañante en vuelo con conexión       | El formulario de reserva está completamente cargado en [http://tickets.vueling.com](http://tickets.vueling.com). | 1. Completar "Origen" y "Destino" (ej. Valencia a París) y seleccionar la fecha.<br>2. Ingresar datos del pasajero: Nombre, Edad = 16.<br>3. No ingresar datos de adulto.<br>4. Seleccionar un vuelo con conexión.<br>5. Pulsar "Buscar vuelos".         | La reserva procede, ya que la restricción aplica únicamente a menores de 16.                     | ✅/❌   | Caso de límite: verifica que un pasajero de 16 años o mayor puede reservar sin acompañante. |

---

## 8. Appendices and References

### Additional Documentation

- **Base Business Rules Document:**  
  *Readme.MD*  
  This original document contains the description of the business rules for ticket sales and the instructions for validating reservations, including restrictions for minors and other flow specifications.

- **Functional and Technical Specifications (if available):**  
  In real projects, there is usually a document detailing the system architecture, user flows, and use cases. Although not provided in this technical test, it can be referenced as "support documentation."

- **Testing Environment Links:**  
  - Booking website URL: [http://tickets.vueling.com](http://tickets.vueling.com)

- **Test Case Management Tools:**  
  Tools such as Jira, TestRail, or even an Excel/Google Sheets template are recommended for documenting and managing test cases in detail. In this Test Plan, the manual test cases are included directly for review purposes; however, in a real project, these are managed separately.

---

## 9. Change History

*(Include change history details as per the original document.)*

---

**End of Document**
