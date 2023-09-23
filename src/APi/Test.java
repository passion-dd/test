package APi;

import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String st1 = "hdtrs";
        String st2 = "hdtrs";
        System.out.println(Objects.equals(st1, st2));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(19);
        list.get(1);

//        拼接内容
        StringBuilder s = new StringBuilder("hhh");
        s.append("strd").append(1).append("jiksd");
        System.out.println(s);

        System.out.println(fun(new int[]{1, 3, 4, 21}));
    }

    public static String fun(int[] arr) {
        StringBuilder s = new StringBuilder();

        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]).append(", ");
        }
        s.append("]");
        return s.toString();
    }
}
