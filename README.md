<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!


OneStop Computer Part Shop

A.	Create your subgroup and project by logging into GitLab using the web link provided and using the “GitLab How-To” web link, and do the following:

B.	Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.

C.	Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts

-Added OneStop shop name and changed title mainscreen.html

D.	Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen

-Added Controller entry in MainScreenControllerr.java. Added About.html to view templates. Didn’t change the title in Letter C went into the mainscreen.html. 

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

-Added Model information to BoostrapData.java. Set up attributes in the POJO under domain (part.java) for min and max.

F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

-Added Controller for buyNow in MainScreenController.java. Added 2 new views failure.html and success.html. Added the Buy Now button in mainscreen.html.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

-Added ValidMinandMax.java and MinandMaxParts.java for a custom annotation. Added the custom annotation to the Part.java. Had some spacing errors in BoostrapData.java. Added fields for Max and Min in InhousePart.java and OutsourcedPart.java. Changed some lines in EnufParrtsValidator.java to add a rule that a products part inventory must be between max and min.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following: 
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

-Validated by things put in place in G

I.	Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

Added an entry in applications.properties to allow for H2 dialect (ran into issues with the DB). Then added my two unit tests in DemoApplicationTests.java.

J.  Remove the class files for any unused validators in order to clean your code

-Removed DeletePartValidator.java and ValidDeletePart.java. Got rid of the ValidDeletePart.java annotation from Part.java

K.  Demonstrate professional communication in the content and presentation of your submission.
