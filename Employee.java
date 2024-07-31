package Assignments.unrealComputerSales;

abstract class Employee{
    // The name and employee ID of the employee
    private String firstName, lastName, employeeID;

    /**
     * Constructor for the employee
     * @param firstName Takes in a first name
     * @param lastName Takes in a last name
     * @param employeeID Takes in an employee ID
     */
    Employee(String firstName, String lastName, String employeeID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
    }
    /**
     * Gives the name and employee ID of the employee
     * @return the name and employee ID of the employee
     */
    public String toString(){
        return "Name: " + getName() + "\nEmployee ID: " + getEmployeeID(); 
    }
    /**
     * Depending on the type of employee, gives them their pay based off their unit of measure for the salary
     * @param numUnits
     */
    public abstract double pay(int numUnits);
    /**
     * Gets the name of the employee
     * @return the name of the employee
     */
    public String getName(){
        return firstName + " " + lastName;
    }
    /**
     * Gets the employee ID
     * @return the employee ID
     */
    public String getEmployeeID(){
        return employeeID;
    }
    /**
     * Sets the employee ID
     * @param employeeID the employee ID
     */
    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }
    /**
     * Sets the first name of the employee
     * @param firstName the first name of the employee
     */
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    /**
     * Sets the last name of the employee
     * @param lastName the last name of the employee
     */
    public void setLastName(String lastName){
        this.lastName = lastName; 
    }
}
