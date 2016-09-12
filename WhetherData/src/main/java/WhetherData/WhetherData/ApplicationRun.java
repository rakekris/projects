package WhetherData.WhetherData;

import com.cwa.wd.WeatherDataLogger;
public class ApplicationRun 
{
    public static void main( String[] args )
    {
    	WeatherDataLogger weatherDataLogger = new WeatherDataLogger();
    	if (args.length==1 && args!=null && args[0] != null && args[0].matches("[0-9]+")) {
    		weatherDataLogger.writeWeatherDataIntoFile(Integer.parseInt(args[0])); 
    	}
    	else
    		System.out.println("Please provide a valid input, ex : 100");
            
    }
    }
