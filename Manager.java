package Assignments.unrealComputerSales;

class Manager extends Employee{
    // The salary of the manager
    private int salary;
    
    /**
     * Constructor for the manager
     * @param firstName Takes in a first name
     * @param lastName Takes in a last name
     * @param employeeID Takes in an employee ID
     * @param salary Takes in a salary
     */
    Manager(String firstName, String lastName, String employeeID, int salary){
        super(firstName, lastName, employeeID);
        this.salary = salary;
    }

    /**
     * Gives the manager their weekly salary
     * @return the weekly salary of the manager
     */
    public double weeklySalary(){
        return salary / 52;
    }

    @Override
    /**
     * Gives the manager their pay based on the number of weeks they worked
     * @param weeksWorked the number of weeks the manager worked
     * @return that the manager has been paid
     */
    public double pay(int weeksWorked){
        return weeklySalary() * weeksWorked;
    }
    
    @Override
    /**
     * Gives the name, employee ID, and job title of the manager
     * @return the name, employee ID, and job title of the manager
     */
    public String toString(){
        return getName() + "\nEmployee ID: " + getEmployeeID() + "\nJob Title: Manager";
    }

    /**
     * Gets the salary of the manager (Maybe if they get a raise)
     * @param salary the salary of the manager
     */
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Gets the salary of the manager
     * @return the salary of the manager
     */
    public int getSalary(){
        return salary;
    }
}
