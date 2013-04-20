package helloworld.firefox;

import static org.junit.Assert.*;
import org.junit.Test;
import org.roussev.selenium4j.WebTest;

public class TestrandomTest extends WebTest {
  
    @Test
  	public void testMethod() throws Exception {
  		startSelenium("FirefoxDriver", "file:///C:/work/workspaceGroupBy/selenium-maven-plugin/src/test/web/index.html");
		
		session().open("file:///C:/work/workspaceGroupBy/selenium-maven-plugin/src/test/web/index.html");
		session().click("css=button");
		assertEquals("hello world", session().getTitle());
  	}	
  
}