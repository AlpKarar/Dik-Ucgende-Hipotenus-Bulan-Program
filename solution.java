import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        int a, b;
        double c, u, area, area_sqr;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("a: ");
        a = input.nextInt();
        
        System.out.print("b: ");
        b = input.nextInt();
        
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        
        System.out.printf("%.2f", c);
        
        u = (a + b + c)/2;
        
        area_sqr = u*(u-a)*(u-b)*(u-c);
        
        area = Math.sqrt(area_sqr);
        
        System.out.printf("\nArea: %.2f", area);
        
    }
}
