package Question1;

public class Person implements Comparable<Person>{
	
	String name;
	Integer weight;
	Integer height;
	
	
	 public Person(Integer height,Integer weight, String name)
	{
		super();
		this.height=height;
		this.weight= weight;
		this.name = name;
	}
	
	public Integer getHeight() {
		return height;
	}
	public Integer getWeight() {
		return weight;
	}
    public String getName() {
    	return name;
    }
    public String toString()
    {
    	return"Person [name is "+name+", Height is "+height+", Weight is "+weight+"]";
    }
    
    public int compareTo(Person o) {
    	if(this.getWeight()==o.getWeight())
    		return this.getHeight().compareTo(o.getHeight());
    	else
    		return this.getWeight().compareTo(o.getWeight());
    }
}

