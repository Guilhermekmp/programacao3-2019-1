package projeto;

public class Students {

	private char id;
	private String name;
	private int phNo;
	private String Adress;
	private Admin contratante;
	private Teachers professor;
	private Class classe;
	private TestPapers exame = professor.getTestPapers();
	
	public Students(char id, String name, int phNo, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
		Adress = adress;
	}
	
	public void FillAdmissionForm() {}
	public void GetEnrolled() {}
	public void WriteExam(TestPapers exam) {
		this.exame = exam;
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
		Students other = (Students) obj;
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
