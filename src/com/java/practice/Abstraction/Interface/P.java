package com.java.practice.Abstraction.Interface;

public interface P {


//interface P
//{
    String p = "PPPP";
     
    String methodP();
}
 
interface Q extends P
{
    String q = "QQQQ";
     
    String methodQ();
}
 
class R implements P, Q
{
    public String methodP()
    {
        return q+p;
    }
     
    public String methodQ()
    {
        return p+q;
    }
}
 
