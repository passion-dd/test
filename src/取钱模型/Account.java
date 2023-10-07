package 取钱模型;

public class Account {
    private double money;
    private String cardId;

    public Account(double money, String cardId) {
        this.money = money;
        this.cardId = cardId;
    }

//    synchronized修饰，上锁，一次只允许一个对象访问
    public synchronized void drawmoney(double i){
//        获取现在谁在取钱
        String name=Thread.currentThread().getName();
//        账户余额大于要取的钱
//        ctrl+alt+T,选择第九个，生成同步代码块
            if(this.money>=i){
                System.out.println(name+"取钱"+i);
                this.money=this.money-i;
                System.out.println(name+"取钱之后剩余"+this.money);
            }else{
                System.out.println(name+"余额不足");
            }
    }

    public Account() {
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

}
