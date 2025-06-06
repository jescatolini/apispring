package com.senac.apispring.aluno;

import com.senac.apispring.endereco.DadosEndereco;

public record DadosAtualizacaoAluno(
		
		Long id,
		
		String nome, 
		
		String email,
		
		String cpf,
		
		String matricula,
		
		Curso curso,
		
		DadosEndereco endereco
		
		){

}
