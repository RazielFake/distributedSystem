package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextField;

/**
 *
 * @author Raziel
 */
public class UIController {
    private int hour;
    private int minute;
    private int second;
    Pattern pat  = Pattern.compile("[0-9]+");
    
    public void adjust(JTextField JThour, JTextField JTminute, JTextField JTsecond){
        //HOURS
        if(matching(JThour)){
            this.hour = Integer.parseInt(JThour.getText());
        }else{
            this.hour = 0;
            JThour.setText("0");
        }
        //MINUTES
        if(matching(JTminute)){
            this.minute = Integer.parseInt(JTminute.getText());
        }else{
            this.minute = 0;
            JTminute.setText("0");
        }
        //SECONDS
        if(matching(JTsecond)){
            this.second = Integer.parseInt(JTsecond.getText());
        }else{
            this.second = 0;
            JTsecond.setText("0");
        }
        
        //THIS METOD ADJUST THE TIME IF THE VALUES ARE BIGGER THAN THEY SHOYLD
        adjustTime();
    }
    
    public boolean matching(JTextField mtch){
        Matcher mat = pat.matcher(mtch.getText());
        if(mat.matches())
            return true;
        else
            return false;
    }
    
    
    public void adjustTime(){
        if(this.second >= 60){
            this.minute += Math.floor(this.second/60);
            this.second = this.second%60;
            
        }
        if(this.minute >= 60){
            this.hour += Math.floor(this.minute/60);
            this.minute = this.minute%60;
        }
        if(this.hour >= 24){
            this.hour = this.hour%24;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    
}
