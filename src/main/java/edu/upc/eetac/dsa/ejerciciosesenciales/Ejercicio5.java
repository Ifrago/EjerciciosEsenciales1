package edu.upc.eetac.dsa.ejerciciosesenciales;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio5 {

	public static void main (String [] args){
		FileInputStream f = null;
		FileOutputStream fe=null;
		BufferedInputStream lecturaimagen=null;
		BufferedOutputStream escrituraimagen=null;
		
		try{
			//Creamos objetos para poder leer el fichero
			f= new FileInputStream ("C:\\Users\\Iván\\DSAProjects\\Mina.jpg");
			lecturaimagen= new BufferedInputStream ( f);
			
			//Printamos la longitud de bytes que nos quedan por leer ( toda )
			System.out.println(lecturaimagen.available());
			
			//Construimos el atributo para almacenar longitud de bytes.
			int numbytes=lecturaimagen.available();

			//Sacamos la fecha
			Date fecha = new Date();
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/YYYY  HH: mm: ss");
			String fechastring = formato.format(fecha);
			System.out.println(fechastring);
			
			//Construimos el texto.
			String texto= "Mina "+fechastring+" "+ numbytes+" bytes.";
			
			//Decimos el directorio del nuevo archivo y procedemos a la escritura
			fe= new FileOutputStream("C:\\Users\\Iván\\DSAProjects\\registro.txt");
			escrituraimagen= new BufferedOutputStream (fe);
			
			//Al estar haciendo una salida de bytes, necesitamos transformar texto en bytes y escribimos.
			byte[] escribir = texto.getBytes();
			escrituraimagen.write(escribir);
			
			//Cerramos los buffers.
			lecturaimagen.close();
			escrituraimagen.close();
			
			}catch(FileNotFoundException e){
			System.err.println("Ocurrió un error: "+ e.getMessage());
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		
	}
}
