package IgorAntonio;

import IgorAntonio.model.domain.Aluno;
import IgorAntonio.model.domain.Curso;
import IgorAntonio.model.domain.Disciplina;

public class Main {

	public static void main(String[] args) {
		
        Aluno aluno1 = new Aluno(1001, "João");
        Aluno aluno2 = new Aluno(1002, "Maria");
        Aluno aluno3 = new Aluno(1003, "Carlos");
        Aluno aluno4 = new Aluno(1004, "Ana");
        Aluno aluno5 = new Aluno(1005, "Pedro");
        
        Disciplina disciplina1 = new Disciplina(101, "Matemática");
        Disciplina disciplina2 = new Disciplina(102, "História");
        Disciplina disciplina3 = new Disciplina(103, "Geografia");
        
        Curso curso = new Curso(1, "Engenharia");
        
        curso.addAluno(aluno1);
        curso.addAluno(aluno2);
        curso.addAluno(aluno3);
        curso.addAluno(aluno4);
        curso.addAluno(aluno5);
        
        curso.addDisciplina(disciplina1);
        curso.addDisciplina(disciplina2);
        curso.addDisciplina(disciplina3);
        
        System.out.println(curso.exibirAlunos());
        
        System.out.println(curso.exibirGrade());
	}
}
