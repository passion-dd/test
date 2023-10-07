package 线程池;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pl= new ThreadPoolExecutor(3,5,8,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(4),
                Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        Callable target=new MyCallable(10);
        Future<String> f1= pl.submit(target);//返回一个future对象
        Future<String> f2= pl.submit(target);//返回一个future对象
        Future<String> f3= pl.submit(target);//返回一个future对象
        Future<String> f4= pl.submit(target);//返回一个future对象

        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());


    }
}
