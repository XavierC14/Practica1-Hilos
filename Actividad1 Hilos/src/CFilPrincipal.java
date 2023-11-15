import java.util.Iterator;
import java.util.Scanner;

public class CFilPrincipal  {
	
	public static int elecion;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		CFil padre, hijo;		
		
		System.out.println("Elige que funcion desea ejecutar:");
		
		System.out.println("1- Primera funcion \n 2- Segunda funcion \n 3- Tercera funcion \n 4- Cuarta funcion");
		
		elecion = sc.nextInt();
				
		if (elecion == 1) {
			padre = new CFil("Padre");
			hijo = new CFil("Hijo");
			padre.setTemp(10000);
			hijo.setTemp(2000);
			
			padre.start();
			hijo.start();
		} else if (elecion == 2){
			padre = new CFil("Padre");
			hijo = new CFil("Hijo");
			padre.setTemp(2000);
			hijo.setTemp(10000);
			
			padre.start();
			hijo.start();
		} else if (elecion == 3){
			padre = new CFil("Padre");
			hijo = new CFil("Hijo");
			padre.setTemp(2000);
			hijo.setTemp(1000);
			
			hijo.start();

			
			try {
				hijo.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			padre.start();
			
		} else if (elecion == 4){
			
			int procesos;
						
			padre = new CFil("Padre");
			hijo = new CFil("Hijo");
			
			System.out.println("Introduzca la cantidad de procesos que quiera ejecutar: ");
			procesos = sc.nextInt();
			
			CFil [] hijos = new CFil[procesos];
			
			for (int i = 0; i < procesos ; i++) {
				hijos[i] = new CFil("Hijo" + i);
	
				hijos[i].setTemp(i * 1000);
				
				hijos[i].start();
				
				try {
					hijos[i].join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			padre.start();
			
		}
		
		//tarea.start();
		//tarea2.start();
		
		
}

}
