
package da270a.lab.pkg1.client;

import java.util.Scanner;

/**
 *
 * @author KN
 */
public class CommandReader extends Thread
{

    public boolean hasCommand = false;
    private String value;

    @Override
    public void run()
    {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                value = in.nextLine();
                hasCommand = true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String getCommand()
    {
        hasCommand = false;
        return value;
    }

}
