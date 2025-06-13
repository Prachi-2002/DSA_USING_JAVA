package SOLID;

// Solid principles :

// principles are the set of rules which we follow to make our code good code
// Good code : refers to the code which has the reusability and can be easily extensible
// S - single responsibility (A class should have only one reason to change)
// O - class should be open for extension but closed for modification 
// L - liskov substitution principle (We should keep the generalised property in the class)
// I - interface segragation
// D - dependency inversion (We should depend on abstraction rather than concrete class)
// KISS -
// DRY - 
// YAGNI - 
// 


// Rider
// Driver
// Payment
// Rides

// User ->  name , phoneno , email
// Driver -> location , isAvailable,
// Rider -> location
// Payment -> CreditCard payment , Debit card payment, upi payment,
// Rides -> status, location , source , destination

abstract class User{
    String id;
    String name;
    String email;
    int phoneno;
}

class Driver extends User{
    String location;
    boolean isAvailable;
}

class Rider extends User{
    String location;
}

class Rides {
    String location;
    String source;
    String destination;
    String status; 
}


 interface PaymentStrategy {
    void pay (int amount);
    
    
}

class PayByCreditCard implements PaymentStrategy {
    public void pay (int amount){
        System.out.println("Paying by credit card " + amount);
    }
}

class PayByDebitCard implements PaymentStrategy {
    public void pay(int amount){
        System.out.println("Paying by debit card" +  amount);
    }
}

class PayByUpi implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paying by upi " +  amount);
    }
}

public class Uber {
    
}
