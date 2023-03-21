public abstract class SongCarrier {
    private Song[] songs;
    private String name;

    SongCarrier(Song[] compositions){
        this.songs = compositions.clone();
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Song[] getSongs() {
        return songs;
    }

    public void setSongs(Song[] songs) {
        this.songs = songs.clone();
    }
}
