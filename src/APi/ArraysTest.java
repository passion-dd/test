package APi;

import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

public class ArraysTest {
    public static void main(String[] args) {
        double[] a = {10.0, 20.45, 30, 20, 50};
//        返回数组内容
        System.out.println(Arrays.toString(a));

//        把数组中数据改值后再存进数组里
//        例：把数组中数据乘以0.8
        Arrays.setAll(a, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return a[value] * 0.8;
            }
        });
        System.out.println(Arrays.toString(a));

//        排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
