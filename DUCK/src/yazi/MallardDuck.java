package yazi;

public class MallardDuck extends Duck {
	public MallardDuck() {
		QuackBehavior = new Quack();
		FlyBehavior = new FlyWithWings();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("野鸭会游泳");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这只是野鸭");
	}
}