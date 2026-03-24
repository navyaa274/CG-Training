package com.example.demojdbc.jdbcdemo;

import java.sql.Connection;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

        Connection conn = DBConnection.getConnection();
        System.out.println(conn);
        System.out.println("Database connected successfully\n");

        DBConnection.createTable("person");

        Person p1 = new Person("Navya", "Aggarwal", 21);
        Person p2 = new Person("John", "Doe", 25);

        DBConnection.insertPerson(p1);
        DBConnection.insertPerson(p2);

        System.out.println("\nAll Persons:");
        List<Person> persons = DBConnection.getAllPerson();
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("\nPerson with ID = 1:");
        Person person = DBConnection.getPersonbyId(1);
        System.out.println(person);

        System.out.println("\nUpdating Person with ID = 1...");
        Person updatedPerson = new Person("Updated", "Name", 30);
        updatedPerson.setId(1);

        DBConnection.updatePerson(updatedPerson);

        System.out.println("After Update:");
        System.out.println(DBConnection.getPersonbyId(1));

        System.out.println("\nDeleting Person with ID = 2...");
        DBConnection.deletePersonBYId(2);

        System.out.println("All Persons after deletion:");
        List<Person> updatedList = DBConnection.getAllPerson();
        for (Person p : updatedList) {
            System.out.println(p);
        }

        DBConnection.closeConnection();
    }
}