

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.wipro")
@EnableJpaRepositories(basePackages = "com.wipro.Repository")
@EntityScan(basePackages = "com.wipro.Model")
public class ShoppingCartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingCartApplication.class, args);
    }
}
