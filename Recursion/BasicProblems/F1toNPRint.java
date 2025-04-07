package BasicProblems;
import java.util.*;

public class F1toNPRint {
    static void print1ToN(int n){
        if(n==0){
            return;
        }
        print1ToN(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n= sc.nextInt();

        print1ToN(n);
    }
    
}
