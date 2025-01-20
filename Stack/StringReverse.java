package Stack;

import java.util.*;
import java.util.Stack;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }
        String reverse= "";
        while(!st.isEmpty()){
            reverse += st.pop();
        }
        System.out.println(reverse);
    }
}