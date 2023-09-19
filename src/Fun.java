public class Fun extends Test {
    //    方法重写,私有方法和静态方法不能重写
    @Override
    public int getA() {
        return a + 1;
    }
}
