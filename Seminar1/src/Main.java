import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[]args) {
        List<Tool> tool = List.of(new Hammer(10 ,"hammer"));
        System.out.println(ToolsFilter.filterbyweight(tool,7));

        int [] arr = {6,5,6,7};

        ArraySorter sorter = new ArraySorter();
        sorter.setSortingStrategy(new SlowSorter());
        sorter.sortArray(arr);

        System.out.println(Arrays.toString(arr));

       // OrderLine orderLine = new OrderLine(10,new ComedyMovie("Bad Movie",10));
       // System.out.println((orderLine.calculatePrice()));

        OrderLine orderLine = new OrderLine(10, new ComedyMovie("Bad Movie", 10), new ComedyMovieDiscounter());

        System.out.println(orderLine.calculatePrice());

    }
}