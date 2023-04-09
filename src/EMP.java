public class EMP {
    Integer Salary;
    int EMPID;
    String EMPName;

    void Display(){
        System.out.println(EMPID);
        System.out.println(EMPName);
        System.out.println(Salary);
    }
    public static void main(String args[]){
        EMP object = new EMP();
        object.Display();
    }
}
