package ex02;

import java.util.Scanner;

public  class Calculatrice {
    
    public static void main(String[] args)  
{  
Scanner sc= new Scanner(System.in); 

System.out.print("Enter the first number (a)");  
int a= sc.nextInt();  
System.out.print("Enter the second nuber (b)");  
int b= sc.nextInt();   
int c=a+b;  
System.out.println("La somme des deux nombres est :" +c);  
}  
}  
