package tshirtstrategy.models;

public enum Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    public float getPrice() {
        switch (this) {
            case RED:
                return 0.5f;
            case ORANGE:
                return 0.10f;
            case YELLOW:
                return 0.15f;
            case GREEN:
                return 0.20f;
            case BLUE:
                return 0.25f;
            case INDIGO:
                return 0.30f;
            case VIOLET:
                return 0.35f;
            default:
                return 0;
        }
    }
}
