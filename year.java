import java.util.Scanner;
class year{
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the year");
int y=sc.nextInt();
int r=(y%400==0);
{
System.out.println("leap year");
}
System.out.println("not leap year");
System.out.println(r);
}
}