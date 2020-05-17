package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
	
	String name;
	
    @Override
    public String toString() {
    	System.out.println("Init a cat");
    	this.setName("Some cat");
        return "Im a Cat";
    }
   
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	return super.equals(obj);
    }
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    
}
