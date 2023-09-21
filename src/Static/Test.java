package Static;

public class Test {
    int a;
    private double b;

    public Test() {
        System.out.println("无参构造器");
    }

    public Test(String name, double s) {
        System.out.println("有参构造器");
    }

    public static void test1() {
        Test son = new Test();
        System.out.println(son);
        son.setB(0.99);
        System.out.println(son.getB());
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
}