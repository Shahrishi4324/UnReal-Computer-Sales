package Assignments.unrealComputerSales;
class SalesAssociate extends Employee{
    // The rate of pay for the sales associate
    private double rateOfPay;
    /**
     * Constructor for the sales associate
     * @param firstName Takes in a first name
     * @param lastName Takes in a last name
     * @param employeeID Takes in an employee ID
     */
    SalesAssociate(String firstName, String lastName, String employeeID, double rateOfPay){
        super(firstName, lastName, employeeID);
        this.rateOfPay = rateOfPay;
    }
    @Override
    /**
     * Gives the sales associate their pay based on the number of hours they worked
     * @param numHours the number of hours the sales associate worked
     * @return the pay of the sales associate
     */
    public double pay(int numHours){
        return rateOfPay * numHours;
    }

    @Override
    /**
     * Gives the name, employee ID, and job title of the sales associate
     * @return the name, employee ID, and job title of the sales associate
     */
    public String toString(){
        return getName() + "\nEmployee ID: " + getEmployeeID() + "\nJob Title: Sales Associate";
    }
    /**
     * Gets the rate of pay for the sales associate (Maybe if they gets a raise)
     * @param rateOfPay the rate of pay for the sales associate
     */
    public void setRateOfPay(double rateOfPay){
        if (rateOfPay >= 16.5 && rateOfPay <= 19.75){
            this.rateOfPay = rateOfPay;
        } else{
            System.out.println("Invalid rate of pay, must be between $16.50 and $19.75");
        }
    }
    /**
     * Gets the rate of pay for the sales associate
     * @return the rate of pay for the sales associate
     */
    public double getRateOfPay(){
        return rateOfPay;
    }
}

