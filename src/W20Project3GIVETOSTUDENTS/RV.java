package W20Project3GIVETOSTUDENTS;

import java.util.Calendar;
import java.util.GregorianCalendar;

/***********************************************************************************************************************
 * CIS 163 Project 3
 *
 * @author Keilani Bailey and Emma Owen
 **********************************************************************************************************************/

public class RV extends CampSite {

private int power;

    /****************************************************************************************************************
     * Default constructor for RV
     ****************************************************************************************************************/

    public RV() {
    }

    /****************************************************************************************************************
     * Constructor creates a die of specified size X size pixels
     *
     * @param guestName String
     * @param checkIn GregorianCalender
     * @param estimatedCheckOut GregorianCalender
     * @param actualCheckOut GregorianCalender
     * @param power int
     ****************************************************************************************************************/

    public RV(String guestName, GregorianCalendar checkIn, GregorianCalendar estimatedCheckOut, GregorianCalendar actualCheckOut, int power) {
        super(guestName, checkIn, estimatedCheckOut, actualCheckOut);
        this.power = power;
        }

    /*******************************************************************************************************************
     *Getter method for power
     *******************************************************************************************************************/

    public int getPower() {
        return power;
    }

    /*******************************************************************************************************************
     *Setter method for power
     *******************************************************************************************************************/

    public void setPower(int power) {
        this.power = power;
    }

    /****************************************************************************************************************
     *Method that allows the user to save the database under a given file name
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
            if(power > 1000)
                cost += 30;
            else
                cost += 20;
            gTemp.add(Calendar.DATE, -1);
        }
        return cost;
    }

    /****************************************************************************************************************
     *Method that converts string
     *
     * @param toString String
     * @return toString
     ****************************************************************************************************************/

    @Override
    public String toString() {
        return "RV{" +
                "power=" + power +
                super.toString() +
                '}';
    }
}