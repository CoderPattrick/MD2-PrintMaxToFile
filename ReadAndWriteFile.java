import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class ReadAndWriteFile {
    public List<Integer> readFile(String path){
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader reader =new BufferedReader(new FileReader(file));
            String line ="";
            while((line= reader.readLine())!=null){
                numbers.add(parseInt(line));
            }
            reader.close();
        }
        catch (Exception e){
            System.err.println("File not exists or something wrong with the file.");
        }
        return numbers;
    }
    public void writeMaxFromFile(String path,int max){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
//            BufferedWriter writer = new BufferedWriter(new FileWriter(path,true));
//            dùng lệnh dưới nếu muốn ghi tiếp nội dung mà k xóa nội dung cũ, còn để mặc định như trên là ghi đè nội dung.
            writer.write("Max = "+max);
            writer.close();
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
