package 线程池;

import java.util.concurrent.Callable;
//线程池处理Callable任务
public class MyCallable implements Callable {
    private  int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception{
        int sum=0;
        for (int i = 1; i < n; i++) {
            sum+=i;
        }
        return Thread.currentThread().getName()+"  1-n的和----"+sum;
    }
}
