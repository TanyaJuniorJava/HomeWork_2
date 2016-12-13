package com.company;

/**•	Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за сутки случается так,
 * что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия
 * (например, 02:20, 11:11 или 15:51).
 * Created by Rosh on 11.12.2016.
 */
public class Clock {
public static void main(String []args){
    int j = 0;
    int hours, minutes, h1, h2, m1, m2;
    hours = 0;
    minutes = 0;
    while (hours<24){
        h1 = hours/10;
        h2 = hours%10;
        m1 = minutes/10;
        m2 = minutes%10;
        if ((h1==m1)&&(h2==m2)){
                j++;}
        minutes++;
        if (minutes==60){
            minutes=0;
            hours++;}
    }
    System.out.println(j);
    }

}
