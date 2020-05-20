package com.trungtamjava.service;

public abstract class AnimalServiceImpl implements AnimalService {

    @Override
    public void them() {
        System.out.println("Them");
    }


    @Override
    public void sua() {
        System.out.println("Sua");
    }

    @Override
    public void xoa() {
        System.out.println("Xoa");
    }
}
