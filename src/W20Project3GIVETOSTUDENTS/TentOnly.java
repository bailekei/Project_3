package W20Project3GIVETOSTUDENTS;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TentOnly extends CampSite {

    private int numberOfTenters;

    public TentOnly() {
    }

    public TentOnly(String guestName,
                    GregorianCalendar checkIn,
                    GregorianCalendar estimatedCheckOut,
                    GregorianCalendar actualCheckOut,
                    int numberOfTenters) {
        super(guestName, checkIn, estimatedCheckOut, actualCheckOut);
        this.numberOfTenters = numberOfTenters;
    }

    public int getNumberOfTenters() {
        return numberOfTenters;
    }

    public void setNumberOfTenters(int numberOfTenters) {
        this.numberOfTenters = numberOfTenters;
    }

    /****************************************************************************************************************
     *Method that finds the cost of the tents. RETURN TO LATER. VALUES ARE SLIGHTLY LARGER
     *
     * @param checkOut GregorianCalender - the check out date
     * @return double cost
     ****************************************************************************************************************/

    @Override
    public double getCost(GregorianCalendar checkOut) {
        double cost = 10;

        GregorianCalendar gTemp = new GregorianCalendar();
        gTemp = (GregorianCalendar) checkOut.clone();

        while(gTemp.after(checkIn)){
            if(numberOfTenters > 10)
                cost += 20;
            else
                cost += 10;
            gTemp.add(Calendar.DATE, -1);
        }
        return cost;
    }

    @Override
    public String toString() {
        return "TentOnly{" +
                "numberOfTenters=" + numberOfTenters +
                super.toString() +
                '}';
    }

}
