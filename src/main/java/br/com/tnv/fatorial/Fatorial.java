package br.com.tnv.fatorial;

public class Fatorial {
	
	
	public static Integer calcularFatorial(Integer numero) {
		
		Integer fatorial = 1;
		
		if(numero == 0)
			return 1;
		
		for (int i = 1; i <= numero ; i++) {		
			
			fatorial = fatorial * i;			
		}
		
		return fatorial;
	}
	
	

}
