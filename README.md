# AmazOff-Project

The task involves creating a simple Spring Boot application named "Amazoff" for managing delivery orders and partners. The application follows the MVC architecture and uses in-memory data storage (HashMaps) to simulate a database. Here's a summary:

1. Model Classes:

Create two model classes, Order and DeliveryPartner, with necessary fields, constructors, and getters/setters. These classes represent orders and delivery partners.
Repository Interface:

Create an interface named OrderRepository with methods to perform CRUD operations, using HashMaps to store orders and delivery partners.
2. Service Class:

Implement a service class named OrderService to handle business logic. Include methods for adding orders, adding delivery partners, assigning orders to partners, and retrieving various information.
3. Controller Class:

Implement a controller class named OrderController with methods for adding orders, adding delivery partners, assigning orders to partners, and retrieving information about orders and partners. Use ResponseEntity to wrap responses.
4. API Endpoints:

Implement API endpoints for adding orders, adding delivery partners, assigning orders to partners, retrieving orders by ID, retrieving partners by ID, and other specified functionalities.
Testing:

Test each API endpoint using Postman to ensure they work correctly.
5. Naming Conventions:

Follow the specified naming conventions for classes (e.g., OrderController.java, OrderService.java, OrderRepository.java, Order.java, DeliveryPartner.java).
6. Time Handling:

Pay attention to handling time formats, especially when passing or returning time information.
7. Deletion Logic:

Implement logic to unassign orders when deleting a partner and vice versa.

8. Documentation:
The project aims to demonstrate a functional Spring Boot application for managing delivery orders and partners with specified CRUD operations and API endpoints.
