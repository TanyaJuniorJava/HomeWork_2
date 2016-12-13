package com.company;

import java.util.Scanner;

/*•	Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
(заранее не известно сколько цифр будет в числе).*/
public class FirstSum {

    public static void main(String[] args) {
	// write your code here
        int ch = 0;
        int sum = 0;
        System.out.println("Vvedite naturlnoe chislo:");
        Scanner scan = new Scanner(System.in);
        ch = scan.nextInt();
        while (ch!=0)
        {
            sum = sum + ch % 10;
            ch /= 10;
        }
        System.out.println("Summa cifr vvedennogo chisla:" + sum);
    }
}
