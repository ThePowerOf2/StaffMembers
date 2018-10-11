public class Employee extends staffMember{
    
    // Declaring variables specific to Employee.
    private String socialSecurityNumber;
    private double payRate;

    // Constructor for an Employee.
    public Employee(String name, String address, String phone, String ssn, double payRate) {
        super(name, address, phone);
        this.socialSecurityNumber = ssn;
        this.payRate = payRate;
    }
    
    // Setting and getting the Social Security Number.
    void setSSN(String SSN){
        socialSecurityNumber = SSN;
    }
    protected String getSSN(String SSN){
        return socialSecurityNumber;
    }
    
    // Setting the pay rate.
    void setPayRate(double payRate){
        this.payRate = payRate;
    }
    
    // Returning the pay rate of the employee.
    @Override
    double Pay(){
        return payRate;
    }
    
    // Overriding the staffMember toString().
    // Adding the specific details from employee to it.
    @Override
    public String toString(){
        return super.toString() + "\nSSN = " + socialSecurityNumber + "\nPay Rate = " + payRate;
    }
}
