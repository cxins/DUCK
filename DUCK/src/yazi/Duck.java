package yazi;

public abstract class Duck {

	QuackBehavior QuackBehavior;
	
	FlyBehavior FlyBehavior;

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		QuackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		FlyBehavior = flyBehavior;
	}

	public abstract void swim();

	public abstract void display();

	public void performQuack() {
		
		QuackBehavior.quack();
	}

	public void performFly() {
	
		FlyBehavior.fly();
	}

}