/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timers;



/**
 *
 * @author Franco.Garcia
 */
public class Timers {
    public static long start;
    public static long elapsedTime;
    
    public static void startTimer(){
        start = System.currentTimeMillis();
    }
    
    public static void endTimer(){
        elapsedTime = System.currentTimeMillis()-start;
    }
    
    public static String getTimer(){
        return String.valueOf((elapsedTime / 1000));
    }
        
}
