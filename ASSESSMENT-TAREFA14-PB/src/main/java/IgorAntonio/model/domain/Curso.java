package IgorAntonio.model.domain;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private int codigo;
	private String nome;
	private List<Aluno> alunos;
	private List<Disciplina> disciplinas;
	
	
	public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.disciplinas = new ArrayList<>();
    }
	
	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
	
	public String exibirAlunos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alunos do Curso ").append(nome).append(":\n");
        for (Aluno aluno : alunos) {
            sb.append("- ").append(aluno.getNome()).append("\n");
        }
        return sb.toString();
    }
    
    public String exibirGrade() {
        StringBuilder sb = new StringBuilder();
        sb.append("Grade do Curso ").append(nome).append(":\n");
        for (Disciplina disciplina : disciplinas) {
            sb.append("- ").append(disciplina.getNome()).append("\n");
        }
        return sb.toString();
    }
	    

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
