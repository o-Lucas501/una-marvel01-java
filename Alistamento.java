import java.util.Scanner;

public class ProjeyoRenascimento {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new scanner(System.in);

        System.out.println("Digite o nome do(a) recruta: ");
        String nome = scanner.nextLine();

        System.out.println("ola "+nome+ "!");

        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Seu peso: " +peso+ "kg");

        if(peso < 50){
            System.out.println("você esta a baixo do peso ideal para o alistamento");
        }

        else if ( peso >= 50 && peso < 100) {
            System.out.println("você esta no peso ideal para o alistamento ");
        }

        else {
            System.out.println("você esta acima do peso ideal para o alistamento");
        }
       
        
        scanner.close();


    }

}