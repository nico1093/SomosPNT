package somospnt.ejercicio.productos;

public class Higiene extends Producto {
	private Integer contenido;
	
	public Higiene() { }
	
	public Higiene(String nombre, int precio, int contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	public Integer getContenido() {
		return contenido;
	}

	public void setContenido(Integer contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "Nombre: " + super.getNombre() + " /// Contenido: " + this.contenido + " /// Precio: $" + super.getPrecio();
	}
	
	
}
