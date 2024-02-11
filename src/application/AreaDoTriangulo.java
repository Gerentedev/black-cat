package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
public class AreaDoTriangulo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
       Triangle x;
       Triangle y;
       x = new Triangle();
       y = new Triangle();
           
           System.out.println("\nDigite as medidas do triângulo X:");
            x.a =sc.nextDouble();
            x.b = sc.nextDouble();
            x.c = sc.nextDouble();
        
            System.out.println("\nDigite as medidas do triângulo Y:");
            y.a = sc.nextDouble();
            y.b = sc.nextDouble();
            y.c = sc.nextDouble();
                
           System.out.printf(" Área do triângulo X é: %.4f \n",x.Area());
           System.out.printf(" Área do triângulo Y é: %.4f \n",y.Area());
           System.out.println("Isso deu muito certo!!!!");

            sc.close();

    }
}




