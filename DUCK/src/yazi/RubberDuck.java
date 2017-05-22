package yazi;

public class RubberDuck extends Duck{
	public RubberDuck() {
		QuackBehavior = new Squeak();
		FlyBehavior = new FlyWithRocket();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("橡皮鸭不会游泳");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这只是橡皮鸭");
	}

}