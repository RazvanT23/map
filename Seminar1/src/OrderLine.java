public class OrderLine {
    private int quantity;
    private Movie movie;

    private Discounter discounter;

    public OrderLine(int quantity, Movie movie, ComedyMovieDiscounter comedyMovieDiscounter){
        this.quantity = quantity;
        this.movie=movie;

    }

    public double calculatePrice(){
        return quantity * discounter.calculatePrice();
    }
}
