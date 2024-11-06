package br.com.e2etreinamentos.projeto.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.e2etreinamentos.projeto.api.model.Aluno;
import br.com.e2etreinamentos.projeto.api.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	//Listar todos os alunos
	public List<Aluno> listarTodos(){
		return alunoRepository.findAll();
	}
	
	public Optional<Aluno> consultarPorCpf(String cpf){
		return alunoRepository.findCpf(cpf);

	}	
	
	public void cadastrar(Aluno aluno) {
		alunoRepository.save(aluno);
	}
	
	public void excluir(String cpf) {
		alunoRepository.findCpf(cpf).ifPresent(alunoRepository::delete); // A função dos :: é que se o cpf é presente no repositório ele executa, no caso aqui quero deletar
	}
	
	
	

	
	}
		
		
