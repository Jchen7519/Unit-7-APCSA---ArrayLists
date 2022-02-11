import java.util.ArrayList;

public class NicknameGenerator
{
    /** The person’s first name in all uppercase letters, initialized
     * by the constructor.
     */
    private String firstName;

    /** The person’s last name in all uppercase letters, initialized
     * by the constructor.
     */
    private String lastName;

    /** Construct with first name and last name assignments */
    public NicknameGenerator(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /** Returns the number of vowels in lastName. */
    private int numVowels()
    {
        int count = 0;
       for (int i = 0; i < lastName.length(); i++)
       {
           if (lastName.substring(i, i+1).equals("A") || lastName.substring(i, i+1).equals("E")||lastName.substring(i, i+1).equals("I")||lastName.substring(i, i+1).equals("O")||lastName.substring(i, i+1).equals("U"))
           {
               count++;
           }
       }
       return count;
    }

    /** Returns the index of the first vowel in lastName.
     * Returns -1 if there are no vowels in lastName.
     * (not too hard!, but don't forget about it being in all capital
     * letters.  Mine didn't work at first!)
     */
    private int indexOfFirstVowel()
    {
        for (int i = 0; i < lastName.length(); i++)
        {
            if (lastName.substring(i, i+1).equals("A") || lastName.substring(i, i+1).equals("E")||lastName.substring(i, i+1).equals("I")||lastName.substring(i, i+1).equals("O")||lastName.substring(i, i+1).equals("U"))
            {
                return i;
            }
        }
        return -1;
    }


    /** Returns a list of shortened last names, as described
     * in part (a).
     */
    public ArrayList<String> shortLastNames()
    {
        ArrayList<String> nameList = new ArrayList<String>();
        if (numVowels() < 2)
        {
            nameList.add(lastName);
        }else{
            for (int i = indexOfFirstVowel() + 1; i <= lastName.length(); i++)
            {
                nameList.add(lastName.substring(0, i));
            }
        }
        return nameList;
    }

    /** Returns a list of nicknames, as described in part (b). */
    public ArrayList<String> nicknames()
    {
        ArrayList<String> nameList = shortLastNames();
        String first = firstName.substring(0, 1) + "-";
        ArrayList<String> nickList = new ArrayList<String>();
        for (String i : nameList)
        {
            nickList.add(first + i);
        }
        return nickList;
    }
}

