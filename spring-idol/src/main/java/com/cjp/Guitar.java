package com.cjp;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
