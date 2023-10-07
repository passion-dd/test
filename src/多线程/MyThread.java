package 多线程;

//让子类继承Thread线程类
public class MyThread extends Thread{

    @Override
//    重写Thread里的run方法
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("MyThread1--线程i的值："+i);
        }
    }
}
