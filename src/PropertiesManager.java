

//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PropertiesManager {

	Properties properties = new Properties();
		
	public PropertiesManager(){
		try {
//			System.out.println("load oopg.properties start");
		    //properties.load(new FileInputStream("/opt/conf/oopg.properties"));
			InputStream is = getClass().getResourceAsStream("oopg.properties");
			if(is!=null){
				properties.load(is);
//				System.out.println("load oopg.properties success");
			}
//			System.out.println("load oopg.properties end");
		} catch (IOException e) {
			System.out.println("IOException: "+e);
		} catch (Exception ex){
			System.out.println("Exception: "+ex);
		}
	}
	
	public PropertiesManager(String propertiesFileName){
		try {
			System.out.println("load "+propertiesFileName+" start");
		    InputStream is = getClass().getResourceAsStream(propertiesFileName);
			
		    System.out.println("is: "+is);
		    
		    if(is!=null){
				properties.load(is);
				System.out.println("load "+propertiesFileName+" success");
			}
			System.out.println("load "+propertiesFileName+" end");
		} catch (IOException e) {
			System.out.println("IOException: "+e);
		} catch (Exception ex){
			System.out.println("Exception: "+ex);
		}
	}
	
	public String get(String keyValue){
		String retValue = "";
		
		retValue = properties.getProperty(keyValue);
		
		return retValue;
	}
	
	
	public int getReduceCentsAmount(int amount,String currencyCode)
	{
		try
		{
			String nonCentsCurrency = properties.getProperty("NON_CENTS_CALCULATE_CURRENCY");
		
			if(nonCentsCurrency!=null )
			{
				String [] nonCentsCurrencyAry = nonCentsCurrency.split(",");
				for(String tmpNonCentsCurrency : nonCentsCurrencyAry)
				{
					if(currencyCode.equalsIgnoreCase(tmpNonCentsCurrency))
					{
						//To divided the 100 amount for non cents currenies such as JPY, WON
						amount = amount /100;
						break;
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return amount;
	}
	
	public int displayReduceCentsAmount(int amount,String currencyCode)
	{
		boolean isDivided = false;
		try
		{
			String nonCentsCurrency = properties.getProperty("NON_CENTS_CALCULATE_CURRENCY");
		
			if(nonCentsCurrency!=null )
			{
				String [] nonCentsCurrencyAry = nonCentsCurrency.split(",");
				for(String tmpNonCentsCurrency : nonCentsCurrencyAry)
				{
					if(currencyCode.equalsIgnoreCase(tmpNonCentsCurrency))
					{
						//To divided the 100 amount for non cents currenies such as JPY, WON
						isDivided = true;
						break;
					}
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		if(!isDivided)
		{
			return amount / 100;
		}
		else
		{
			return amount;
		}
	}
}
