package com.springboot.cartProject.dbConnection;

import java.sql.*;

public class Dbconnection {



        private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mahi"; // URL to database
        private static final String USER = "root"; // username of the database
        private static final String PASSWORD = "mahesh6040@M"; // Enter your Database Password

        public static void main(String[] args) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver"); // 2. Load and register the Driver
                Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD); // 3. Establish the Connection

                //Create a Statement
                Statement statement = conn.createStatement();

                //Execute SQL Queries
                ResultSet resultSet = statement.executeQuery("SELECT * FROM mahi.departments;");
                while (resultSet.next()) { //Loop through the data in the resultset
                    int DepartmentID = resultSet.getInt("DepartmentID");
                    String DepartmentName = resultSet.getString("DepartmentName");
                    String Location = resultSet.getString("Location");
                     int ManagerID = resultSet.getInt("ManagerID");

                    System.out.println(DepartmentID + " : " + DepartmentName + ": " + Location + " : " +ManagerID);// Print out the data
                }
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
}
