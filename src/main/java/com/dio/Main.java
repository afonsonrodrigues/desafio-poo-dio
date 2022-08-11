package com.dio;

import java.time.LocalDate;

import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		
		curso1.setTitulo("curso de java");
		curso1.setDescricao("descrição do curso de java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("curso de js");
		curso2.setDescricao("descrição do curso de js");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria1 = new Mentoria();
		
		mentoria1.setTitulo("mentoria java");
		mentoria1.setDescricao("descrição da mentoria java");
		mentoria1.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
	}

}
