public class LambdaPractice {
    interface Greetings
    {
        public String sayHello(String g);
    }
     public void testGreeting(String a, Greetings g)
     {
         String result=g.sayHello(a);
         System.out.println("Result: "+result);
     }
    public static void main(String[] args) {
        //Lambda function
        //(String s) -> "Hello "+s
        new LambdaPractice().testGreeting("Shubham",(String s) -> "Hello "+s);
        //(String s) ->!s.isEmpty() ?"Howdy "+s:"Did you miss something"
        new LambdaPractice().testGreeting("sohan",(String s) ->!s.isEmpty() ?"Howdy "+s:"Did you miss something");
    }
}
