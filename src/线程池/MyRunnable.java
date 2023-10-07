package 线程池;

//多线程中利用Runnable接口的匿名内部类创建，这里重写Runnable接口
//线程池处理Runnable任务
public class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+"   111");
//        休眠1s
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
