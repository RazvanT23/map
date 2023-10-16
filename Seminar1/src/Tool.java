public class Tool {
    private int weight;
    private String name;

    @Override
    public String toString() {
        return "Tool{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    public Tool(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;

    }

    public boolean candCut(){
        return false;

    }
}
