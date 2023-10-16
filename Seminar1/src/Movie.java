public class Movie {
    private String title;

    public String getTitle() {
        return title;
    }

    public Movie(String title, double basePrice) {
        this.title = title;
        this.basePrice = basePrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", basePrice=" + basePrice +
                '}';
    }

    private double basePrice;

    public double calculatePrice() {
        return 0;
    }
}
