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



I.	Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

-Added an entry in applications.properties to allow for H2 dialect (ran into issues with the DB). Then added my two unit tests in DemoApplicationTests.java.

J.  Remove the class files for any unused validators in order to clean your code
	
-Removed DeletePartValidator.java and ValidDeletePart.java. Got rid of the ValidDeletePart.java annotation from Part.java

K.  Demonstrate professional communication in the content and presentation of your submission.

Bug Fixes

Changed Shop name for Part C Coyte Cline 6/12/2024 5:55 PM
-Changed the mainscreen.html to update to a new shop name

Changed validators to return false if its the number in terms of min and max Coyte Cline 6/12/2024 5:56 PM
-Changed how EnufPartsValidator.java worked it didnt solve the issue. I resolve it later. Changed <= to < and >= to >
in order to allow for that last part to be added

Added Readme in MD format instead of DocX Coyte Cline 6/12/2024 6:07 PM
-Added Readme

Deleted the unit tests from J in DemoApplicationtests.java. 
Fixed the lingering issue with adding a part to a product with respect to the minimum. 
Added an enhancement to OutsourcedPartForm.html to now display the error message from validation on parts. 
Added to PartTest.java two unit tests. 
Added Readme

