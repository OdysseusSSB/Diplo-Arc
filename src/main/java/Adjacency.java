import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Adjacency {
    public enum AdjacencyType {
        LAND,
        SEA
    }
    /*Each adjacency is stored in an adjacencies property of the region, e.g.
    "to":"Edinburgh","via":["Land","Sea"]*/
    
    //Write an override desirializer method to use the JSON data, and store in the properties

    //Adjacent region
    public Region region;

    //Mode(s) of adjacency
    public List<AdjacencyType> adjacencyTypes;
}
