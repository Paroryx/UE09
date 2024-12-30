public class Task {
    public final String name ;
    public final int duration ;

    public Task ( String name , int duration ) {
        this . name = name ;
        this . duration = duration ;
    }

    @Override
    public String toString(){
        return String.format("(%dh) %s", duration , name );
    }
}