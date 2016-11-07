import java.io.*;
import java.util.*;

public class CSVParser {
	static String pathToFile;
	static BufferedReader reader;
	static ArrayList<String> lineArray;

	public CSVParser(String filePath){
		pathToFile = filePath;
		reader = new BufferedReader(new FileReader(pathToFile));
	}

	public static void readCSVFile(){
		try {
			String lineRead;
			while(lineRead = reader.readLine() != null){
				System.out.println(csvToArrayList(readLine));
			}
		} catch (IOException e){
			System.out.println(e);
		}
		
	}

	public static ArrayList<String> csvToArrayList(String csvLine){

		if(csvLine != null){
			String[] splitData = csvLine.split("\\s*,\\s*");
			for(int i = 0; i < splitData.length; i++){
				if(!(splitData[i] == null) || splitData[i].length == 0){
					this.lineArray.add(splitData[i].trim());
				}
			}
		}
		return lineArray;
	}


} 