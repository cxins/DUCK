package yazi;

import org.junit.Test;

public class Testduck {
		
		@Test
		public void MallardDuck() {
		      Duck MallardDuck = new MallardDuck();
		      System.out.println("这是第一只鸭子");
		      System.out.println("野鸭");
		      MallardDuck.performQuack();
		      MallardDuck.performFly();		
		      MallardDuck.display();
		      MallardDuck.swim();
		    
		   }
		@Test
		public void RubberDuck() {
		      Duck RubberDuck = new RubberDuck();
		      System.out.println("这是第二只鸭子");
		      System.out.println("橡皮鸭");
		      RubberDuck.performQuack();
		      RubberDuck.performFly();	
		      RubberDuck.display();
		      RubberDuck.swim();
		      
		   }
		@Test
		public void RedHeadDuck() {
		      Duck RedHeadDuck = new RedheadDuck();
		      System.out.println("这是第三只鸭子");
		      System.out.println("红头鸭");
		      RedHeadDuck.performQuack();
		      RedHeadDuck.performFly();		     
		      RedHeadDuck.display();
		      RedHeadDuck.swim();
		      
		   }
		}
