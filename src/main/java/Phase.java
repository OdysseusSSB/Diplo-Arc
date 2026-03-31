import java.util.ArrayList;

public class Phase {
    private PhaseTime phaseTime;
    private ArrayList<Region> regions;

    public Phase(Phase phase) {
        //Will need to be a deep copy of previous phase but evaluated
    }

    public PhaseTime getPhaseTime() {
        return this.phaseTime;
    }
    
    public String toString() {
        return this.phaseTime.getSeason().toString() + this.phaseTime.getYear();
    }
}