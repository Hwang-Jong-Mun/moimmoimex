package javatreeex.moimmoimex.configuration;

import javatreeex.moimmoimex.repository.ProfileRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@MapperScan(value = {"javatreeex.moimmoimex.mapper"})
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
}
