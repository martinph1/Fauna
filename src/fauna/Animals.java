package fauna;

public abstract class Animals {

	private int age;
	private double size;

	public Animals() {
	}

	public Animals(int age, double size) {
		this.age = age;
		this.size = size;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getSize() {
		return this.size;
	}

	public abstract void MakeNoise();

	public String toString() {
		return "\nSize: " + this.size + " Age: " + this.age;
	}

}
