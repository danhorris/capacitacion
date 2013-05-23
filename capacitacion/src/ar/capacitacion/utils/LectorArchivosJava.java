package ar.capacitacion.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Clase encargada de leer archivos usando la librerias de JAVA
 * 
 * @author dan
 * 
 */
public class LectorArchivosJava {

	public static void main(String[] arg) {
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			/*
			 * Apertura del fichero y creacion de BufferedReader para poder
			 * hacer una lectura comoda (disponer del metodo readLine()).
			 */
			
//			LectorArchivosJava.class.getClassLoader().getResourceAsStream("//resources/archivo.txt");
//			archivo = new File("C:\\Users\dan\Documents\GitHub\capacitacion\capacitacion\resources\archivo.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			/*
			 * En el finally cerramos el fichero, para asegurarnos que se cierra
			 * tanto si todo va bien como si salta una excepcion.
			 */
			try {
				if (null != fr) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
