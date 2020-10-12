package computer;

public class cpu {
    private int speed;
    private String name;

    public cpu() {

    }

    int getSpeed(){
        return speed;
    }

    public cpu(int speed) {
        this.speed = speed;
    }

    public cpu(String name) {
        this.name = name;
    }

    String getName(){
        return name;
    }
    void  setSpeed(int speed){
        this.speed=speed;
    }
    void setName(String name){
        this.name = name;
    }
}
