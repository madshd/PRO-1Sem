package exarch.controller;

import exarch.model.Company;
import exarch.model.Employee;
import exarch.storage.Storage;

import java.util.ArrayList;

public abstract class Controller {
    /**
     * Create a new Company.
     * Pre: name not empty, hours >= 0.
     */
    public static Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        Storage.storeCompany(company);
        return company;
    }
    /**
     * Delete the company.
     * Pre: The company has no employees.
     */
    public static void deleteCompany(Company company) {
        Storage.deleteCompany(company);
    }
    /**
     * Update the company.
     * Pre: name not empty, hours >= 0.
     */
    public static void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }
    public static ArrayList<Company> getCompanies() {
        return Storage.getCompanies();
    }
    /**
     * Create a new Employee.
     * Pre: name not empty, hours >= 0.
     */
    public static Employee createEmployee(String name, int wage) {
        Employee employee = new Employee(name, wage);
        Storage.storeEmployee(employee);
        return employee;
    }

    public static Employee createEmployee(String name, int wage, Company company) {
        Employee employee = new Employee(name, wage);
        if (company != null) {
            addEmployeeToCompany(company, employee);
        }
        Storage.storeEmployee(employee);
        return employee;
    }

    /**
     * Delete the Employee.
     */
    public static void deleteEmployee(Employee employee) {
        Storage.deleteEmployee(employee);
    }

    /**
     * Update the employee.
     * Pre: name not empty, hours >= 0.
     */
    public static void updateEmployee(Employee employee, String name, int wage, int employmentYear) {
        employee.setName(name);
        employee.setWage(wage);
        employee.setEmploymentYear(employmentYear);
    }

    public static ArrayList<Employee> getEmployees() {
        return Storage.getEmployees();
    }
    /**
     * Add the employee to the company.
     * If the employee is connected to a company, this connection is removed first.
     */
    public static void addEmployeeToCompany(Company company, Employee employee) {
        Company oldCompany = employee.getCompany();
        if (oldCompany != null) {
            oldCompany.removeEmployee(employee);
        }
        company.addEmployee(employee);
        employee.setCompany(company);
    }
    public static int getEmployeeCount(Company company) {
       return company.employeesCount();
    }
}
