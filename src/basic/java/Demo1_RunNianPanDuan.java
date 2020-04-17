package basic.java;

import java.util.Scanner;

/**
 * @author Administrator
 *资源限制
时间限制：1.0s   内存限制：256.0MB
问题描述
给定一个年份，判断这一年是不是闰年。

当以下情况之一满足时，这一年是闰年：

1. 年份是4的倍数而不是100的倍数；

2. 年份是400的倍数。

其他的年份都不是闰年。

输入格式
输入包含一个整数y，表示当前的年份。
输出格式
输出一行，如果给定的年份是闰年，则输出yes，否则输出no。
说明：当试题指定你输出一个字符串作为结果（比如本题的yes或者no，你需要严格按照试题中给定的大小写，写错大小写将不得分。
 */
public class Demo1_RunNianPanDuan {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        if((n%4==0)&&(n%100!=0)||(n%400==0)) {
            System.out.print("yes");
        }else {
            System.out.print("no");
        }
    }

}