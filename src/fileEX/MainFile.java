package fileEX;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainFile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		String path = "C:\\Users\\sabal\\Documents\\Sauce\\srce.txt";
		String folderPath = "C:\\Users\\sabal\\Documents\\Sauce\\out";
		String output = "C:\\Users\\sabal\\Documents\\Sauce\\out\\saida.txt";
		File folder = new File(folderPath);
		
		List<Product> myList = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			
			while(line != null) {
				String field[] = line.split(", ");
				myList.add(new Product(field[0], Double.parseDouble(field[1]), Integer.parseInt(field[2])));
				line = br.readLine();
			}
			
			boolean wasFolderCreated = true;
			if(!folder.exists())
				wasFolderCreated = folder.mkdir();
			
			if(wasFolderCreated) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(output));
				for(Product x : myList) {
					bw.write(x.getName() + ", " + x.totalValue());
					bw.newLine();
				}
				bw.close();
			} else
				System.out.println("Error. The folder was not created");
			
			
		} catch(IOException	e) {
			System.out.println(e.getMessage());
		}
	}

}
