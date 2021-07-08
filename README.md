-------------Create project and run FF and run | Add runner class and run it-------------
Step 1 - Create a new maven project
Step 2 - Add maven dependencies Cucumber Java | Cucumber JUnit | JUnit | Selenium Java
Step 3 - Create a folder Features under src/test/resources
Step 4 - Under features folder create a new feature file login.feature
Step 5 - Download cucumber plugin from Eclipse Marketplace if needed
Step 6 - Create feature file and add contents, Feature, Scenario, Steps, Scenario Outline, Example, Tags, Comments
Step 7 - Try to run the feature file indivisually snippet will be created to paste in steps
Step 8 - Add Step Definitions / Glue Code under src/test/java package
Step 9 - Create a Runner class if need to run multiple feature files

with above, all frk will be running without selenium code

------------ add selenium webdriver code --------------

Step 1 - Add Selenium Java maven dependency
Step 2 - Create a feature file and add Scenario and Steps
Step 3 - Create Step Definition/Glue Code for the steps
Step 4 - Download browser driver files 
Step 5 - Add Selenium WebDriver code
Step 6 - Run Feature file and check the execution

-------------add selenium web driver navigation code

Step 1 - Check the scenario/navigation
Step 2 - Create a feature file and add Scenario and Steps
Step 3 - Create Step Definition/Glue Code for the steps
Step 4 - Add Selenium WebDriver code
Step 5 - Run Feature file and check the execution

------------- add param code -------------------------

Step 1 - In the feature file select the values that need to be parameterized
Step 2 - Put the values within conical brackets or double quotes (Parameterization)
Step 3 - Change Scenario to Scenario Outline
Step 4 - Add Examples section
Step 5 - Add data for the parameters in the Examples section
Step 6 - Update step definition to get values from feature file Examples section
Step 7 - Run and verify

-------------- POM model -----------------------

Step 1 - Create a class for each page
Step 2 - Create locators of all objects to be used in that page
Step 3 - Create methods or actions to be performed on the objects
Step 4 - Refer in the test scripts
Step 5 - Run and validate

-------------- Page Factory --------------------

Step 1 - Create a class for each page
Step 2 - Create locators of all objects to be used in that page using @FindBy
Step 3 - Create methods or actions to be performed on the objects
Step 4 - Create constructor to get driver instance and 
                initialize Elements using method initElements
public LoginPage_PF(WebDriver driver) {
  this.driver = driver;
  PageFactory.initElements(driver, LoginPage_PF.class);
 }
Step 5 - Update Test Scripts to refer methods from PageFactory class
Step 6 - Run and validate

--------------- Taggings-----------------------

Step 1 - Create a new or use an existing Feature File
Step 2 - Mark the feature and scenarios with Tags : @TagName
Step 3 - Create new or use an existing TestRunner class
Step 4 - Add the tags in CucumberOptions section

@RunWith(Cucumber.class)
@CucumberOptions(
  features="src/test/resources/features", 
  glue= {"Steps"},
  tags = {"@SmokeTest"}
  )
public class TestRunner {
}

Step 5 - Run test runner class with different combination of tags

Single tag - tags = {"@smoke"}

Multiple tags
Tags with AND OR conditions
tags = {"@smoke or @regression"}
tags = {"@smoke and @regression"}
tags = {"@smoke and not @regression"}

Skip or Ignore Tags
tags = {"(@smoke or @regression) and not @important"}

----------- Hooks------------

Step 1 - Create a new or use an existing Feature File
Step 2 - Create the steps for the scenario in the feature file
Step 3 - Create setup and teardown methods and mark with annotation
@Before
@After
@BeforeSteps
@AfterSteps

Step 4 - Create new or use an existing TestRunner class
Step 5 - Run the TestRunner class and check execution

-------------FF background ------------

Step 1 - Create a new or use an existing Feature File
Step 2 - Create the steps for the scenario in the feature file
Step 3 - Create new or use an existing TestRunner class
Step 4 - Run the test runner file
Step 5 - Create a background section and add common steps
Step 6 - Run the test runner file and check execution of the background

-------------- CMD executions --------

Step 1 - Right-click on the project and select Run As - Maven test
Step 2 - Check the console logs
Step 3 - Troubleshoot and correct the errors
Step 4 - Open CMD prompt
Step 5 - Check MAVEN is installed   mvn -version
Step 6 - CD to the project location
Step 7 -  Run command  mvn test

By default mvn test will run the files with naming syntax
**/Test*.java
**/*Test.java
**/*TestCase.java

Overriding Cucumber Options from Command Line
mvn test
mvn test -Dcucumber.options=”Your Options”
mvn test -Dcucumber.options=”--help”
Run specific feature : mvn test -Dcucumber.options="src/test/resources/login.feature" 
Run specific scenario : mvn test -Dcucumber.options="feature file path:7" 
Run with Tags : mvn test -Dcucumber.options="--tags @Smoke" 
Reports : mvn test -Dcucumber.options=”--plugin html:target/HtmlReports”

Running with multiple parameters
Can run with multiple parameters from command line
mvn test -Dcucumber.options="----"  -Dcucumber.options="----" 

example
mvn test 
-Dcucumber.options="src/test/resources/login.feature"  -Dcucumber.options="--tags @Smoke" 

-------------- Reporting -------------------

Step 1 : Add the maven cucumber reporting dependency in pom.xml
Step 2 : Add the build plugins in pom.xml
Step 3 : Clean project
Step 4 : From command line run - mvn test
Step 5 : From command line run - mvn verify
Step 6 : Check report generated

---------------Execution---------
1. Right click on FF and run
2. Run indivisual test runner file
2. Right click project and Maven test run
3. In cmd, run mvn test, it will run all testRunner class files

---------CICD pipeline 2 ways---------
1. Add free style project in Jenkins and link repo from Git hub
2. Add Jenkinsfile and link in pipeline job in Jenkins
3. For add cucumber plugins in Manage Jenkins

-------Two way of running------
1. Using chrome driver placed in local dir or folder structure
2. Using Docker container

------By using docker container-----
1. Download the selenium/standalone-chrome into local repo
2. create the container and run the image with cmd docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome:latest
3. Run the scripts







