public class WaterBottle {
    private int volume;

    public WaterBottle(int volume) {
        this.volume = 100;
    }

    public int getVolume() {
        return this.volume;
    }

    public int getDrinkWater() {
        this.volume-=10;
        return this.volume;
    }

    public int getEmptyBottle() {
        this.volume=0;
        return this.volume;
    }

    public Object getFillBottle() {
        this.volume=100;
        return this.volume;
    }

}
