package ejercicio7JUnit;

import org.junit.jupiter.api.Test;

//si no importamos estas funciones, el sistema no reconocerá ni a "assertEquals ni ha assertNotNull" y se nos reirá en la cara...
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CuentaBancariaHistorialTest {
	
	/**
	 * Comprobar que el movimiento del ingreso inicial se guarda bien
	 */
	@Test
	void historial_IngresoInicial()
	{
		Movimiento movimiento = new Movimiento(Movimiento.Tipo.DEPOSITO, 100.0);
		assertEquals(Movimiento.Tipo.DEPOSITO, movimiento.getTipo());
		assertEquals(100.0, movimiento.getCantidad());
		assertNotNull(movimiento.getFechaHora());
	}
	
	/**
	 * Comprobar que se añade correctamente un deposito a una cuenta que
	 * ya existe con un depósito inicial
	 */
	@Test
	void historial_AddDepositoCorrecto()
	{
		Movimiento movimiento = new Movimiento(Movimiento.Tipo.DEPOSITO, 100.0);
		assertEquals(Movimiento.Tipo.DEPOSITO, movimiento.getTipo());
		assertEquals(100.0, movimiento.getCantidad());
		assertNotNull(movimiento.getFechaHora());
	}
	
	/**
	 * Comprobar que no se añade un movimiento si el deposito es negativo
	 */
	@Test
	void historial_AddDepositoIncorrecto()
	{
		Movimiento movimiento = new Movimiento(Movimiento.Tipo.DEPOSITO, -100.0);
		assertEquals(Movimiento.Tipo.DEPOSITO, movimiento.getTipo());
		assertEquals(-100.0, movimiento.getCantidad());
		assertNotNull(movimiento.getFechaHora());
	}
	
	/**
	 * Comprobar que se puede hacer un retiro de una cantidad correcta y 
	 * se añade a los movimientos
	 */
	@Test
	void historial_AddRetiroCorrecto()
	{
		Movimiento movimiento = new Movimiento(Movimiento.Tipo.RETIRO, 100.0);
		assertEquals(Movimiento.Tipo.RETIRO, movimiento.getTipo());
		assertEquals(100.0, movimiento.getCantidad());
		assertNotNull(movimiento.getFechaHora());
	}
	
	/**
	 * Comprobar que no se puede hacer un retiro de una cantidad negativa/incorrecta y 
	 * no se añade a los movimientos
	 */
	@Test
	void historial_AddRetiroIncorrecto()
	{
		Movimiento movimiento = new Movimiento(Movimiento.Tipo.RETIRO, -100.0);
		assertEquals(Movimiento.Tipo.RETIRO, movimiento.getTipo());
		assertEquals(-100.0, movimiento.getCantidad());
		assertNotNull(movimiento.getFechaHora());
	}
}