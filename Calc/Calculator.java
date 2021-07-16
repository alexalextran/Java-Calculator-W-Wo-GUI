package Calc;
import java.util.LinkedList;
import java.util.Scanner;
public class Calculator 
{
    
   public static LinkedList<Float> numbers = new LinkedList<Float>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Hello welcome to calculator 1.0 by Alex Tran; feel free to experiment and bug test! :)");
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("How many numbers will you be using: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){ //Filling the LinkedList with numbers to be calculated
            System.out.print("Enter in a number: ");
            float p = sc.nextInt();
            Calculator.numbers.add(p);      
        }  
       boolean works = true;
       while (works == true){
        System.out.println("+, -, x, ÷, Mode, Mean, Median, " + "(Press q to quit) " + "Choose a feature; ");
        String switcheronies = sc.next();
    
        switch (switcheronies){
            case "+" : System.out.println(Operators.addition());
        break;
            case "-" : System.out.println(Operators.subtraction()); 
        break;
            case "x" : System.out.println(Operators.multiplication()); 
        break;
            case "÷" : System.out.println(Operators.division()); 
        break;
            case "Mean" : System.out.println("The mean is " + Operators.mean()); 
        break;
            case "Mode" : 

            if(Operators.mode() == 0){
                System.out.println("There is no mode");
            }
             else{
                 System.out.println("The mode is " + Operators.mode()); 
             }

        break;
            case "Median" : System.out.println("The median is " + Operators.median()); 
        break;
            case "q" : works = false;
        break;
            default: System.out.println("Thats not a feature !, Try again");  
        } 
    }
        sc.close();
        
        
    }
}

