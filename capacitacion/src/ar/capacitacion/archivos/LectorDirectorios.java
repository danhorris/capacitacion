package ar.capacitacion.archivos;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author dan
 * 
 */
public class LectorDirectorios {

	/* directorio de archivos */
	private String dirPath;

	public LectorDirectorios(String dirPath) {
		super();
		this.dirPath = dirPath;
	}

	/**
	 * @return nombres de archivos en un directorio
	 */
	public List<String> obtenerArchivosDeDirectorio() {

		List<String> filenames = new ArrayList<String>();
		File folder = new File(dirPath);

		for (File file : folder.listFiles()) {
			filenames.add(file.getName());
		}
		return filenames;
	}

	public String getDirPath() {
		return dirPath;
	}

	public void setDirPath(String dirPath) {
		this.dirPath = dirPath;
	}

}
