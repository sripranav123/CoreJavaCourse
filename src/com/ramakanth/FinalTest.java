package com.ramakanth;

public class FinalTest {
    public final static double PI=3.14;
    public final static String MYCITY="Anantapur";
    public static void main(String[] args){
        FinalTest test=new FinalTest();
        test.trytoChange();
        int[] myarray=new int[5];
        try {
            //int a = myarray[10];
            int a=10/0;
            System.out.println("this is the last line.......");
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array index out of bounds.");
        }
        catch(Exception e){
            System.out.println("");
            e.printStackTrace();
        }finally {
            System.out.println("in finally.");
        }
    }
    public final void trytoChange(){
        System.out.println("This is Final Method");
    }
    @Override
    protected void finalize(){

    }
}
