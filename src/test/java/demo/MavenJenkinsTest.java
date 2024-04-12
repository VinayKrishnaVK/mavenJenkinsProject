package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenJenkinsTest {
	
		@Test
		public void mavenJenkins() {
			Reporter.log("MavenJenkins project working successfully",true);
		}
}
