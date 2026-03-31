import java.util.ArrayList;

public class Region {
    enum RegionType {
        IMPASSABLE,
        LAND,
        SEA,
        COAST
    }

    private String abbreviation; //Typically three letter shorthand name
    private String name;
    private ArrayList<String> alternativeNames; //Alternative names that will be resolved to this region
    private RegionType regionType;
    private ArrayList<Region> adjacencies;
    private Region parent; //For coasts
    private ArrayList<Region> children; //For regions with coasts

    public Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
        
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public ArrayList<String> getAlternativeNames() {
        return alternativeNames;
    }

    public void setAlternativeNames(ArrayList<String> alternativeNames) {
        this.alternativeNames = alternativeNames;
    }

    public RegionType getRegionType() {
        return regionType;
    }

    public void setRegionType(RegionType regionType) {
        this.regionType = regionType;
    }

    public ArrayList<Region> getAdjacencies() {
        return adjacencies;
    }

    public boolean isAdjacent(Region region) {
        return this.adjacencies.contains(region);
    }

    public void setAdjacencies(ArrayList<Region> adjacencies) {
        this.adjacencies = adjacencies;
    }

    public boolean addAdjacency(Region adjacency) {
        if(this.adjacencies.contains(adjacency)) {
            return false;
        }
        else {
            this.adjacencies.add(adjacency);
            return true;
        }
    }

    public boolean addAdjacencies(ArrayList<Region> adjacencies) {
        boolean i = true;
        for(Region region: adjacencies) {
            if(this.adjacencies.contains(region)) {
                i = false;
            }
            else {
                this.adjacencies.add(region);
            }
        }
        return i;
    }

    public boolean removeAdjacency(Region adjacency) {
        if(this.adjacencies.contains(adjacency)) {
            this.adjacencies.remove(adjacency);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeAdjacencies(ArrayList<Region> adjacencies) {
        boolean i = true;
        for(Region region: adjacencies) {
            if(this.adjacencies.contains(region)) {
                this.adjacencies.remove(region);
            }
            else {
                i = false;
            }
        }
        return i;
    }

    public void setParent(Region parent) {
        this.parent = parent;
        parent.addChild(this);
    }

    public Region parent() {
        return this.parent;
    }

    public ArrayList Children() {
        return this.children;
    }

    private void addChild(Region child) {
        this.children.add(child);
    }
}
