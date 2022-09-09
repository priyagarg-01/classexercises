package com.EWAClass;

import java.util.Scanner;
import java.util.Stack;

public class MathsExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<String> brackets=new Stack<String>();
        String math= sc.nextLine();
        String[] list=math.split("");
        int c=1;
        for (String i: list){
            if (i.equals("{")||i.equals("[")||i.equals("(")){
                brackets.push(i);
            }
            else if (i.equals("}")||i.equals("]")||i.equals(")")){
                String s=brackets.pop();
                if (!((s.equals("{")&&i.equals("}"))|| (s.equals("[") && i.equals("]")) ||(s.equals("(")&&i.equals(")")))){
                    System.out.println("Unbalanced");
                    c=0;
                    break;
                }
            }
        }
        if (brackets.isEmpty() && c==1){
            System.out.println("Balanced");
        }

    }
}
