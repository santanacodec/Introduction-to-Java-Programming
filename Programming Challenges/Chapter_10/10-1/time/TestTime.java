/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Edgar Santana
 */
public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);
        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println(time3.hour + ":" + time3.minute + ":" + time3.second);
    }      
}
