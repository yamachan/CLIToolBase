import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CLIMain {

	public static void main(String[] args) throws ParseException {
		// create Options object
		Options options = new Options();

		// add t option
		options.addOption("t", false, "display current time");
		
		CommandLineParser parser = new DefaultParser();
		CommandLine cmd = parser.parse(options, args);

		if(cmd.hasOption("t")) {
			System.out.println("Sample output with t option.");		
		} else {
			System.out.println("Sample output without t option.");		
		}
	}
}
