import java.io.BufferedWriter;
import java.io.File;
import java.io.OutputStreamWriter;

public class EjemploSaludaAalguien2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessBuilder probuilder = new ProcessBuilder();
		probuilder = probuilder.command("java","-jar","saludaAalguien.jar"); 
		try {
			File fbat= new File("entrada.txt");
			File fout = new File("salida.txt");
			File ferror= new File("error.txt");
			probuilder.redirectOutput(fbat);
			probuilder.redirectError(ferror);
			probuilder.redirectError(ferror);
			Process p= probuilder.start();
			
			
		}catch (Exception e)  { e.printStackTrace(); }

	}

}
