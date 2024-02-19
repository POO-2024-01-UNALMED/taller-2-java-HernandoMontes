package test;
public class Auto{
	 String modelo;
	 int precio;
	 Asiento[] asientos;
	 String marca;
	 Motor motor;
	 int registro;
	 static int cantidadCreados;
	
	 int cantidadAsientos(){
		int suma = 0;
		
		for (int i=0; i < asientos.length ; i++) {
			
			if (asientos[i] !=null) {
				
				suma++;
			}
		}
		
		return suma;
		
	}
	
	 String verificarIntegridad() {
	    
	        if (registro==this.motor.registro) {
	        
	            for (int n =0; n<asientos.length; n++){
	            
	                if (asientos[n]!=null) {
	                
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
