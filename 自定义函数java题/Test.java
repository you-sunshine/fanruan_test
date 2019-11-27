import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入:");
        int n = Integer.parseInt(scan.nextLine().trim());
        //设置a b c 的初始值 在后面的代码中使a b c 的值不断变化
        long a =1,b = 1,c = 0;
//        System.out.print("前"+n+"项为:\n"+a+"\t"+b+"\t");
        for(int i=3;i<=n;i++){//此处要减去两项
            c = a + b;
            a = b;
            b = c;
//            System.out.print(c+"\t");
            if(i%10==0){
                System.out.println();
            }
        }
        //输出请第n项的值:
        System.out.println("\n"+"f("+n+")="+c);
          System.out.println(c);
    }

}