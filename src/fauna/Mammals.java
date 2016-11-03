package fauna;

public abstract class Mammals extends Animals {
	private boolean fur;
	private String region;

	public Mammals() {
		super();
	}

	public Mammals(int age, double size, boolean fur, String region) {
		super(age, size);
		this.fur = fur;
		this.region = region;
	}

	public void setFur(boolean fur) {
		this.fur = fur;
	}

	public boolean getFur() {
		return this.fur;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegion() {
		return this.region;
	}

	@Override
	public abstract void MakeNoise();

	public String toString() {
		return super.toString() + " Fur: " + this.fur + " Region: " + this.region;
	}

}
