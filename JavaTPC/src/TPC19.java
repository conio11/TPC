import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		// Dog, Cat --> Animal
		Dog d = new Dog();
		d.eat(); // Animal의 eat()
		
		Cat c = new Cat();
		c.eat(); // Animal의 eat()
		
		// Dog.java(X), Dog.class(O)
		// 소스파일 없이 배포 --> 어떻게 동작?
		
		// Animal <-- [Dog.class, Cat.class]
		// Dog dd = new Dog();
		// dd.eat();
		
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
	}
}
