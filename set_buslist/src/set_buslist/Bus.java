package set_buslist;

import java.util.Objects;

public class Bus {
	private int id;
	private double cost;
	private String providerName;
	private float rating;
	
	public Bus(int id, double cost, String providerName, float rating) {
		
		this.id =id;
		this.cost = cost;
		this.providerName = providerName;
		this.rating = rating;

	}

	public Bus() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", cost=" + cost + ", providerName=" + providerName + ", rating=" + rating + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return id == other.id;
	}



	

	
}
