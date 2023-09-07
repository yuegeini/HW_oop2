public class Radio {
    private int volume;
    private int can;

    public void setVolume(int vol) {
        volume = vol;
    }

    public void setCan(int cann) {
        can = cann;
    }

    public int getVolume() {
        return volume;
    }

    public int getCan() {
        return can;
    }

    public void up() {
        if (volume < 100) {
            volume++;
        }
    }

    public void down() {
        if (volume > 0) {
            volume--;
        }
    }

    public void next() {
        can = (can + 1) % 10;
    }

    public void prev() {
        can = (can - 1 + 10) % 10;
    }
}
