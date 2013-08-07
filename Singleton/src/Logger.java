/**
 * Created with IntelliJ IDEA.
 * User: maxmiller
 * Date: 8/5/13
 * Time: 6:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class Logger {
    private static Logger instance;

    private Logger() {}

    static Logger getInstance(){
         if(instance == null) {
             instance = new Logger();
         }
         return instance;
    }

    public void log() {
        System.out.print("log!");
    }

    public static void main(String[] args){
        Logger.getInstance().log();
    }
}
