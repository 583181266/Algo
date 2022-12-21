import java.util.TreeSet;

/**
 * @author huangbentai
 * @date 2022/12/21 10:42
 */
public class Demo17 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>((x,y) -> {
            if (x.equals("") || y.equals("")){
                return y.length() - x.length();
            }
            if (x.equals(y)){
                return 0;
            }

            int i = 0;
            while (x.charAt(i) - y.charAt(i) == 0){
                if (i == Math.min(x.length(),y.length()) - 1){
                    return x.length() - y.length();
                }
                i++;
            }
            return y.charAt(i) - x.charAt(i);

        });
        set.add("aaaaaaa");
        set.add("aaaaaaa");
        set.add("aa");

        set.add("abc");
        set.add("ab");
        set.add("ac");
        set.add("gg");
        set.add("xyz");
        set.add("a");

        set.add("c");



        System.out.println(set);

    }
}
