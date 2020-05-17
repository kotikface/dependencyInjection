package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {
	private String name;
    @Override
    public String toString() {
        return "I'm a Dog";
    }
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
    
}
