package EasyLevelProblems;

import java.util.HashMap;
import java.util.Scanner;

public class validAnagram {

    static boolean isValid(String s, String t){

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i =0;i< s.length();i++){

            map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i), 1) + 1);
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i), 1) + 1);
        }

        return map1.equals(map2);
    }
    
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        System.out.println(isValid(s, t));
    }

}
