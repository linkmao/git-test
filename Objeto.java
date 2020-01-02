
public class Objeto{
	private String nombre;
	private int edad;

	public Objeto(){
		this ("",0);
	}

	public Objeto (String name, int age){
		setNombre(name);
		setEdad(age);
	}

	public void setNombre(String name){
		nombre=name;
	}

	public void setEdad (int age){
		edad=age;
	}

	public String getNombre(){
		return nombre;
	}

	public int getEdad(){
		return edad;
	}
}