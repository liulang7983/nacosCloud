package com.lm.sentinel.miOcr;

public class MiOcrThread implements Runnable {
    private AbstractMiOcr abstractMiOcr;

    public MiOcrThread(AbstractMiOcr abstractMiOcr) {
        this.abstractMiOcr = abstractMiOcr;
    }

    @Override
    public void run() {
        abstractMiOcr.MiOcr();
    }
}
