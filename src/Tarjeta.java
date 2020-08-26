public class Tarjeta {
    long NoTarjetaC;
    int ClaveAvances;

    @Override
    public String toString() {
        return "Tarjeta{" +
                "NoTarjetaC=" + NoTarjetaC +
                ", ClaveAvances=" + ClaveAvances +
                ", FechaCaducidad='" + FechaCaducidad + '\'' +
                ", Couta=" + Couta +
                ", Cupo=" + Cupo +
                ", TasaInteres=" + TasaInteres +
                ", CoutaManejo=" + CoutaManejo +
                '}';
    }

    String FechaCaducidad;
    Double Couta;
    Double Cupo;
    Double TasaInteres;
    Double CoutaManejo;



}
