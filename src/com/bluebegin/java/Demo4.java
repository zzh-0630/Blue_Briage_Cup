package com.bluebegin.java;
import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        int[] a=new int[10000000];
        int number_p=10007;
        a[0]=a[1]=1;
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if(number==1 || number==2){
            System.out.println(a[0]);
        }else{
            for (int i = 2; i <number; i++){
                a[i]=(a[i-1]+a[i-2])%number_p;
            }
            System.out.println(a[number-1]);
        }
    }
}