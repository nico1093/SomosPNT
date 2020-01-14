package somospnt.ejercicio.productos;

public class Bebida extends Producto{
	private Double litros;
	
	public Bebida() { }
	
	public Bebida(String nombre, int precio, double contenido) {
		super(nombre, precio);
		this.litros = contenido;
	}

	public Double getLitros() {
		return litros;
	}

	public void setLitros(Double contenido) {
		this.litros = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + super.getNombre() + " /// Litros: " + this.litros + " /// Precio: $" + super.getPrecio();
	}

	

}
