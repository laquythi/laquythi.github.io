package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GirlFriend {
    @Autowired
    public Outfit outfit;

    // constructor
    public GirlFriend(){
        this.outfit = new Dress();
    }

    public GirlFriend(Outfit outfit){
        this.outfit = outfit;
    }

    // getter setter
    public Outfit getOutfit() {
        return this.outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
}
