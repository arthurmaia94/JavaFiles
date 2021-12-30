/*
 * CalcImc.java
 * 
 * Copyright 2021 Arthur Maia <contato.94tech@gmail.com>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class CalcImc {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = scan.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = scan.nextDouble();
		double calculo;
		
		calculo = peso / (altura * altura);
		int resultado = (int)calculo;		
		
		if(resultado < 18.5){
			System.out.println("Magreza, abaixo do peso ideal, IMC: "+resultado);
		} else if (resultado > 25) {
			System.out.println("Sobrepeso, acima do peso ideal, IMC: "+resultado);
		} else {
			System.out.println("Peso normal, IMC: "+resultado);
		}
	}
}

