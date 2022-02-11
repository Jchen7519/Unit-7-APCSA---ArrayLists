import java.util.ArrayList;

public class LinearSearch
{
    // returns the index in elements at which target is found; -1 if not found
    public static int linearSearch(int[] elements, int target)
    {
        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String[] elements, String target)
    {
        for (int i = 0; i < elements.length; i++)
        {
            if (elements[i].equals(target))
            {
                return i;
            }
        }
        return -1;
    }

}
