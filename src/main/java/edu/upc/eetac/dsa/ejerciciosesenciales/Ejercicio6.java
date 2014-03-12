package edu.upc.eetac.dsa.ejerciciosesenciales;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Ejercicio6 {
	public static void main (String [] args){
		//Tipo texto
		File archivotexto = null;
		BufferedReader lecturatexto= null;
		//Tipo byte
		FileInputStream archivobyte=null;
		BufferedInputStream lecturabyte=null;
		
		try{
			//Indicamos el directorio del archivo en cada forma de leerlo
			archivotexto= new File ("C:\\Users\\Iván\\DSAProjects\\registro.txt");
			archivobyte = new FileInputStream("C:\\Users\\Iván\\DSAProjects\\registro.txt");

			//Variable para leer el archivo en cada forma
			lecturatexto= new BufferedReader( new FileReader (archivotexto) );
			lecturabyte = new BufferedInputStream ( archivobyte);
			
			//Variable para leer linea a linea
			String lineatexto;
			int numbytes=0, numchar=0;
			
			//Leemos el archivo registro.txt por caracteres
			while(lecturatexto.ready()){
				lineatexto=lecturatexto.readLine();
				numchar=numchar+lineatexto.length();
			}
			
			//Miramos el tamaño en bytes del archivo
			numbytes=archivobyte.available();
			
			//Visualizamos  el resultado
			System.out.println("El archivo tiene: "+numchar+" y "+numbytes+" bytes.");
	
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}catch(IOException e1){
			e1.printStackTrace();
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}
	}

}
