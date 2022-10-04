package by.itstep.makejt.thread.controller;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Printer {

        public static void print(String text) throws InterruptedException{
            Random random = new Random();
            System.out.print("[");
            TimeUnit.MILLISECONDS.sleep(random.nextInt(3000));

            for (int i = 0; i < text.length(); i++) {
                System.out.print(text.charAt(i));
                TimeUnit.MILLISECONDS.sleep(random.nextInt(2000));
            }
            TimeUnit.MILLISECONDS.sleep(random.nextInt(5000));
            System.out.println("]");
        }

    public void print1(String text) throws InterruptedException{
        Random random = new Random();
        System.out.print("[");
        TimeUnit.MILLISECONDS.sleep(random.nextInt(3000));

        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            TimeUnit.MILLISECONDS.sleep(random.nextInt(2000));
        }
        TimeUnit.MILLISECONDS.sleep(random.nextInt(5000));
        System.out.println("]");
    }
}