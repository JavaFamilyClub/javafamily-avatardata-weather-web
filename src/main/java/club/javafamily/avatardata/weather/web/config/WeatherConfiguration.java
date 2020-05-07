package club.javafamily.avatardata.weather.web.config;

import club.javafamily.weather.query.WeatherQueryEngine;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("club.javafamily.avatardata.weather.web")
public class WeatherConfiguration {
   /**
    * Singleton weather query engine
    */
   @Bean
   public WeatherQueryEngine weatherQueryEngine() {
      return new WeatherQueryEngine();
   }
}
