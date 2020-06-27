import java.io.ByteArrayOutputStream;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /*int[] a = new int[2];
        int[] b = new int[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                if (i == 0) {
                    a[j] = Integer.parseInt(line[j]);
                } else {
                    b[j] = Integer.parseInt(line[j]);
                }
            }
        }
        double lengthA = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
        double lengthB = Math.sqrt(b[0] * b[0] + b[1] * b[1]);
        double product = a[0] * b[0] + a[1] * b[1];
        System.out.println(Math.toDegrees(Math.acos(product / (lengthA * lengthB))));*/
        int[] message = new int[] {114, 101, 97, 100, 32, 97, 98, 111, 117, 116, 32, 65, 83, 67, 73, 73};

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        for (int code : message) {
            outputStream.write(code);
        }

        System.out.println(outputStream.toString());
    }
}