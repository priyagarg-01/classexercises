package com.EWAClass;

import java.util.*;

public class CarParking {
    public static void main(String[] args) {
        Stack<Integer> driveway= new Stack<Integer>();
        Queue<Integer> street=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        driveway.push(1);
        driveway.push(2);
        driveway.push(3);
        driveway.push(4);
        driveway.push(5);
        System.out.println("enter which car you want to retrieve");
        int car= sc.nextInt();
        ListIterator<Integer> itr=driveway.listIterator();
        while (itr.hasNext()){
            int a=driveway.pop();
            if (a==car){
                break;
            }
            street.offer(a);
        }
        System.out.println(street);
    }
}
