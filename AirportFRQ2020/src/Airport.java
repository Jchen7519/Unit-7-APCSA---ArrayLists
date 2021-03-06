import java.util.ArrayList;

public class Airport
{
    /** A list of the flights into and out of this airport
     *  Guaranteed not to be null and to contain only non-null entries
     */
    private ArrayList<Flight> allFlights;

    public Airport(ArrayList<Flight> flights)
    {
        allFlights = flights;
    }

    public ArrayList<Flight> getAllFlights()
    {
        return allFlights;
    }

    /** Returns the revenue generated by all flights at the airport,
     *  as described in part (a)
     */
    public double getTotalRevenue()
    {
        double totalRev = 0;
        for (Flight i : allFlights)
        {
            if (i.getNumPassengers() > i.getCapacity()){
                totalRev += i.getCapacity() * i.getPrice();
            }else{
                totalRev += i.getNumPassengers() * i.getPrice();
            }
        }
        return totalRev;
    }

    /** Updates the list of flights by removing certain flights and
     *  returns the total number of passengers whose flights were removed,
     *  as described in part (b)
     */
    public int updateFlights()
    {
        int totalPass = 0;
        for (int i = allFlights.size() - 1; i >= 0; i--)
        {
            if (allFlights.get(i).getNumPassengers() < 0.2 * allFlights.get(i).getCapacity())
            {
                totalPass += allFlights.get(i).getNumPassengers();
                allFlights.remove(i);
            }
        }
        return totalPass;
    }
}
