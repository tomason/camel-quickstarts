package io.fabric8.quickstarts.camelcdi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
	private String name;
	private int age;

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

	@Override
	public String toString() {
		return String.format("Person[name='%s', age='%s']", name, age);
	}
}
