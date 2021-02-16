package clases;

public class CapacidadEndedudamiento {
    Long ingresosTotales;
    Long gastosFijos;
    Long gastoVaribales;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase
    
    public Long getIngresosTotales() {
		return ingresosTotales;
	}

	public void setIngresosTotales(Long ingresosTotales) {
		this.ingresosTotales = ingresosTotales;
	}

	public Long getGastosFijos() {
		return gastosFijos;
	}

	public void setGastosFijos(Long gastosFijos) {
		this.gastosFijos = gastosFijos;
	}

	public Long getGastoVaribales() {
		return gastoVaribales;
	}

	public void setGastoVaribales(Long gastoVaribales) {
		this.gastoVaribales = gastoVaribales;
	}

	public double getPOR_FIJO() {
		return POR_FIJO;
	}
   

    //Construye un metodo que retorne una cadena con las propiedades de la clase
	
	public String getPropertiesClass() {
		return "\nIngresos Totales: "+getIngresosTotales()+
				"\nGastos Fijos: "+getGastosFijos()+
				"\nGastos Variables: "+getGastoVaribales()+
				"\nCapacidad Endeudamiento: "+getCapacidadEndeudamiento();
	}    

	public String getCapacidadEndeudamiento() {
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
    	return ""+(long)((getIngresosTotales()-(getGastosFijos()+getGastoVaribales()))*getPOR_FIJO());
    }
    
    public boolean validarCapEndeudamiento() {
    	if(Long.parseLong(getCapacidadEndeudamiento())>0) {
    		return true;
    	}
    	return false;
    }
	
}
