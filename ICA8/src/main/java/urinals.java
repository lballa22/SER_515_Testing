import javax.swing.plaf.synth.SynthLookAndFeel;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author LOKA KALYAN BALLA
 */
public class urinals {
    public static void main(String args[]) throws IOException {
        freeUrinals f = new freeUrinals();
        Scanner sc = new Scanner(System.in);
        String choice;
        while(true)
        {
            System.out.println("Enter your Input:");
            System.out.println("1-> Input from keyboard\n 2->Read input from File\n 3->Exit" );
            choice = sc.next();
            if(choice.equals("1"))
            {
                System.out.println("Enter the input string:");
                String str = sc.next();
                if(f.goodString(str))
                {
                    System.out.println("The number of urinals available");
                    System.out.println(f.checkFreeUrinals(str));
                }
                else{
                    System.out.println("Please enter correct input");
                }
            }
            if(choice.equals("2"))
            {
                String[] urinal = f.readFile("./ICA8/src/main/resources/urinal.dat");
                String ruleFile = f.writeFile(urinal);
                System.out.println("Output is written to " + ruleFile);
            }
            if(choice.equals("3"))
            {
                System.out.println("exiting");
                break;
            }
        }
    }
}
