// Nacimiento: 1 enero de 2020
// Objetivo: explorara con este archivo la manera de utilizar el sistema de contrl de cambio GIT


public class Hola{
	public static void main(String[] args){
		System.out.println("Hola GIT, bienvenido a mi conjunto de herramientas para programar");
		Objeto aplicacion = new Objeto ("Mauricio", 40);
		System.out.printf("El objeto creado tiene las siguinetes caracteristicas\nNombre: %s\nEdad: %d",aplicacion.getNombre(), aplicacion.getEdad());
		System.out.printf("El objeto creado tiene las siguinetes caracteristicas\nEdad: %s\nNombre: %d",aplicacion.getEdad(), aplicacion.getNombre());
	}
}


