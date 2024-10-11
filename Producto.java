package Ejercicio1;

public class Producto {
	
	private String nombre;
	private double precio;
	private int cantidadStock;

	public Producto(String nombre, double precio, int cantidadStock) {
		this.nombre=nombre;
		this.precio=precio;
		this.cantidadStock=cantidadStock;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		if(precio>0) {
			this.precio=precio;
		}else {
			System.out.println("El precio debe ser Positivo");
		}
	}
	
	public int getCantidadStock() {
		return cantidadStock;
	}
	
	public void setCantidadStock(int cantidadStock) {
		if(cantidadStock>0) {
			this.cantidadStock=cantidadStock;
		}else {
			System.out.println("La cantidad de Stock debe ser Positiva");
		}
	}
	 
	public void mostrarInfo() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Precio: " + precio);
	        System.out.println("Cantidad en stock: " + cantidadStock);
	    }
}
