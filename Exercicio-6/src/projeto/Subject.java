package projeto;

public class Subject {

	private char id;
	private String name;
	private char classId;
	private Admin contratante;
	
	public Subject(char id, String name, char classId) {
		super();
		this.id = id;
		this.name = name;
		this.classId = classId;
	}
	
	public void DisplaySubjects() {
		
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
		Subject other = (Subject) obj;
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
