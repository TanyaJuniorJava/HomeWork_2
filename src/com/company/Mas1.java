package com.company;



/**•	Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99].
 *  Вывести массив на экран.
 * Created by Rosh on 11.12.2016.
 */
public class Mas1 {
    public static void main(String []args){
        int mas [][] =new int [8][5];
        for (int i=0; i<mas.length; i++){
            for (int j=0; j<mas[i].length; j++){
                mas[i][j] = (int)(Math.random()*90+10);
            }
        }
        for (int i=0; i<mas.length; i++){
            for (int j=0; j<mas[i].length; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
