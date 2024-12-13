package apiautomation;

import org.testng.annotations.Test;

import com.github.javafaker.Color;
import com.github.javafaker.Faker;

public class FackerDemo

{
	
	@Test
	void testGenerateDummyData() {
		
		Faker faker=new Faker();
		
		System.out.println(faker.name().fullName());
		4j
		Color color=faker.color();
		System.out.println(color);
		
		
}

}
