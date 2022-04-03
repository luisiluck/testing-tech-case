# Automation framework

##### This framework was scaffold from Serenity-bdd Archetype.

## Features
- Cucumber6/Gherkin
- Selenium Webdriver
- Rest-Assured

## Requirements
- GIT
- JVM-8
- MAVEN

## Project structure

- pe.com.bcp.techcases.testautiomation/
- ├─ api/ (API automation eith Rest-Assured)
- │  ├─ actors/
- │  │  ├─ ApiClient
- │  ├─ steps/
- │  │  ├─ RestApiDefinition
- ├─ ui/ (web UI automation with Selenium)
- │  ├─ actors/
- │  │  ├─ DefaultUser
- │  ├─ pages/
- │  │  ├─ PracticeFormPage
- │  ├─ steps/
- │  │  ├─ StepDefinitions
- ├─ Tests
- features/ (Gherkin features)
- ├─ api/
- │  ├─ findUser.feature
- ├─ ui/
- │  ├─ demo_form.feature
- serenity.properties (driver specifications)