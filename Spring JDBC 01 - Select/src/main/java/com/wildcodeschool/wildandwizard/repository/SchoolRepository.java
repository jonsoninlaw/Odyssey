package com.wildcodeschool.wildandwizard.repository;

import com.wildcodeschool.wildandwizard.entity.School;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SchoolRepository {

    private final static String DB_URL = "jdbc:mysql://localhost:3306/spring_jdbc_quest?serverTimezone=GMT";
    private final static String DB_USER = "h4rryp0tt3r";
    private final static String DB_PASSWORD = "Horcrux4life!";

    public List<School> findAll() {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM school;"
            );
            List<School> schools = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                Long capacity = resultSet.getLong("capacity");
                String country = resultSet.getString("country");
                schools.add(new School(id, name, capacity, country));
            }
            return schools;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public School findById(Long id) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM school WHERE id = ?;"
            );
            statement.setLong(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String name = resultSet.getString("name");
                Long capacity = resultSet.getLong("capacity");
                String country = resultSet.getString("country");
                return new School(id, name, capacity, country);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<School> findByCountry(String country) {

        try {
            Connection connection = DriverManager.getConnection(
                    DB_URL, DB_USER, DB_PASSWORD
            );
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM school WHERE country = ?;"
            );
            statement.setString(1, country);
            List<School> schools = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                Long capacity = resultSet.getLong("capacity");
                schools.add(new School(id, name, capacity, country));
            }
            return schools;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
