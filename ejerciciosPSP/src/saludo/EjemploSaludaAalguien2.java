package saludo;
import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;

public class EjemploSaludaAalguien2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder probuilder = new ProcessBuilder();
		probuilder = probuilder.command("java","-jar","D:\\PROGRAMACION SERVICIOS Y PROCESOS\\eclipse-workspace PSP\\ejerciciosPSP\\src\\saludo\\saludaAalguien.jar"); 
		try {
			File fbat= new File("D:\\PROGRAMACION SERVICIOS Y PROCESOS\\eclipse-workspace PSP\\ejerciciosPSP\\src\\saludo\\entrada.txt");
			File fout = new File("D:\\PROGRAMACION SERVICIOS Y PROCESOS\\eclipse-workspace PSP\\ejerciciosPSP\\src\\saludo\\salida.txt");
			File ferror= new File("D:\\PROGRAMACION SERVICIOS Y PROCESOS\\eclipse-workspace PSP\\ejerciciosPSP\\src\\saludo\\error.txt");
			probuilder.redirectOutput(fbat);
			probuilder.redirectError(ferror);
			probuilder.redirectError(ferror);
			Process p= probuilder.start();
			
			
		}catch (Exception e)  { e.printStackTrace(); }

	}

}
