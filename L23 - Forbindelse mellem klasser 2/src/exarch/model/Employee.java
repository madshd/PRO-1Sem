package exarch.model;

public class Employee {
    private String name;
    private int wage; // hourly wage
    private Company company;

    /** Pre: name not empty, wage >= 0. */
    public Employee(String name, int wage) {
        this.name = name;
        this.wage = wage;
//        this.company = company;
    }

    public String getName() {
        return name;
    }

    /** Pre: name not empty. */
    public void setName(String name) {
        this.name = name;
    }

    public int getWage() {
        return wage;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    /** Pre: wage >= 0. */
    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return name + " (kr " + wage + ") \n";
    }
}
