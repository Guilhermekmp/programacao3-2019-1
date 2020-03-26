package projeto;

public class TestPapers {

	private char id;
	private String name;
	private float duration;
	private char classId;
	private Teachers autor;

	public TestPapers(char id, String name, float duration, char classId) {
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.classId = classId;
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
		TestPapers other = (TestPapers) obj;
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
