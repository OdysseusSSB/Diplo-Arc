import com.fasterxml.jackson.annotation.JsonProperty;

public class Turn {

    @JsonProperty("Year")
    public int year;

    @JsonProperty("Season")
    public String season;
}