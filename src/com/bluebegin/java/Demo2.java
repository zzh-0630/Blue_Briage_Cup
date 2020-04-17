package com.bluebegin.java;

import java.util.*;
public class Demo2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO 自动生成方法存根
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long sum=0;
        for(int i = 1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
