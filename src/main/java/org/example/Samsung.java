package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
    @Qualifier("snapDragon")    //use to select ne of the processor (snapDragon or mediaTeg)
    private MobileProcessor cpu;
    public void config(){
        System.out.println("Samsung mobile");
        cpu.process();
    }
    public MobileProcessor getCpu() {
        return cpu;
    }
    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }
}
