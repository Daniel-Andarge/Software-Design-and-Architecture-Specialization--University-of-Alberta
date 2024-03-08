# Capstone Assignment 2.3 - Addressing Code Smells

Having successfully implemented the Command Pattern and MVC Pattern in our application, it's time to conduct a thorough evaluation of the code in Capstone Assignment 2.3. This assignment comprises two main parts, each focusing on identifying and rectifying specific code smells.

## Part 1: Code Smell Identification and Documentation

In the initial phase of this assignment, my task is to pinpoint two distinct code smells within the provided code base, excluding the Long Method. For each identified code smell:

- **Document the Code Smell:**
  Clearly specify the location of the code smell, including the relevant class or method.

- **Identify the Code Smell Type:**
  Specify which code smell from the Anti Patterns & Code Smells lecture is evident and provide reasoning for the identification.

- **Explain the Issue:**
  Articulate why the identified code smell is problematic and elucidate why it should be addressed.

- **Propose a Solution:**
  Suggest a viable solution to rectify the identified code smell.

Part 1 requires a comprehensive analysis, ensuring that if the same piece of code exhibits multiple code smells, each should be addressed individually with distinct code smell types and solutions. However, repetition of the same code smell in different sections will not be considered.

## Part 2: Fixing the Long Method Code Smell

In the second phase of this assignment, my focus will be on mitigating the Long Method code smell. The targeted solution involves the implementation of a `validateInput()` method in four distinct activities:

- AddItemActivity
- EditItemActivity
- AddContactActivity
- EditContactActivity

These activities currently contain "save" methods housing extensive code for validating user input. The proposed remedy is to extract the lines of code responsible for input validation and relocate them to a newly introduced `validateInput()` method. Consequently, this method can be invoked from within the existing save methods, promoting code modularity and readability.

Guidelines for both parts of the assignment encourage a succinct explanation, with Part 1 limited to one paragraph per code smell and a cumulative word count not exceeding 600 words. Additionally, the use of UML diagrams is welcomed to supplement explanations regarding code smells and their resolutions.

### Part 2 Hints and Submission Instructions

To effectively address the Long Method code smell in Part 2 of this assignment, follow these hints:

1. **Replace Validation Code in "Save" Method:**
   - Replace the existing multiple lines of input validation within the "save" method with the provided code snippet:
     ```java
     if (!validateInput()) {
         return;
     }
     ```
2. **Implement `validateInput()` Method:**
   - Create and implement the `validateInput()` method in each of the four activities with the given signature:
     ```java
     public boolean validateInput() {
         // Input validation goes here...
         // ...
     }
     ```
3. **Modify Variable Scope:**
   - Adjust the scope of relevant variables in each activity. For example, in `EditItemActivity`, modify the scope of variables like `title_str`, `maker_str`, `description_str`, `length_str`, `width_str`, `height_str`, and `contact`.

Remember, the primary objective is to enhance code modularity without altering the overall functionality of the application.

## Submission Instructions

**Part 1:**

- Upload a PDF document containing your comprehensive solution where prompted.

**Part 2:**

- Include the following files in a dedicated folder:
  - `AddItemActivity.java`
  - `EditItemActivity.java`
  - `AddContactActivity.java`
  - `EditContactActivity.java`
- Compress the folder into a ZIP file. Windows users can use tools like 7zip or WinRAR.
- Upload the ZIP folder where prompted.

Ensure adherence to these instructions to facilitate a smooth and organized submission process.
