public class Test {
    int a;
    public static void test1(){
        for(int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
    public  Test(){
        System.out.println("无参构造器");
    }
    public  Test(String name,double s){
        System.out.println("有参构造器");
    }
}