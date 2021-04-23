package equals;
//equals：拿一个对象与指定的对象进行内容比较

public class main {
    public static void main(String[] args) {
        char[] line ={'a','b','c'};
        //生成一个字符数组

        String a =new String(line);
        String b =new String(line);
        //创建两个String类型对象，并且都调用line字符数组

        System.out.println(a.equals(b));
        //把a和b进行equals比较
    }
}
