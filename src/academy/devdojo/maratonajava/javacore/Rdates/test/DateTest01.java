package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(); // long 100000
        date.setTime(date.getTime());
        System.out.println(date);
    }
}








