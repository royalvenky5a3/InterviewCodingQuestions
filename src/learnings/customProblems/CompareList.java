package learnings.customProblems;

import java.util.ArrayList;

public class CompareList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("100");
        list1.add("A");
        list1.add("a");
        System.out.println(isAsc(list1));

    }
    public static boolean isAsc(ArrayList<String> list){
        boolean isAsc = true;
        for(int i=1;i<list.size();i++){
            if(list.get(i).compareTo(list.get(i-1)) <= 0){
                isAsc = false;
            }
        }
        return isAsc;
    }
}
