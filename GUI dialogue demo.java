import javax.swing .JOptionPane;

//this program demonstrates using dialogs with JOptionPane

public class NamesDialog
{
    public static void main(String[] args)
    {
        String firstName;
        String middleName;
        String lastName;
        //get the user first name
        firstName =
            JOptionPane.showInputDialog("what is " + "your first name? ");

        //get the usrs middle name
        middleName =
             JOption.showInputDialog("what is " + "your middle name? ");

        lastName =
             JOption.showInputDialog("what is " + "your last name? ");

       //display a greeting
       JOPtionPane.showMessageDialog(null, "Hello" + firstName + " " + middleName + " " + lastName);

       System.exit(0);


        
    }

}