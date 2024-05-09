
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        // write code here
        this.count++;
        this.sum+=number;
    }

    public int getCount() {
        // write code here
        return this.count;
    }
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        return this.count > 0 ? 1.0*this.sum/this.count : 0.0;
    }
}
