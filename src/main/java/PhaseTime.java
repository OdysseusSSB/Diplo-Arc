public class PhaseTime {
    enum Season {
        SPRING,
        SPRING_RETREATS,
        FALL,
        FALL_RETREATS,
        WINTER
    }

    private int year; //years from start
    private Season season;

    public PhaseTime(int year, Season season) {
        this.year = year;
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public Season getSeason() {
        return season;
    }
}
