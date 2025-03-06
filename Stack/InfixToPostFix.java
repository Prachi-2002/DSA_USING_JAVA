// Infix Operation - a+b*(c^d-e) as the operators are between operands
// operators - ^ + - * /
// operands - A - Z , a - z or 0 - 9

/*

| i   | Character | Stack (st)               | Answer (ans)       | Action                                       |
|-----|-----------|--------------------------|--------------------|----------------------------------------------|
| 0   | a         | +                        | "a"                | Add `a` to the answer.                       |
| 1   | b         | +                        | "ab"               | Add `b` to the answer.                       |
| 2   | *         | +*                       | "ab"               | Push `*` onto the stack.                     |
| 3   | (         | +*(                      | "ab"               | Push `(` onto the stack.                     |
| 4   | c         | +*(                      | "abc"              | Add `c` to the answer.                       |
| 5   | ^         | +*(^                     | "abc"              | Push `^` onto the stack.                     |
| 6   | d         | +*(^                     | "abcd"             | Add `d` to the answer.                       |
| 7   | -         | +*( || ^ | +*(-          | "abcd^"            | Pop and append operators till precedence.    |
| 8   | e         | +*(-                     | "abcd^e"           | Add `e` to the answer.                       |
| 9   | (         | Pop everything till `(`  | "abcd^e-"          | Add popped operators and update the stack.   |
|     |           | +*                       | "abcd^e-*+"        | Result after processing.                     |

*/


package Stack;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {
    // Method to return priority of an operator
    private static int priority(char op) {
        switch (op) {
            case '^': 
                return 3; // Highest precedence
            case '*': 
            case '/': 
                return 2; // Medium precedence
            case '+': 
            case '-': 
                return 1; // Lowest precedence
            default: 
                return 0; // Non-operator characters
        }
    }

    public  static String InfixToPostFixConverter(String s){

        Stack <Character> st =  new Stack<>();
        String ans = "";

        for(int i=0;i< s.length();i++){
            if((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 0 && s.charAt(i) <=9)){
                ans += s.charAt(i);
            }
            else if(s.charAt(i) == '('){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans +=st.pop();
                }
                st.pop();
            }else{
                while (!st.isEmpty() && priority(s.charAt(i)) <= priority(st.peek())) {
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i));
            }
        }

        while(!st.isEmpty()){
            ans += st.pop();
        }

        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(InfixToPostFixConverter(s));
    }
}