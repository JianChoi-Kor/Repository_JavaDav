package Study;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		
		polyCry(dog);
		polyCry(cat);
		polyCry(bird);
	}
	
	public static void polyCry(Animal ani) {
		ani.crying();
	}

}
