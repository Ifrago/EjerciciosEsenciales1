package edu.upc.eetac.dsa.ejerciciosesenciales;

import java.io.*;

public class Dato implements Serializable  {
	
	public int numero;
	public char caracter;
	public String texto;
	
	//Tenemos un constructor
	public Dato ( int newint, char newchar, String newString){
		numero=newint;
		caracter=newchar;
		texto=newString;
	}
	
}
