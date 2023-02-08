package Arrays;

public class HarmonicAverage {
    public static void main(String[] args) {

        int[] harmonic = {7,8,9};
        double sum = 0.0;
        for (int i = 0; i < harmonic.length; i++) {
            sum += 1.0 / harmonic[i];
        }
        System.out.println(harmonic.length / sum);
    }
}
