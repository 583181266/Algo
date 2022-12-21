package PAT;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;
import java.io.*;
/**
 * @author huangbentai
 * @date 2022/9/21 00:50
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        String count = in.readLine();
        Integer n = Integer.parseInt(count);


        for(int i = 0; i < n; i++){

            String temp = in.readLine();
            //三段A的位置0：第一段A的长度；1：第二段A的长度，2：第三段A的长度
            int[] counts = new int[3];
            //PT的数量
            int[] PTcount = new int[2];
            //PT的位置
            int[] PTLocation = new int[2];
            //三段A的位置下标
            int x = 0;
            //是否符合条件判断
            boolean isNotRight = false;
            for (int j = 0; j < temp.length(); j++) {

                if (temp.charAt(j) == 'A'){
                    counts[x]++;
                }
                // 记录P位置，并且把三段A中从第一段移动到第二段A的位置
                if (temp.charAt(j) == 'P'){
                    PTLocation[0] = j;
                    PTcount[0]++;
                    if (PTcount[0] > 1){
                        isNotRight = true;
                        break;
                    }
                    x++;
                }
                // 记录T位置，并且把三段A中从第二段移动到第三段A的位置
                if (temp.charAt(j) == 'T'){
                    PTcount[1]++;
                    PTLocation[1] = j;
                    if (PTcount[1] > 1){
                        isNotRight = true;
                        break;
                    }
                    x++;
                }
                // 如果出现不等于P A T的字符直接判断不符合
                if (temp.charAt(j) != 'P' && temp.charAt(j) != 'A' && temp.charAt(j) != 'T'){
                    isNotRight = true;
                    break;
                }
            }
            // T在P前面不符合
            if (PTLocation[0] > PTLocation[1]){
                System.out.println("NO");
                continue;
            }
            if (isNotRight){
                System.out.println("NO");
                continue;
            }
            //P和T的数量不唯一不符合
            if (PTcount[0] != 1 || PTcount[1] != 1){
                System.out.println("NO");
                continue;
            }
            // PT中间必须有A
            if (counts[1] == 0){
                System.out.println("NO");
                continue;
            }
            // 第一段A 的数量 * 第二段 A的数量 等于 第三段 A的数量符合条件
            if ((counts[0] * counts[1]) == counts[2]){
                System.out.println("YES");
                continue;
            }else {
                System.out.println("NO");
            }


        }

    }
}