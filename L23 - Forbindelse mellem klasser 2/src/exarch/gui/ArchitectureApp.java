package exarch.gui;

import exarch.controller.Controller;
import exarch.model.Company;
import exarch.model.Employee;
import javafx.application.Application;

public class ArchitectureApp {

    public static void main(String[] args) {
        initStorage();
        Application.launch(ArchitectureGui.class);
    }

    public static void initStorage() {
        Company ibm = Controller.createCompany("IBM", 37);
        Company amd = Controller.createCompany("AMD", 40);
        Company sled = Controller.createCompany("SLED", 45);

        Employee emp1 = Controller.createEmployee("Mads D", 500);
        Employee emp2 = Controller.createEmployee("Philip", 4800);
        Employee emp3  = Controller.createEmployee("Rasmus W", 450);
        Employee emp4 = Controller.createEmployee("Mikael", 1600);

        Controller.createCompany("Vector", 32);

        Controller.addEmployeeToCompany(ibm, emp1);
        Controller.addEmployeeToCompany(ibm, emp2);
        Controller.addEmployeeToCompany(ibm, emp3);
        Controller.addEmployeeToCompany(ibm, emp4);

        System.out.println(emp1);
        System.out.println(Controller.getCompanies());
        System.out.println(Controller.getEmployeeCount(ibm));
    }
}
