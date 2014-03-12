package edu.upc.eetac.dsa.ejerciciosesenciales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.text.*;

public class Ejercicio4 {
	public static void main (String [] args){
		File f = null;
		BufferedReader lectura= null;
		try{
			f= new File ("C:\\Users\\Iván\\DSAProjects\\registro.txt");
			lectura= new BufferedReader( new FileReader (f ) );
			String linea,texto=null;
			int numchar=0;
			while(lectura.ready()){
				linea=lectura.readLine();
				numchar=linea.length();
				System.out.println("El archivo tiene: "+linea.length()+" caracteres.");								
			}
			//Sacamos la fecha
			Date fecha = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY  HH: mm: ss");
			String fechastring = formato.format(fecha);
			System.out.println(fechastring);
			//Ahora procederemos a escribir en el fichero
			String nfichero="registro.txt";
			texto=" El fichero se llama: "+nfichero+" Tiene: "+ numchar+" caracteres. "+fechastring;
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Iván\\DSAProjects\\"+nfichero,true));//Al poner true, permitimos que se sobreescriba si el fichero ya existe
			bw.write(texto);
			bw.close();
			
			
			
		}catch(FileNotFoundException fnfe){
			System.err.println("Ocurrió un error: "+ fnfe.getMessage());
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}
		
		
	}

}
