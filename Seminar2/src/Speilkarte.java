public class Speilkarte {
    private String color;
    private int wert;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    @Override
    public String toString() {
        return "Speilkarte{" +
                "color='" + color + '\'' +
                ", wert=" + wert +
                '}';
    }
}
