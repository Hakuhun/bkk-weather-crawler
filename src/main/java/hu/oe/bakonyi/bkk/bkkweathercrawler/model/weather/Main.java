package hu.oe.bakonyi.bkk.bkkweathercrawler.model.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-02T19:31:53.527Z[GMT]")
public class Main   {
  @JsonProperty("temp")
  private BigDecimal temp = null;

  @JsonProperty("pressure")
  private Integer pressure = null;

  @JsonProperty("humidity")
  private Integer humidity = null;

  @JsonProperty("temp_min")
  private BigDecimal tempMin = null;

  @JsonProperty("temp_max")
  private BigDecimal tempMax = null;

  @JsonProperty("sea_level")
  private BigDecimal seaLevel = null;

  @JsonProperty("grnd_level")
  private BigDecimal grndLevel = null;

}
