package ASSIGNMENT_SOLID.SplitExpense;

interface SplitStrategy {

     void verifySplit(Expense expense);
     void split(Expense expense);
}