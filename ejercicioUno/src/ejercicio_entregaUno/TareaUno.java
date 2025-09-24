package ejercicio_entregaUno;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TareaUno {

	public static void main(String[] args) {
		// Crea un programa en Java que guarde en un fichero la 
		//salida de los servicios que se están ejecutando en el 
		//sistema (el comando el Windows es "net start")
		//leemos el fichero F  datos,txt
		File servicios = new File("servicios.txt");
		
		try {
			BufferedWriter queSeEscribe = new BufferedWriter(new FileWriter(servicios));
			Runtime r = Runtime.getRuntime();    
			String[] comando= {"CMD", "/c", "net start"};
			Process p= r.exec(comando);
			try {	
				BufferedReader br = new BufferedReader (new InputStreamReader (p.getInputStream()));   
				//p = r.exec( comando );		                   
				String linea;
				while((linea = br.readLine())!=null) { //lee una l�nea del fichero 
					System.out.println(linea); 
					queSeEscribe.write(linea);
					queSeEscribe.newLine();
				}
				br.close();
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			
			// CONTROL DE LOS MENSAJES DE ERROR
			try {
				InputStream StreamError = p.getErrorStream();					
				BufferedReader brer = new BufferedReader(new InputStreamReader(StreamError));
				String liner = null;
				while ((liner = brer.readLine()) != null) {
					System.out.println("ERROR >" + liner);
				}
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			// COMPROBACION DE ERROR:  0 indica que ha terminado bien
			int exitVal;
			try {
				exitVal = p.waitFor();
				System.out.println("Valor de Salida: " + exitVal);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			queSeEscribe.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
