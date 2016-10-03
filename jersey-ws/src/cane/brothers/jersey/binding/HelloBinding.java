package cane.brothers.jersey.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HelloBinding {
	public String name;
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
}
