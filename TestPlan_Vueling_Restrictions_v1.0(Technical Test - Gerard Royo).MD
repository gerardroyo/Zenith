# Test Plan – Travel Restrictions for Minors

**Technical Test – Gerard Royo**

---

## INDEX

1. [Project data for Vueling’s Ticket Selling Web](#project-data-for-vuelings-ticket-selling-web)
2. [Introduction and objectives](#introduction-and-objectives)
3. [Scope of Testing](#scope-of-testing)
4. [Testing Strategy and Approach](#testing-strategy-and-approach)
5. [Planning](#planning)
6. [Risk Forecasting and Management](#risk-forecasting-and-management)
7. [Definition of Manual Test Cases](#definition-of-manual-test-cases)
8. [Appendices and References](#appendices-and-references)
9. [Change History](#change-history)

---

> **Note:** In developing this Test Plan, I followed the best practices and guidelines defined by the ISTQB, along with a few personal touches.

## 1. Project data for Vueling’s Ticket Selling Web

| Version               | Date       | Author      | Canges                 | Stakeholders |
|-----------------------|------------|-------------|------------------------|--------------|
| 1.0                   | 01/04/2025 | Gerard Royo | Document creation      | Vueling      |


**Project description:**  
A web system for selling airline tickets, with specific rules regarding the travel of minors and validation of insurance rate tariffs in the technical section.

**Executive summary:**  
This document describes the manual test plan designed to validate the business rules implemented in the Vueling’s Ticket Selling Web system. The primary focus is to ensure that the restrictions related to booking tickets for minors are correctly enforced in accordance with established policies. In addition, acceptance criteria, scope, testing strategy, and the necessary planning for the successful execution of tests in the established environment are defined.

---

## 2. Introduction and objectives

**Project context:**  
The project consists of implementing and validating a reservation system for Vueling. Specifically, the system must enforce accompaniment rules for children and adolescents based on their age and nationality. This initiative aims to optimize safety and customer satisfaction, ensuring that bookings are made in compliance with current regulations and Vueling’s internal policies.

**Test objectives:**

1. **Verify the implementation of business rules:**  
   Ensure that the system prevents reservations that do not meet the accompaniment conditions established for each age group and nationality.

2. **Identify input validation defects:**  
   Detect any inconsistencies in the system’s validation logic, both on the user interface and within the booking flow.

3. **Guarantee user experience:**  
   Confirm that the application’s messages and behavior are clear and correctly guide the user when a reservation is not allowed due to the established restrictions.

---

## 3. Scope of testing

### What is tested:

**Business rules for minors:**

- Verify that children under 12 can only book if they travel accompanied by an adult.
- Check that Italian children under 14, when traveling to or from Italy, always travel accompanied by an adult.
- Validate that Romanian passengers under 18, when traveling to or from Romania, have an adult present.
- Ensure that unaccompanied minors under 16 cannot book connecting flights.

**Booking flow:**

- Validate that when data is entered that meets (or does not meet) the conditions, the system responds with clear informational messages and either allows or prevents the reservation accordingly.
- Confirm that the pages involved in the flow (data entry, booking confirmation, error messages) behave as expected.

**Messages and notifications:**

- Verify that appropriate alert or error messages are displayed when a reservation does not comply with the established rules.

### What is not tested:

**Performance aspects:**

- Response time and server load will not be evaluated. The focus is on validating business rules and the correct functionality of the booking flow.

**Security tests:**

- Vulnerability, authentication, or authorization tests will not be included unless specified in another phase of the project.

**Detailed visual design and usability:**

- The aesthetics or in-depth user experience (e.g., graphic design or responsiveness on different devices) will not be evaluated unless they directly affect the validation of the rules.

**Integration with other systems:**

- Testing integrations with external systems (e.g., payment gateways or third-party systems) that are not directly related to the validation of the booking flow will not be covered.

**Other booking flows:**

- Tests related to booking flows not linked to the validation of the accompaniment rules for minors will be excluded.

---

## 4. Testing strategy and approach

### Manual tests:

**Functional tests:**  
- *Description:* These tests focus on validating that the application meets the defined functional requirements.

**Boundary value tests:**  
- *Description:* This technique helps define test cases that cover different input groups (ages) and critical boundary values.

**Exploratory tests:**  
- *Description:* These tests allow testers to interact freely with the application to discover unexpected behaviors or defects not covered by predefined cases.

### Future automated tests:

Although this plan focuses on manual testing, it is recommended to evaluate the automation of regression tests in future iterations to improve efficiency and test coverage.

### Regression tests:

- *Description:* Each time changes are made to the validation logic, the selected CI/CD tool will re-execute the test cases to ensure no new errors are introduced.

### Methodology:

**Black box techniques:**  
- *Description:* Techniques such as boundary value analysis are applied to define representative data sets without knowledge of the system’s internal code.

**Structuring and documentation of test cases:**

- **Format:**  
  Each test case must include:
  - **Identifier:** A unique code that facilitates traceability (e.g., `TC_Rx_yyy.y`).
  - **Title:** A brief, clear description of the scenario to be validated.
  - **Preconditions:** The state or configurations required in the system before execution.
  - **Steps to Follow:** Detailed, numbered instructions that allow the scenario to be replicated without ambiguity.
  - **Expected Results:** The behavior expected from the system based on the defined requirements.
  - **Status and Observations:** A record of the actual result and comments on any deviations or issues encountered.

**Continuous review and validation:**  
- *Description:* Periodic sessions are recommended to review test cases and results with the team.

---

## 5. Planning

### Key dates and milestones:

1. **Planning and preparation**  
   - **Start of testing project:**  
     - **Date:** 01/04/2025  
     - **Activity:** Review documentation and initially define the test scope and objectives.
   - **Internal approval of the test plan:**  
     - **Date:** 02/04/2025  
     - **Activity:** Internal review and validation of the document by the QA team.

2. **Development of regression tests and execution of manual tests**  
   - **Start of test case execution:**  
     - **Date:** 09/04/2025  
     - **Activity:** Begin executing all defined test cases.
   - **Completion of test execution:**  
     - **Date:** 11/04/2025  
     - **Activity:** Conclude execution of all cases and record the results.

3. **Results logging and analysis**  
   - **Review and logging of incidents:**  
     - **Date:** 12/04/2025  
     - **Activity:** Consolidate defects and perform an initial analysis to identify patterns or critical areas.
   - **Feedback meeting:**  
     - **Date:** 13/04/2025  
     - **Activity:** Session with the team and/or stakeholders to discuss findings, validate results, and define improvement or re-test actions.

4. **Final report and closure**  
   - **Final report delivery and test cycle closure:**  
     - **Date:** 14/04/2025  
     - **Activity:** Draft and distribute the final report with conclusions, metrics, and recommendations for the next phase or system adjustments.

> **Note:** In case of critical incidents, the schedule may be adjusted.

---

## 6. Risk forecasting and management

**Last-Minute changes in requirements/business rules:**  
- **Policy updates:**  
  If any business rule is modified during testing, the affected test cases must be updated and revalidated. These changes must be documented in the test plan and, if necessary, the tests rescheduled to ensure full coverage of the new rules.

**Environment availability:**  
- **Testing environment issues:**  
  If the testing environment ([http://tickets.vueling.com](http://tickets.vueling.com) – PRE/DEV version) experiences unexpected downtime, connectivity issues, or slowness that prevent proper test execution, it is recommended to:
  - Establish direct communication with the infrastructure team to report and resolve the issue urgently.
  - Consider rescheduling test execution once normal operation is restored.
  - Evaluate using an alternative or simulated environment if available, to avoid completely halting validation.

---

## 7. 7. Definition of manual test cases

> **Naming Legend:** `TC_Rx_yyy.y` → **TC** = Test Case, **x** = Business Rule, **yyy** = Test Case Number.

> **Note:** Normally, detailed test case definitions are documented in a separate file or through a test case management tool such as Jira or TestRail, which allows for a modular and scalable structure. In this Test Plan, the manual test cases are included directly to facilitate review and understanding of the testing scope and strategy in the context of this technical test. It is recommended that in larger projects, these cases be maintained in a separate document or system and linked within the Test Plan for easier maintenance and traceability.

---

### Business Rule 1: Children under 12 years old at time of the flight must always travel accompanied by an adult.

| ID         | Title                                                     | Preconditions                                                                                  | Steps                                                                                                                                                                                                                                                                      | Expected Result                                               | Status  | Observations                                                                                                             |
|------------|-----------------------------------------------------------|------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------|---------|-------------------------------------------------------------------------------------------------------------------------|
| TC_R1_001  | Successful Reservation for an 11-Year-Old Child Accompanied | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in the "Origin" and "Destination" fields.<br>2. Select the flight date.<br>3. Enter passenger details: Name, Age = 11, Nationality (any).<br>4. Enter accompanying adult details (Name, Age, Relationship).<br>5. Click the "Search Flights" button.               | The reservation proceeds without errors.                      | ✅/❌   | Positive case: The system validates that the minor is accompanied. "In case of defect, record what occurred."             |
| TC_R1_002  | Blocked Reservation for an 11-Year-Old Child Without Accompaniment | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in the "Origin" and "Destination" fields and select the flight date.<br>2. Enter passenger details: Name, Age = 11, Nationality (any).<br>3. Omit the accompanying adult section.<br>4. Click "Search Flights".                                   | The system displays "The passenger must travel accompanied by an adult" and blocks the reservation.                        | ✅/❌   | Negative case: Absence of an accompanying adult causes blockage.                                                       |
| TC_R1_003  | Boundary Case: 12-Year-Old Child Without Accompaniment      | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in the "Origin" and "Destination" fields and select the flight date.<br>2. Enter passenger details: Name, Age = 12, Nationality (any).<br>3. Do not enter accompanying adult information.<br>4. Click "Search Flights".                         | The reservation proceeds, assuming the rule applies strictly to children under 12.                                     | ✅/❌   | Boundary case: Evaluates system behavior at the age limit.                                                             |


---

### Business Rule 2: Italian Children Under 14 Traveling To/From Italy Must Be Accompanied by an Adult

| ID           | Title                                                                       | Preconditions                                                                                  | Steps                                                                                                                                                                                                                                                                                   | Expected Result                                                      | Status  | Observations                                                                               |
|--------------|-----------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|---------|-------------------------------------------------------------------------------------------|
| TC_R2_004    | Successful Reservation for a 13-Year-Old Italian Child Accompanied (Outbound to Italy) | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" (e.g., Rome) and "Destination" (e.g., Madrid) and select the flight date.<br>2. Enter passenger details: Name, Age = 13, Nationality = Italian.<br>3. Enter accompanying adult details.<br>4. Click "Search Flights".                                 | The reservation proceeds correctly, showing flight options.          | ✅/❌   | Positive case: Rule is met by providing an accompanying adult (Outbound to Italy).           |
| TC_R2_004.1  | Successful Reservation for a 13-Year-Old Italian Child Accompanied (Return to Italy)      | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" (e.g., Madrid) and "Destination" (e.g., Rome) and select the flight date.<br>2. Enter passenger details: Name, Age = 13, Nationality = Italian.<br>3. Enter accompanying adult details.<br>4. Click "Search Flights".                                  | The reservation proceeds correctly, showing flight options.          | ✅/❌   | Positive case: Rule is met by providing an accompanying adult (Return to Italy).            |
| TC_R2_005    | Blocked Reservation for a 13-Year-Old Italian Child Without an Accompanying Adult            | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" and "Destination" with Italian cities (e.g., Rome to Milan) and select the flight date.<br>2. Enter passenger details: Name, Age = 13, Nationality = Italian.<br>3. Omit accompanying adult information.<br>4. Click "Search Flights".             | The system displays "The passenger must travel accompanied by an adult" and blocks the reservation. | ✅/❌   | Negative case: Absence of an accompanying adult triggers the error.                       |
| TC_R2_006    | Boundary Case: Italian Child of 14 Years Without an Accompanying Adult                         | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" and "Destination" (e.g., Rome to Florence) and select the flight date.<br>2. Enter passenger details: Name, Age = 14, Nationality = Italian.<br>3. Do not enter accompanying adult information.<br>4. Click "Search Flights".                        | The reservation proceeds, assuming the rule applies strictly to children under 14.             | ✅/❌   | Boundary case: Evaluates system behavior at the age limit.                                  |


---

### Business Rule 3: Romanian Children Under 18 Traveling To/From Romania Must Be Accompanied by an Adult

| ID           | Title                                                                       | Preconditions                                                                                  | Steps                                                                                                                                                                                                                                                                                   | Expected Result                                                      | Status  | Observations                                                           |
|--------------|-----------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|---------|-----------------------------------------------------------------------|
| TC_R3_007    | Successful Reservation for a 17-Year-Old Romanian Child Accompanied (Outbound to Romania) | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" (e.g., Bucharest) and "Destination" (e.g., Madrid) and select the flight date.<br>2. Enter passenger details: Name, Age = 17, Nationality = Romanian.<br>3. Enter accompanying adult details.<br>4. Click "Search Flights".                          | The reservation proceeds correctly, displaying flight options.        | ✅/❌   | Positive case: Correct validation with accompaniment.                |
| TC_R3_007.1  | Successful Reservation for a 17-Year-Old Romanian Child Accompanied (Return to Romania)      | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" (e.g., Madrid) and "Destination" (e.g., Bucharest) and select the flight date.<br>2. Enter passenger details: Name, Age = 17, Nationality = Romanian.<br>3. Enter accompanying adult details.<br>4. Click "Search Flights".                          | The reservation proceeds correctly, displaying flight options.        | ✅/❌   | Positive case: Validates the rule with accompaniment on a return flight. |
| TC_R3_008    | Blocked Reservation for a 17-Year-Old Romanian Child Without an Accompanying Adult             | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" and "Destination" (e.g., Bucharest to Barcelona) and select the flight date.<br>2. Enter passenger details: Name, Age = 17, Nationality = Romanian.<br>3. Omit accompanying adult information.<br>4. Click "Search Flights".                       | The system displays "The passenger must travel accompanied by an adult" and blocks the reservation. | ✅/❌   | Negative case: Absence of an accompanying adult causes blockage.       |
| TC_R3_009    | Boundary Case: Romanian Child of 18 Years Without an Accompanying Adult                        | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" and "Destination" (e.g., Bucharest to Paris) and select the flight date.<br>2. Enter passenger details: Name, Age = 18, Nationality = Romanian.<br>3. Do not enter accompanying adult information.<br>4. Click "Search Flights".                   | The reservation proceeds, assuming the rule applies strictly to children under 18.              | ✅/❌   | Boundary case: Evaluates behavior at the age limit.                    |


---

### Business Rule 4: Unaccompanied Minors Under 16 Cannot Book Connecting Flights

| ID           | Title                                                                       | Preconditions                                                                                  | Steps                                                                                                                                                                                                                                                                                   | Expected Result                                                      | Status  | Observations                                                                   |
|--------------|-----------------------------------------------------------------------------|------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------|---------|-------------------------------------------------------------------------------|
| TC_R4_010    | Successful Reservation for a 15-Year-Old Passenger Without Accompaniment on a Direct Flight | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" (e.g., Valencia) and "Destination" (e.g., Seville) and select the flight date.<br>2. Enter passenger details: Name, Age = 15.<br>3. Do not enter accompanying adult information.<br>4. Select a direct (non-stop) flight.<br>5. Click "Search Flights".        | The reservation proceeds without errors, as the connecting flight restriction does not apply.     | ✅/❌   | Positive case: Direct flights are allowed when unaccompanied.                  |
| TC_R4_011    | Blocked Reservation for a 15-Year-Old Passenger Without Accompaniment on a Connecting Flight | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" and "Destination" (e.g., Valencia to Paris with a stopover) and select the flight date.<br>2. Enter passenger details: Name, Age = 15.<br>3. Do not enter accompanying adult information.<br>4. Select a connecting flight.<br>5. Click "Search Flights".         | The system displays "Connecting flights are not allowed for unaccompanied minors" and blocks the reservation. | ✅/❌   | Negative case: Absence of an accompanying adult triggers the connecting flight restriction. |
| TC_R4_012    | Boundary Case: 15-Year-Old Passenger With Accompaniment on a Connecting Flight | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" and "Destination" (e.g., Valencia to Paris) and select the flight date.<br>2. Enter passenger details: Name, Age = 15.<br>3. Enter accompanying adult details.<br>4. Select a connecting flight.<br>5. Click "Search Flights".                        | The reservation proceeds, as the restriction applies only to unaccompanied minors.                | ✅/❌   | Boundary case: Verifies that the presence of an accompanying adult allows the booking.         |
| TC_R4_012.1  | Boundary Case: 16-Year-Old Passenger Without Accompaniment on a Connecting Flight | The booking form is fully loaded on [http://tickets.vueling.com](http://tickets.vueling.com).      | 1. Fill in "Origin" and "Destination" (e.g., Valencia to Paris) and select the flight date.<br>2. Enter passenger details: Name, Age = 16.<br>3. Do not enter accompanying adult information.<br>4. Select a connecting flight.<br>5. Click "Search Flights".                | The reservation proceeds, as the restriction applies only to minors under 16.                     | ✅/❌   | Boundary case: Verifies that a passenger aged 16 or older can book even without accompaniment. |


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

