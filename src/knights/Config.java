package knights;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Knight knight() {
		//return new BraveKnight(quest());
		return null;
	}

	@Bean
	public Quest quest() {
		return new SlayDragonQuest(System.out);
	}
}
