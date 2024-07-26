package com.pranav;

import com.ramakanth.FinalTest;

public class FinalTestSubClass extends FinalTest{

    public void Ptest(){
        super.finalize();
    }
    public void differentMethod(){
        double mypi= FinalTest.PI;
        FinalTest test=new FinalTest();
        test.trytoChange();

    }
}
