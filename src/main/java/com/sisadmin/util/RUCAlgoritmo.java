package com.sisadmin.util;

/**
 * RUCAlgoritmo
 * @author ciro
 *
 */
public class RUCAlgoritmo {
	
	public static boolean RUCBienFormado(String ruc){
		boolean estado = false;
		
		/*Validar longitud*/
		if(ruc.length() != 11){
			estado = false;
		}else {
			int digito01 = Integer.parseInt(ruc.substring(0, 1))*5;
			int digito02 = Integer.parseInt(ruc.substring(1, 2))*4;
			int digito03 = Integer.parseInt(ruc.substring(2, 3))*3;
			int digito04 = Integer.parseInt(ruc.substring(3, 4))*2;
			int digito05 = Integer.parseInt(ruc.substring(4, 5))*7;
			int digito06 = Integer.parseInt(ruc.substring(5, 6))*6;
			int digito07 = Integer.parseInt(ruc.substring(6, 7))*5;
			int digito08 = Integer.parseInt(ruc.substring(7, 8))*4;
			int digito09 = Integer.parseInt(ruc.substring(8, 9))*3;
			int digito10 = Integer.parseInt(ruc.substring(9, 10))*2;
			int digito11 = Integer.parseInt(ruc.substring(10, 11));
			
			/*Suma de dígitos*/
			int suma = digito01 + digito02 + digito03 + digito04 +digito05 +digito06 + digito07 + digito08 + digito09 + digito10 + digito11;
			
			/*residuo de suma y 11*/
			int residuo = suma % 11;
			
			/*Diferencia de 11 y residuo*/
			int resta = 11 - residuo;
			
			/*Validar resta*/
			int digitoChk = 0;
			if(resta == 10){
				digitoChk = 0;
			}else if(resta == 11){
				digitoChk = 1;
			}else{
				digitoChk = resta;
			}
			
			if(digito11 == digitoChk){
				estado = true;
			}
			else{
				estado = false;
			}
		}
		
		return estado;
	}

}
