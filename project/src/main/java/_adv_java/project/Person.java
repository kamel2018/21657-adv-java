package _adv_java.project;

public class Person {
	private String Name;
	private String Sex;
	private int age;
	private float height;
	private float weight;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
			this.Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		this.Sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

public String toString() {
	return "name: "+ Name+ " Sex: "+Sex+" Age: "+age+" Height: "+height+" Weight: "+weight;
}
	
}











