import com.fasterxml.jackson.annotation.JsonProperty;

public class Unit {
    public enum UnitType {
        Army,
        Fleet
    }

    @JsonProperty("Type")
    public UnitType type;   // "Army" or "Fleet"

    @JsonProperty("Region")
    public String region; // where the unit is

    @JsonProperty("Owner")
    public String owner;  // e.g. "Britain"

    public Unit() {}

    @Override
    public String toString() {
        return type + " in " + region + " (" + owner + ")";
    }
}