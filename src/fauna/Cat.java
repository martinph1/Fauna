package fauna;

public class Cat extends Mammals {
	private String name;
	private String brand;

	public Cat() {
	}

	public Cat(int age, double size, boolean fur, String region, String name, String brand) {
		super(age, size, fur, region);
		this.name = name;
		this.brand = brand;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand()
	{
		return this.brand;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Name " + this.name + " Brand: " + this.brand;
	}

	@Override
	public void MakeNoise() {
		System.out.println("Meeew Meeeeoowww");

	}

}
