package Logger.logframework.logger;

import java.io.PrintStream;

/**
 *
 */
public class Driver {

    static Logger logger = new GreatLogger(new ConsoleTarget(), Driver.class);

    public static void main(String... args){
        logger.log(LogLevel.Debug, "I'm in main");
        logger.log(LogLevel.Info, "Info string from main");
    }

    private static class ConsoleTarget implements LoggerTarget{
        private PrintStream ps;

        @Override
        public void configureTarget() {
            ps = System.out;
        }

        @Override
        public void write(String string) {
            ps.println(string);
        }
    }
}