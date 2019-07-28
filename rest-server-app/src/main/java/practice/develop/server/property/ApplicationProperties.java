package practice.develop.server.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class ApplicationProperties {

	@Autowired
	private Environment env;
	
	public String getProp(String key) {
		
		return env.getProperty(key);
	}
	
}
