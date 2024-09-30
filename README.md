Cinema Management System Project

Overview

This project is a Java-based implementation of a Cinema Management System that demonstrates the use of five creational design patterns: Singleton, Factory Method, Abstract Factory, Builder, and Prototype. The system allows for the management of various operations such as movies, screens, ticketing, concessions, and customer interactions.

-----

Features

Singleton Pattern: System Configuration

Factory Method Pattern: Movie Creation

Abstract Factory Pattern: User Interface Generation

Builder Pattern: Ticket Booking

Prototype Pattern: Movie Schedule

-----

Project Structure

config: Configuration classes

factories: Factory classes for movie creation and UI generation

models: Model classes for movies, tickets, and schedules

builders: Builder classes for ticket booking

ui: User interface classes for buttons and text fields

'CinemaManagementApp': Main application class

-----

Usage

Clone the repository or download the project files.

Import the project into your Java IDE.

Run the 'CinemaManagementApp' class to start the application.

Follow the prompts to interact with the system.

-----

Design Patterns

Singleton Pattern: Ensures that only one instance of the CinemaConfig class exists throughout the application.

Factory Method Pattern: Allows for the creation of different types of movies (e.g., RegularMovie, 3DMovie, IMAXMovie) based on user input.

Abstract Factory Pattern: Provides a way to generate different themes (e.g., DarkTheme, LightTheme) for the cinema's booking system.

Builder Pattern: Enables the step-by-step configuration of complex ticket bookings.

Prototype Pattern: Allows for the easy cloning and modification of movie schedules.
