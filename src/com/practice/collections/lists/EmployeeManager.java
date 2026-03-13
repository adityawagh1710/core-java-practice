package com.practice.collections.lists;

import java.util.*;

public class EmployeeManager {

    // ── Employee class ───────────────────────────────────────────────────────
    static class Employee {
        private int id;
        private String name;
        private double salary;
        private int age;
        private String gender;
        private String deptName;
        private String managerName;
        private String city;

        public Employee(int id, String name, double salary, int age, String gender,
                        String deptName, String managerName, String city) {
            this.id = id; this.name = name; this.salary = salary;
            this.age = age; this.gender = gender; this.deptName = deptName;
            this.managerName = managerName; this.city = city;
        }

        // Getters
        public int    getId()          { return id;          }
        public String getName()        { return name;        }
        public double getSalary()      { return salary;      }
        public int    getAge()         { return age;         }
        public String getGender()      { return gender;      }
        public String getDeptName()    { return deptName;    }
        public String getManagerName() { return managerName; }
        public String getCity()        { return city;        }

        // Setters (validated)
        public void setId(int id)                  { this.id = id; }
        public void setName(String name)           { this.name = name; }
        public void setSalary(double salary) {
            if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative!");
            this.salary = salary;
        }
        public void setAge(int age)                { this.age = age; }
        public void setGender(String gender)       { this.gender = gender; }
        public void setDeptName(String deptName)   { this.deptName = deptName; }
        public void setManagerName(String manager) { this.managerName = manager; }
        public void setCity(String city)           { this.city = city; }

        @Override
        public String toString() {
            return String.format(
                    "Employee{id=%d, name='%s', salary=%.2f, age=%d, gender='%s', dept='%s', manager='%s', city='%s'}",
                    getId(), getName(), getSalary(), getAge(),
                    getGender(), getDeptName(), getManagerName(), getCity()
            );
        }
    }

    // ════════════════════════════════════════════════════════════════════════
    public static void main(String[] args) {

        // ── 20 Employees ─────────────────────────────────────────────────────
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1,  "Alice Johnson",    95000, 32, "Female", "Engineering",  "Tom Harris",   "New York"));
        employees.add(new Employee(2,  "Bob Smith",         72000, 45, "Male",   "Marketing",    "Sara Lee",     "Chicago"));
        employees.add(new Employee(3,  "Carol White",       88000, 29, "Female", "Engineering",  "Tom Harris",   "San Francisco"));
        employees.add(new Employee(4,  "David Brown",       61000, 38, "Male",   "HR",           "Nancy Clark",  "New York"));
        employees.add(new Employee(5,  "Eva Martinez",     110000, 41, "Female", "Finance",      "James Wilson", "Chicago"));
        employees.add(new Employee(6,  "Frank Lee",         53000, 27, "Male",   "Support",      "Sara Lee",     "Houston"));
        employees.add(new Employee(7,  "Grace Kim",         79000, 35, "Female", "Marketing",    "Sara Lee",     "San Francisco"));
        employees.add(new Employee(8,  "Henry Adams",       67000, 50, "Male",   "HR",           "Nancy Clark",  "Houston"));
        employees.add(new Employee(9,  "Isla Thomas",      102000, 33, "Female", "Engineering",  "Tom Harris",   "New York"));
        employees.add(new Employee(10, "Jack Wilson",       48000, 24, "Male",   "Support",      "Sara Lee",     "Chicago"));
        employees.add(new Employee(11, "Karen Davis",       85000, 44, "Female", "Finance",      "James Wilson", "New York"));
        employees.add(new Employee(12, "Liam Moore",        74000, 31, "Male",   "Engineering",  "Tom Harris",   "San Francisco"));
        employees.add(new Employee(13, "Mia Taylor",        59000, 28, "Female", "Support",      "Sara Lee",     "Houston"));
        employees.add(new Employee(14, "Noah Anderson",     91000, 39, "Male",   "Finance",      "James Wilson", "Chicago"));
        employees.add(new Employee(15, "Olivia Jackson",    63000, 36, "Female", "HR",           "Nancy Clark",  "San Francisco"));
        employees.add(new Employee(16, "Paul Harris",      120000, 47, "Male",   "Engineering",  "Tom Harris",   "New York"));
        employees.add(new Employee(17, "Quinn Martin",      55000, 26, "Female", "Marketing",    "Sara Lee",     "Houston"));
        employees.add(new Employee(18, "Ryan Garcia",       82000, 43, "Male",   "Finance",      "James Wilson", "San Francisco"));
        employees.add(new Employee(19, "Sophia Robinson",   97000, 37, "Female", "Engineering",  "Tom Harris",   "Chicago"));
        employees.add(new Employee(20, "Tyler Walker",      44000, 23, "Male",   "Support",      "Sara Lee",     "New York"));

        System.out.println("======================================================");
        System.out.println("     EMPLOYEE MANAGEMENT SYSTEM  [ Lambda Edition ]   ");
        System.out.println("======================================================\n");

        // ── 1. Employee with HIGHEST salary ─────────────────────────────────
        System.out.println("1. Employee with HIGHEST Salary:");
        List<Employee> sortedDesc = new ArrayList<>(employees);
        Collections.sort(sortedDesc, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
        System.out.println("   " + sortedDesc.get(0));

        // ── 2. Employee with LOWEST salary ──────────────────────────────────
        System.out.println("\n2. Employee with LOWEST Salary:");
        List<Employee> sortedAsc = new ArrayList<>(employees);
        Collections.sort(sortedAsc, (a, b) -> Double.compare(a.getSalary(), b.getSalary()));
        System.out.println("   " + sortedAsc.get(0));

        // ── 3. Count of Female and Male employees ────────────────────────────
        System.out.println("\n3. Count of Female and Male Employees:");
        int[] genderCount = {0, 0}; // [0]=Male  [1]=Female
        employees.forEach(e -> {
            if      (e.getGender().equalsIgnoreCase("Male"))   genderCount[0]++;
            else if (e.getGender().equalsIgnoreCase("Female")) genderCount[1]++;
        });
        System.out.println("   Male   : " + genderCount[0]);
        System.out.println("   Female : " + genderCount[1]);

        // ── 4. All employees belonging to a specific dept ────────────────────
        String targetDept = "Engineering";
        System.out.println("\n4. All Employees in '" + targetDept + "' Department:");
        employees.forEach(e -> {
            if (e.getDeptName().equalsIgnoreCase(targetDept))
                System.out.println("   " + e);
        });

        // ── 5. Average salary of Male & Female employees ─────────────────────
        System.out.println("\n5. Average Salary — Male & Female:");
        double[] salaryTotals = {0, 0}; // [0]=Male  [1]=Female
        int[]    salaryCounts = {0, 0};
        employees.forEach(e -> {
            if (e.getGender().equalsIgnoreCase("Male")) {
                salaryTotals[0] += e.getSalary(); salaryCounts[0]++;
            } else if (e.getGender().equalsIgnoreCase("Female")) {
                salaryTotals[1] += e.getSalary(); salaryCounts[1]++;
            }
        });
        System.out.printf("   Male   Avg Salary : %.2f%n",
                salaryCounts[0] > 0 ? salaryTotals[0] / salaryCounts[0] : 0);
        System.out.printf("   Female Avg Salary : %.2f%n",
                salaryCounts[1] > 0 ? salaryTotals[1] / salaryCounts[1] : 0);

        // ── 6. Average salary of ALL employees ───────────────────────────────
        System.out.println("\n6. Average Salary of ALL Employees:");
        double[] totalSalary = {0};
        employees.forEach(e -> totalSalary[0] += e.getSalary());
        System.out.printf("   %.2f%n", totalSalary[0] / employees.size());

        // ── 7. Average salary for each department ────────────────────────────
        System.out.println("\n7. Average Salary per Department:");
        List<String> depts = new ArrayList<>();
        employees.forEach(e -> {
            if (!depts.contains(e.getDeptName())) depts.add(e.getDeptName());
        });
        Collections.sort(depts);
        depts.forEach(dept -> {
            double[] dTotal = {0};
            int[]    dCount = {0};
            employees.forEach(e -> {
                if (e.getDeptName().equalsIgnoreCase(dept)) {
                    dTotal[0] += e.getSalary();
                    dCount[0]++;
                }
            });
            System.out.printf("   %-15s : %.2f%n", dept, dTotal[0] / dCount[0]);
        });

        // ── 8. Employees belonging to a specific city ────────────────────────
        String targetCity = "New York";
        System.out.println("\n8. Employees in '" + targetCity + "':");
        employees.forEach(e -> {
            if (e.getCity().equalsIgnoreCase(targetCity))
                System.out.println("   " + e);
        });

        // ── 9. Count of employees for each city ──────────────────────────────
        System.out.println("\n9. Employee Count per City:");
        List<String> cities = new ArrayList<>();
        employees.forEach(e -> {
            if (!cities.contains(e.getCity())) cities.add(e.getCity());
        });
        Collections.sort(cities);
        cities.forEach(city -> {
            int[] count = {0};
            employees.forEach(e -> {
                if (e.getCity().equalsIgnoreCase(city)) count[0]++;
            });
            System.out.println("   " + city + " : " + count[0]);
        });

        // ── 10. Female employees for each city ───────────────────────────────
        System.out.println("\n10. Female Employees per City:");
        cities.forEach(city -> {
            List<Employee> femalesInCity = new ArrayList<>(employees);
            femalesInCity.removeIf(e ->
                    !e.getCity().equalsIgnoreCase(city) ||
                            !e.getGender().equalsIgnoreCase("Female"));
            if (!femalesInCity.isEmpty()) {
                System.out.println("   City: " + city);
                femalesInCity.forEach(e -> System.out.println("     -> " + e));
            }
        });

        // ── 11. Employees ABOVE average salary ───────────────────────────────
        System.out.println("\n11. Employees with Salary ABOVE Company Average (avg = "
                + String.format("%.2f", totalSalary[0] / employees.size()) + "):");
        double avgSalary = totalSalary[0] / employees.size();
        List<Employee> aboveAvg = new ArrayList<>(employees);
        aboveAvg.removeIf(e -> e.getSalary() <= avgSalary);
        Collections.sort(aboveAvg, (a, b) -> Double.compare(b.getSalary(), a.getSalary()));
        aboveAvg.forEach(e -> System.out.println("   " + e));

        // ── 12. Oldest and Youngest employee ─────────────────────────────────
        System.out.println("\n12. Oldest and Youngest Employee:");
        List<Employee> sortedByAge = new ArrayList<>(employees);
        Collections.sort(sortedByAge, (a, b) -> Integer.compare(b.getAge(), a.getAge()));
        System.out.println("   Oldest  -> " + sortedByAge.get(0));
        Collections.sort(sortedByAge, (a, b) -> Integer.compare(a.getAge(), b.getAge()));
        System.out.println("   Youngest-> " + sortedByAge.get(0));

        System.out.println("\n======================================================");
        System.out.println("                      END                             ");
        System.out.println("======================================================");
    }
}