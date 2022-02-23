package cuentas;
/**
 * Clase destinada a crear y mostrar por pantalla la información 
 * de una cuenta bancaria
 * así como el procedimiento que se realiza en la misma
 * de entre tres posibles
 * @author srarr
 *
 */
public class Main {
	/**
	 * Crea una cuenta y muestra por pantalla sus datos
	 * @param args datos de la cuenta
	 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 0);
    }
/**
 * Se realiza una operación de retirada en la cuenta 
 * que dará varios resultados
 * @param cuenta1
 * @param cantidad
 */
	private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
