import java.util.*;

/**
 * @author huangbentai
 * @date 2022/12/13 18:53
 */
public class Demo14 {
    public static void main(String[] args) {
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isUpperCase('c'));
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isISOControl('d'));
        String s = "aaaaaabcdefg";
        System.out.println(s.substring(0, 3));
        String a = s.replaceAll("a", "");
        System.out.println(a);

        int[] map = new int[123];
        map['a'] = 1;
        map['z'] = 1;
        System.out.println(Arrays.toString(map));
        System.out.println(Character.toString(122));
        System.out.println((char) 122);
        String a1 = String.valueOf('a');
        System.out.println(a1);
        String n = "00001010000000000000001111000001";
        String substring = n.substring(0, 8);
        System.out.println(substring);

        System.out.println(Long.parseLong(n,2));

        String ip = "192.168.0.1";
        String[] split = ip.split("\\.");
        System.out.println(Arrays.toString(split));

        String[] sArr = {"asd","bcd","acs","cds"};
        Arrays.sort(sArr);
        System.out.println(Arrays.toString(sArr));

        char[] chars = {'a','b','a'};

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(1);
        Collections.sort(list, (o1, o2) -> o1 - o2);
        for (Integer integer : list) {

        }


        ArrayList<Map<String,Integer>> lists = new ArrayList<>();
        Map<String,Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("a",1);
        lists.add(stringIntegerMap);
        System.out.println(lists.size());
        System.out.println(lists.get(0));
        for (Map<String, Integer> stringIntegerMaps : lists) {
            System.out.println(stringIntegerMaps);
            Object object = stringIntegerMaps.keySet().toArray()[0];
            System.out.println(object);
        }

        

    }
}
