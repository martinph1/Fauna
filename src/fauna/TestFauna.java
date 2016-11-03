package fauna;

public class TestFauna {

	public static void main(String[] args) {
		Mammals m = new Mammals() {
			
			@Override
			public void MakeNoise() {
				System.out.println("Ahahahahah");
				
			}
		};
		
		m.setAge(3);
		m.setFur(true);
		m.setRegion("Europe");
		m.setSize(4.5);
		
		m.MakeNoise();
		
		System.out.println(m);
		System.out.println(Mammals.class);
		
		Mammals m2 = new Mammals(3, 4.5, true, "Africa") {
			
			@Override
			public void MakeNoise() {
				System.out.println("Making noise");
			}
		};
		
		System.out.println(m2);
		m2.MakeNoise();
		
		Cat cat1 = new Cat(1, 12.3, true, "World", "Stacy", "Pitbull");
		System.out.println(cat1);
		cat1.MakeNoise();
	}
	

}
