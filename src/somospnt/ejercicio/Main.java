package somospnt.ejercicio;

import somospnt.ejercicio.productos.Catalogo;

public class Main {

	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		catalogo.printCatalogo();
		System.out.println("==============================");
		catalogo.printProductoMasCaro();
		catalogo.printProductoMasBarato();
	}

}
