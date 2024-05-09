public class Chatbot
{
	public String greeting()
	{
		return "Whats on your mind broski";
	}
	
	String color = "";
	String sport = "";
	String pet = "";
	String name = "";
	String nameOfPet = "";
	
	public String getResponse(String statement)
	{
		String response = "";
		//String name = "";
		//String nameOfPet = "";
		//String pet = "";
		//String color = "";
		//String sport = "";
		statement = statement.trim();
		if (statement.indexOf("no") >= 0)
		{
		    response = "we dont need negativity";
		} else if (
		    statement.indexOf("mother") >= 0 ||
		    statement.indexOf("brother") >= 0 ||
		    statement.indexOf("sister") >= 0 ||
		    statement.indexOf("father") >= 0
		)
	    {
	        response = "enlighten me about your family";
	    } else if (
	        statement.indexOf("weather") >= 0 ||
		    statement.indexOf("sun") >= 0 ||
		    statement.indexOf("rain") >= 0 
		    
		    
        )
        {
            response = "Righht, the weather is good here isn't it?.";
           
        } else if (
            statement.indexOf("cat") >= 0 || 
            statement.indexOf("dog") >= 0
        )
        {
            petStatement();
        }
        
        else if
        (statement.indexOf("snacks") >= 0 ||
        statement.indexOf("breakfeast") >= 0 ||
        statement.indexOf("lunch") >= 0 ||
        statement.indexOf("dinner") >= 0
        )
       {
           response = "Tell me more about that meal.";
       }
       
       else if
       (statement.indexOf("soccer") >= 0 ||
       statement.indexOf("football") >= 0 ||
       statement.indexOf("basketball") >= 0 ||
       statement.indexOf("tennis") >= 0
       )
       {
           response = "i like sports too, thas so cool";
       }
       
       else if(
           statement.indexOf("alfredo") >= 0 ||
           statement.indexOf("spaghetti") >= 0 ||
           statement.indexOf("steak") >= 0 ||
           statement.indexOf("lasagna") >= 0
           )
           {
               response = "Those food sounds great.";
           }
        else if(
            statement.indexOf("read") >= 0 ||
            statement.indexOf("video games") >= 0 ||
            statement.indexOf("party") >= 0 ||
            statement.indexOf("friends") >= 0 ||
            statement.indexOf("exercise") >= 0
            )
            {
                response = "that sound like a great thing to do in your free time";
            }
        else if(
            statement.indexOf("fall") >= 0 ||
            statement.indexOf("spring") >= 0 ||
            statement.indexOf("summer") >= 0 ||
            statement.indexOf("winter") >= 0 ||
            statement.indexOf("autumn") >= 0
            )
            {
                response = "Thats my favorite season too, although I do like the others";
            }
            
            


        
        else if (
            statement.indexOf("mr.") >= 0 ||
            statement.indexOf("mrs.") >= 0 ||
            statement.indexOf("ms.") >= 0
        )
        {
            response = "Wow idc, tell me more about them";    
        }
        
        
        //I was able to get day 2 done but I was having trouble on the reponse back for 
        //the code to restate the name and favorite color. But I want to let you know that I 
        //do understand the concepts of substrings, and how i can use the substring method to capture 
        //the important part of a users statment, save it to remeber later in the future.
        
        /**
         * During school we you get the chance
         * could you help withe that part
         **/
         
        
        
        
        else if(
            statement.indexOf("my name is") >= 0
            
            )
            {
                name = statement.substring(11);
                response = "yo, whats up " + name;
            }
        else if(
            statement.indexOf("my favorite color is") >= 0
            )
            {
                color = statement.substring(20);
                response = "Yo thats crazy," + color + " is my favorite color aswell"; 
            }
        
        else if(
            statement.indexOf("what is my favorite color") >= 0
            )
            {
                response = "your favorite color is "+ color;
                
            }
            
        else if(
            statement.indexOf("what is my name ") >=0
        )
        {
            response = "your name is gonna have to be "+ name;
        }
        else if(
            statement.indexOf("my pet is a") >= 0
            )
            {
                pet = statement.substring(11);
                response = "I really adore "+ pet+ "s";
            }
        
        else if(
            statement.indexOf("my pets name is ") >= 0
            )
            {
                nameOfPet = statement.substring(15);
                response = "I already know"+ nameOfPet + " is a good boy or girl";
            }
            
        else if(
            statement.indexOf("what is my pets name") >= 0
            )
            {
                response = "Your "+pet+" is named "+ nameOfPet;
            }
        
        else if(
            statement.indexOf("what do you know about me?") >= 0
            )
            {
                response = "Your really thought I would forget about you, Your name was "+ name+", Your favorite color was "+color+", and the name of your pet was "+nameOfPet;
            }
            
        else if(
            statement.indexOf("My favorite sport is") >=0
            )
            {
                sport = statement.substring(19);
                response = sport+" Is my favorite sport too.";
            }
        else if(
            statement.indexOf("what is my favorite sport") >= 0
            )
            {
                response = "your favorite sport is "+ sport;
            }
        
        
        else if (
            statement.length() == 0)
            
            {
                shortStatement();
            }
            
        else if(
            statement.length() == 1)
            {
                noStatement();
            
            }
            else {
            response = randomResponse();
        }
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return String
	 */
	private String randomResponse()
	{
		int NUMBER_OF_RESPONSES = 6;
		double responseIndex = Math.random();
		int whichResponse = (int)(responseIndex * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "awsome, rad";
		}
		else if (whichResponse == 1)
		{
			response = "speak on that more";
		}
		else if (whichResponse == 2)
		{
			response = "thats cool";
		}
		else if (whichResponse == 3)
		{
			response = "can we speak on other buisness";
		}
		else if (whichResponse == 4)
		{
			response = "Not funny, uncool";
		}
		else if (whichResponse == 5)
		{
			response = "you like to keep your mouth running, huh?";
		}
		else if(whichResponse == 6)
		{
		    response = "I dont know about that but, do you have any other family";
		}
		else if(whichResponse == 7)
		{
		    response = "thats great, but do you play any sports";
		}
		else if(whichResponse == 8)
		{
		    response = "Awsome, but let me ask you this, what's your favorite season";
		}
		else if(whichResponse == 9)
		{
		    response = "between spaghetti, alfredo, lasagna, and steak, which food wood you pick to eat if it was your last day on earth.";
		}
		else if(whichResponse == 10)
		{
		    response = "Interesting, but what you like to do in your free time";
		}
		else if(whichResponse == 11)
		{
		    response = "that's very compelling, may iask what type of pet you have";
		}
		return response;
		
		
	}
	
	
	private void petStatement()
	{
	     System.out.println("Tell me more about your pet, like wahst his or hers name.");
	     
	    
	}
	
	private void shortStatement()
	{
	   System.out.println("Say something please");
	}
	
	private void noStatement()
	{
	    System.out.println("You need to say bit more than that");
	}
	

}