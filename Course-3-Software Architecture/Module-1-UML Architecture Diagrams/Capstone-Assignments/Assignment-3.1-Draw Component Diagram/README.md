# Capstone Assignment 3.1 – Draw a Component Diagram

## Guidelines for the assignment

Review these Lectures to aid you on your assignment:

- 3.1.3 - Component Diagrams

### Recap

For those of you who are new to this specialization, the code base you will be working with involves an Android application, a Web application, and a remote database. Capstone assignments in the Software Architecture course build off the updated version of the Android app from the earlier Design Patterns course with added functionality.

In the application’s current state:

- A user of the app is able to create and edit a profile with a unique username and any email. (New)
- A user of the app is able to log in and log out. (New)
- An owner is able to record the items they own and wish to share.
- A bidder is able to place bids on items they wish to borrow from other users, which changes the status of the item to “Bidded”. (New)
- An owner is able to accept a bid and lend the item to the bidder, which changes the status of the item to “Borrowed”. (New)
- An owner may change the status of an item they own from “Borrowed” to “Available” when the item is no longer being borrowed.
- An owner may view: all of their items; their “Available” items; their “Bidded” items; or, their “Borrowed” items.
- A borrower may view a list of items they are borrowing. (New)
- A user of the app is able to search a list of all “Available” and “Bidded” items by keywords. (New)
- An owner is able to view the profile of a borrower who is borrowing one of their items. (New)

### How to create your assignment

- In this assignment, assume that the mobile application (described above) stores its data in a remote database (rather than locally, as the current version of the app does).
- To access the remote database, the mobile app sends an HTTP request to the remote server that matches the remote server’s provided interface.
- The web server parses the HTTP request to determine its type, passing the data along to the application server.
- The data provided by the web server to the application server must match the application server’s provided interface.
- The application server parses the request and, depending on the request type, either fetches data from the database or modifies the database using the database’s provided interface.
- Additionally, there is a web app accessible through a web browser, which, like the mobile application, can access the remote database by making a request to the web server.

Based on this description make a UML component diagram that represents this system.
