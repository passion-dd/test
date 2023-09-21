package Interface;

public interface A {
    //    变量需为常量
//    方法为抽象方法
    String name = "xiaom";

    void testa();

    void testB();

    //    但用default修饰的方法,私有方法,静态方法不需要重写
    default void testC() {
        System.out.println("A接口中的默认方法");
    }
}

//接口之间可以多继承
interface C {
}

interface D {
}

interface F extends A, C, D {

}
