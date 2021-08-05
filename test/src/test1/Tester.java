package test1;

public class Tester {
	
	private int id;
	private String name;
	
	public Tester(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tester [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Tester t = (Tester)obj;
		
		if(this.id == t.id) return true;
		else return false;
		
	}
	
}
