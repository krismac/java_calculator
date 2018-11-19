public class Printer {
    private int paperCapacity;
    private int tonerVolume;


    public Printer(int paperCapacity, int tonerVolume, int printJob) {
        this.paperCapacity = 100;
        this.tonerVolume = 90;
        printJob = 10;
    }



    public boolean getCapacityJobComparison(int paperCapacity, int tonerVolume, int printJob) {
        if (this.paperCapacity >= printJob) {
            return true;
        }
        return false;
    }
}
