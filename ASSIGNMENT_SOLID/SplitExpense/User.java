package ASSIGNMENT_SOLID.SplitExpense;

import java.util.HashMap;

public class User {

    String userId;
    String userName;
    String emailId;
    double totalBorrow; //Amount he/she will pay
    double totalPays; //Amount he/she will receive
    double netAmount;
    HashMap<String, Double> amountMap = new HashMap<>();
}