package tshirtstrategy.models;

public enum Fabric {
    WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK;

    public float getPrice() {
        float result = 0;
        switch (this) {
            case WOOL:
                return 2.5f;
            case COTTON:
                return 4.5f;
            case POLYESTER:
                return 5.0f;
            case RAYON:
                return 7.5f;
            case LINEN:
                return 8.2f;
            case CASHMERE:
                return 9.3f;
            case SILK:
                return 22.0f;
            default:
                return 0;
        }
    }
}
