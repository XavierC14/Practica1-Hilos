import java.util.*;

public class CFil extends Thread{
	
	int tiempo;
	String nombre;
	
	public CFil (String nombre) {
		this.nombre = nombre;
	}
	
	//gets
	
	public String getNombre(){
		return getNombre();
	}
	//sets
	
	public void setTemp(int tiempo) {
		this.tiempo = tiempo;
	}
	
	//constructor de las tareas concurentes
	
	public void run() {
		if (CFilPrincipal.elecion == 1) {
			funcion1();
		} else if (CFilPrincipal.elecion == 2){
			funcion2();
		} else if (CFilPrincipal.elecion == 3){
			funcion3();
		} else if (CFilPrincipal.elecion == 4){
			funcion4();
		}
	}
	
	public void funcion1() {
		
		for (int i = 0; i < 5; i ++) {
			try {
				sleep((this.tiempo));
				System.out.println(i + " " + this.nombre);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void funcion2() {
		for (int i = 0; i < 5; i ++) {
			try {
				sleep((this.tiempo));
				System.out.println(i + " " + this.nombre);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public void funcion3() {
		for (int i = 0; i < 5; i ++) {
			try {
				sleep((this.tiempo));
				System.out.println(i + " " + this.nombre);
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
	}
	
	public void funcion4() {
		for (int i = 0; i < 1; i ++) {
			try {
				sleep((this.tiempo));
				System.out.println(i + " " + this.nombre);
			} catch (Exception e) {
				System.out.println(e);
			}
		}	
	}
	
}
