package leonardo.valter.credito.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
          .select()
          .apis(RequestHandlerSelectors.basePackage("leonardo.valter.credito.core.controllers"))
          .paths(PathSelectors.any())
          .build()
          .apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	            .title("Aplicação Core de Análise de Crédito")
	            .description("Aplicação Core que realiza o processamento e análise de cŕedito de propostas de crédito.")
	            .version("1.0.0")
	            .license("GitHub")
	            .licenseUrl("https://github.com/valterleonardo/analise-credito")
	            .contact(new Contact("Valter Leonardo", "https://valterleonardo.com.br", "contato@valterleonardo.com.br"))
	            .build();
	}
}