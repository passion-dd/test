package 多线程;

public class ThreadTest {
    public static void main(String[] args) {
//        第一种方法：创建MyThread线程类对象代表一个线程
        Thread t=new MyThread();
//        启动线程
        t.start();
//        第二种方法：利用Runnable接口的匿名内部类创建
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("MyThread2--线程i:"+i);
                }
            }
        };
        new Thread(r).start();
//main方法中的语句要放在子线程启动之后，否则仍然是单线程
        for (int i = 0; i < 5; i++) {
            System.out.println("main--线程中i:"+i);
        }

    }
}
