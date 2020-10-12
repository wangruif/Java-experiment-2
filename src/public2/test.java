package public2;

import public1.cpu;
import public1.harddisk;

public class test {
    public static void  main(String[] args){
        public1.cpu cpu = new cpu();
        public1.harddisk hd = new harddisk();
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
