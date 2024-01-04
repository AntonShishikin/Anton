package Enums;

public enum MemorySize {
    SMALL(128),
    MEDIUM(512),
    NORMAL(1024),
    PERFECT(2048);

    private int size;

    MemorySize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
