import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {


    ArrayList <Integer> cedula = new ArrayList <Integer> ();
    ArrayList <String> nombre = new ArrayList <String> ();
    ArrayList <String>  apellidos =  new ArrayList <String> ();


    public void RegistrarCliente(int cont){
        Scanner sc = new Scanner (System.in);
        System.out.println(" Digite los datos del cliente ");
        System.out.println(" Digite la cedula");
         cedula.add(sc.nextInt());
        System.out.println(" Digite el nombre");
        nombre.add(sc.next());
        System.out.println(" Digite los apellidos");
        apellidos.add(sc.next());
    }
    public void MostrarClientes() {
        for(int i = 0; i< nombre.size();i++){
            System.out.println("cedula"+cedula.get(i));
            System.out.println("nombre"+nombre.get(i));
            System.out.println("apellidos"+apellidos.get(i));
        }

    }

}
