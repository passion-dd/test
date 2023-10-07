package 线程池;

import java.util.concurrent.*;

public class RunnableTest {
    public static void main(String[] args) {
//        通过ThreadPoolExecutor创建线程池对象,赋给ExecutorService变量
//         public ThreadPoolExecutor(int corePoolSize,核心线程数量
                            //        int maximumPoolSize,最大线程数量，最大线程数量-核心线程数量=临时线程数量
//        临时线程的创建要等核心线程数量和线程池任务队列满了之后才会创建
                            //        long keepAliveTime,存活时间
                            //        TimeUnit unit,存活的时间单位
                            //        BlockingQueue<Runnable> workQueue,线程池的任务队列
                            //        ThreadFactory threadFactory,线程池工厂
                            //        RejectedExecutionHandler handler)任务拒绝策略
       ExecutorService pl= new ThreadPoolExecutor(3,5,8,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        Runnable target=new MyRunnable();
        pl.execute(target);//线程池会自动创建新线程，自动执行这个任务
        pl.execute(target);//线程池会自动创建新线程，自动执行这个任务
        pl.execute(target);//线程池会自动创建新线程，自动执行这个任务
        pl.execute(target);//复用前面的线程

        pl.shutdown();//等任务执行完毕后关闭线程池
    }
}
