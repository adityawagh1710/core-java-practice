package com.practice.collections.lists;

import java.util.ArrayList;
import java.util.List;

import static com.practice.collections.lists.EmployeeOperations.*;

public class EmployeeApp {

    // Helper method to create 20 different employees
    private static List<EmployeeModel> createEmployees() {
        List<EmployeeModel> list = new ArrayList<>();

        list.add(new EmployeeModel(101, "Amit Sharma", 145000, 34, "Male", "IT", "Priya Menon", "Bangalore"));
        list.add(new EmployeeModel(102, "Priya Menon", 180000, 38, "Female", "IT", "Rahul Verma", "Bangalore"));
        list.add(new EmployeeModel(103, "Rahul Verma", 92000, 29, "Male", "HR", "Sunita Rao", "Mumbai"));
        list.add(new EmployeeModel(104, "Sunita Rao", 125000, 42, "Female", "HR", "Vikram Singh", "Mumbai"));
        list.add(new EmployeeModel(105, "Vikram Singh", 210000, 45, "Male", "Finance", "Neha Kapoor", "Delhi"));
        list.add(new EmployeeModel(106, "Neha Kapoor", 165000, 37, "Female", "Finance", "Amit Sharma", "Delhi"));
        list.add(new EmployeeModel(107, "Rohan Patel", 78000, 26, "Male", "Sales", "Kavita Desai", "Pune"));
        list.add(new EmployeeModel(108, "Kavita Desai", 98000, 31, "Female", "Sales", "Sanjay Gupta", "Pune"));
        list.add(new EmployeeModel(109, "Sanjay Gupta", 135000, 39, "Male", "Marketing", "Anjali Nair", "Hyderabad"));
        list.add(new EmployeeModel(110, "Anjali Nair", 112000, 33, "Female", "Marketing", "Rohan Patel", "Hyderabad"));
        list.add(new EmployeeModel(111, "Arjun Reddy", 88000, 28, "Male", "IT", "Priya Menon", "Bangalore"));
        list.add(new EmployeeModel(112, "Meera Iyer", 105000, 30, "Female", "HR", "Sunita Rao", "Chennai"));
        list.add(new EmployeeModel(113, "Karan Malhotra", 148000, 36, "Male", "Finance", "Neha Kapoor", "Delhi"));
        list.add(new EmployeeModel(114, "Sneha Joshi", 89000, 27, "Female", "Sales", "Kavita Desai", "Pune"));
        list.add(new EmployeeModel(115, "Deepak Chauhan", 122000, 41, "Male", "Marketing", "Anjali Nair", "Hyderabad"));
        list.add(new EmployeeModel(116, "Pooja Banerjee", 95000, 29, "Female", "IT", "Priya Menon", "Bangalore"));
        list.add(new EmployeeModel(117, "Nikhil Thakur", 168000, 40, "Male", "Finance", "Vikram Singh", "Delhi"));
        list.add(new EmployeeModel(118, "Shreya Pillai", 132000, 35, "Female", "HR", "Sunita Rao", "Mumbai"));
        list.add(new EmployeeModel(119, "Yashwant Kumar", 76000, 25, "Male", "Sales", "Sanjay Gupta", "Pune"));
        list.add(new EmployeeModel(120, "Divya Menon", 118000, 32, "Female", "Marketing", "Anjali Nair", "Hyderabad"));

        return list;
    }

    public static void main(String[] args) {

        List<EmployeeModel> employeeModels = createEmployees();

        System.out.println("=== EMPLOYEE OPERATIONS ===\n");

        // 1. Employee with the highest salary
        findAndPrintHighestSalaryEmployee(employeeModels);

        // 2. Employee with the lowest salary
        findAndPrintLowestSalaryEmployee(employeeModels);

        // 3. Count of male and female employees
        printGenderCount(employeeModels);

        // 4. All employees in a specific department (example: "IT")
        printEmployeesByDepartment(employeeModels);

        // 5. Average salary of male & female employees
        printAverageSalaryByGender(employeeModels);

        // 6. Average salary of all employees
        printOverallAverageSalary(employeeModels);

        // 7. Average salary for each department
        printAverageSalaryByDepartment(employeeModels);

        // 8. All employees in a specific city (example: "Mumbai")
        printEmployeesByCity(employeeModels, "Mumbai");

        // 9. Count of employees city-wise
        printEmployeeCountByCity(employeeModels);

        // 10. Female employees information city-wise
        printFemaleEmployeesByCity(employeeModels);
    }
}
