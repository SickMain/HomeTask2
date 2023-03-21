public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("September","Stigmata");
        Song song2 = new Song("In the end","Linkin Park");
        Song song3 = new Song("Can You Feel My Heart","Bring Me The Horizon");
        Song song4 = new Song("Personal Jesus","Depeche Mode");

        VinylRecord vr = new VinylRecord(song1);
        VinylPlayer vp = new VinylPlayer(vr);
        vp.play();

        CDdisk cdd = new CDdisk(new Song[]{song1,song2});
        CDPlayer cdp = new CDPlayer(cdd);
        cdp.play(1);
        cdp.play(2);

        FlashDrive fd = new FlashDrive(new Song[]{song1,song2,song3,song4});
        UniversalPlayer up = new UniversalPlayer(fd);
        up.play(1);
        up.play(4);



    }
}