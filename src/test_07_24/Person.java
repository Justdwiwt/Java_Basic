package test_07_24;

import java.io.Serializable;

public class Person implements Serializable {

	// �汾��
	// private static final long serialVersionUID = 563L;

	private static final long serialVersionUID = -4759881397810241796L;
	private String name;
	private int age;
	private char gender;
	private String id;
	private transient double weight;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	// static String classroom;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
