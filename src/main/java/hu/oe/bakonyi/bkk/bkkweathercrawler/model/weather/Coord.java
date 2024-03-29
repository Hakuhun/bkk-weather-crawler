package hu.oe.bakonyi.bkk.bkkweathercrawler.model.weather;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.redis.core.index.GeoIndexed;
import org.springframework.data.redis.core.index.Indexed;
import org.springframework.validation.annotation.Validated;

import java.math.BigDecimal;

@Data
@Validated
@Builder
@NoArgsConstructor
@AllArgsConstructor
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-09-02T19:31:53.527Z[GMT]")
public class Coord   {
  @JsonProperty("lon")
  @Indexed
  private double lon;

  @Indexed
  @JsonProperty("lat")
  private double lat;
}
