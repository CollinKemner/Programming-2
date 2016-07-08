
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Collin Kemner
 */
public class Clock {
    
    private int Hours;
    
    private int Minutes;
    
    /**
     *
     * @param hour
     * @param minute
     */
    public Clock (int hour, int minute)
    {
        if (hour < 0 || hour > 23)
            Minutes = ((minute >= 0 && minute < 59) ? minute : 0);
            
    }
    
    public void initializeHours(int hour)
    {
        Hours = hour;
    }
    
    public int getHour()
    {
        return Hours;
    }
    
    public void initializeMinutes(int minute)
    {
        Minutes = minute;
        
    }
    
    public int getMinutes()
    {
        return Minutes;
    }
    
    /*private String setHoursString = new Integer(Hours).toString();
    private String setMinutesString = new Integer(Minutes).toString();
    private String TimeStatement = setHoursString + ":" + setMinutesString;
    
    public String getTime()
    {
        return TimeStatement;
    }
    */
}
