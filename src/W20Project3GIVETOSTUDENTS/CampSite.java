package W20Project3GIVETOSTUDENTS;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public abstract class
CampSite implements Serializable {

    /** serial number */
    private static final long serialVersionUID = 1L;

    /** name of guest */
    protected String guestName;

    /** check in date */
    protected GregorianCalendar checkIn;

    /** estimated chedkout time*/
    protected GregorianCalendar estimatedCheckOut;

    /** actual check out date */
    protected GregorianCalendar actualCheckOut;

    /*****************************************************************
     Default constructor for campsite
     *****************************************************************/
    public CampSite() {
    }

    public abstract double getCost(GregorianCalendar checkOut);

    /*****************************************************************
     Constructor creates a die of specified size X size pixels
     @param guestName
     @param checkIn
     @param estimatedCheckOut
     @param actualCheckOut
     *****************************************************************/
    public CampSite(String guestName,
                    GregorianCalendar checkIn,
                    GregorianCalendar estimatedCheckOut,
                    GregorianCalendar actualCheckOut) {
        this.guestName = guestName;
        this.checkIn = checkIn;
        this.estimatedCheckOut = estimatedCheckOut;
        this.actualCheckOut = actualCheckOut;
    }

    /*******************************************************************************************************************
     *Getter method for guest name
     *******************************************************************************************************************/

    public String getGuestName() {
        return guestName;
    }

    /*******************************************************************************************************************
     *Setter method for guest name
     *******************************************************************************************************************/

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    /*******************************************************************************************************************
     *Getter method for checkin date
     *******************************************************************************************************************/

    public GregorianCalendar getCheckIn() {
        return checkIn;
    }

    /*******************************************************************************************************************
     *Setter method for checkin date
     *******************************************************************************************************************/

    public void setCheckIn(GregorianCalendar checkIn) {
        this.checkIn = checkIn;
    }

    /*******************************************************************************************************************
     *Getter method for estimated checkout date
     *******************************************************************************************************************/

    public GregorianCalendar getEstimatedCheckOut() {
        return estimatedCheckOut;
    }
    /*******************************************************************************************************************
     *Setter method for estimated checkout date
     *******************************************************************************************************************/

    public void setEstimatedCheckOut(GregorianCalendar estimatedCheckOut) {
        this.estimatedCheckOut = estimatedCheckOut;
    }

    /*******************************************************************************************************************
     *Getter method for checkout date
     *******************************************************************************************************************/

    public GregorianCalendar getActualCheckOut() {
        return actualCheckOut;
    }

    /*******************************************************************************************************************
     *Setter method for checkout date
     *******************************************************************************************************************/

    public void setActualCheckOut(GregorianCalendar actualCheckOut) {
        this.actualCheckOut = actualCheckOut;
    }

    // following code used for debugging only
    // IntelliJ using the toString for displaying in debugger.
    @Override
    public String toString() {
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

        String checkInOnDateStr;
        if (getCheckIn() == null)
            checkInOnDateStr = "";
        else
            checkInOnDateStr = formatter.format(getCheckIn().getTime());

        String  estCheckOutStr;
        if (getEstimatedCheckOut() == null)
            estCheckOutStr = "";
        else
            estCheckOutStr = formatter.format(getEstimatedCheckOut().getTime());

        String checkOutStr;
        if (getActualCheckOut() == null)
            checkOutStr = "";
        else
            checkOutStr = formatter.format(getActualCheckOut().getTime());

        return "CampSite{" +
                "guestName='" + guestName + '\'' +
                ", checkIn=" + checkInOnDateStr +
                ", estimatedCheckOut=" + estCheckOutStr +
                ", actualCheckOut=" + checkOutStr +
                '}';
    }
}
