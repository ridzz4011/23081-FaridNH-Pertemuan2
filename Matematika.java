package pertemuan3.code7;

public class Matematika implements MathRule {
    private double a, b;

    public Matematika (double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double pertambahan() {
        return a + b;
    }

    @Override
    public double pengurangan() {
        return a - b;
    }

    @Override
    public double perkalian() {
        return a * b;
    }

    @Override
    public double pembagian() {
        if (b != 0) {
            return a / b;
        } else {
            System.err.println("Error: Tidak dapat membagi dengan 0!");
            return Double.NaN; // Kembalikan nilai null
        }
    }

}
