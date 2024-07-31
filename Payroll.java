package Assignments.unrealComputerSales;

import java.util.ArrayList;
import java.util.Scanner;

public class Payroll {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        // Creating the general employees
        Manager diego = new Manager("Diego", "Martin", "9879", 55000);
        SalesAssociate kylie = new SalesAssociate("Kylie", "Walter", "1234", 18.50);
        SalesAssociate michael = new SalesAssociate("Michael", "Rose", "5678", 16.75);
        
        // Creating the array lists for the managers and sales associates
        ArrayList <Manager> managers = new ArrayList <Manager>();  
        ArrayList <SalesAssociate> salesAssociates = new ArrayList <SalesAssociate>();

        // Add the employees to the array lists
        managers.add(diego);
        salesAssociates.add(kylie);
        salesAssociates.add(michael);

        boolean play = true;
        int choice; 
        // The main loop for the program
        while(play){
            // The menu for the program
            System.out.println("\nWelcome to the Unreal Computer Sales Payroll System: ");
            System.out.println("-----------------------------------------------------");
            System.out.println("1. Add a new employee: ");
            System.out.println("2. Pay an employee: ");
            System.out.println("3. Pay all employees: ");
            System.out.println("4. Display an employee's information: ");
            System.out.println("5. Quit: ");
            System.out.println("-----------------------------------------------------");
            // The input for the menu
            while(true){
                System.out.print("Enter your choice: ");
                try{
                    choice = sc.nextInt();
                    break;
                } catch(Exception e){
                    System.out.println("Invalid input, please try again");
                    sc.nextLine();
                }
            }
            // The switch statement for the menu
            switch(choice){
                case 1:
                    // The menu for adding a new employee
                    System.out.println("What type of employee would you like to add?");
                    System.out.println("1. Manager");
                    System.out.println("2. Sales Associate");
                    System.out.println("3. Quit"); 
                    // The input for the menu
                    while(true){
                        System.out.print("Enter your choice: ");
                        try{
                            choice = sc.nextInt();
                            break;
                        } catch(Exception e){
                            System.out.println("Invalid input, please try again");
                            sc.nextLine();
                        }
                    }
                    // The switch statement for the menu
                    switch(choice){
                        case 1:
                            // The input for the manager
                            System.out.print("Enter the first name of the manager: ");
                            String firstName = sc.next();
                            System.out.print("Enter the last name of the manager: ");
                            String lastName = sc.next();
                            System.out.print("Enter the employee ID of the manager: ");
                            String employeeID = sc.next();
                            System.out.print("Enter the salary of the manager: ");
                            int salary = sc.nextInt();
                            Manager newManager = new Manager(firstName, lastName, employeeID, salary);
                            // Add the manager to the array list
                            managers.add(newManager);
                            System.out.println("The manager has been added");
                            System.out.println(newManager);
                            break;
                        case 2:
                            // The input for the sales associate
                            System.out.print("Enter the first name of the sales associate: ");
                            firstName = sc.next();
                            System.out.print("Enter the last name of the sales associate: ");
                            lastName = sc.next();
                            System.out.print("Enter the employee ID of the sales associate: ");
                            employeeID = sc.next();
                            System.out.print("Enter the rate of pay of the sales associate: ");
                            double rateOfPay = sc.nextDouble();
                            // Make sure that the rate of pay is within the boundaries
                            if (rateOfPay < 16.5){
                                rateOfPay = 16.5;
                            }else if (rateOfPay > 19.75){
                                rateOfPay = 19.75;
                            }
                            SalesAssociate newSalesAssociate = new SalesAssociate(firstName, lastName, employeeID, rateOfPay);
                            // Add the sales associate to the array list
                            salesAssociates.add(newSalesAssociate);
                            System.out.println("The sales associate has been added");
                            System.out.println(newSalesAssociate);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid input, please try again");
                            break;
                    }
                    break;
                case 2:
                    // The menu for paying an employee
                    System.out.println("Are you paying a manager or a sales associate? ");
                    System.out.println("1. Manager");
                    System.out.println("2. Sales Associate");
                    System.out.println("3. Quit");
                    // The input for the menu
                    while(true){
                        System.out.print("Enter your choice: ");
                        try{
                            choice = sc.nextInt();
                            break;
                        } catch(Exception e){
                            System.out.println("Invalid input, please try again");
                            sc.nextLine();
                        }
                    }
                    sc.nextLine();
                    // The switch statement for the menu
                    switch(choice){
                        case 1:
                            // The input for the manager
                            System.out.print("Please enter the FULL name of the manager: ");
                            String name = sc.nextLine();
                            // Checks if the manager exists and then tells you to enter the number of weeks to find the pay
                            for(int i = 0; i < managers.size(); i++){
                                if(managers.get(i).getName().equals(name)){
                                    System.out.print("Enter the number of weeks the manager worked: ");
                                    int numWeeks = sc.nextInt();
                                    System.out.println( managers.get(i).getName() + " has been paid $" + managers.get(i).pay(numWeeks));
                                    break;
                                }
                            } 
                            break;
                        case 2:
                            // The input for the sales associate
                            System.out.print("Please enter the FULL name of the sales associate: ");
                            name = sc.nextLine();
                            // Checks if the sales associate exists and then tells you to enter the number of hours to find the pay
                            for(int i = 0; i < salesAssociates.size(); i++){
                                if(salesAssociates.get(i).getName().equals(name)){
                                    System.out.print("Enter the number of hours the sales associate worked: ");
                                    int numHours = sc.nextInt();
                                    System.out.println( salesAssociates.get(i).getName() + " has been paid $" + salesAssociates.get(i).pay(numHours));
                                    break;
                                }
                            }
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid input, please try again");
                            break;
                    }
                    break;
                case 3:
                    // The menu for paying all employees
                    System.out.println("You are paying all employees! ");
                    System.out.println("Managers: ");
                    // Goes through the array list of managers and tells you to enter the number of weeks to find the pay
                    for (int i = 0; i < managers.size(); i++){
                        System.out.println(managers.get(i).getName() + ": ");
                        while(true){
                            System.out.print("Enter the number of weeks: ");
                            try{
                                int numWeeks = sc.nextInt();
                                System.out.println("The " + managers.get(i).getName() + " has been paid " + managers.get(i).pay(numWeeks));
                                break;
                            } catch(Exception e){
                                System.out.println("Invalid input, please try again");
                                sc.nextLine();
                            }
                        }
                    }
                    sc.nextLine(); 
                    // Goes through the array list of sales associates and tells you to enter the number of hours to find the pay
                    System.out.println("\nSales Associates: ");
                    for (int i = 0; i < salesAssociates.size(); i++){
                        System.out.println(salesAssociates.get(i).getName() + ": ");
                        while(true){
                            System.out.print("Enter the number of hours: ");
                            try{
                                int numHours = sc.nextInt();
                                System.out.println("The " + salesAssociates.get(i).getName() + " has been paid "+ salesAssociates.get(i).pay(numHours));
                                break;
                            } catch(Exception e){
                                System.out.println("Invalid input, please try again");
                                sc.nextLine();
                            }
                        }
                    }
                    System.out.println("All employees have been paid! ");
                    break;
                case 4:
                    // The menu for displaying an employee's information
                    System.out.println("Display an employee's information: ");
                    System.out.println("Are you displaying a manager or a sales associate? ");
                    System.out.println("1. Manager");
                    System.out.println("2. Sales Associate");
                    System.out.println("3. Quit");
                    // The input for the menu
                    while(true){
                        System.out.print("Enter your choice: ");
                        try{
                            choice = sc.nextInt();
                            break;
                        } catch(Exception e){
                            System.out.println("Invalid input, please try again");
                            sc.nextLine();
                        }
                    }
                    sc.nextLine();
                    // The switch statement for the menu
                    switch(choice){
                        case 1:
                            // To get the information of the manager
                            System.out.print("Please enter the FULL name of the manager: ");
                            String name = sc.nextLine();
                            for (int i = 0; i < managers.size(); i++){
                                if (managers.get(i).getName().equals(name)){
                                    System.out.println(managers.get(i).toString());
                                }
                            }
                            break;
                        case 2:
                            // To get the information of the sales associate
                            System.out.print("Please enter the FULL name of the sales associate: ");
                            name = sc.nextLine();
                            for (int i = 0; i < salesAssociates.size(); i++){
                                if (salesAssociates.get(i).getName().equals(name)){
                                    System.out.println(salesAssociates.get(i).toString());
                                }
                            }
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid input, please try again");
                            break;
                    }
                    break;
                case 5:
                    // To quit the program
                    System.out.println("Thank you for using the Unreal Computer Sales Payroll System!");
                    play = false;
                    break;
            }
        }
        sc.close();
    }
}
