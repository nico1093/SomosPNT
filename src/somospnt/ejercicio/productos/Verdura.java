package somospnt.ejercicio.productos;

public class Verdura extends Producto {
	private final String unidadDeVenta = "kilo";
	
	public Verdura(String nombre, int precio) {
		super(nombre, precio);
	}

	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}

	@Override
	public String toString() {
		return "Nombre: " + super.getNombre() + " /// Precio: $" + super.getPrecio() + " /// Unidad De Venta: " + this.unidadDeVenta;
	}
	
	

}
