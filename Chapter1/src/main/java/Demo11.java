import java.nio.charset.StandardCharsets;

public class Demo11 {
    public static void main(String[] args) {
        String s = "0x4d696e69536f6c69646974790000000000000000000000000000000000000000";
        //System.out.println(s.length());
        String str = "MiniSolidity";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] noBytes = new byte[32];
        for (int i = 0; i < 64; i++) {
            if (i < bytes.length){
                System.out.printf("%X  ",bytes[i]);
            } else {
                System.out.printf("%X",noBytes[i]);
            }

        }
    }
}
