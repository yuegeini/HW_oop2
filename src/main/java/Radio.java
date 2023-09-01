public class Radio {
    public int volume;
    public int can;

    public Radio() {
        volume = 0;
        can = 0;
    }

    public Radio(int vol, int c) {
        volume = vol;
        can = c;
    }

    public void up() {
        if(volume < 100) volume++;
    }
    public void down() {
        if(volume > 0) volume--;
    }
    public void next() {
        can = (can + 1) % 10;
    }
    public void prev() {
        can = (can - 1 + 10) % 10;
    }
}
