public class UniversalPlayer extends AudioDevice{
    public UniversalPlayer(SongCarrier carrier){
        super(carrier);
        setName("Universal Player");
    }
    @Override
    void play() {
        if (!(getCarrier() instanceof FlashDrive)) System.out.println("The Universal player can only play songs from a flash drive");
        System.out.println(getCarrier().getSongs()[0]);
    }
    void play(int number) {
        if (!(getCarrier() instanceof FlashDrive)){
            System.out.println("The Universal player player can only play songs from a flash drive");
            return;
        }
        System.out.println(getName() + " plays now: " + getCarrier().getSongs()[number-1]);
    }
}
