package procesos;
import clases.Juguete;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	HashMap<String, Juguete> mapJuguetes;
	Juguete juguete;
	
	String nombre, precio, tamaño, material, decision;
	int opcion;
	
	public Procesos () {
		mapJuguetes=new HashMap<>();
	}
	
	public void iniciar() {
		
		do {
			menu();
			switch (opcion) {
			case 1:ingresarJuguete();break;
			case 2:
				if(!mapJuguetes.isEmpty()) {imprimirJuguetes();}
				else {System.out.println("no hay jugutes así");}break;
			case 3:
				if(!mapJuguetes.isEmpty()) {imprimirJuguete();}
				else {System.out.println("no hay jugutes así");}break;
			case 4:
				JOptionPane.showMessageDialog(null, "Hasta luego");	break;

			default:JOptionPane.showMessageDialog(null, "todo bien o no?");
				break;
			}
		} while (opcion != 4);
		
		
	}
	
	public void menu() {
		String menu="----Menu---- \n";
		menu +="1. Registrar un Juguete. \n";
		menu +="2. Imprimir lista de los juguetes. \n";
		menu +="3. Buscar un Juguete. \n";
		menu +="4. salir. \n\n";
		menu += "Ingrese la opcion que desea \n";
		
		opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
		
	}
	
	public void ingresarJuguete () {
		do {
			nombre=JOptionPane.showInputDialog("Ingrese el nombre del juguete");
			precio=JOptionPane.showInputDialog("Ingrese el precio del juguete");
			tamaño=JOptionPane.showInputDialog("Ingrese el tamaño del juguete");
			material=JOptionPane.showInputDialog("Ingrese el material del juguete");
			
			juguete = new Juguete(nombre, precio, tamaño, material);
			mapJuguetes.put(nombre, juguete);
			
			decision ="Desea ingresar otro juguete? ";
		} while (decision.equalsIgnoreCase("si"));
		System.out.println(juguete);
	}
	
	public void imprimirJuguetes () {
		String mensaje="";
		
		for (String nombre: mapJuguetes.keySet()) {
			mensaje +="*************Juguete*************";
			mensaje+="\n Nombre Juguete: "+ juguete.getNombre();
			mensaje+="\n precio Juguete: " + juguete.getPrecio();
			mensaje+="\n tamaño Juguete: "+ juguete.getTamaño();
			mensaje+="\n material Juguete: "+juguete.getMaterial();
			mensaje+="\n **********************************";
			System.out.println(mensaje);
		}
	}
	
	public void imprimirJuguete() {
		String mensaje="";
		String nombreBuscar=JOptionPane.showInputDialog("Ingrese el nombre del juguete que desea. ");
		if (mapJuguetes.containsKey(nombreBuscar)) {
			mensaje += "******Info Juguete******\n";
			mensaje+="Nombre Juguete: "+ juguete.getNombre();
			mensaje+="\n precio Juguete: " + juguete.getPrecio();
			mensaje+="\n tamaño Juguete: "+ juguete.getTamaño();
			mensaje+="\n material Juguete: "+juguete.getMaterial();
			mensaje+="\n **********************************";
			
			JOptionPane.showMessageDialog(null, mensaje);
		
		}else {
			JOptionPane.showMessageDialog(null, "No tenemos juguetes con ese nombre.");

		}
	}
	
	
	
	
	
	
	

}
