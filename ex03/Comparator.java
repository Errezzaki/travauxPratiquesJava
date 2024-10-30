package ex03;

import java.util.Scanner;

public class Comparator {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 

            System.out.print("Entrer votre age");  
            int userAge= sc.nextInt();  
            System.out.println("Age passe en argument : " + userAge ); 
            if (userAge>18) {
                System.out.println("Vous etes majeur");
            } 
            
            else{
                System.out.println("Vous etes mineur");
            }
             
            }  
    }


