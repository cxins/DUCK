package yazi;

import org.junit.Test;

public class Testduck {
		
		@Test
		public void MallardDuck() {
		      Duck MallardDuck = new MallardDuck();
		      System.out.println("���ǵ�һֻѼ��");
		      System.out.println("ҰѼ");
		      MallardDuck.performQuack();
		      MallardDuck.performFly();		
		      MallardDuck.display();
		      MallardDuck.swim();
		    
		   }
		@Test
		public void RubberDuck() {
		      Duck RubberDuck = new RubberDuck();
		      System.out.println("���ǵڶ�ֻѼ��");
		      System.out.println("��ƤѼ");
		      RubberDuck.performQuack();
		      RubberDuck.performFly();	
		      RubberDuck.display();
		      RubberDuck.swim();
		      
		   }
		@Test
		public void RedHeadDuck() {
		      Duck RedHeadDuck = new RedheadDuck();
		      System.out.println("���ǵ���ֻѼ��");
		      System.out.println("��ͷѼ");
		      RedHeadDuck.performQuack();
		      RedHeadDuck.performFly();		     
		      RedHeadDuck.display();
		      RedHeadDuck.swim();
		      
		   }
		}
