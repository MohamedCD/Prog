import java.util.Scanner;

public class Ejercicio33{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int altura;
       
        System.out.println("Introduce la altura");
        altura = sc.nextInt();
        
        for (int i = 0; i < altura - 1; i++) {
            System.out.print("*");
            
            for (int j = 0; j < altura; j++) {
                System.out.print(" ");
            }
            
            System.out.println("*");
        }
        
        System.out.print(" ");
        
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("* ");
        }
        
        System.out.println();
    }
}