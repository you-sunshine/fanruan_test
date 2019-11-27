import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /**
         * 迭代法求a的平方根：temp=a/temp时，temp为其平方根，
         两者差小于10的负4次方，<1e-4，即为精确到小数点后四位
         temp  和 a/temp 分别位于a的平方根的两头，一个大于，一个小于，
         取两者的平均值进行迭代。
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float temp=1;
        while(Math.abs(temp-a/temp)>1e-4)
        {
            temp=(temp+a/temp)/2;
        }


        System.out.println(temp);


    }
}
