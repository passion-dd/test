package 取钱模型;

public class GetThread extends Thread{
    private Account account;

    public GetThread(Account acc,String name){
        super(name);
        account=acc;
    }
    @Override
    public void run(){
        account.drawmoney(100000);
    }
}
