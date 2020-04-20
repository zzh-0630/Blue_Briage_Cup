package LEVEL_BEGIN;

import java.util.Scanner;

/*
问题描述
　　153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的三位十进制数，每个数占一行。
 */
public class BASIC_7_Special_Number {
    public static void main(String[] args) {

        for(int i=101;i<=999;i++){
            int a=i/100;
            int b=(i/10)%10;
            int c=i%10;
            if(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)==i){
                System.out.println(i);
            }
        }
    }
}
