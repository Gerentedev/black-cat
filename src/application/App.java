package application;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
        double xA,xB,xC,yA,yB,yC;
        System.out.println("=>>Programa para cálculo de área de triângulo\n----------------------------------------------------------------");
        System.out.println("\nDigite as medidas do triângulo X:");
            xA = sc.nextDouble();
            xB = sc.nextDouble();
            xC = sc.nextDouble();
        System.out.println("\nDigite as medidas do triângulo Y:");
            yA = sc.nextDouble();
            yB = sc.nextDouble();
            yC = sc.nextDouble();
    
            double p = (xA+xB+xC) / 2.0;
            double areaX = Math.sqrt(p*(p-xA)*(p-xB)*(p-xC));
           
            p = (yA+yB+yC) / 2.0;
            double areaY = Math.sqrt(p*(p - yA) * (p-yB) * (p - yC));
            
            System.out.printf(" Área do triângulo X é: %.4f \n",areaX);
            System.out.printf(" Área do triângulo Y é: %.4f \n",areaY);

            sc.close();

    }
}
