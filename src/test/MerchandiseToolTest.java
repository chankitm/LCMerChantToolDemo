package test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import model.MerchToolSortRequest;
import model.MerchToolSortResponse;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;
import org.xmappr.Xmappr;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class MerchandiseToolTest {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	//		sendPost();
	//		testMultiply();
			merchandiseToolTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testMultiply() {

		// MyClass is tested

		// check if multiply(10,5) returns 50
		assertEquals("10 + 5 must be 15", 15, 10 + 5);
		assertEquals("10 * 5 must be 50", 50, 10 * 5);
	}
	
	static final private String LVL_ASC = "LowToHigh"; 
	static final private String LVL_DESC = "HighToLow"; 
	static final private String SORT_PRI_COLOUR = "Colour"; 
	static final private String SORT_PRI_SUBCATE = "SubCategory"; 
	static final private String SORT_PRI_NEWESTIN = "NewestIn"; 
	static final private String SORT_PRI_PRICE = "PricePoint"; 
	static final private String SORT_PRI_STOCK = "StockLevel"; 
	private final String USER_AGENT = "Mozilla/5.0";
	private static final String url = "http://192.168.42.129:8080/rest/bean/lc/rest/LCMerchandiseToolRest/sort";
	private final String portContent = "arg1={\"SearchMethod\": \"Category\","
			+ "\"TargetCategory_ID\":\"catd000129\","
			+ "\"PurgeCache\":false,\"Cache\":true,"
			+ "\"Region\":\"HK\","
			+ "\"SortLevel\": [\"Colour\",\"SubCategory\",\"PricePoint\",\"NewestIn\"],"
			+ "\"Colour\": [\"Red\",\"White\",\"Grey\",\"Neutral and Brown\",\"Black\",\"Pink\",\"Purple\",\"Blue and Green\",\"Yellow and Orange\",\"Multi-colour\",\"Metallic\",\"Animal Print\"],"
			+ "\"SubCategory\": [\"catd000128\",\"catd000120\",\"catd000116\",\"catd000110\",\"catd000104\",\"catd000098\",\"catd000090\",\"catd000082\",\"catd010010\",\"catd010020\"],"
			+ "\"PricePoint\":\"HighToLow\",\"NewestIn\": \"LowToHigh\",\"CallerReferenceNo\":\"ROY_TEST_12\"}";
	@Test
	public void merchandiseToolTest(){
		long start = System.currentTimeMillis();
		try {
//			String s_response = PostSortRequest(portContent);
			MerchToolSortRequest merchToolSortRequest = getMerchToolSortRequest();
			System.out.println("merchandiseToolTest() getSortLevel = " + merchToolSortRequest.getSortLevel());
			System.out.println("merchandiseToolTest() getSubCategory = " + merchToolSortRequest.getSubCategory());
			System.out.println("merchandiseToolTest() getColour = " + merchToolSortRequest.getColour());
			System.out.println("merchandiseToolTest() getPricePoint = " + merchToolSortRequest.getPricePoint());
			System.out.println("merchandiseToolTest() getNewestIn = " + merchToolSortRequest.getNewestIn());

			String postcontentFromReq = convertPOJO2JSON(merchToolSortRequest);
			String s_response = PostSortRequest(postcontentFromReq);
			MerchToolSortResponse j_response = parseResponse(s_response);
			
			org.junit.Assert.assertNotNull(j_response);
			
			if(null != j_response) 
				System.out.println("merchandiseToolTest() j_response = " + j_response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			System.out.println("merchandiseToolTest() elapsedtime = " + (System.currentTimeMillis() - start));
		}
	}
	
	

	public void digestJSONResponse(MerchToolSortRequest request ,String response){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//util functions
	private static String PostSortRequest(String postContent) {
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		String ret = "";
		try {
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			nameValuePairs.add(new BasicNameValuePair("arg1", postContent));
			post.setEntity(new UrlEncodedFormEntity(nameValuePairs));
			post.setHeader("Content-Type", "application/x-www-form-urlencoded");
			
			HttpResponse response = client.execute(post);
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					response.getEntity().getContent()));
			String line = "";
			while ((line = rd.readLine()) != null) {
				System.out.println(line);
				ret += line;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return ret;
	}
	public static String convertPOJO2JSON(Object input){
		Gson gson = new Gson();
		return gson.toJson(input);
	}
	public static MerchToolSortResponse parseResponse(String input) throws JsonSyntaxException{
		if(null == input) return null;
		Gson gson = new Gson();
		return gson.fromJson(input, MerchToolSortResponse.class);
	}
	
	static private MerchToolSortRequest getMerchToolSortRequest(){
		MerchToolSortRequest ret = new MerchToolSortRequest();
		ret.setTargetCategory_ID("catd000129");
		ret.setSortLevel(new ArrayList<String>(){{
			add(SORT_PRI_SUBCATE);
			add(SORT_PRI_COLOUR);
			add(SORT_PRI_PRICE);
//			add(SORT_PRI_NEWESTIN);
//			add(SORT_PRI_STOCK);
			}});
		
		ret.setColour(new ArrayList<String>(){{
			add("Red");
			add("White");
			add("Grey");
			add("Neutral and Brown");
			add("Black");
			add("Pink");
			add("Purple");
			add("Blue and Green");
			add("Yellow and Orange");
			add("Multi-colour");
			add("Metallic");
			add("Animal Print");
			}});
			
//		ret.setNewestIn(LVL_ASC);
		ret.setNewestIn(LVL_DESC);
//		ret.setPricePoint(LVL_ASC);
		ret.setPricePoint(LVL_DESC);
//		ret.setStockLevel(LVL_ASC);
//catd000128","catd000120","catd000116","catd000110","catd000104","catd000098","catd000090","catd000082","catd010020","catd010010		
		ret.setSubCategory(new ArrayList<String>(){{	
			add("catd000128");
			add("catd000120");
			add("catd000116");
			add("catd000110");
			add("catd000104");
			add("catd000098");
			add("catd000090");
			add("catd000082");
			add("catd010020");
			add("catd010010");
			}});
			
		ret.setTestMode(true);
		ret.setRegion("HK");
		ret.setSearchMethod("Category");
		ret.setCallerReferenceNo(String.valueOf(System.currentTimeMillis()));
		ret.setCache(false);
		return ret;
	}

	private static Reader getReader(String fileName) {
		FileReader reader = null;
		try {
			reader = new FileReader(fileName);
			if(reader.ready()){
				return reader;
			}else{
				System.out.println("file not ready yet!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return reader;
	}
	
	private static Writer getWriter(String fileName) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return writer;
	}
	
	public static void testToXML(Class xmlObjClass, String outputfileName,
			String inputfileName) {
		try {
			Reader reader = getReader(inputfileName);
			Writer writer = getWriter(outputfileName);

			Xmappr xmappr = new Xmappr(xmlObjClass);
			Xmappr.Result result = xmappr.fromXMLwithUnmapped(reader);

			Object object = result.getObject();
			System.out.println("testToXML.object = "+object);
			xmappr.toXML(object, writer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
