package Question1;

interface Abc
{
    int add(int a,int b);
   
    }
    interface Dbc
    {
        int sub(int a,int b);
    }
    interface Ebc
    {
        int mul(int a,int b);
    }
    interface Fbc
    {
        int div(int a,int b);
    }
    public class InterfaceDemo{
        public static void main(String []args){
        Abc obj=(a,b)->(a+b);
        System.out.println(obj.add(10,20));
        Dbc c=(a,b)->(a-b);
        System.out.println(c.sub(9,1));
        Ebc s=(a,b)->(a*b);
        System.out.println(s.mul(5,7));
        Fbc h=(a,b)->(a/b);
        System.out.println(h.div(10,2));
        }
    }

