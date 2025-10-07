package EjercicioProgramasProgramas;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;

public class tareaProcesoJAbreProcesoJ {

	public static void main(String[] args) {
		/*
		 * Crea un programa en Java que lea las líneas de un fichero y
		 *  las muestre por pantalla,
 por la salida estándar y si se produce algún error que salga por la salida de error.
		 */
		// Fichero del que queremos leer

		File mifichero = new File ("D:\\PROGRAMACION SERVICIOS Y PROCESOS\\eclipse-workspace PSP\\ejerciciosPSP\\src\\EjercicioProgramasProgramas\\saludo.txt");
		try {
			FileReader lector = new FileReader(mifichero);

			// ahora voy a leer utilizando un buffer
			BufferedReader cestaTemporal = new BufferedReader(lector);

			String linea = cestaTemporal.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = cestaTemporal.readLine();
			}
			cestaTemporal.close();
		} catch (IOException e) {
			//e.printStackTrace();
			System.err.println("LEER FICHERO "+e.getMessage());//salida estandar
		}

		/*
Después tendremos que compilar este programa y convertirlo a un archivo .jar (ejecutable)
		 */


		/*
		 *
Implementa ahora otro programa en Java que ejecute el programa anterior y almacene la salida
estándar en un fichero mientras que la salida de error la ha de mostrar por la consola
(preferiblemente por la salida System.err) No modifiques el programa
		 */
		//cualquier modificacion se debe generar un nuevo jar
	}

}
