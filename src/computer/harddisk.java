package computer;

public class harddisk {
    private int amount;
    private int speed;

    public harddisk(int amount, int speed) {
        this.amount = amount;
        this.speed = speed;
    }

    public harddisk() {

    }

    int getAmount(){
        return amount;
    }
    int getSpeed(){
        return speed;
    }
    void setAmount(int amount){
        this.amount=amount;
    }
    void setSpeed(int speed){
        this.speed=speed;
    }
}
