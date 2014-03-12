package edu.upc.eetac.dsa.ejerciciosesenciales;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import edu.upc.eetac.dsa.ejerciciosesenciales.Dato;

public class Ejercicio7 {
	public static void main (String [] args){
		
		//Nuestro Objeto para escribiry leer.
		Dato date = new Dato(1,'a',"texto1");
		
		//Crear objetos de lectura de objeto.
		FileInputStream ObjetoIn = null;
		ObjectInputStream LecturaObj= null;
		
		//Crear objetos de escritura de objetos.
		FileOutputStream ObjetoOut=null;
		ObjectOutputStream EscrituraObj=null;
		
		try{
			
			//Indicamos el directorio con el objeto ObjectoOut.
			ObjetoOut=  new FileOutputStream("C:\\Users\\Iván\\DSAProjects\\ObjetoDSA.obj");
			//Creamos el Objetos àra la escritura.
			EscrituraObj= new ObjectOutputStream (ObjetoOut);
			
			//Escribrimos en el fichero nuestro Objeto.
			EscrituraObj.writeObject(date);
			
			//Indicamos el directorio donde leeremos el Objeto con ObjectInput
			ObjetoIn= new FileInputStream("C:\\Users\\Iván\\DSAProjects\\ObjetoDSA.obj");
			//Creamos el Objeto de lectura
			LecturaObj=new ObjectInputStream(ObjetoIn);
			
			//leemos el fichero, y lometemos en un String para poder printarlo.
			Dato DateRead = (Dato)LecturaObj.readObject();
			String Objtexto= DateRead.toString();
			
			
			//Printamos un texto y el objeto
			System.out.println("Hemos sacado el objeto: ");
			System.out.println(Objtexto);
			
			EscrituraObj.close();
			LecturaObj.close();			
		}catch(IOException ioe){
			ioe.printStackTrace();
		}catch(ClassNotFoundException cfe){
			cfe.printStackTrace();
		}catch(SecurityException se){
			se.printStackTrace();
		}catch(NullPointerException npe){
			npe.printStackTrace();
		}
		
		
		
	}

}
