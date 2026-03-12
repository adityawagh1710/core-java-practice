package com.practice.collections.lists;

public class EmployeeModel {
    public static final String GENDER_MALE = "Male";
    public static final String GENDER_FEMALE = "Female";
    public static final String DEPT_IT = "IT";
    
    int id;
    String name;
    double salary;
    int age;
    String gender;
    String deptName;
    String managerName;
    String city;

    public EmployeeModel(
            int id,
            String name,
            double salary,
            int age,
            String gender,
            String deptName,
            String managerName,
            String city
    ) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        this.deptName = deptName;
        this.managerName = managerName;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("ID=%d, Name=%s, Salary=%.2f, Age=%d, Gender=%s, Dept=%s, Manager=%s, City=%s",
                id, name, salary, age, gender, deptName, managerName, city);
    }
}
