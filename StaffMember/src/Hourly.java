public class Hourly extends Employee {
    
    // Declaring variables specific to the hourly worker.
    private double hoursWorked;

    // Constructing a hourly worker that is a employee that is a staff member.
    public Hourly(String name, String address, String phone, String ssn, double payRate,double hoursWorked) {
        super(name, address, phone, ssn, payRate);
        this.hoursWorked = hoursWorked;
    }
    
    // Getting and setting the hours worked of the hourly worker.
    void setHoursWorked(double hours){
        hoursWorked = hours;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }
    
    // Adding hours to the hourly workers total hours.
    void addHours(double hours){
        hoursWorked += hours;
    }
    
    // Subtracting hours from the hourly workers total hours.
    void subtracthours(double hours){
        hoursWorked -= hours;
    }
    
    // Returning the salary of the hourly worker.
    @Override
    double Pay(){
        return super.Pay() * hoursWorked;
    }
    
    // Overriding the employee toString().
    // Adding hourly worker specific variables and 'Hourly worker : ' to the top.
    @Override
    public String toString(){
        return "Hourly Worker:\n" + super.toString() + "\nPaid = " + Pay();
    }
}
