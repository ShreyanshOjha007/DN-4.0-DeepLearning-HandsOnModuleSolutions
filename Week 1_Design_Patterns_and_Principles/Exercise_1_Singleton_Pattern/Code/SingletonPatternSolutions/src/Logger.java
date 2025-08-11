public class Logger {

    private static Logger loginInstance;

    private Logger(){
        System.out.println("Login successful!!! Welcome onboard");
    }

    public static Logger getInstance(){
        if(loginInstance == null) loginInstance = new Logger();
        return loginInstance;
    }
}
