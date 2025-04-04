# Technical Test Vueling Gerard Royo

This document describes the work carried out for Vueling's technical test. Two main testing areas have been developed:

- **Test plan manual:**  
  A detailed document to validate the business rules in ticket sales (especially the travel restrictions for minors), prepared following the requirements of the brief and the ISTQB guidelines.

- **Automated tests in cypress:**  
  Automation of two test cases for the validation of insurance rates (Basic and Premium) in the car rental system.

---

# INDEX

1. [Test plan manual](#1-test-plan-manual)   
2. [Technologies and dependencies](#2-technologies-and-dependencies)  
3. [Installation and configuration](#3-installation-and-configuration)  
4. [Test execution](#4-test-execution)  
5. [Report generation with mochawesome](#5-report-generation-with-mochawesome)  
6. [Relevant commands](#6-relevant-commands)  
7. [Console commands](#7-console-commands)  
8. [Summary of Automated Testing](#8-summary-of-automated-testing) 

---

# 1. Test Plan Manual

### 1.1. Description
The Test Plan Manual has been developed with a special emphasis on travel restrictions for minors. It was created following the exact requirements of the brief and based on the ISTQB guidelines.


### 1.2. Structure of the test plan
The document is organized into the following sections:
- **Project data:** Basic information and context of the system.
- **Introduction and objectives:** The context and objectives are defined, such as verifying that the application prevents incorrect bookings and provides clear messages.
- **Scope of testing:** Details which functionalities are validated and which aspects are excluded (for example, performance or security).
- **Strategy and approach:** Describes the methodologies used (functional tests, boundary value tests, and exploratory tests based on black box techniques).
- **Planning and risk management:** Presents the timeline, key milestones, and mitigation strategies for changes or issues in the environment.
- **Test case definition:** Each case is documented with an identifier, preconditions, detailed steps, expected results, and observations, ensuring traceability and clarity in the validation process.

> **Note:** <br>
Normally, detailed test case definitions are documented in a separate file or through a test case management tool such as Jira or 
TestRail, which allows for a modular and scalable structure. In this Test Plan, the manual test cases are included directly to facilitate 
review and understanding of the testing scope and strategy in the context of this technical test. 
It is recommended that in larger projects, these cases be maintained in a separate document or system and linked within the Test 
Plan to ease maintenance and traceability. 

### 1.3. Why it was designed this way
The Test Plan Manual was designed strictly according to the brief's indications, ensuring:

- **Compliance with requirements:**  
  Every business rule is thoroughly validated to ensure that the application prevents incorrect bookings and clearly notifies the user.

- **Detailed documentation:**  
  The structure facilitates review, auditing, and tracking of issues, which is essential to ensure the quality of the validation process.

- **Transparencia y control:**  
  It allows for review sessions with the QA team and stakeholders, ensuring that any changes in requirements are documented and revalidated in a timely manner.

---

# Automated testing in Cypress

# 2. Technologies and dependencies

- [**Cypress:**](https://www.cypress.io) Automation framework for end-to-end testing.
- [**Moment.js:**](https://momentjs.com) For handling and formatting dates.
- [**cypress-mochawesome-reporter:**](https://github.com/LironEr/cypress-mochawesome-reporter) Generates interactive HTML reports with embedded screenshots.
- [**Mochawesome Merge & Marge:**](https://github.com/adamgruber/mochawesome-report-generator) For merging results and generating final reports.
- *(Optional)* **CI/CD tools:**  <br>
  It is recommended to integrate these tests into a CI/CD pipeline, for example, using **Azure DevOps** or **GitHub Actions**, to run the tests automatically with each commit and obtain updated reports.
  - **Why CI/CD?**  <br>
    It allows continuous validation of code quality, early detection of errors, and maintains system stability in production environments.
  - **Recommended tools:**  <br>
    Azure DevOps Pipelines, GitHub Actions, Jenkins, etc.

---

# 3. Installation and configuration

### Prerequisites
- [Node.js](https://nodejs.org/en) (includes npm) installed.
- Access to the code repository (cloned on your local machine).

### Installation

1. **Clone the repository:**

   ```bash
   git clone <URL_DEL_REPOSITORIO>
   cd <NOMBRE_DEL_REPOSITORIO>

2. **Install dependencies:**

   ```bash
    npm install

3. **Project structure:**

The project structure is organized as follows:

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


# 4. Test execution

### Interactive mode
To open Cypress in interactive mode:

    npx cypress open

From the graphical interface, select and execute the tests.

### Headless mode
To run the tests from the command line:

    npx cypress run --headed --browser chrome

> **Note:** <br>
The viewport has been set to 430x932 to simulate a mobile environment, as required by the technical test.

---

# 5. Report generation with Mochawesome

The project uses ``cypress-mochawesome-reporter`` to generate interactive HTML reports that include screenshots in case of failure.<br>
This option was chosen over Cypress’s default reporter mainly because it produces an HTML file that is much more agile for presentations and displays the results in a clearer, more advanced manner.

### Reporter configuration in ``cypress.config.js``:

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

### Automatic Report Generation

To automate the generation of the HTML report after running the tests, scripts have been configured in the ``package.json``:

    {
      "scripts": {
        "test": "npx cypress run --headed --browser chrome && npm run generate-report",
        "generate-report": "npx marge mochawesome.json -o cypress/reports/mochawesome && start cypress/reports/mochawesome/mochawesome.html"
      }
    }

With this command, running ``npm run test`` will run the tests, merge the JSON files, and generate the HTML report that will automatically open in the browser.

---

# 6. Relevant commands

- **Open Cypress in interactive mode:**
    ```
    npx cypress open
- **Run tests in headless mode:**
    ```
    npx cypress run --headed --browser chrome
- **Clear Cypress cache:**
    ```
    npx cypress cache clear
- **Generate Mochawesome report (if not automated via script):**
    ```
    npx marge mochawesome.json -o cypress/reports/mochawesome
---

# 7. Console commands

The automation of tests with Cypress is ideal for integration into a CI/CD pipeline. Continuous integration allows you to:

- **Continuous execution:**<br>
Run tests automatically on every commit or pull request, detecting errors before they reach production.
- **Consistency and quality:**<br>
Ensure that the code is tested uniformly and maintains quality in every iteration.
- **Recommended tools:**
  - **Azure DevOps Pipelines:** Configurable to run Cypress and generate reports with Mochawesome.
  - **GitHub Actions:** A popular option to integrate automated tests in GitHub repositories.
  - **Jenkins, CircleCI, etc.:** Valid alternatives depending on the environment.
- **Why do it?**
Automating test execution in a CI/CD pipeline helps to:
  - Reduce feedback time.
  - Minimize the risk of introducing errors in production.
  - Facilitate tracking software quality over time.

> **Note:** <br>
In this particular case, Azure DevOps is recommended since this project is hosted on a repository within that platform.

---

# 8. Summary of automated testing

- **Car rental search flow:**
  - Navigation to the URL, cookie acceptance, and form filling (pickup location, dates, age range).
  - Execution of the search and validation of car selection (filtered by SUV).
  - Validation of the insurance rate selection (Basic or Premium) and navigation to the driver information page.
  - Automatic screenshot capture on failure and generation of detailed reports with Mochawesome.
- **Best practices applied:**
  - **Page object model (POM):** Separation of UI interaction logic into objects.
  - **Helper functions:** Centralization of common flow steps.
  - **Use of fixtures:** For centralized management of test data.
  - **Report configuration:** Integration with cypress-mochawesome-reporter to generate interactive reports.
  - **Error handling:** Configuration of ``screenshotOnRunFailure`` and global exception handling.
  - **Mobile Configuration:** Use of ``viewport`` to simulate mobile devices as required.

> **Note:** <br>
In the provided fixtures file, the word "Basic" was changed to "Limited" since the website references "Limited".

---