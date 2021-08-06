package test1;

public class TesterBus implements Comparable<TesterBus>{
	private int id;
	private String providerName;
	private double cost;
	private float rating;
	
	public TesterBus() {
		
	}
	
	public TesterBus(int id, String providerName, double cost, float rating) {
		this.id = id;
		this.providerName = providerName;
		this.cost = cost;
		this.rating = rating;
		
	}

	@Override
	public String toString(){
		return "id: "+ this.id+ " provider name: " + this.providerName+" cost: "+ this.cost+" rating: "+this.rating;
	}

	@Override
	public int compareTo(TesterBus b) {
		Float i1 = this.rating;
		Float i2 = b.rating;
		return i2.compareTo(i1);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

}
