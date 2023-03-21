public abstract class AudioDevice {
    private String name;
    private SongCarrier carrier;
    public AudioDevice(SongCarrier carrier){
        this.carrier = carrier;

    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public SongCarrier getCarrier() {
        return carrier;
    }

    public void setCarrier(SongCarrier carrier) {
        this.carrier = carrier;
    }

    abstract void play();


}
