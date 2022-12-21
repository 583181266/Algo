import DPAlgo.StringUtils;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @author huangbentai
 * @date 2022/12/16 12:25
 */
public class Demo16 {
    public static void main(String[] args) {
        String s = "r 22-18-21-21-7-20 3-23-10-6;c;q0;p 1;b A6;c;b A5;b A1;c;q1;p 5;\n";
        String[] split = s.split(";");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i].charAt(0));
            System.out.println("Step   " + split[i]);
        }
    }
}
