This ia a project done using BDD framework. I have used Selenium as automation tool and Java as developing language. 
I have three main folders, src/main/java, src/test/java and src/test/resources
In src/main/java:
          - Base.java - Class to initialize web drivers
          - com.Pages - Page clases for webelements.
          -com.Utilities - Configreader class to read data from properties file.
In src/test/java:
          - AppHooks.java - class with common methids that needs to be exceuted everytime, priorities,,etc.
          -StepDef - Actual code of the project.
          -Testrunner.java - Trigger the test cases, add group..etc.
In src/test/reources:
          -com.features - feature file where we use Gherkin language
          -config.properties - properties file to add username, password, browser value..etc.
Has a pom.xml file to add dependencies.
Maven has been used for build management. 
Can use Apache POI to read and write data from Excel, Powerpoint..etc
