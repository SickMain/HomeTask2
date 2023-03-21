public class CDPlayer extends AudioDevice{
    public CDPlayer(SongCarrier carrier){
        super(carrier);
        setName("CD Player");
    }
    @Override
    void play() {
        if (!(getCarrier() instanceof CDdisk)) System.out.println("The CD player can only play songs from a CD disk");
        System.out.println(getCarrier().getSongs()[0]);
    }
    void play(int number) {
        if (!(getCarrier() instanceof CDdisk)){
            System.out.println("The CD player can only play songs from a CD disk");
            return;
        }
        System.out.println(getName() + " plays now: " + getCarrier().getSongs()[number-1]);
    }
}
