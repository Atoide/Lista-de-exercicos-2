import java.util.Scanner;
public class atv3 {
public static void main(String[] args) {   
    Scanner entrada = new Scanner(System.in);
    double massa;
    System.out.println("Digite o valor da massa: ");       
     massa = entrada.nextDouble();

    if(massa < 0.0){
        System.out.println("Saindo..."); 
    }
    double minino = 0.1;
    int tempo = 0;
    while (massa >= minino) {
     massa *= 0.75;
     tempo += 30;  
    }
    System.out.println("O tempo preciso será: " + tempo + " segundos.");

 }
}
