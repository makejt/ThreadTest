package by.itstep.makejt.thread.model;
import by.itstep.makejt.thread.controller.Printer;

//public class Writer implements Runnable {
//    @Override
//    public void run() {
//        Thread thread = Thread.currentThread();
//        try {
//            Printer.print(thread.getName());
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//    }
//}

public class Writer implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        try {
            new Printer().print1(thread.getName());
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}