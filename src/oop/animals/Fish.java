package oop.animals;

public class Fish {

    private boolean canSwim;
    private int length;
    private int finCount;
    private boolean isSaltWater;
    private String name;
    private boolean hasScales;

    public Fish(boolean canSwim, int length, int finCount,
                boolean isSaltWater, boolean hasScales, String name) {
        this.canSwim = canSwim;
        this.length = length;
        this.finCount = finCount;
        this.isSaltWater = isSaltWater;
        this.name = name;
        this.hasScales = hasScales;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        this.finCount = finCount;
    }

    public boolean isSaltWater() {
        return isSaltWater;
    }

    public void setSaltWater(boolean saltWater) {
        isSaltWater = saltWater;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasScales() {
        return hasScales;
    }

    public void setHasScales(boolean hasScales) {
        this.hasScales = hasScales;
    }
}

