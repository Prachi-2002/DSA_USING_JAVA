package ASSIGNMENT_SOLID.SplitExpense;

public class SplitAmount {

    SplitStrategy splitStrategy;

    SplitAmount(SplitStrategy ss){
        this.splitStrategy = ss;
    }

    void verifySplit (Expense expense) {
        splitStrategy.verifySplit(expense);
    }

    void split(Expense expense){
        splitStrategy.split(expense);
    }
}