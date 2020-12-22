package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  //use to get that processor
public class MediaTeg implements MobileProcessor{
    @Override
    public void process() {
        System.out.println("Mobile Processor MediaTeg");
    }
}
