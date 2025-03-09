import java.util.Scanner;
class Amma{
             int n_students;
             int n_employees;
             double cgpa;}
    
//sub class
class Eng extends Amma{
	Eng (int n_students,int n_employees,double cgpa)  {
        this.n_students=n_students;
        this.n_employees=n_employees;
        this.cgpa=cgpa;}
     void cse(int n_students,int n_employees,double cgpa){
        System.out.println("No.of students"+n_students+"no.of employees"+n_employees);
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
    
}}

class singleinheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your cgpa");
        double cgpa=sc.nextDouble();
        Eng eng1=new Eng(7,8,8.9);
        if (cgpa>=8.5){
        eng1.cse(10, 5,8.52);}
        else if (cgpa>=7.5){
        eng1.ai(5,7);}
        else {
        eng1.ds(8,9);}
    }}



