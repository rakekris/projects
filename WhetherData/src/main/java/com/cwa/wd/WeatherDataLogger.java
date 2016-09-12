package com.cwa.wd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WeatherDataLogger {
	private FileOutputStream fop;
	private File file;

	public void writeWeatherDataIntoFile(int entries) {
		try {
			file = new File("weatherdata.txt");
			fop = new FileOutputStream(file);
			if (!file.exists()) {
				file.createNewFile();
			}
			for(int i=0;i<=entries;i++){
			byte[] contentInBytes = WeatherDataGenerator.getWeatherData(entries).getBytes();
			fop.write(contentInBytes);
			}
			fop.flush();
			fop.close();

			System.out.println("The output file is in: "+file.getAbsolutePath());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
