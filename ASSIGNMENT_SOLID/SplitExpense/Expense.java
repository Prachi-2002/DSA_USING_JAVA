package ASSIGNMENT_SOLID.SplitExpense;

import java.util.Date;
import java.util.ArrayList;

public class Expense {

    double expense;
    String paidBy;
    SplitType splitType;
    String description;
    ArrayList<Split> splits;
    double netAmountDue; //Amount which will be received by payee
    Date expenseDate;

    Expense(Double expense, String paidBy, SplitType splitType, String description, ArrayList<Split> splits, Date date){
        this.expense =  expense;
        this.paidBy = paidBy;
        this.splitType = splitType;
        this.description = description;
        this.splits = splits;
        this.expenseDate =  date;
    }

}