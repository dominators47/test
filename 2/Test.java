public class Test {
    public static void main(String[] args) {
        Person p = new Person("Alice");
        System.out.println(p.name); // ❌ 错误：无法访问私有属性
    }
}
