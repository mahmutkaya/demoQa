# com.Demoqa & Petstore swagger 

- WEB & API Automation Testing Using Java, cucumber and restAssured

- Test results monitoring tool Calliope.pro

- Environment and specs: https://demoqa.com/ (UI) /https://petstore.swagger.io/ (API)

### dependencies:
- [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)
- [cucumber-java](https://mvnrepository.com/artifact/io.cucumber/cucumber-java)
- [cucumber-junit](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit)
- [webdrivermanager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)
- [jackson-databind](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
- [rest-assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
- [hamcrest](https://mvnrepository.com/artifact/org.hamcrest/hamcrest)

### Setting Up
These instructions will get you a copy of the project up and running on your local machine.

- *clone the repo:*
```shell
git clone  https://github.com/islamduger40/Demoqa.git
```

- *set project sdk as 11*

Running tests from terminal:
```shell
mvn verify --file pom.xml
```
- In this project I used github actions but for any other CI/CD tools, checkout calliope documentation.

- If you want to use same pipeline setup just add following variables defined inside the workflows/maven.yml to your github repository as secret variables.

```properties  
 API_KEY: Required to import tests to Calliope.pro. Can be found on your Calliope.pro account page
 PROFILE_ID: Tests will be imported in one of your profiles on Calliope.pro. 
```  

### About scenarios:

Automated scenarios are:
- Drag and Drop (ui)
- Forms Filling (ui)
- Search(ui)
- Get request for pet endpoint(api)
- Post request for Store Order(api)
- Post request for user(api)

