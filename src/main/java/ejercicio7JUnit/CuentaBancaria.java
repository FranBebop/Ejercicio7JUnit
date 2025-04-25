package ejercicio7JUnit;

public class CuentaBancaria {
	private double saldo;
	
	public CuentaBancaria(double saldo)
	{
		if (saldo < 0) saldo = 0;
		this.saldo = saldo;  
	}
	
	public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double cantidad) {
        if (cantidad <= 0) return false;
        saldo += cantidad;
        return true;
    }

    public boolean retirar(double cantidad) {
        if (cantidad <= 0 || cantidad > saldo) return false;
        saldo -= cantidad;
        return true;
    }
}
