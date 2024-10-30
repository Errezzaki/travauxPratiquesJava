package ex04;

import java.util.Scanner;

public class TemperatureConvertor{

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 

            System.out.print("Entrer une temperature en degre Celecius");  
            double celeciusDegree= sc.nextDouble(); 
            double farhrenheitDegree =  9*celeciusDegree/5 + 32;
            System.out.println("La temperature passe en argument en degree Celecius est : " + celeciusDegree);
            System.out.println(celeciusDegree + " degres Celcius equivalent a "+ farhrenheitDegree + " degres farhrenheit");
    }


}