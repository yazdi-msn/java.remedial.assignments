package car.console;
/**
 * Holds a channel's state
 * TODO make fields private
 * TODO add getters and setters 
 */
class Channel {
    Band band;
    private Integer frequency;

    public Integer getFrequency () {
        return this.frequency;
    }
    public void setFrequency (Integer frequency) {
        this.frequency=frequency
    }
}

enum Band {FM1,FM2,AM}
