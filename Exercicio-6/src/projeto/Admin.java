package projeto;

import java.util.HashSet;

public class Admin {

	private char id;
	private String name;
	private String password;
	private HashSet<Teachers> professoresContratados = new HashSet<Teachers>();
	private HashSet<Students> estudantesMatriculados = new HashSet<Students>();
	private HashSet<Subject> materias = new HashSet<Subject>();
	private HashSet<Division> divisoes = new HashSet<Division>();
	private HashSet<Class> classes = new HashSet<Class>();
	
	public Admin(char id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public void Login(String name, String password) {
		//TODO implements method Login
	}
	
	public void Logout() {
		//TODO implements method Logout
	}
	
	public void AddNewTeachers(Teachers professor) {
		professoresContratados.add(professor);
	}
	
	public void ModifyTeacher(Teachers novoProfessor) {
		if(professoresContratados.contains(novoProfessor)) {
			professoresContratados.remove(novoProfessor);
			professoresContratados.add(novoProfessor);
		}
		else{
			System.out.println("Professor(a) não encontrado(a)");
		}
	}
	public void AddNewStudents(Students aluno) {
		estudantesMatriculados.add(aluno);
	}
	
	public void ModifyStudents(Students aluno) {
		if(estudantesMatriculados.contains(aluno)) {
			estudantesMatriculados.remove(aluno);
			estudantesMatriculados.add(aluno);
		}
		else{
			System.out.println("Aluno(a) não encontrado(a)");
		}
	}
	public void AddNewSubject(Subject assunto) {
		materias.add(assunto);
	}
	
	public void ModifySubject(Subject assunto) {
		if(materias.contains(assunto)) {
			materias.remove(assunto);
			materias.add(assunto);
		}
		else{
			System.out.println("Matéria não encontrada");
		}
	}
	public void AddNewDivision(Division divisao) {
		divisoes.add(divisao);
	}
	
	public void ModifyDivision(Division divisao) {
		if(divisoes.contains(divisao)) {
			divisoes.remove(divisao);
			divisoes.add(divisao);
		}
		else{
			System.out.println("Divisão não encontrada");
		}
	}
	public void AddNewClass(Class classe) {
		classes.add(classe);
	}
	
	public void ModifyClass(Class classe) {
		if(classes.contains(classe)) {
			classes.remove(classe);
			classes.add(classe);
		}
		else{
			System.out.println("Classe não encontrada");
		}
	}
	
	
}
