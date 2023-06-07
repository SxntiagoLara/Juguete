package clases;

public class Juguete {
	
	private String nombre;
	private String precio;
	private String tamaño;
	private String material;
	private boolean estadoRobot;
	
	
	
	public Juguete () {
		
	}
	
	public Juguete (String nombre, String precio, String tamaño, String material){
		setNombre(nombre);
		setMaterial(material);
		setPrecio(precio);
		setTamaño(tamaño);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void encenderJuguete () {
		estadoRobot= true;
		System.out.println("El juguete se ha prendido");
	}
	
	public void apagarJuguete() {
		estadoRobot=false;
		System.out.println("el juguete se ha apagado");
	}
	
	public void moverBrazos () {
		if (estadoRobot) {
			System.out.println("Moviendo los brazos. ");
		}else {
			System.out.println("no fue posible Moverme.");
		}
	}
	
	public void encenderOjos() {
		if (estadoRobot) {
			System.out.println("encendiendo ojos...");
		}else {
			System.out.println("no tiene pilas...");
		}
	}

}
