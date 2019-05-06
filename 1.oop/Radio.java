/**
 * Car Radio implementation
 *
 * TODO limit frequency for each band
 * TODO add constructor (initial state)
 */
public class Radio {
    final Integer MAX_CHANNELS = 6;

    Channel channels[];
    Integer currentFrequency;
    Integer currentVolume;
    Band currentBand;
    final int MAXFREQUENCY=1000;
    final int MINFREQUENCY=1;

    // Radio constructor
    Radio(Channel channels[] ,Integer currentFrequency , Integer currentVolume , Band currentBand ){
        this.channels[]=channels[];
        this.currentFrequency = currentFrequency;
        this.currentVolume=currentVolume;
        this.currentBand=currentBand;
    }

    public void volumeUp() {
        currentVolume++;
    }
    void volumeDown() { 
        currentVolume--;
    }

    void tuneUp() {
        if currentFrequency < MAXFREQUENCY
        currentFrequency++;
    }
    void tuneDown() {
        if currentFrequency > MINFREQUENCY
        currentFrequency--;
    }

    void switchBand(Band band) {
        currentBand = band;
    }

    /**
     * Finds next tune
     * Seek left off due to complexity
     *
     */
    void seekUp() {}
    void seekDown() {}

    void saveChannel(Integer position) {
        if (position < MAX_CHANNELS ) {
            Channel channel = new Channel();
            channel.band = currentBand;
            channel.frequency = currentFrequency; 
            channels[position] = channel;
        }
    }
}

/**
 * Holds a channel's state
 * TODO make fields private
 * TODO add getters and setters 
 */
class Channel {
    private Band band;
    private Integer frequency;

    //constuctor
    channel(Band band,Integer frequency){
        this.band = band;
        this.frequency=frequency;
    }

    public Integer getFrequency () {

        return this.frequency;
    }
    public void setFrequency (Integer frequency) {

        this.frequency=frequency
    }

    public Band getBand () {
        return this.band;
    }

    public void setBand (Band band) {
        this.band=band;
    }

}

enum Band {FM1,FM2,AM}
