import java.util.Scanner;
public class atv1 {
    public static void main(String[] args) {   
    Scanner entrada = new Scanner(System.in);
     int numero;
        System.out.println("Digite o numero inteiro:");
         numero = entrada.nextInt(); 

         System.out.println("Os proximos numeros serão:"); 
            for (int i = 1; i != 100; i++){
             System.out.println(numero + i);
            }

 }
}