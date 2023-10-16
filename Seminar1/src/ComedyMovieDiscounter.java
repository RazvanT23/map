public class ComedyMovieDiscounter implements Discounter {
    @Override
    public double calculatePrice() {
        double basePrice = 0;
        return basePrice * 0.5;
    }
}