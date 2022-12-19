package lk.ijse.dep9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan
@Configuration
public class WebAppConfig {

    @Bean
    public ViewResolver viewResolver(){
        return new InternalResourceViewResolver("WEB-INF/view/", ".jsp");
    }
}
