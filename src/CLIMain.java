import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CLIMain {
	public static String version = "1.0.0";
	public static String update = "2023/05/07";
	public static void main(String[] args) throws ParseException {
		// create Options object
		Options options = new Options();

		// add options
		options.addOption("t", "time", false, "display current time");
		options.addOption("h", "help", false, "display current time");
		
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);

		if(cmd.hasOption("h")) {
			HelpFormatter hf = new HelpFormatter();
        	hf.printHelp("CLIToolBase", "A simple template repo for Java CLI tool.", options, "\nversion " + version + " at " + update, true);
           	System.exit(0);
		} else if (cmd.hasOption("t")) {
			System.out.println("Sample output with [-t|--time] option.");
		} else {
			System.out.println("Sample output without [-t|--time] option.");		
		}
	}
}
