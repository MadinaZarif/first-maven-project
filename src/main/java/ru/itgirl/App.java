package ru.itgirl;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Schreiben Sie Woche Tag, bitte: ");
        String message = scan.nextLine();

        try{
            DayOfWeek day = DayOfWeek.valueOf(message.toUpperCase());
            System.out.println("День недели (русский): " + day.getTranslateRussian());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка");
        }

    }

}
