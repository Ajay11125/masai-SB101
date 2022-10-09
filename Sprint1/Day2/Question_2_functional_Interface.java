package SB101_Day2_assignment;

public class Question_2_functional_Interface {
    public static int StringTonum(String S){
        return Integer.parseInt(S);
    }
    public static void main(String[] args) {
        x i=Question_2_functional_Interface::StringTonum;
        System.out.println(i.convetStringToNumber("121"));
    }


}
