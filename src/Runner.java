public class Runner {
    private static String[] firstNames={"goo","gaa"};
    private static String[] familyNames={"last","last2"};

    public static void main (String[] args)
    {
        Student sampleStudent = new Student("Tim","Tom");
        Teacher sampleTeacher =  new Teacher("Science","Mr","Liu","Phillipe");

        Student[] students={};

        System.out.println(sampleTeacher);
        System.out.println(sampleStudent);

    }



}
