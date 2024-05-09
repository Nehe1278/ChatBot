import java.util.Scanner;

/**
 * Code
 * This code adapted from
 * @author Laurie White
 */
public class ChatbotRunner
{
	public static void main(String[] args)
	{
		Chatbot bot = new Chatbot();
		System.out.println(bot.greeting());
		Scanner scanner = new Scanner(System.in);
		String statement = scanner.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println(bot.getResponse(statement));
			statement = scanner.nextLine();
		}
		scanner.close();
	}

}