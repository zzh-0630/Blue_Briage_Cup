package LEVEL_BEGIN;

import java.util.Scanner;

/*
问题描述
　　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
输出格式
　　按从小到大的顺序输出满足条件的四位十进制数。
 */
public class BASIC_8_Back_Number {
    public static void main(String[] args) {
        int i;
        for(i = 1000;i<9999;i++){
            int a = i/1000;
            int b = i/100%10;
            int c = i/10%10;
            int d = i%10;
            if(a==d&&b==c){
                System.out.println(i);
            }
        }
    }
}
