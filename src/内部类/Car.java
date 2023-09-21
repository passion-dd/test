package 内部类;

public class Car {
    private int age = 99;

    public class Enginer {
        private String name;

        public void fun() {
//            访问外部类变量
            System.out.println(Car.this.age);
        }

        ;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
