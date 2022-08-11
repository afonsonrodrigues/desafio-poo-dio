package com.dio;

import java.time.LocalDate;

import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
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
		
		/*
		 * System.out.println(curso1); System.out.println(curso2);
		 * System.out.println(mentoria1);
		 */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Develop");
		bootcamp.setDescricao("Descrição Bootcamp Java Develop");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devAfonso = new Dev();
		devAfonso.setNome("Afonso");
		devAfonso.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Afonso" + devAfonso.getConteudosInscritos());
		devAfonso.progredir();
		devAfonso.progredir();
		devAfonso.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos Afonso" + devAfonso.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Afonso" + devAfonso.getConteudosConcluidos());
		System.out.println("XP:" + devAfonso.calcularTotalXp());
		
		
		System.out.println("----------------");
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("--");
		System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
		System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
		System.out.println("XP:" + devCamila.calcularTotalXp());
		
	}

}
