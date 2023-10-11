/*找出所有的水仙花数，输出格式要求：每个整数占6列*/
import java.lang.Math;
public class Test
{
    public static void main(String[] args)
    {
        int n,ge,shi,bai,sum;//n是一个三位数的整数，ge、shi、bai表示n的个位、十位、百位数字，sum表示三位数字的立方和
        //请在以下位置添加代码
//        for(n=100;n<1000;n++){
        n=102;
            ge=n%10;
            shi=n/10%10;
            bai=n/100;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
            sum=(int)(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3));
            System.out.println(sum);
            if(n==sum)
            {
                System.out.print("   "+n);
            }

//        }
    }
}