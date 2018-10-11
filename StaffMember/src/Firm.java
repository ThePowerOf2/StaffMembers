import java.util.ArrayList;
import java.util.List;


public class Firm{
    public static void main(String[] args) {
        
        // Creating an ArrayList of staffMembers.
        List<staffMember> Staff = new ArrayList<>();
        
        // Creating staff members and adding to the array list.
        Executive ex1 = new Executive("Dave","Washigton Street","345665","4513-45-89",15000.45,0.0);
        Staff.add(ex1);
        Employee emp1 = new Employee("Dom","William St","987654","94-65-41",1200.15);
        Staff.add(emp1);
        
    }
}