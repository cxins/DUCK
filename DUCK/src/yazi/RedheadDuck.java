package yazi;

public class RedheadDuck extends Duck{
	   public RedheadDuck() {
		      QuackBehavior = new Quack();
		      FlyBehavior = new FlyWithWings();
		   }
	   @Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("红头鸭会游泳");
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("这只是红头鸭");
		}

}