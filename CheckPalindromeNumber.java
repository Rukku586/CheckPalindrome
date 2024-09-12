/*Program name:Palindrome*/
//Author's name:Ganesh
/*Palindrome is number or string that will remains the same
When we write that in reverse order.
Some example of
palindrome is 393,010,madam,etc.*/
//imports the Scanner class of the java.util package
import java.util.Scanner;
//class defination
public class CheckPalindromeNumber
{
//main method
public static void main(String args[])
{
//variables to be used in program
int r,s=0,temp;
int x;//it is the number variable to be checked for palindrome
Scanner sc=new Scanner(System.in);
System.out.println("Enter the nuber to check:");
//reading a number from thr user
x=sc.nextInt();
//logic to check if number id palindrome or not
temp=x;
while(x>0)
{
r=x%10; //finds remainder
s=(s*10)+r;
x=x/10;
}
if(temp==s)
System.out.println("The given number is palindrome.");
else
System.out.println("The given number is not palindrome.");
}
}