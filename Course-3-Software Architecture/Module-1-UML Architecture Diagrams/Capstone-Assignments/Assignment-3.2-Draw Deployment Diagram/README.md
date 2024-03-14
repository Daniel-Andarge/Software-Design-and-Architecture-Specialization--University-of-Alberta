# Capstone Assignment 3.2 – Draw a Deployment Diagram

## Guidelines for the Assignment

### Review these Lectures to aid you on your assignment:

- 3.1.5 - Deployment Diagram

### How to Create Your Assignment

Assume that the application described in the previous assignment stores its data in a remote database and has both a mobile and web version.

To access this remote database, the mobile/web app sends an HTTP request to the remote web server. The web server parses the HTTP request to determine its type, then passes the data to the application server. The application server parses the request and, depending on the request, either fetches data from the database or modifies it.

You may assume that:

- The web server, application server, and database all reside on the same device, running in the same execution environment.
- There are 3 separate JAR files for the web server, application server, and database components, respectively.
- The web server component uses a config file to route requests to the application server.
- The application server component runs a JAR file to search and modify the database.
- The database component uses an XSD file to define its schema.
- An HTML file manifests the sharing web app.
- An APK file manifests the sharing mobile app.

Based on this description, create a specification-level deployment diagram that captures this system.
