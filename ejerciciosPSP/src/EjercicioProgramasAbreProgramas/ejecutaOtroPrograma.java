package EjercicioProgramasAbreProgramas;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ejecutaOtroPrograma{

	public static void main(String[] args) {
		/*
		 *
Implementa ahora otro programa en Java que ejecute el programa anterior y almacene la salida
estándar en un fichero mientras que la salida de error la ha de mostrar por la consola
(preferiblemente por la salida System.err) No modifiques el programa
		 */
		// TODO Auto-generated method stub
		ProcessBuilder pb = new ProcessBuilder("java" , "-jar", "D:\\PROGRAMACION SERVICIOS Y PROCESOS\\eclipse-workspace PSP\\ejerciciosPSP\\src\\EjercicioProgramasProgramas\\tareaProcesoAbreFichero.jar");
		File ficheroSalida= new File("D:\\PROGRAMACION SERVICIOS Y PROCESOS\\eclipse-workspace PSP\\ejerciciosPSP\\src\\EjercicioProgramasProgramas\\salidadelprograma.txt");
		pb.redirectOutput(ficheroSalida);
		try {
			Process proceso= pb.start();
			//proceso.waitFor(); //espera a que termine el proceso


			//cazar la salida de error del proceso y mostrarla por consola
			//InputStreamReader isr = new InputStreamReader(proceso.getErrorStream());
			InputStream in = proceso.getErrorStream();
			BufferedReader br = new BufferedReader( new InputStreamReader(in));
			String linea;
			while ((linea=br.readLine())!=null) {
				System.err.println(linea);
			}
			br.close();
			proceso.waitFor();
			
			
			
			
			//System.out.println("Proceso terminado");
			//Redirige la salida de error a un fichero
			//File ficheroError= new File("error.txt");
			//probuilder.redirectInput(ficheroSalida);
			//probuilder.redirectError(ficheroError);
			//proceso.getErrorStream();//cazar la salida de error del proceso
			//System.err.println(proceso.getErrorStream());
			
			
		}catch (IOException ioe)  { 
			//ioe.printStackTrace();
			System.err.println("ejecutarOtroPorgrama" +ioe.getMessage());
		} catch (InterruptedException ie) {
			// TODO Auto-generated catch block
			//ie.printStackTrace();
			System.err.println("ejecutarOtroPorgrama" +ie.getMessage());
		}
		System.out.println("Proceso terminado");
	}

}
