public class Executive extends Employee{
    
    // Declaring the variables specific to an executive.
    private double bonus;
    
    // Constructor for a executive which is a employee and a staff member.
    public Executive(String name, String address, String phone, String ssn, double payRate, double bonus) {
        super(name, address, phone, ssn, payRate);
        this.bonus = bonus;
    }
    
    // Getting and setting the bonus for the executive.
    void setBonus(double bonus){
        this.bonus = bonus;
    }
    public double getBonus(){
        return bonus;
    }
    
    // Adding more the executives bonus.
    void awardBonus(double bonus){
        this.bonus += bonus;
    }
    
    // Reseting the executives bonus back to 0.
    void resetBonus(){
        this.bonus = 0.0;
    }
    
    // Returning the salary of the executive.
    @Override
    double Pay(){
            return super.Pay() + bonus;
    }
    
    // Overriding the Employee toString().
    // Adding executive specific variables and 'Executive: ' to the top.
    @Override
    public String toString(){
        return "Executive:\n" + super.toString() + "\nPaid = " + Pay();
    }
}