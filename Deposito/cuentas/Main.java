package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta_recup;
        double saldoActual;


}
public void operativa_cuenta(CCuenta cuenta_recup, Double saldoActual, float cantidad) {
    

    cuenta_recup = new CCuenta("Luisa Garcia","1000-2365-85-1230456789",2500,0);
    saldoActual = cuenta_recup.estado();
    System.out.println("El saldo actual es"+ saldoActual );

    try {
        cuenta_recup.retirar(2300);
    } catch (Exception e) {
        System.out.print("Fallo al retirar");
    }
    try {
        System.out.println("Ingreso en cuenta");
        cuenta_recup.ingresar(695);
    } catch (Exception e) {
        System.out.print("Fallo al ingresar");
    }
}
}


