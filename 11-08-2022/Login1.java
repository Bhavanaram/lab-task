import java.util.*;
class Login1
 {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the user name ");
    String userName=sc.nextLine();// reading userName from user
    System.out.println("enter the password ");
    String password=sc.nextLine();//reading password from user
    String pwd=userName.substring(0,3);// creating password
    pwd=pwd+"123";
    if(pwd.equals(password))// condition to checking userpassword and auto gerated password

     {
        System.out.println("login Sucessfully");
      }
    else
    {
        System.out.println("login not sucessfull");     
     }
   }
  }