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

    public Tarjeta(long noTarjetaC, int claveAvances, String fechaCaducidad, Double couta, Double cupo, Double tasaInteres, Double coutaManejo) {
        NoTarjetaC = noTarjetaC;
        ClaveAvances = claveAvances;
        FechaCaducidad = fechaCaducidad;
        Couta = couta;
        Cupo = cupo;
        TasaInteres = tasaInteres;
        CoutaManejo = coutaManejo;
    }

    String FechaCaducidad;
    Double Couta;
    Double Cupo;
    Double TasaInteres;
    Double CoutaManejo;



}
