package ar.capacitacion.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author dan
 * 
 */
public class LectorArchivos {

	private static final String VACIO = " ";
	private File file;
	private FileReader fileReader;
	private BufferedReader buffer;
	private String lineaLeida;

	/**
	 * 
	 * @param pathFile
	 */
	public LectorArchivos(String pathFile) {
		super();
		file = new File(pathFile);
		try {
			fileReader = new FileReader(file);
		} catch (FileNotFoundException error) {
			System.out.println(error.getMessage());
		}
		buffer = new BufferedReader(fileReader);
	}

	/**
	 * Retorna las lineas de un archivo. TODO hay que cerrar archivo?
	 * 
	 * @return
	 */
	public List<String> leer() {
		List<String> lineasLeidas = new ArrayList<String>();
		try {
			while (buffer.ready()) {
				lineaLeida = buffer.readLine();
				if (!lineaLeida.equals(VACIO)){ 
					lineasLeidas.add(lineaLeida);	
				}
			}
			buffer.close();
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}

		return lineasLeidas;
	}

}
