package br.com.alura.argentum.bean;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.alura.argentum.indicadores.IndicadorFechamento;

public class TestaReflection {

	public static void main(String[] args) {

		Class<IndicadorFechamento> classe;
		try {
			classe = (Class<IndicadorFechamento>) Class.forName("br.com.alura.argentum.indicadores.IndicadorFechamento");
			
			IndicadorFechamento indicador = classe.newInstance();
			
			for (Field atributos : classe.getDeclaredFields()) {
				System.out.println(atributos);				
			}
			
			for (Method atributos : classe.getDeclaredMethods()) {
				System.out.println(atributos);				
			}


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
