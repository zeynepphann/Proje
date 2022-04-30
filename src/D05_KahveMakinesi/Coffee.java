package D05_KahveMakinesi;

public class Coffee {
    private String coffee;

    public String getCoffee() {
        return coffee;
    }

    @Override
    public String toString() {
        return
               coffee +" " ;
    }

    public Coffee(String coffee) {
        this.coffee = coffee;
    }
}
