import java.util.ArrayList;
import java.util.List;

public class SILab2 {

   public static List<String> function(List<String> list) {//1
        if (list.size() <= 0) {//2
            throw new IllegalArgumentException("List length should be greater than 0");//3
        }//4
        List<String> numMines = new ArrayList<>();//5
        for (int i = 0; i < list.size(); i++) {//6
            if (!list.get(i).equals("#")) {//7
                int num = 0;//8
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {//9
                    num++;//10
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {//11
                    num++;//12
                }
                numMines.add(String.valueOf(num));//13
            } else {//14
                numMines.add(list.get(i));//15
            }
        }//16
        return numMines;//17
    }//18
}
