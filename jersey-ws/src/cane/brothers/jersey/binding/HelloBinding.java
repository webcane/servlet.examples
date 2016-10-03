package cane.brothers.jersey.binding;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloBinding {
	
	@XmlElement
	public String name;
	
	@XmlElement
	public int age;
	
	/**
	 * Default constructor
	 */
	public HelloBinding() {
	} 
	 
    public HelloBinding(String name, int age) {
        this.name = name;
        this.age = age;
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

	@Override
	public String toString() {
		return String.format("HelloBinding [name=%s, age=%s]", name, age);
	}
	
}
