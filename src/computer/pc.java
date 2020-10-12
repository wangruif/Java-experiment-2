package computer;

class pc {
    private cpu cpu;
    private harddisk hd;

    void setCpu(cpu cpu) {
        this.cpu = cpu;
    }

    void setharddisk(harddisk hd){
        this.hd = hd;
}
void show(){
        System.out.println("cpu's speed is "+cpu.getSpeed());
        System.out.println("this's cpu name is"+cpu.getName());
        System.out.println("harddisk's capacity is "+hd.getAmount());
        System.out.println("harddisk's speed was "+hd.getSpeed());

}

}
