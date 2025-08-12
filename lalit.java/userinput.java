import java.util.Scanner;
public class userinput {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no");
        int a = sc.nextInt();
        int b=sc.nextInt();
        float c=sc.nextFloat();
        float d=sc.nextFloat();
        System.out.println("sum is:"+(a+b));
        System.out.println("sum is:"+(c+d));
        System.out.println(a);
    }
}
