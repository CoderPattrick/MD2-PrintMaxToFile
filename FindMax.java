import java.util.List;

public class FindMax {
    public static int getMax(List<Integer> list){
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if(max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }
}
