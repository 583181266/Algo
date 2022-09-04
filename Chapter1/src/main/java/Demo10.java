import pojo.User;

public class Demo10 {
    public static void main(String[] args) {
        //extracted();
//        boolean flag = "abc".equals("abc");
//        System.out.println(1==2);
//        System.out.println("abQ" == "abQ");
//        System.out.println("abQ".hashCode());
        User user = new User();
        user.setAge(10);
        User user1 = new User();
        user1.setAge(10);
        System.out.println(System.identityHashCode(user));
        System.out.println(System.identityHashCode(user1));
        System.out.println(user.hashCode());

        System.out.println("==" +(user == user1));
        System.out.println("user和user1是否相等" + user.equals(user1));

    }

    private static void extracted() {
        String[] ch = {"rastar","game","hello","world"};
        char[][] chr = {
                {'r','a','s','t','a','r'},
                {'g','a','m','e'},
                {'h','e','l','l','o'}

        };
        System.out.printf("%s",ch[0] + 10);
        System.out.printf("%s",new String(chr[0]) + 10);
    }
}
