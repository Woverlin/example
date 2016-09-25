package Exam2_OOP;

public class PTbac1 {
	//member variables
    private double a;   //private - hide data
    private double b;   // encapsulation
    //constructor
    public PTbac1()//default constructor
    {
        a = b = 0; //0x+0=0
    }
    //ã+b=0
    public PTbac1(double a,double var_b)//overloading constructor 
    {
        this.a = a;
        b= var_b;
    }
    //member methods
    public String GiaiPhuongTrinh()
    {
        String kq = "";
        if (a == 0 && b == 0)
            kq = "pt vo so nghiem";
        else
            if (a == 0)
            kq = "pt vo nghiem";
        else
            kq = "nghiem x=" + (-b / a);
        return kq;
    }

}
