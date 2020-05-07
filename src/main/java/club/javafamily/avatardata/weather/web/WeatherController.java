package club.javafamily.avatardata.weather.web;

import club.javafamily.model.WeatherVO;
import club.javafamily.weather.query.WeatherQueryEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/1.0/")
public class WeatherController {

   @Autowired
   public WeatherController(WeatherQueryEngine queryEngine) {
      this.queryEngine = queryEngine;
   }

   @GetMapping("weather")
   public WeatherVO getWeather(String city) throws Exception {
      WeatherVO weatherVO = queryEngine.queryWeather(city);

      return weatherVO;
   }

   private final WeatherQueryEngine queryEngine;
}
