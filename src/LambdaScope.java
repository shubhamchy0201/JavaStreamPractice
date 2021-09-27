public class LambdaScope extends SuperScope{
    private String member="GRANDPA";
    public interface Family
    {
        String who(String member);
    }

    public void testMember(String member)
    {
        System.out.println("Local member: "+member);
        System.out.println("Local member: "+this.member);
        System.out.println("Parent member: "+super.member);

        Family familyLambda=(familymember) ->{
            System.out.println(familymember);
            System.out.println("Local member: "+member);
            System.out.println("Local member: "+this.member);
            System.out.println("Parent member: "+super.member);
            return  familymember;
        };
        familyLambda.who(member);
    }
    public static void main(String[] args) {
        new LambdaScope().testMember("SON");
    }
}
