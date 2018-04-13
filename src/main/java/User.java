import java.util.Collections;

public class User implements Comparable {
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

	/**
	 * Compare deux User et retourne -1 si l'Objet passé en paramètre n'est pas un User
	 */
	public int compareTo(Object u) {
		if(u instanceof User)
			return this.getName().compareTo(((User)u).getName());
		return -1;
	}
	
}
