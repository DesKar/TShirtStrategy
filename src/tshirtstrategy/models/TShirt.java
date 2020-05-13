package tshirtstrategy.models;

import java.util.Objects;

/*
       .5     .10      .15     .20   .25    .30     .35
Color, {RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET}

       .22 .23 .25 .30 .35 .45   .60  
Size, {XS, S,   M, L,  XL, XXL, XXXL}
          
          2.5    4.5      5         7.5   8.2      9.3     22
Fabric, {WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK}
*/

public class TShirt {
    private String name;
    private Color color;
    private Size size;
    private Fabric fabric;
    private final float basePrice = 10;

    public TShirt() {
    }
       
    public TShirt(String name, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
    }

    public float getBasePrice() {
        return basePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.color);
        hash = 13 * hash + Objects.hashCode(this.size);
        hash = 13 * hash + Objects.hashCode(this.fabric);
        hash = 13 * hash + Float.floatToIntBits(this.basePrice);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TShirt other = (TShirt) obj;
        if (Float.floatToIntBits(this.basePrice) != Float.floatToIntBits(other.basePrice)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.fabric != other.fabric) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TShirt{" + "name=" + name + ", color=" + color + ", size=" + size + ", fabric=" + fabric + ", basePrice=" + basePrice + '}';
    }   
}
