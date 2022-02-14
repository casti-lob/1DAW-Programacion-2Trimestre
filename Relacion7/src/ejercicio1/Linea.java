package ejercicio1;

import java.util.Objects;

public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;
	
	//Constructor
	public Linea() {
		super();
		this.puntoA = new Punto(0, 0);
		this.puntoB = new Punto(0, 0);
	}

	public Linea(Punto puntoA, Punto puntoB) {
		super();
		this.puntoA = new Punto(puntoA.getX(),puntoA.getY());
		this.puntoB = new Punto(puntoB.getX(),puntoB.getY());
	}
	
	//Get & Set
	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	//equals
	@Override
	public int hashCode() {
		return Objects.hash(puntoA, puntoB);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linea other = (Linea) obj;
		return Objects.equals(puntoA, other.puntoA) && Objects.equals(puntoB, other.puntoB);
	}
	
	//Metodos
	public void moverDerecha(double valor) throws LineaException {
		if(valor <=0) {
			throw new LineaException("0001-No se pueden poner valores inferiores a 1");
		}else {
			puntoA.setX(puntoA.getX()+valor);
			puntoB.setX(puntoB.getX()+valor);
		}
		
	}
	
	public void moverIzquierda(double valor)throws LineaException{
		if(valor <=0) {
			throw new LineaException("0001-No se pueden poner valores inferiores a 1");
		}else {
			puntoA.setX(puntoA.getX()-valor);
			puntoB.setX(puntoB.getX()-valor);
		}
	}
	
	public void moverArriba(double valor)throws LineaException{
		if(valor <=0) {
			throw new LineaException("0001-No se pueden poner valores inferiores a 1");
		}else {
			puntoA.setY(puntoA.getY()+valor);
			puntoB.setY(puntoB.getY()+valor);
		}
	}
	public void moverAbajo(double valor)throws LineaException{
		if(valor <=0) {
			throw new LineaException("0001-No se pueden poner valores inferiores a 1");
		}else {
			puntoA.setY(puntoA.getX()-valor);
			puntoB.setY(puntoB.getX()-valor);
		}
	}
	public String mostrarLinea() {
		return "["+getPuntoA()+","+getPuntoB()+"]";
	}
	@Override
	public String toString() {
		return "Linea [puntoA=" + puntoA + ", puntoB=" + puntoB + "]";
	}
	
	
	
	
	
}
