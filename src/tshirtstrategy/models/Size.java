package tshirtstrategy.models;

public enum Size {
    XS, S, M, L, XL, XXL, XXXL;
    
    public float getPrice() {
        switch(this) {
            case XS:
                return 0.22f;
            case S:
                return 0.23f;
            case M:
                return 0.25f;
            case L:
                return 0.30f;
            case XL:
                return 0.35f;
            case XXL:
                return 0.40f;
            case XXXL:
                return 0.60f;
            default:
                return 0;
        }
    }
}
