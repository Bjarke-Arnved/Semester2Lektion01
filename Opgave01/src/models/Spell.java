package models;

public class Spell {
    private String name;
    private int range;
    private Duration duration;

    public Spell(String name, int range, Duration duration) {
        this.name = name;
        this.range = range;
        this.duration = duration;
    }

    public int getRange() {
        return range;
    }

    public Duration getDuration() {
        return duration;
    }
    public String getName() {
        return name;
    }
}