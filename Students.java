public class Students {
    //Properties
    private String name;
    private int age;
    private String subject;
    private String grade;
    private Long studentId;
    
    // Non parameterized constructor
    public Students(){
        System.out.println("From non parameterized constructor");
    }
    // Parameterized constructor
    public Students(String name,int age,String subject,String grade,long studentId){
        System.out.println("From parameterized constructor");
        this.name=name;
        this.age=age;
        this.subject=subject;
        this.grade=grade;
        this.studentId=studentId;
    }
    //Methods
    public String details(){
        return "Name: "+name+"\n"+"Age: "+age+"\n"+"Subject: "+subject+"\n"+"Grade: "+grade+"\n"+"StudentId: "+studentId;
    }

}
