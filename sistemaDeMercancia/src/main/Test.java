package main;

import modelo.*;

public class Test {

	public static void main(String[] args) throws Exception {
		System.out.println("\n");
		Servicio servicio = new Servicio("283754", "Mantenimiento de Hidrolavadora", 2500.0, 30.0, true);
		System.out.println("\n");
		Servicio servicio2 = new Servicio("2837545", "Mantenimiento de Hidrolavadora", 2500.0, 30.0, true);
		System.out.println(servicio2);
		System.out.println("\n");
		Producto producto = new Producto("387125", "Bolsas de Aspiradora 5 unidades", 450.0, 25.0, true);
		System.out.println("\n");
		Producto producto2 = new Producto("3871258", "Bolsas de Aspiradora 5 unidades", 450.0, 25.0, true);
		System.out.println(producto2);
		System.out.println("\n");
		System.out.println(servicio2.calcularPrecioFinal());
		System.out.println("\n");
		System.out.println(producto.calcularPrecioFinal());
		System.out.println("\n");
		Sistema sistema = new Sistema();
		sistema.agregarProducto("9739237", "Correa Lavarropa", 825.0, 15.0, true);
		sistema.agregarServicio("4829875","Mantenimiento de Moladora",3500.0,10.0,true);
		sistema.agregarProducto("2837181", "Selector de programas lavarropa",4550.0,15.0,false);
		sistema.agregarServicio("4780718","Limpieza y lubricación de maquina de coser",1250.0,10.0,false);
		System.out.println(sistema.toString());
		System.out.println("\n");
		sistema.agregarServicio("4829875","Mantenimiento de Moladora",3500.0,10.0,true);
		System.out.println("\n");
		sistema.agregarProducto("9739237", "Correa Lavarropa", 825.0, 15.0, true);
		System.out.println("\n");
		
	}

}
