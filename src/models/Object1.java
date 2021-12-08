/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import controllers.TrongException;
import java.io.Serializable;

/**
 *
 * @author nguyen
 */
public class Object1 implements Serializable {
    private int ma;
    private String ten;
    private static int sma = 1000;

    public Object1() {
    }

    public Object1(String ten) throws TrongException  {
        if(ten.isEmpty()){
            throw new TrongException();
        }
        this.ma = sma++;
        this.ten = ten;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Object1.sma = sma;
    }
    public Object[] toObject() {        
        return new Object[] { ma, ten };    
    }
    

}
