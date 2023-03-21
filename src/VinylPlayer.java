public class VinylPlayer extends AudioDevice{
    public VinylPlayer(SongCarrier carrier){
        super(carrier);
        setName("Vinyl Player");
    }
    @Override
    void play() {
        if (!(getCarrier() instanceof VinylRecord)){
            System.out.println("The vinyl player can only play songs from a vinyl record");
            return;
        }
        System.out.println(getName() + " plays now: " + getCarrier().getSongs()[0]);
    }
}
