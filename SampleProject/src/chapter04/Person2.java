package chapter04;
//getters and setters
//java beans (통 역할을 한다고 해서 beans)
public class Person2 {
	private String name;
	public Person2(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public Person2(int sex, int age) {
		super();
		this.sex = sex;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	private int sex;
	private int age;
	public String getName() {
		return name;
		//getName()-> name을 쓸 수 있음.
	}
	public void setName(String name) {
		this.name = name;
		//setName()
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
