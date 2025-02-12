package com.designPrinciple.dependencyReversal;

public class Computer {
    Disk disk;
    Cpu cpu;
    Memory memory;

    void run(){
        System.out.println("运行中...");
        cpu.run();
        disk.save();
        disk.get();
        memory.save();
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
