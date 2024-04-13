package demo;

import org.testng.annotations.Test;

public class jenkinsParameterTest {
	@Test
	public void reciveData() {
		String browserValue= System.getProperty("browser");
		System.out.println(browserValue);
	}
}
