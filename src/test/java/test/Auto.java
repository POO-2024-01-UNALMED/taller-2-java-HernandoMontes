package test;

public class Auto {
	public String modelo;
	public int precio;
	public Asiento[] asientos;
	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos() {
		
		int cantAsientos = 0;
		
		for (int i = 0; i < this.asientos.length; i++) {
			
			if (this.asientos[i] != null) {
				
				cantAsientos++;
			}
		}
		
		return cantAsientos;
		
	}
	
	 String verificarIntegridad() {
	    
	        if (registro == this.motor.registro) {
	        
	            for (int n = 0; n < this.asientos.length; n++){
	            
	                if (this.asientos[n] !=null) {
	                
	                    if (asientos[n].registro!=this.registro) {
	                    
	                        return "Las piezas no son originales";
	                    }
	                }
	            }return "Auto original";
	        }
	        else {
	        
	            return "Las piezas no son originales";
	        }
	    }
	}
