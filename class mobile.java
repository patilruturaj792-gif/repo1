class Mobile
{
   void call()
   {
       System.out.println("Making a Call");
       
   }
}

class smartphone extends Mobile
{
   void browseinternet()
   {
       System.out.println("Browsing the Internet");
   }
}
public class SingleInheritence {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       smartphone s1=new smartphone();
       s1.call();
       s1.browseinternet();
   }

}
