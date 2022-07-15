import java.util.Scanner;
class reversepattern
{
public static void main(String args[])
{
Scanner so=new Scanner(System.in);
System.out.println("Enter no of lines");
int lines=so.nextInt();
for(int i=lines;i>=0;i--)
{
for(int j=0;j<i;j++)
{
System.out.println("*");
}
System.out.println();
}
}
}