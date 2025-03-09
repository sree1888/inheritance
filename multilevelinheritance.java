import java.util.Scanner;
class Amma{                  //super class
    int n_students;
    int n_employees;
    double cgpa;
    

}
//sub class
class Eng extends Amma{
     void cse(int n_students,int n_employees,double cgpa){
        System.out.println("No.of students"+n_students+"no.of employees in"+n_employees);
        if (cgpa>=8.5){
            System.out.println("You are in slab 1");
        }}
    
     void ai(int n_students,int n_employees){
        System.out.println("No.of students"+n_students+"no.of employees"+n_employees);
        if (7.5>=cgpa){
            System.out.print("You are in  slab 2");
    }}
    
     void ds(int n_students,int n_employees){
        System.out.println("No.of students"+n_students+"no.of employees"+n_employees);
        System.out.print("You are in slab 3");
    }
}
class medical extends Eng{ 
    medical(int n_students,int n_employees,double cgpa)  {
        this.n_students=n_students;
        this.n_employees=n_employees;
        this.cgpa=cgpa;
    }    //sub class 2
    void mbbs(int n_students,int n_employees,double neet){
        System.out.println("No .of students  "+n_students+"no.of employees "+n_employees);
        if (neet>=720){
            System.out.println("You are in slab 1");
    }
    else if (neet>=600 && neet<720){
        System.out.println("You are in slab 2");
    }
    else{
        System.out.println("You are in slab 3");
}
 
}
    }

class multilevelinheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your cgpa");
        float cgpa=sc.nextFloat();
        System.out.println("Enter your neet score");
        int neet=sc.nextInt();
        medical m1=new medical(7,8,7.8);
        if (cgpa>=8.5){
        m1.cse(10, 5,8.52);}
        else if (cgpa>=7.5){
        m1.ai(5,7);}
        else {
        m1.ds(8,9);}
        m1.mbbs(12,18,cgpa);
    }
}

       