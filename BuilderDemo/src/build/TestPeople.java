package build;

/**
 * author feiyang
 * create at 2018/9/13 11:29
 * description：
 */
public class TestPeople {
    //main方法快捷键  psvm
    public static void main(String[] args) {
        People.Builder builder = new People.Builder(1, "name");
        People people = builder.address("地址").age(15).desc("描述").build();
    }
}
