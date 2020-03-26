package projeto;

import java.util.ArrayList;
import java.util.Stack;

public class Teachers {

	private char id;
	private String name;
	private int phNo;
	private String Adress;
	private Admin contratante;
	private ArrayList<Students> alunos = new ArrayList<Students>();
	private Stack<TestPapers> provas = new Stack<TestPapers>();
	
	public Teachers(char id, String name, int phNo, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
		Adress = adress;
	}
	
	public void PrepareTestPaper(char id, String name, float duration, char classId) {
		TestPapers prova = new TestPapers(id,name,duration,classId);
		provas.add(prova);
	}
	
	public void MarkAttendance() {
		//TODO implements method MarkAttendance
	}
	
	public void CheckPapers() {
		//TODO implements method CheckPapers
	}
	
	public void PrepareReportCards() {
		//TODO implements method PrepareReportCards
	}
	
	public void DeclareResults() {
		//TODO implements method DeclareResults
	}
	
	public TestPapers getTestPapers() {
		return provas.peek();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teachers other = (Teachers) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
