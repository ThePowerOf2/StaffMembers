public class Volunteer extends staffMember{
    
    // Constructor for the volunteer which is a staff member.
    public Volunteer(String name,String address,String phone){
        super(name,address,phone);
    }

    // Return the pay of the volunteer which is 0.
    @Override
    double Pay() {
        return 0.0;
    }
    
    // Overriding the staffMember toString().
    // Just adding 'Volunteer:' to the top.
    @Override
    public String toString(){
        return "Volunteer:\n" + super.toString();
    }
}
