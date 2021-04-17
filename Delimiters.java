import java.util.*;
import java.util.ArrayList;
import java.util.List;

//Programmer: Kyle Kim
//Period: 2

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
		return false;
	}


  public ArrayList<String> getDelimitersList(String[] tokens)
  {
      //create an arraylist for the delimiters
      ArrayList<String> newDelimiter = new ArrayList<>();
      //change the list of tokens into an arraylist
      List<String> tokensA= new ArrayList<String>(Arrays.asList(tokens));
      //loop through the arraylist tokens
      for(int c=0; c<tokensA.size(); c++)
      {
        //if tokens is equal to the open delimiter add it to newdelimiter list
        if((tokensA.get(c)).equals(openDel))
        {
          String current=tokensA.get(c);
          newDelimiter.add(current);
        }
        //if tokens is equal to the close delimiter add it to newdelimiter list
        else if((tokensA.get(c)).equals(closeDel))
        {
          String current=tokensA.get(c);
          newDelimiter.add(current);
        }
        else
        {
        }
      }
      //return newDelimiter list
      return newDelimiter;
  }
}