import java.sql.SQLOutput;
import java.util.Scanner;

public class Banco {
    public static void main(String [] args){
        int cont = 0;
        Cliente cli = new Cliente();
        Scanner sc = new Scanner(System.in);


        System.out.println("Programa Banco");
        System.out.println("1. Registrar un cliente en el sistema");
        System.out.println("2. Mostrar los clientes");

        switch (sc.nextInt()){
            case 1:
                cli.RegistrarCliente(cont);
            case 2:
                cli.MostrarClientes();
                break;


        }


    }
}
