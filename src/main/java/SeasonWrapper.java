import com.fasterxml.jackson.annotation.JsonProperty;

public class SeasonWrapper {

    @JsonProperty("First")
    public Turn first;

    @JsonProperty("Current")
    public Turn current;
}