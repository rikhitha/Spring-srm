import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

@Configuration
@EnableAutoConfiguration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "com.demo.repositories" })
@ComponentScan("com.demo")
@PropertySource("classpath:application.properties")
public class JPAConfiguration {

	@Bean
	public ProductService productService() {
		return new ProductServiceImpl();
	}

}