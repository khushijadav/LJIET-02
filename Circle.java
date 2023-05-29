
package tns1;
import java.util.*;
public class Circle 
{
    static final double PI=3.14;
    static double radius;
    double area;
    double circumference;
    public void setRadius()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius : ");
        radius=sc.nextDouble();
    }
    public static void main(String[] args) 
    {
        Circle c1=new Circle();
        c1.setRadius();
        System.out.println("Area is : "+PI*radius*radius);
    }
}
