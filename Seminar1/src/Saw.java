import java.security.KeyStore;

public class Saw extends Tool implements Cut{
    public Saw(int weight, String name) {
        super(weight, name);
    }

    public boolean canCut(){
        return true;

    }

    @Override
    public void cut() {
        System.out.println("cutting>>>");
    }
}
