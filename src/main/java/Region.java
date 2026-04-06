import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Region {

    @JsonProperty("name")
    public String name;

    @JsonProperty("abr")
    public String abbreviation; // optional field

    @JsonProperty("supply_value")
    public int supplyValue;

    @JsonProperty("adjacencies")
    public List<Adjacency> adjacencies;
}