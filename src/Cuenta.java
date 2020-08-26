public class Cuenta {
    long NoCuenta;

    public Cuenta(long noCuenta, Double saldo, String tipo) {
        NoCuenta = noCuenta;
        Saldo = saldo;
        Tipo = tipo;
    }

    Double Saldo;
    String Tipo;

    public RetirarDinero(double cantidad){
        if(saldo > cantidad){
            System.out.println("Saldo suficiente procediendo al retirp");
            saldo = saldo - cantidad;
        }else{
            System.out.println("Saldo de la cuenta insuficiente");
        }

    }
    
}
