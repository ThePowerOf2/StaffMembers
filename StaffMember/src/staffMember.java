public abstract class staffMember {
    
    // Declaring Variables.
    private String name;
    private String address;
    private String phone;
    
    // Constructor for a staff member.
    public staffMember(String name,String address,String phone){
        this.address = address;
        this.name = name;
        this.phone = phone;
    }
    
    // Getting and Setting the name of the staff member.
    void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    
    // Getting and setting the address of the staff member.
    void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    
    // Getting and setting the phone number of the staff members.
    void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return phone;
    }
    
    // Declaring an abstract class for the pay to different types of staff members.
    abstract double Pay();
    
    // Overriding toString to print out the details of the staff member.
    @Override
    public String toString(){
        return "Name = " + name + "\nAddress = " + address + "\nPhone = " + phone;
    }
}
