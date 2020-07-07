package CodingClubQuestions;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;

public class Permutations {

    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        String initalAdd = "pug";
        st.push("+" + initalAdd);
        while(!st.isEmpty()){
            String temp = st.pop();
            if(temp.charAt(temp.length()-1)=='+'){
                System.out.println(temp.substring(0,temp.length()-1));
            }
            System.out.println();
            for (int i = 0; i < temp.substring(temp.indexOf('+')).length(); i++) {
                st.push(temp.substring(0,temp.indexOf('+')) + temp.charAt(i) + "+"
                        + temp.substring(temp.indexOf('+') + 1, i) + temp.substring(i+1));
            }
        }


    }
    public static void permutate(Stack<String> st){
        if(st.size()==0){
            return;
        }
        String working = st.pop();
        if(working.endsWith("+")){
            System.out.println(working.substring(0,working.length()-1));
            permutate(st);
        }
        for (int i = 0; i < working.substring(working.indexOf("+")).length(); i++) {
            st.push(working.substring(0, working.indexOf("+")) + working.substring(i, i+1));
        }
        permutate(st);
    }
}
