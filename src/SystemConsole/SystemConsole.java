package SystemConsole;

import java.io.Console;

public class SystemConsole {

    public void T1Console() 
    {
        //Wird fehler ausgeben, in der IDE geht es nicht, siehe dazu
       //Java 7 Das Handbuch auf Seite 75!
        Console cons = System.console();
        cons.printf("Ausgabe mit printf");
        cons.printf("\nEinlesen des Alters");
        cons.printf("\n Geben Sie Ihr Alter ein: ");
        String eingabe = cons.readLine();
        int geburtstjahr = Integer.parseInt(eingabe);
        //Java 7 das Handbuch Seite 74
        cons.printf("Ihr Alter ist: %1$s ", geburtstjahr);
//        System.out.println("sout"+geburtstjahr);
        
    }
}
