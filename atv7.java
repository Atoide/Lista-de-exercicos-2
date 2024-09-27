import java.util.Scanner;
public class atv7 {
public static void main(String[] args) {   
    Scanner entrada = new Scanner(System.in);
    int opcao;
    int colunas;
    System.out.println("escolha a opçao: \n1: Retângulo. \n2: Diagonal superior esquerda. \n3: Diagonal superior direita. \n4: Diagonal inferior esquerda.\n5: Diagonal inferior direita.");
    opcao = entrada.nextInt();

 switch (opcao) {
        case 1: 
        System.out.println("informe a quantidade de colunas: ");
         colunas = entrada.nextInt();
             for( int i = 1; i <= colunas; i++ ) {
             for( int x = 1; x <= colunas; x++) {System.out.print("* ");
             } 
             System.out.println();
            }
            break;
        
        case 2: 
        System.out.println("informe a quantidade de colunas: ");
         colunas = entrada.nextInt();
             for( int i = colunas; i >= 0; i-- ) {
             for( int x = 1; x <= i ; x++) {System.out.print("* ");
             } 
             System.out.println();
             }
            break;

        case 3:
        System.out.println("informe a quantidade de colunas: ");
         colunas = entrada.nextInt();
            break;
        // *nao consegui* //

        case 4: 
        System.out.println("informe a quantidade de colunas: ");
         colunas = entrada.nextInt();
             for( int i = 1; i <= colunas; i++ ) {
             for( int x = 1; x <= i; x++) {System.out.print("* ");
             } 
             System.out.println();
             }

         break;

        case 5:
        System.out.println("informe a quantidade de colunas: ");
         colunas = entrada.nextInt();
            break;
        // *nao consegui* //
    }
    

 }  
}
