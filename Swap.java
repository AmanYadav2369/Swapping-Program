/* wajp to swap two numbers without using third variable. */

class Swap
{
public static void main(String args[])
{
int a=25, b=35;
System.out.println("a ="+a+"  "+"b ="+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("a ="+a+"  "+"b ="+b);

}
}