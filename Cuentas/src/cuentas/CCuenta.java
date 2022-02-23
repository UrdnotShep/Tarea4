package cuentas;
/**
 * Clase destinada a gestionar los datos de una cuenta 
 * tales como el nombre del titular, tipo de cuenta,
 * saldo y tipo de interés, así como las operaciones
 * de ingreso y retirada que se pueden hacer sobre ella
 * @author srarr
 *
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
public CCuenta()
    {
    }
/**
 * Método que determina los parámetros de la cuenta
 * @param nom titular
 * @param cue cuenta
 * @param sal cantidad de saldo
 * @param tipo clase de interes
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * Devuelve el estado de la cuenta, es decir, el saldo que contiene
 * @return
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Gestiona el ingreso dependiendo de la cantidad elegida
 * @param cantidad determina la cantidad a ingresar
 * @throws Exception arroja un error si la cantidad es incompatible con el tipo de operación
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Gestiona la retirada dependiendo de la cantidad elegida
 * @param cantidad determina la cantidad a retirar
 * @throws Exception arroja un error si la cantidad es incompatible con el tipo de operación
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * Devuelve el tipo de interés de la cuenta
 * @return
 */
	private double getTipoInterés() {
		return tipoInterés;
	}
	
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private String getCuenta() {
		return cuenta;
	}

	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
