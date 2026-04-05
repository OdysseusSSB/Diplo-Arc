import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class GameState {

    @JsonProperty("Name")
    public String name;

    @JsonProperty("Season")
    public List<SeasonWrapper> season;

    @JsonProperty("Powers")
    public List<String> powers;

    @JsonProperty("Regions")
    public List<Region> regions;

    @JsonProperty("Region_Assignments")
    public List<RegionAssignment> regionAssignments;

    @JsonProperty("Home_Region_Assignments")
    public List<RegionAssignment> homeRegionAssignments;

    @JsonProperty("Units")
    public List<Unit> units;

    public String audit() {
        String str = "";
        str += this.name + "\n";
        str += "Season: " + season + "\n";
        str += "\n";
        for (String power : powers) {
            str += power + "\n";
            for (Unit unit : units) {
                if (unit.owner.equals(power)) {
                    str += unit.type + " in " + unit.region + "\n";
                }
            }
        }
        str += "\n";
        for (Region region: regions) {
            str += region.name + "\n";
        }
        return str;
    }
}