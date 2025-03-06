package Stack;

import java.util.Scanner;
import java.util.Stack;

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type
public class BalancedParenthesis {

    public static boolean isValid(String s) {
        Stack <Character> st =  new Stack <>();
        for(int i=0;i< s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();

                if(c == ')' && top != '('){
                    return false;
                }

                if(c == ']' && top != '['){
                    return false;
                }
                if(c == '}' && top != '{'){
                    return false;
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String validParenthesisString = sc.nextLine();

        System.out.println(isValid(validParenthesisString));

    }
}