package 取钱模型;

public class Test {
    public static void main(String[] args) {
        Account acc=new Account(100000,"Acc-s");
//        创建两个线程分别代表小明，小红，分别取钱100000
        new GetThread(acc,"小明").start();//小明取钱
        new GetThread(acc,"小红").start();//小红取钱

        Account aee=new Account(100000,"Acc-d");
        new GetThread(aee,"小黑").start();//小黑取钱
        new GetThread(aee,"小白").start();//小白取钱
    }
}
