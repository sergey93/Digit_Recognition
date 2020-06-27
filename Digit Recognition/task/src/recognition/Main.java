package recognition;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final int n = 5;
        final int m = 3;
        double[] inputNeurons = new double[n * m];
        Arrays.fill(inputNeurons, 1);
        double[] bias = { -1, 6, 1, 0, 2, 0, -1, 3, -2, -1 };

        double[][] weights = {
                { 1,  1,  1,  1, -1,  1,  1, -1,  1,  1, -1,  1,  1,  1,  1}, // 0
                {-1,  1, -1, -1,  1, -1, -1,  1, -1, -1,  1, -1, -1,  1, -1}, // 1
                { 1,  1,  1, -1, -1,  1,  1,  1,  1,  1, -1, -1,  1,  1,  1}, // 2
                { 1,  1,  1, -1, -1,  1,  1,  1,  1, -1, -1,  1,  1,  1,  1}, // 3
                { 1, -1,  1,  1, -1,  1,  1,  1,  1, -1, -1,  1, -1, -1,  1}, // 4
                { 1,  1,  1,  1, -1, -1,  1,  1,  1, -1, -1,  1,  1,  1,  1}, // 5
                { 1,  1,  1,  1, -1, -1,  1,  1,  1,  1, -1,  1,  1,  1,  1}, // 6
                { 1,  1,  1, -1, -1,  1, -1, -1,  1, -1, -1,  1, -1, -1,  1}, // 7
                { 1,  1,  1,  1, -1,  1,  1,  1,  1,  1, -1,  1,  1,  1,  1}, // 8
                { 1,  1,  1,  1, -1,  1,  1,  1,  1, -1, -1,  1,  1,  1,  1}, // 9
        };
        int k = 0;
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("");
            for (int j = 0; j < m; j++) {
                if (!line[j].equals("X")) {
                    inputNeurons[k] = 0;
                }
                k++;
            }
        }
        double[] outputNeurons = performOutputNeurons(inputNeurons, weights, bias);
        System.out.println("This number is: " + maxOutNeuron(outputNeurons));
    }

    public static int maxOutNeuron(double[] outputNeurons) {
        int iMax = 0;
        for (int i = 0; i < outputNeurons.length; i++) {
            if (outputNeurons[i] > outputNeurons[iMax]) {
                iMax = i;
            }
        }
        return iMax;
    }

    public static double[] performOutputNeurons(double[] inputNeurons, double[][] weights, double[] bias) {

        double[] outputNeurons = new double[10];
        //Arrays.fill(outputNeurons, 0);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 15; j++) {
                outputNeurons[i] += inputNeurons[j] * weights[i][j];
            }
            outputNeurons[i] += bias[i];

        }

        return outputNeurons;
    }


}
