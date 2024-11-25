public class stutext {
    public static void main(String[] args) {
        student stu = new student("Alice",20);
        System.out.println("name:"+stu.getName());
        System.out.println("age:"+stu.getAge());
        stu.setName("Bob");
        stu.setAge(18);
        stu.setAge(-5);
        System.out.println("update name:"+stu.getName());
        System.out.println("update age:"+stu.getAge());
        
    }
}
