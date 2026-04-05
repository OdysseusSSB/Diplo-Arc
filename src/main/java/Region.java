import com.fasterxml.jackson.annotation.JsonProperty;

public class Region {

    @JsonProperty("name")
    public String name;

    @JsonProperty("abr")
    public String abbreviation; // optional field

    @JsonProperty("supply_value")
    public int supplyValue;
}