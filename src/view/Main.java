package view;

import java.io.IOException;

import controller.Fruit;
import controller.IFruit;

public class Main {

	public static void main(String[] args) {
		IFruit arqCont = new Fruit();
		String path = "C:\\WINDOWS\\TEMP\\";
		String name = "generic_food.csv";
		try {
			arqCont.readDir(path);
			arqCont.readFile(path, name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
