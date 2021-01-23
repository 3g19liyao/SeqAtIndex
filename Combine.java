package LiKou;

import java.util.ArrayList;
import java.util.List;

public class Combine {
    static List<List<Integer>> lists = new ArrayList<>();
    public static void main(String[] args) {
        List<List<Integer>> lists = combine(4,2);
        System.out.println(lists);
    }
    public static List<List<Integer>> combine(int n, int k) {
        for(int i = 1;i <= n;i++){
            List<Integer> list = new ArrayList<>();
            func(i,n,k,list);
        }
        return lists;
    }

    private static void func(int i, int n, int k, List<Integer> list) {
        if(list.size() == k){
            System.out.println(list);
            lists.add(list);
            System.out.println(lists);
            System.out.println("-------");
            return ;
        }
        list.add(i);
        for(int p = 1;p <= n-i;p++){
            System.out.println(i+p);
            func(i+p,n,k, list);
            System.out.println(list+"---");
            list.remove(list.size()-1);
            System.out.println(list+"***");
        }
    }
}
