/**
 * 
 */
package ejercicio7JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio7JUnit.CuentaBancaria;


public class CuentaBancariaTest {
	
	@Test
	public void crearCuenta_ConSaldoInicialPositivo()
	{
		CuentaBancaria cuenta = new CuentaBancaria(100);
		assertEquals(100, cuenta.getSaldo());
	}
	
	@Test
	public void crearCuenta_ConSaldoInicialNegativo()
	{
		CuentaBancaria cuenta = new CuentaBancaria(-100);
		assertEquals(0, cuenta.getSaldo());
	}
	
	@Test
    void depositar_CantidadPositiva() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        boolean resultado = cuenta.depositar(25.0);
        assertTrue(resultado);
        assertEquals(125, cuenta.getSaldo());
    }

	@Test
    void depositar_CantidadNegativa() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        boolean resultado = cuenta.depositar(-25);
        assertFalse(resultado);
        assertEquals(100, cuenta.getSaldo());
    }
	
	@Test
    void retirar_CantidadValida() {
        CuentaBancaria cuenta = new CuentaBancaria(100.0);
        boolean resultado = cuenta.retirar(40.0);
        assertTrue(resultado);
        assertEquals(60.0, cuenta.getSaldo());
    }
	
	 @Test
    void retirar_CantidadMayorQueSaldo() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        boolean resultado = cuenta.retirar(125);
        assertFalse(resultado);
        assertEquals(100, cuenta.getSaldo());
    }

    @Test
    void retirar_CantidadNegativa() {
        CuentaBancaria cuenta = new CuentaBancaria(100);
        boolean resultado = cuenta.retirar(-25);
        assertFalse(resultado);
        assertEquals(100, cuenta.getSaldo());
    }

}
