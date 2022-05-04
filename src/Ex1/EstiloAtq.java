package Ex1;

public enum EstiloAtq {


    RANGED(3),
    MELEE(1);

    private int range;
    private EstiloAtq(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }
}
