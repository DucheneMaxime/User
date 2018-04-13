
public class User {
	private String name;
	private Integer age;
	private boolean isMale;
	
	public User() {
		this("", 0, true);
	}
	
	public User(String name, Integer age, boolean isMale) {
		this.name=name;
		this.age=age;
		this.isMale=isMale;
	}
	
	/**
	 * Compare deux User par leurs noms
	 * @param Premier User
	 * @param Second User à comparer au premier
	 * @return 1 si le premier User est alphabeticalement inférieur, -1 sinon
	 */
	public static int compareTo (User u1, User u2) {
		if(u1.getName().compareTo(u2.getName())>0)
			return 1;
		else
			return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String toString() {
		return "User [name=" + name + ", age=" + age + ", isMale=" + isMale + "]";
	}
	
}
