# Door-to-Door Travel com.ash.travelbooking.model.travelbooking.Booking

This project is a comprehensive application for booking international travel from door to door, including taxi and flight bookings. It consists of a backend service built with Spring Boot and a frontend application developed using Angular.

## Project Structure

The project is organized into two main directories: `backend` and `frontend`.

### Backend

The backend service is responsible for handling all the business logic and data management related to travel bookings. It is structured as follows:

- **src/main/java/com/example/travelbooking**
  - **controller**: Contains the `BookingController` class for handling HTTP requests.
  - **model**: Defines the `com.ash.travelbooking.model.travelbooking.Booking` class representing a travel booking entity.
  - **repository**: Contains the `BookingRepository` interface for CRUD operations.
  - **service**: Implements the `BookingService` class for business logic.

- **src/main/resources**
  - **application.properties**: Configuration properties for the Spring Boot application.
  - **data.sql**: Initializes the database with sample data.

- **src/test/java/com/example/travelbooking**: Contains test cases for the application.

- **pom.xml**: Maven configuration file for managing dependencies.

### Frontend

The frontend application provides the user interface for booking travel. It is structured as follows:

- **src/app**
  - **components/booking**: Contains the booking component files (HTML, TypeScript, CSS).
  - **services**: Defines the `BookingService` for making HTTP requests to the backend.

- **src/assets**: Directory for static assets.

- **src/environments**: Contains environment-specific settings.

- **src/index.html**: Main HTML file for the Angular application.

- **src/main.ts**: Entry point for bootstrapping the Angular application.

- **angular.json**: Configuration settings for the Angular CLI.

- **package.json**: npm configuration file for managing frontend dependencies.

- **tsconfig.json**: TypeScript configuration file.

## Setup Instructions

### Backend

1. Navigate to the `backend` directory.
2. Run `mvn clean install` to build the project.
3. Configure your database settings in `application.properties`.
4. Run the application using `mvn spring-boot:run`.

### Frontend

1. Navigate to the `frontend` directory.
2. Run `npm install` to install dependencies.
3. Run `ng serve` to start the Angular application.

## Usage

- Access the frontend application at `http://localhost:4200`.
- Use the booking interface to create and manage travel bookings.

## Contributing

Contributions are welcome! Please submit a pull request or open an issue for any enhancements or bug fixes.