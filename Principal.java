package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Producto>ListaProductos = new ArrayList<>();
		
		ListaProductos.add(new Producto("Television", 1500, 10));
		ListaProductos.add(new Producto("Laptop", 2000, 15));
		ListaProductos.add(new Producto("Cama", 3500, 20)); 
		
		for(Producto producto : ListaProductos) {
			producto.mostrarInfo();
			System.out.println("----------");
		}
		
		ListaProductos.get(0).setPrecio(1700);
		
		System.out.println("Informacion Actualizada del producto televisión");
		for(Producto producto: ListaProductos) {
			producto.mostrarInfo();
		}
		
		ListaProductos.remove(0);
		
		System.out.println("Informacion de Productos después de la eliminación");
		for(Producto producto : ListaProductos) {
			producto.mostrarInfo();
		}
	      
		String nombreBusqueda=JOptionPane.showInputDialog("Ingrese el nombre del producto");

		 boolean productoEncontrado = false;
		 
	         for(Producto producto: ListaProductos) {
	                if(producto.getNombre().equals(nombreBusqueda)) {
	                    System.out.println("\nProducto encontrado:");
	                    producto.mostrarInfo();
	                    productoEncontrado = true;
	                    return; 
	                
	             }
	         }
	         
        	if (!productoEncontrado) {
            System.out.println("Producto no encontrado.");
        }
	         
    }
	
}

//		Producto Producto1 = new Producto("Laptop", 1500, 10);
//		
//		Producto1.mostrarInfo();
//		
//		Producto Producto2 = new Producto("Televisor", 2000, 15);
//		Producto2.mostrarInfo();
//		
//		Producto2.setNombre("Cama");
//		Producto2.setPrecio(3500);
//		Producto2.setCantidadStock(20);
//	
//		Producto2.mostrarInfo();

