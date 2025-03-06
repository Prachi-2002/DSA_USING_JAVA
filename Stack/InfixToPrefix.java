// Infix Operation - (A+B)*C-D+F as the operators are between operands
// operators - ^ + - * /
// operands - A - Z , a - z or 0 - 9
/*
Steps - Reverse the infix ((A+B)*C-D+F) => F+D-C*)B+A(
        while performing reversal make sure to reverse the opening and closing bracket means
        opening bracket will be closing brcket and vice-versa
        so the reversalOf Infix = F+D-C*(B+A)
        Infix to postfix conversion = FDCBA+-*+
        Reverse the answer = +*-+ABCDF

*/
/*
 
| i   | Character | Stack (st)               | Answer (ans)       | Action                                      |
|-----|-----------|--------------------------|--------------------|---------------------------------------------|
| 0   | F         |                          | "F"                | Add `F` to the answer.                      |
| 1   | +         | +                        | "F"                | Push `+` to the stack.                      |
| 2   | D         | +                        | "FD"               | Add `D` to the answer.                      |
| 3   | -         | +-                       | "FD"               | Push `-` onto the stack.                    |
| 4   | C         | +-                       | "FDC"              | Add `C` to the answer.                      |
| 5   | *         | +-*                      | "FDC"              | Push `*` onto the stack.                    |
| 6   | (         | +-*(                     | "FDC"              | Push `(` onto the stack.                    |
| 7   | B         | +-*(                     | "FDCB"             | Add `B` to the answer.                      |
| 8   | +         | +-*(+                    | "FDCB"             | Push `+` onto the stack.                    |
| 9   | A         | +-*(+                    | "FDCBA"            | Add `A` to the answer.                      |
| 10  | )         | +-*                      | "FDCBA+-"          | Pop everything till `(` and append to ans.  |
|     |           | +*                       | "FDCBA+-*+"        | Pop remaining operators from the stack.     |

*/

// package Stack;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

    // Reverse the string and swap parentheses
    public static String reverseStringFunc(String s) {
        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '(') {
                reverse.append(')');
            } else if (ch == ')') {
                reverse.append('(');
            } else {
                reverse.append(ch);
            }
        }
        return reverse.toString();
    }

    // Determine the precedence of operators
    public static int priority(char c) {
        switch (c) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return 0;
        }
    }

    // Convert infix to postfix
    public static String infixToPostfix(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) { // Operand
                ans.append(ch);
            } else if (ch == '(') { // Opening parenthesis
                st.push(ch);
            } else if (ch == ')') { // Closing parenthesis
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                st.pop(); // Pop the '('
            } else { // Operator
                while (!st.isEmpty() && priority(ch) < priority(st.peek())) {
                    ans.append(st.pop());
                }
                // If operators have the same precedence, consider associativity
                if (!st.isEmpty() && priority(ch) == priority(st.peek())) {
                    if (ch != '^') { // Left-associative operators
                        ans.append(st.pop());
                    }
                }
                st.push(ch);
            }
        }

        // Pop any remaining operators in the stack
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }

    // Convert infix to prefix
    public static String infixToPrefix(String s) {
        // Reverse the infix expression and change parentheses
        String reversed = reverseStringFunc(s);

        // Convert the reversed string to postfix
        String postfix = infixToPostfix(reversed);

        // Reverse the postfix result to get prefix
        return reverseStringFunc(postfix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String s = sc.nextLine();

        // Convert the infix expression to prefix
        String prefix = infixToPrefix(s);

        System.out.println("Prefix expression: " + prefix);
        sc.close();
    }
}

