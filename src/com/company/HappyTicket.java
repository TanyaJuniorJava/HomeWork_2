package com.company;

/**•	В городе N проезд в трамвае осуществляется по бумажным отрывным билетам. Каждую неделю трамвайное депо
 * заказывает в местной типографии рулон билетов с номерами от 000001 до 999999. «Счастливым» считается билетик
 * у которого сумма первых трёх цифр номера равна сумме последних трёх цифр, как, например, в билетах с номерами
 * 003102 или 567576. Трамвайное депо решило подарить сувенир обладателю каждого счастливого билета и теперь
 * раздумывает, как много сувениров потребуется. С помощью программы подсчитайте сколько счастливых билетов в одном рулоне?
 * Created by Rosh on 11.12.2016.
 */
public class HappyTicket {
    public static void main (String []args){
        int n, j, sum1, sum2;
        j=0;
        sum1=0;
        sum2=0;
        for (int i=3000; i<=999999; i++){
            n=i/1000;
            while (n!=0){
                sum1=sum1+n/10;
                n/=10;
            }
            n=i%1000;
            while (n!=0){
                sum2=sum2+n/10;
                n/=10;
            }
            if (sum1==sum2)
                j++;

        }
        System.out.println("It's need a "+j+"presents ");
    }
}
