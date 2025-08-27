package com;

import java.io.FileReader;
import java.io.FileWriter;

public class CharacterWiseClasses {

	public static void main(String[] args) throws Exception{
	FileReader fr = new FileReader("D:\\Maven Plugins.txt");
	FileWriter fw = new FileWriter("demo.docx");
	int ch;
	while((ch=fr.read())!=-1) {
		fw.write(ch);
	}
	fr.close();
	fw.close();
	System.out.println("file copied");
	}

}
