import java.io.*;

class Converter {
    public static char[] convert(String[] words) throws IOException {
        CharArrayWriter writer = new CharArrayWriter();
        for (int i = 0; i < words.length; i++) {
            writer.write(words[i]);
        }
        return writer.toCharArray();
    }

    public static void main(String[] args) {
        File sampleFile = new File("sample.txt");
        byte[] content = new byte[] {'J', 'a', 'v', 'a'};

        try (OutputStream outputStream = new FileOutputStream(sampleFile)) {
            outputStream.write(content);
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}