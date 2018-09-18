package com.tronipm.correios.main;

import java.util.ArrayList;

import com.tronipm.correios.core.Correios;
import com.tronipm.correios.core.Endereco;

/**
 * 
 * @author Paulo Mateus
 * @email paulomatew@gmail.com
 * @project Correios
 *
 */
public class Principal {

	public static void main(String[] args) {
		Correios c = new Correios("25 de marco", false);
		//Correios c = new Correios("55295555", false);

		if(c.isValid()) {
			ArrayList<Endereco> end = c.getEnderecos();
			System.out.println("\n----ENCONTRADOS (" + end.size() + ")----");
			for(Endereco in : end) {
				System.out.println(in);
			}
		}
	}
}
