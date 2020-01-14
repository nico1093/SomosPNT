package somospnt.ejercicio.productos;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	List<Producto> productos = new ArrayList<Producto>();
	
	public Catalogo() {
		productos.add(new Bebida("Coca-Cola Zero", 20, 1.5));
		productos.add(new Bebida("Coca-Cola", 18, 1.5));
		productos.add(new Higiene("Shampoo Sedal", 19, 500));
		productos.add(new Verdura("Frutillas", 64));
	}
	
	public Catalogo(ArrayList<Producto> lista) {
		this.productos = lista;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void addProductos(Producto producto) {
		productos.add(producto);
	}
	
	public Producto productoMasCaro() {
		Producto productoMasCaro = productos.get(0); 
		for(int i = 1; i < productos.size(); i++) {
			if(esMasCaro(i, productoMasCaro)) {
				productoMasCaro = productos.get(i);
			}
		}
		return productoMasCaro;
	}
	public Producto productoMasBarato() {
		Producto productoMasBarato = productos.get(0); 
		for(int i = 1; i < productos.size(); i++) {
			if(!esMasCaro(i, productoMasBarato)) {
				productoMasBarato = productos.get(i);
			}
		}
		return productoMasBarato;
	}
	
	public boolean esMasCaro(int i, Producto producto) {
		return producto.compareTo(productos.get(i)) > 0;
	}
	
	public void printCatalogo() {
		for(int i = 0 ; i < productos.size(); i++) {
			System.out.println(productos.get(i).toString());
		}
	}
	
	public void printProductoMasCaro() {
		System.out.println("Producto más caro: " + productoMasCaro().getNombre());
	}
	
	public void printProductoMasBarato() {
		System.out.println("Producto más barato: " + productoMasBarato().getNombre());
	}
}
