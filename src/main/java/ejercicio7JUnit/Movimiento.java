package ejercicio7JUnit;

import java.time.LocalDateTime;

public class Movimiento {
	enum Tipo {DEPOSITO, RETIRO};
	
	private Tipo tipo;
	private double cantidad;
	private LocalDateTime fechaHora;
	
	public Movimiento(Tipo tipo, double cantidad) {
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.fechaHora = LocalDateTime.now();
	}

	public Tipo getTipo() {
		return tipo;
	}

	public double getCantidad() {
		return cantidad;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	@Override
	public String toString() {
		return "Tipo=" + tipo + " de " + cantidad + " € - " + fechaHora;
	}
	
	
}
