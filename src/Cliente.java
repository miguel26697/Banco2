public class Cliente {

    String Nombre;
    String Apellidos;
    int Cedula;
    String Direccion;


    public Cliente(String nombre, String apellidos, int cedula, String direccion) {
        Nombre = nombre;
        Apellidos = apellidos;
        Cedula = cedula;
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Cedula=" + Cedula +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }





}
