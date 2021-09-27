public class TargetType {
    public interface Email
    {
        String constructEmail(String s);
    }
    Email email=(String name)->name+"google.com";

    public String getEmail(String s1,Email e)
    {
        return null;
    }

    public static void main(String[] args) {
        new TargetType().getEmail("hello",(String name)->name+"google.com");
    }
}
