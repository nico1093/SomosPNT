package somospnt.ejercicio.productos;

public abstract class Producto implements Comparable<Producto> {
	private String nombre;
	private Integer precio;
	
	public Producto() { }
	
	public Producto(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	@Override
	public int compareTo(Producto o) {
		return this.precio < o.getPrecio() ? 1 : 0;
	}
	
}
