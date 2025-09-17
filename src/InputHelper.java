import java.util.Scanner;

public class InputHelper {

    private  InputHelper(){}
    private static final Scanner scanner = new Scanner(System.in);
    public static double readNumber(String msg)
    {
        double number = 0;
        boolean valid = false;
        while(!valid)

        {
            System.out.print(msg);
            String txt = scanner.nextLine();
            try
            {
                 number = Double.parseDouble(txt.trim());
                 valid=true;

            }
            catch (NumberFormatException e) {
                System.out.println("Error: you must enter a valid number");
            }
        }
        return number;
    }

    public static int readChoice(String msg, int min, int max)

    {
        int number =0;
        boolean valid = false;
        while (!valid)
        {
            System.out.println(msg);
            String txt = scanner.nextLine();

            try {

                number = Integer.parseInt(txt.trim());;
                if (number <= max && number >= min )
                {
                    valid = true;
                }
                else
                {
                    System.out.println("Error: the choice must be between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: you must enter an integer");
            }
        }

    return number;
    }
}
