package WhetherData.WhetherData;

import com.cwa.wd.WeatherDataLogger;
public class ApplicationRun 
{
    public static void main( String[] args )
    {
    	WeatherDataLogger weatherDataLogger = new WeatherDataLogger();
    	weatherDataLogger.writeWeatherDataIntoFile(Integer.parseInt(args[0]));
            
    }
    }
