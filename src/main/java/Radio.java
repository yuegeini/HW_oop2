public class Radio {
    public int volume;
    public int can;

    public int maxCan;


    public Radio() {
        volume = 0;
        can = 0;
        maxCan = 10;
    }
    public Radio(int max_can) {
        maxCan = max_can;
        volume = 0;
        can = 0;
    }

    public Radio(int vol, int c) {
        volume = vol;
        can = c;
        maxCan = 10;
    }

    public void up() {
        if(volume < 100) volume++;
    }
    public void down() {
        if(volume > 0) volume--;
    }
    public void next() {
        can = (can + 1) % maxCan;
    }
    public void prev() {
        can = (can - 1 + maxCan) % maxCan;
    }
}
