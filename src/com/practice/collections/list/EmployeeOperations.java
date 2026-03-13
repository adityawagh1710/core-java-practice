package com.practice.collections.list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeOperations {

    // 1. Highest salary employee
    static void findAndPrintHighestSalaryEmployee(List<EmployeeModel> employeeModels) {
        EmployeeModel max = null;

        for (EmployeeModel e : employeeModels) {
            if (max == null || e.getSalary() > max.getSalary()) {
                max = e;
            }
        }

        System.out.println("1. Employee with highest salary:");
        System.out.println(":-> " + max);
        System.out.println();
    }

    // 2. Lowest salary employee
    static void findAndPrintLowestSalaryEmployee(List<EmployeeModel> employeeModels) {
        EmployeeModel min = null;

        for (EmployeeModel e : employeeModels) {
            if (min == null || e.getSalary() < min.getSalary()) {
                min = e;
            }
        }
        System.out.println("2. Employee with lowest salary:");
        System.out.println(":-> " + min);
        System.out.println();
    }

    // 3. Gender count
    static void printGenderCount(List<EmployeeModel> employeeModels) {
        int male = 0, female = 0;

        for (EmployeeModel e : employeeModels) {
            if (EmployeeModel.GENDER_MALE.equalsIgnoreCase(e.getGender())) male++;
            else if (EmployeeModel.GENDER_FEMALE.equalsIgnoreCase(e.getGender())) female++;
        }

        System.out.println("3. Gender count:");
        System.out.println("Male   : " + male);
        System.out.println("Female : " + female);
        System.out.println();
    }

    // 4. Employees by department
    static void printEmployeesByItDepartment(List<EmployeeModel> employeeModels) {
        System.out.println("4. Employees in department: " + EmployeeModel.DEPT_IT);

        for (EmployeeModel e : employeeModels) {
            if (EmployeeModel.DEPT_IT.equalsIgnoreCase(e.getDeptName())) {
                System.out.println("IT Dept : " + e);
            }
        }

        System.out.println();
    }

    // 5. Average salary by gender
    static void printAverageSalaryByGender(List<EmployeeModel> employeeModels) {
        double maleSum = 0, femaleSum = 0;
        int maleCount = 0, femaleCount = 0;

        for (EmployeeModel e : employeeModels) {
            if (EmployeeModel.GENDER_MALE.equalsIgnoreCase(e.getGender())) {
                maleSum += e.getSalary();
                maleCount++;
            } else if (EmployeeModel.GENDER_FEMALE.equalsIgnoreCase(e.getGender())) {
                femaleSum += e.getSalary();
                femaleCount++;
            }
        }

        System.out.println("5. Average salary by gender:");
        System.out.printf("Male   : %.2f%n", maleCount > 0 ? maleSum / maleCount : 0);
        System.out.printf("Female : %.2f%n", femaleCount > 0 ? femaleSum / femaleCount : 0);
        System.out.println();
    }

    // 6. Overall average salary
    static void printOverallAverageSalary(List<EmployeeModel> employeeModels) {
        double total = 0;

        for (EmployeeModel e : employeeModels) {
            total += e.getSalary();
        }

        System.out.printf("6. Overall average salary: %.2f%n%n", total / employeeModels.size());
    }

    // 7. Average salary per department
    static void printAverageSalaryByDepartment(List<EmployeeModel> employeeModels) {
        Map<String, Double> sumMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();

        for (EmployeeModel e : employeeModels) {
            String dept = e.getDeptName();
            sumMap.put(dept, sumMap.getOrDefault(dept, 0.0) + e.getSalary());
            countMap.put(dept, countMap.getOrDefault(dept, 0) + 1);
        }

        System.out.println("7. Average salary by department:");

        for (String dept : sumMap.keySet()) {
            double avg = sumMap.get(dept) / countMap.get(dept);

            // Old-school sprintf style
            String result = String.format("%s-10s : %.2f%n", dept, avg);

            System.out.printf(result);
        }

        System.out.println();
    }

    // 8. Employees by city
    static void printEmployeesByCity(List<EmployeeModel> employeeModels, String city) {
        System.out.println("8. Employees in city: " + city);

        for (EmployeeModel e : employeeModels) {
            if (city.equalsIgnoreCase(e.city)) System.out.println(":-> " + e);
        }
        System.out.println();
    }

    // 9. Count employees city-wise
    static void printEmployeeCountByCity(List<EmployeeModel> employeeModels) {
        Map<String, Integer> cityCount = new HashMap<>();

        for (EmployeeModel e : employeeModels) {
            String city = e.getCity();
            cityCount.put(city, cityCount.getOrDefault(city, 0) + 1);
        }

        System.out.println("9. Employee count by city:");
        for (Map.Entry<String, Integer> entry : cityCount.entrySet()) {
            System.out.println("   " + entry.getKey() + " :-> " + entry.getValue());
        }
        System.out.println();
    }

    // 10. Female employees city-wise
    static void printFemaleEmployeesByCity(List<EmployeeModel> employeeModels) {
        Map<String, List<EmployeeModel>> femalesByCity = new HashMap<>();

        for (EmployeeModel e : employeeModels) {
            if (EmployeeModel.GENDER_FEMALE.equalsIgnoreCase(e.getGender())) {
                String city = e.getCity();
                femalesByCity.computeIfAbsent(city, k -> new ArrayList<>()).add(e);
            }
        }

        System.out.println("10. Female employees by city:");
        for (Map.Entry<String, List<EmployeeModel>> entry : femalesByCity.entrySet()) {

            System.out.println("City: " + entry.getKey());

            for (EmployeeModel fem : entry.getValue()) {
                System.out.println(":-> " + fem);
            }
        }

        System.out.println();
    }

    // 11. Youngest employee
    static void printYoungestEmployee(List<EmployeeModel> amps) {
        EmployeeModel youngest = amps.getFirst();

        for (EmployeeModel e : amps) {
            if (e.getAge() < youngest.getAge()) {
                youngest = e;
            }
        }

        System.out.println("11. Youngest employee:");
        System.out.println("   " + youngest + "\n");
    }

    // 12. Manager with most direct reports
    static void printManagerWithMostEmployees(List<EmployeeModel> emps) {
        Map<String, Integer> managerCount = new HashMap<>();

        for (EmployeeModel e : emps) {
            String mgr = e.getManagerName();
            if (mgr != null && !mgr.trim().isEmpty()) {
                managerCount.put(mgr, managerCount.getOrDefault(mgr, 0) + 1);
            }
        }

        String topManager = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : managerCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                topManager = entry.getKey();
            }
        }

        System.out.println("12. Manager with most employees under them:");

        if (topManager != null) {
            System.out.println("   " + topManager + " → " + maxCount + " direct reports");
        } else {
            System.out.println("No managers found");
        }

        System.out.println();
    }
}
