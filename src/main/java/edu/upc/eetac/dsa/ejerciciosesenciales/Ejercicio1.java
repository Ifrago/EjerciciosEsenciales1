package edu.upc.eetac.dsa.ejerciciosesenciales;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import edu.upc.eetac.dsa.ejerciciosesenciales.BigNumberException;

public class Ejercicio1 {
	public static void main (String [] args) throws BigNumberException{
		File f =null; 
		BufferedReader entrada=null;
		try{
			f=new File("C:\\Users\\Iván\\numeros.txt");
			entrada = new BufferedReader( new FileReader (f ) );
			String linea;
			while(entrada.ready()){
				linea=entrada.readLine();
				String [] datos = linea.split(" ");
				int [] numeros= new int [datos.length];
				for(int i=0; i<datos.length;i++){
					numeros[i]= Integer.parseInt(datos[i]);
					if(numeros[i]>1000)
						throw new BigNumberException();
					System.out.println(numeros[i]);
				}
			}
		}catch(FileNotFoundException e){
			System.err.println("Ocurrió un error: "+ e.getMessage());
		}catch(IOException e1){
			e1.printStackTrace();
		}catch(NullPointerException npe){
			npe.printStackTrace();			
		}catch(BigNumberException bne){
			bne.printStackTrace();
		}finally{
			try{
			entrada.close();
			System.out.println("Fichero correctamente cerrado");
			}catch(IOException e3){
				e3.printStackTrace();
			}
		}
	
	}
}
