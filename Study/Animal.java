package Study;

public class Animal {
	
	void crying() {
		System.out.println("운다");
	}
}

class Dog extends Animal {
	@Override
	void crying() {
		System.out.println("멍멍!");
	}
}

class Cat extends Animal {
	@Override
	void crying() {
		System.out.println("야옹~");
	}
}

class Bird extends Animal {
	@Override
	void crying() {
		System.out.println("짹짹!");
	}
}
