# Backend Travel com.ash.travelbooking.model.travelbooking.Booking Service

This is the backend service for the Door-to-Door Travel com.ash.travelbooking.model.travelbooking.Booking application. It is built using Spring Boot and provides RESTful APIs for managing travel bookings, including flight and taxi bookings.

## Project Structure

- **src/main/java/com/example/travelbooking**
  - **controller**: Contains the `BookingController` class for handling HTTP requests.
  - **model**: Contains the `com.ash.travelbooking.model.travelbooking.Booking` class representing the booking entity.
  - **repository**: Contains the `BookingRepository` interface for CRUD operations.
  - **service**: Contains the `BookingService` class for business logic.

- **src/main/resources**
  - `application.properties`: Configuration properties for the Spring Boot application.
  - `data.sql`: SQL script to initialize the database with sample data.

- **src/test/java/com/example/travelbooking**
  - `com.ash.travelbooking.TravelBookingApplicationTests.java`: Test cases for the application.

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd door-to-door-travel-booking/backend
   ```

2. **Build the project**:
   ```
   mvn clean install
   ```

3. **Run the application**:
   ```
   mvn spring-boot:run
   ```

4. **Access the API**:
   The API will be available at `http://localhost:8080/api/bookings`.

## API Usage

- **Create a com.ash.travelbooking.model.travelbooking.Booking**: `POST /api/bookings`
- **Get a com.ash.travelbooking.model.travelbooking.Booking**: `GET /api/bookings/{id}`
- **Get All Bookings**: `GET /api/bookings`

## Dependencies

This project uses the following dependencies:
- Spring Boot Starter Web
- Spring Data JPA
- H2 Database (for in-memory database)

## License

This project is licensed under the MIT License. See the LICENSE file for more details.