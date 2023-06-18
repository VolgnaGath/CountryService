package countryService.CountryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class CountryServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CountryServiceApplication.class, args);
	}

}
