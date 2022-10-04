package by.itstep.makejt.thread.controller;

import by.itstep.makejt.thread.model.Writer;

public class Controller {
    public static void main(String[] args) {

        Writer threadLogic = new Writer();

        int count = 5;

        Thread[] threads = new Thread[count];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadLogic);
            threads[i].start();   }
    }
}
