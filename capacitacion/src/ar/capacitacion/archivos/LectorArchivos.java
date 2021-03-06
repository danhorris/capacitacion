package ar.capacitacion.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que retorna las lineas no vacias de un archivo con un path especifico.
 * 
 * @author dan
 * 
 */
public class LectorArchivos {

	private static final String VACIO = "";
	private File file;
	private FileReader fileReader;
	private BufferedReader buffer;
	private String lineaLeida;
	private String regExp;

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
	 * Recorre archivo separando las lineas vacias.
	 * <p>
	 * Retorna las lineas de un archivo.
	 * 
	 * @return
	 */
	public List<String> leer() {
		List<String> lineasLeidas = new ArrayList<String>();
		try {
			while (buffer.ready()) {
				lineaLeida = buffer.readLine();
				lineaLeida = lineaLeida.trim();
				if (!lineaLeida.equals(VACIO)) {
					lineasLeidas.add(lineaLeida);
				}
			}
			buffer.close();
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}
		return lineasLeidas;
	}

	/**
	 * @param regex
	 * @return
	 */
	public List<String> leerFiltrandoPorRexExp() {
		List<String> lineasLeidas = new ArrayList<String>();
		try {
			while (buffer.ready()) {
				lineaLeida = buffer.readLine().trim();
				if (lineaLeida.matches(regExp)) {
					lineasLeidas.add(lineaLeida);
				}
			}
			buffer.close();
		} catch (IOException error) {
			System.out.println(error.getMessage());
		}
		return lineasLeidas;
	}

	public String getRegExp() {
		return regExp;
	}

	public void setRegExp(String regExp) {
		this.regExp = regExp;
	}

}
