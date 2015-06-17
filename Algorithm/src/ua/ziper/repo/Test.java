package ua.ziper.repo;

public class Test implements Comparable<Test>{
	private String Name;
	private Integer Value;
	
	public Test(String name, int value){
		Name = name;
		Value = value;
	}
	
	@Override
	public String toString(){
		return Name + " " + Value;
	}
	

	@Override
	public int compareTo(Test n) {
		     if (this.Value>n.Value) return +1;
		else if (this.Value<n.Value) return -1;	
		else return 0;
	}
}
