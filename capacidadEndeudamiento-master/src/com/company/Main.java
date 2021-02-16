package com.company;

import clases.CapacidadEndedudamiento;
import clases.Message;
import java.util.Scanner;

public class Main {
    //Recuerda que aca empieza todo
	static Message message = new Message();
	
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
    	CapacidadEndedudamiento ca = new CapacidadEndedudamiento();	
        Scanner in = new Scanner(System.in);
       
        String ingMesuales, gastFijos, gasVariable;
        String entrada = "SI";
        
        while (entrada.equals("SI")) {
            System.out.println(message.ingresosMensuales);
            ingMesuales = in.nextLine();
            System.out.println(message.gastosFijos);
            gastFijos = in.nextLine();           
            System.out.println(message.gastosVariable);
            gasVariable = in.nextLine(); 
            System.out.println("");
            
            if(!(isNumeric(ingMesuales)&&isNumeric(gastFijos)&&isNumeric(gasVariable))) {
        		System.out.println(message.errorNumber);
        		System.out.println("");
        		
            }else {
            	 ca.setIngresosTotales(Long.parseLong(ingMesuales));
                 ca.setGastosFijos(Long.parseLong(gastFijos));
                 ca.setGastoVaribales(Long.parseLong(gasVariable));
                 
                 
                 if(ca.validarCapEndeudamiento()) {
                	 System.out.println(message.messageYesEndeu);
                	 System.out.println(ca.getPropertiesClass());
                	
                 }else {
                	 System.out.println(message.messageNoEndeu);
                	 System.out.println(ca.getPropertiesClass());                	
                 }
                 entrada="NO";
            }         
            
        }
        
        in.close();
    }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
    	try {
   		 	Double.parseDouble(value);
   		 	return true;
    	}catch(Exception ex) {
    		return false;
    	}
    }
}
