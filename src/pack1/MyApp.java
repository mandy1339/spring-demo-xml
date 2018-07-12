package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		

		///////////////////////////////////////
		// NO INTERFACE (BAD PRACTICE)
		// create the object
		BaseballCoach coach1 = new BaseballCoach();			
		
		// use the object
		System.out.println("COACH 1: " + coach1.getDailyWorkout());
		// NO INTERFACE (BAD PRACTICE)
		///////////////////////////////////////
		
		
		
		//////////////////////////////////////
		// INTERFACE (GOOD PRACTICE)
		// create the object
		Coach coach2 = new BaseballCoach();
		Coach coach3 = new TrackCoach();
		
		// use the object
		System.out.println("COACH 2: " + coach2.getDailyWorkout());
		System.out.println("COACH 3: " + coach3.getDailyWorkout());
		// INTERFACE (GOOD PRACTICE)
		////////////////////////////////////
		
		
		
		//////////////////////////////////////
		// SPRING FACTORY BEAN CREATION
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach4 = context.getBean("myCoach", Coach.class);
		Coach coach5 = context.getBean("myCoach2", Coach.class);
		CricketCoach coach6 = context.getBean("myCoach3", CricketCoach.class);
		
		// call methods on the bean
		System.out.println("\n\n");
		System.out.println("COACH 4: " + coach4.getDailyWorkout());
		System.out.println("COACH 4: " + coach4.getDailyFortune());
		System.out.println("\n\n");
		System.out.println("COACH 5: " + coach5.getDailyWorkout());
		System.out.println("COACH 5: " + coach5.getDailyFortune());
		System.out.println("\n\n");
		System.out.println("COACH 6: " + coach6.getDailyWorkout());
		System.out.println("COACH 6: " + coach6.getDailyFortune());
		System.out.println("COACH 6: " + "email: " + coach6.getEmailAddress() + " team: " + coach6.getTeam());
		
		// close the context
		context.close();
		// SPRING FACTORY BEAN CREATION
		////////////////////////////////////
		
		
		
		

	}
}