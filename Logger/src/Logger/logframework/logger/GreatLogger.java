package Logger.logframework.logger;

import java.util.Scanner;

/**
 *
 */
public class GreatLogger implements Logger {

    private LoggerTarget target;
    private Class loggedClass;
    private static LogLevel appLogLevel;

    static {
        Scanner sc = new Scanner(System.in);
        System.out.println("Set the app log level");
        String logLevel = sc.nextLine();
        sc.close();

        appLogLevel = LogLevel.valueOf(logLevel);
    }

    public GreatLogger(LoggerTarget target, Class loggedClass) {
        this.target = target;
        this.loggedClass = loggedClass;
    }

    @Override
    public void log(LogLevel logLevel, String string) {
        if (logLevel.ordinal() >= this.appLogLevel.ordinal())
            target.write(this.loggedClass + " : " + logLevel + " : " + string);
    }
}