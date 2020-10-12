package computer;

public class test {

    public static void  main(String[] args){
        cpu cpu = new cpu();
        harddisk hd = new harddisk();
        cpu.setSpeed(2200);
        cpu.setName(" AMD ");
        hd.setAmount(200);
        hd.setSpeed(5400);
        pc pc = new pc();
        pc.setCpu(cpu);
        pc.setharddisk(hd);
        pc.show();
    }
}
