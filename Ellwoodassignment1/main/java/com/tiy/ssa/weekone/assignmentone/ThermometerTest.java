package com.tiy.ssa.weekone.assignmentone;

public class ThermometerTest {
    int temperature;
    boolean convert;
    private String deg;
    public  ThermometerTest (int temperature){
        this(temperature, true,"c");}
    
    public ThermometerTest(int temperature, boolean convert, String deg )
    {
        this.temperature = temperature;
        this.convert = convert;
        this.deg = deg;
        
    }
//    public int displayq(boolean convert, String deg)
//    {
//        
//        int temp = 0;
//        
//        if(deg.toLowerCase() == "c")
//        {
//            
//            if(convert == true)
//            {
//                
//                
//                temp = (temperature * 9 / 5) + (32);
//                System.out.println(temp);
//                
//            }
//            else if(convert == false)
//            {
//                temp = temperature;
//                System.out.println(temp);
//                
//            }
//            
//        }
//        else if(deg.toLowerCase() == "f")
//        {
//            
//            if(convert == true)
//            {
//                temp = ((temperature - 32) * (5))/9;
//                System.out.println(temp);
//                
//            }
//            else if(convert == false)
//            {
//                temp = temperature;
//                System.out.println(temp);
//            }
//            
//        }
//        return temp;
//    }

    public int display(boolean convert, String deg ){
          int temp = 0;
          if(deg.toLowerCase() == "c")
            {              
                if(convert == true) { 
                    double temp1 = (temperature * 9f / 5f) + (32);
                    //int range 2^31 -1
                    temp =  (int) Math.round(temp1);//double converts to a long add cast int to make an int
                    //System.out.println(temp);
                    System.out.printf("%.2f is final temp %n", temp1);
                }
                else if(convert == false)
                  {
                      temp = temperature;
                      System.out.println(temp);
                  }
               }
            else if(deg.toLowerCase() == "f")
                  {
                      
                      if(convert == true)
                      {
                          temp = ((temperature - 32) * (5))/9;
                          System.out.println(temp);
                          
                      }
                      else if(convert == false)
                      {
                          temp = temperature;
                          System.out.println(temp);
                      }
                  }
    //  mine      if (userWantsFahrenheit == this.isFahrenheit){//for true or false
//            return this.temperature;}
////        if (userWantsFahrenheit!=this.isFahrenheit){
//        else {
//            temp = (int) ((temperature -32) *5.0/9.0);}
//       // if (true)
       return temp;
        
    }
    int fahrenheitToCelsisus(int temperature){//as long as it's in same package
        return -1;
    }
    int CelsisustoFahrenheit(){//as long as it's in same package
        return -1;
    }
 //does assignmet of memory slot occur at declaration or initialization   

}
//9/5*temperature + 32