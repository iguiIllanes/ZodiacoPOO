import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
        
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu dia: ");
        int diaEntrada = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce tu mes: ");
        int mesEntrada = Integer.parseInt(sc.nextLine());

        Zodiaco zodiaco = new Zodiaco(diaEntrada, mesEntrada);


        System.out.println("tu signo es: " + zodiaco.calcularSignoZodiacal());
        sc.close();
    }
}
