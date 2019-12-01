# Javafx-mvc-skeleton
This is my skeleton project that you can use to develop you javaFX application.  
I created it mainly for beginners so below you can check out quick guide to start developing and learning.  
It is maven based making running, testing, packaging and producing all sort of stuff simple and intuitive.

## Quick Guide
Follow these steps to prepare your application for development  

### 1. Copy the repository
IDE: When your IDE asks for URL use 'clone or download' button and copy https address. It should look kind of like that:  
  ```bash
  https://github.com/LBlocki/Javafx-mvc-skeleton.git
  ```  
Git command line: Make sure you have git installed. If you are using windows/linux command line instead of git's program make sure
that you added git to PATH. Then enter:
   ```bash
   git clone https://github.com/LBlocki/Javafx-mvc-skeleton.git
   ```  
Git will create directory containing this repository  

### 2. Install Java JDK and Maven
Before running you have to install both. You should also add them to the PATH.  
* [Java](https://www.oracle.com/technetwork/java/javase/downloads/index.html) - you need at least JDK 13
* [Maven](https://maven.apache.org/) - you need at least Apache Maven 3.3.9

### 3. Configure project
Almost everything is ready. Now you just need to rename some of the properties to match your needs.  
#### pom.xml
  ```bash
  <groupId>com.yoursurname</groupId>
  <artifactId>yourappname</artifactId>
   ``` 
Fell free to modify it but make sure that is matches with ( src->main->java->com.yoursurname.yourappname ).  
  ```bash
  <mainClass>com.yoursurname.yourappname.YourAppNameStarter</mainClass>
   ``` 
There are a few of these in pom file. Make sure they match the proper path to starter class when you change package names.
#### src/main/resources/META-INF
  ```bash
  Main-Class: com.yoursurname.yourappname.YourAppName
   ``` 
Just like before. Make sure it matches.
#### YourAppName and YourAppNameStarter
These are main classes that start your application. Obviously rename them and remember what I mentioned above

### Maven commands
Clean - removes all generated files ( very nice, use often )
   ```bash
   mvn clean
   ```
Package - creates jar file under target directory ( actually one normal jar and one fat jar -> fat means that it contains all  
the dependencies as well - it is the one we want ) and some other not important stuff
   ```bash
   mvn package
   ```
javafx:run - Runs our application. You should package it first to avoid possible errors caused by usage of generated sources
   ```bash
   mvn javafx:run
   ```
Of course you can link it all in a nice single command:
   ```bash
   mvn clean package javafx:run
   ```
If you created unit tests you can test your app like this:
   ```bash
   mvn test
   ```
For integration tests you can use: 
   ```bash
   mvn verify
   ```
You can create JavaDoc by excecuting:
   ```bash
   mvn javadoc:javadoc -Dshow=private
   ```
Maven will generate documentation that you can find under target/site/apidocs/index.html  

### 4. Few tips that can help you develop
 * Always create link in between fxml file and controller inside fxml for example :    fx:controller="com.yoursurname.yourappname.controllers.ExampleController"  
Also make sure that this reference is placed in the root element of your file - here it is AnchorPane  
( this works nice if you have multiple views and controllers ).
 * Use annotations ( like @FXML ) to link view elements to fields in controller. For example:  
 Label fx:id="amountOfClicks" text="0" has a matching field in controller under the same name with @FXML annotation.
 * It is worth mentioning that fxml fields are initialized ( with initialize method ) only after the constructor of  the class is called. It is important because controller classes are rebuild with each change of the view and adding controller reference to
another main controller may lead to some unexpected results.
 * Try using Singletons for classes that hold state of the game etc. If you have multiple controllers
 having always only one instance of a class can make your life much easier.
   
### That's it. If you found this project useful you can click the star next to repository name. It helps to boost this project in rankings. Thanks :)
