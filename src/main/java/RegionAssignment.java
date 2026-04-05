import com.fasterxml.jackson.annotation.JsonProperty;

public class RegionAssignment {

    @JsonProperty("Region")
    public String region;

    @JsonProperty("Power")
    public String power;
}