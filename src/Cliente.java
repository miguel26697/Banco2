public class Cliente {

    String Nombre;
    String Apellidos;
    int Cedula;
    String Direccion;
    int Edad;


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int cedula) {
        Cedula = cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

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
