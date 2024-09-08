//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CWH_15_PS3 {
    public static void main(String[] args) {
        //Question 1
        String name = "Jack Parker";
        System.out.println(name.toLowerCase());
        //Question 2
        String Name = "  harry  ";
        System.out.println(Name.replace(" " , "_" ));
        //Question 3
        String letter = "Dear <|NAME|> thanks a lot!";
        System.out.println(letter.replace("<|NAME|>" , "Tanya"));
        //Question 4
        String space = "This string contains  double and   triple spaces";
        System.out.println(space.indexOf("  "));
        System.out.println(space.indexOf("   "));
        //Question 5
        String myletter = "Dear Harry,\n\t This Java Course is Nice.\n\t Thanks";
        System.out.println(myletter);
    }
}