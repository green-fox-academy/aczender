import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        if (arrayList.size() == 0) {
            return 0;
        }
        return sum;
    }
}

