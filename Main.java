import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteFile writer = new ReadAndWriteFile();
        List<Integer> list = writer.readFile("text.txt");
        int max = FindMax.getMax(list);
        writer.writeMaxFromFile("result.txt",max);
    }
}
