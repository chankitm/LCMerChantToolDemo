import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.net.HttpURLConnection;
import java.net.URL;
import java.rmi.RemoteException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.Collator;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.params.HttpParams;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import beartool.MD5;

import com.google.common.base.Charsets;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

import model.Sheet_Fraud_By_Order;

import com.javamex.classmexer.MemoryUtil;
import com.lanecrawford.secure.TripleDES;
import com.lanecrawford.oto.oopg.client.getegcholdaudit.PaymentServiceLocator;

import beartool.MD5;
import service.testService;
import service.Impl.testServiceImpl;
import task.linkTestTask;
import util.Base64Util;
import util.XMLParser;
import utiol.JABXParser;
import utiol.Mergesort;
import utiol.MyIntComparable;
import utiol.ProductStringComparable;
import utiol.Quicksort;
import model.ArchiveRecord;
import model.BaseModel;
import model.ColorObject;
import model.FraudCheckContent;
import model.Fruit;
import model.GWPRuleMask;
import model.GWPRuleRequest;
import model.GiftResult;
import model.MerchToolSortRequest;
import model.MerchToolSortResponse;
import model.OomsItem;
import model.PcLcHtml;
import model.PcMediaExternal;
import model.PcProduct;
import model.PcProductTranslation;
import model.ProductSortContent;
import model.RetrieveToLocByAtgOrderIdRequest;
import model.RetrieveToLocByAtgOrderIdResponse;
import model.RoleRight;
import model.User;
import model.testModel;
import model.testObject;
import model.testRequest;
import model.ItemGWPRule;
import model.alipay.SingleTradeQueryResponse;
import model.alipay.mobile.MobileResponse;
import model.alipay.refund.RefundAsynResponse;
import model.alipay.refund.RefundResponse;
import model.gwp.ATG_ORDER_XML;
import model.gwp.AtgOrderXML;
import model.gwp.MyXMLFilter;
import model.gwp.PersonEntity;
import model.gwp.PrefixRemovalXMLFilter;
import model.oopg.PaymentChannel;
import model.productcatalog.Product;
import model.xml.Customer;
import model.PurchasedItem;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Properties;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Node;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLFilter;
import org.xml.sax.XMLReader;

import java.io.StringReader;

import javax.xml.bind.*;
import javax.xml.parsers.*;
import javax.xml.rpc.ServiceException;


public class LCMerchantToolDemo {
	private static Logger logger = Logger.getLogger(LCMerchantToolDemo.class);
	public static String log4jPath = "config/log4j.properties";
	static public void main(String[] args) {

		//log4j
		PropertyConfigurator.configure(log4jPath);
		
		// testintcomparable();
		// testByte();
		// System.out.println("LONG_MAX = "+LONG_MAX);
		// System.out.println("System.currentTimeMillis() = "+System.currentTimeMillis());
		// System.out.println("MAX_VALUE = "+Double.MAX_VALUE);
		// System.out.println("MAX_VALUE - 2^63 = " + (Double.MAX_VALUE -
		// (9223372036854775808.0)));
		// test();
		// testList();
		// testProductSort();
		 //testTrim();
		// testLinkHashMap();
		// testbinaryKeyconvertion();
		// testreqsearchbooleanfunction();
		// testUUID();
		// testCacheEviction();

		// testListMap();
		// testObject2JSON();
		 //merchandiseToolTest();
		// testCollation();
		// testEncoding();
		// substring();
		// testgetaddress();

		// testzipFileFullPath();
		// zipFileFullPathsWithOutput();

		// delete(new
		// File("C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\temp\\unzip"));
		// testunzip();

		// testStringSplit();
		// testConstructor();
		 //testhashmap();
		//testhashmap2();
		// convertlisttoarray();
		 //convertArrayToList();
		// testCSVSplitwithDoubleQuote();

		// testdate();
		// testdatediff();

		// testproxyobj();
		// testStringaray();
		// oopglibtest();
		// testgetFacetComponent();

		// testcc();
		// testJCBCreditCardValidation();
		// printThemAll();

		 //testunicode();
		// testChinese(false);
		//stringTest();
		//testJson();
		//testdate2();
		//testcastmaptolist();
		//testtrim();
		
		//testmapat();
		
		//testlistofint();
		
		//parseColorArray();
		
		//String path "C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\temp\\excel\\ATG_Import_Videos_18-Feb-2014_12-23-31.xls";
		//testexcelParser("temp/excel/ATG_Import_Videos_18-Feb-2014_12-23-31.xls");
		//testexcelParser("temp/excel/ATG_Import_Images_11-Dec-2013_10-45-31.xls");
		//testexcelParser("temp/excel/ATG_Import_Product_11-Dec-2013_10-45-31.xls");
		//testexcelParser("temp/excel/ATG_Import_Translations_11-Dec-2013_10-45-31.xls");
		//testDate();
		
		//testRow();
		//testInteger();
		//testIsEmpty();
		//testListIsContain();
		
		//testenum();
		
		//testEndWith();
		//testExpcetion();
//		testStringFormat();
//		testStringformat3();
//		testSQL();
		 
//		 testObjectArray();
//		 convertlisttoarray();
//		 testRQL();

//		 testJSON2();
//		 testJSON3();
		
		
		//substring2();
		//substringBegining();
		 //testGetResponse(); 
		
		//testLCSitemap();
		//testprocessNumber();
		//testSet();
		//testSubfix();
		
		//grapRightMost7digit();
		
		//testnulllist();
		//textLinesep();
		//testTreeMap();
		
//		testsamdate();
	
		//concatMap();
		//testmaskreqtojson();
		//testDouble();
		
		//testXMLParser();
		//testDouble();
		//testMainInput(args);
		
		//testMapValue();
		//testdivide();
		
		//testGetGift();
		//testround();
		//testFloor();
		
		//XML shit
		//testAtgOrderXMLParser();
		//testXML();
		//testskipxmlprefix();
		//testskipxmlprefix2();
		//testdateparser();
		
		//testfilterList();
		//testOOPGWS(OOPG_WS_URI_UAT_CN);
		//testTextToInputStreamthenfile();
	//	testutf2gb();
	//	testdoubledefaultvalue();
		//testRemoveDoubleTailZero();
		
		//testchinesecharlength();
		//textDateString();
		// trimStringByMD5();
		//testexception();
		//testfloat();
		
		//testmapat();
		//testTransferResult();
		//castDoubleToint();
		//stringCompare();
		
		//testString();
		
		//testMapArray();
		
		//testATGEncodeDecode();
		//testEncodeDecode();
		//testEncodeDecode2();
		
		//testSpringRestTemplate();
		
		//testmd5logicOOPG();
		//patchnumberwithzeroprefix();

		//testParseArray();
		//testHash();
		
		//testVerifySign();
		
		
//		testXMLParser2();
//		testbooleancast();
		
//		testXMLParserSTQ();
		
//		testXMLInDR();
		
//		testParseAlipayMobileAsynRes();
//		testParseAlipayRefundResponse();
		
//		testBigdecial();
//		numberOnlyCheck();
//		testParseRefundDetail();
//		testStringSplit2();
//		convertDoubleToInt();
		

		//testbatchID();
		//testremoveprefix();
//		testIntToDouble();
		//testConvert108();
		//testbitwise();
		
//		testDoubleAsNull();
		
//		testClassCheck();
//		testPercent();
		
		//testdoubledefaultvalue2();
		
//		testFruit();
//		testcastcollectiontolist();
		
//		testCaptureHost();
		
//		testReplaceSpecialCharAlipayRefund();
		
//		testencodeURL();
//		testnullchecking();
//		testReplacechar();
		
//		testverifyNotifyID();
//		testRoundDecimalplaces();
		
//		testOOME();
//		testOOMEStringBuffer();
//		UserOfIntern();//cant trigger oome

//		testOOME3();
//		testOOME3();
		
//		testOOMETwice();
//		testPhoneModule();
		
//		testchecksign();
//		printascii();
//		testListString();
//		testHashset();
		
//		testOOPGCalls();
//		testPlusSignEncode();
		//testMap();
		testReadFile();
	}

	
	private static Set<String> readFile( String file ) throws IOException {
	    BufferedReader reader = new BufferedReader( new FileReader (file));
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    Set<String> ret = new HashSet<String>();
	    
	    long start = System.currentTimeMillis();
	    try {
	        while( ( line = reader.readLine() ) != null ) {
//	            stringBuilder.append( line );
//	            stringBuilder.append( ls );
	        	ret.add(line);
	        }

//	        return stringBuilder.toString();
	        return ret;
	    } finally {
	        reader.close();
		    long end = System.currentTimeMillis();
			System.out.println("elapsedTime="+ (end-start) );
	    }
	}

	private static void testReadFile(){
		
		try {
			String path = "C:/Users/roychan/git/LCMerChantToolDemo/temp/hkorderid.txt";
			Set<String> set = readFile(path);
			System.out.println("set="+ set.size());
	/*		
			for(String object : set){
				System.out.println("object="+ object);
			}
		*/	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void testMap(){
		//1. build a map with key as atg order id, and value as region
		Map<String,String> orderIdRegion = new HashMap<String,String>();

//		long noBytesBefore = MemoryUtil.memoryUsageOf(orderIdRegion);
		
		//2. the map size is about 750 thousand.
		for(int i = 0; i < 750000; i++){
			String key = "o" + String.valueOf(i);
			String value = "HK";//or CN
			
			orderIdRegion.put(key, value);
		}
		

//		long noBytesAfter = MemoryUtil.memoryUsageOf(orderIdRegion);
		
		System.out.println("testMap()"
		+", orderIdRegion.size = "+orderIdRegion.size()
//		+" ,noBytesBefore = "+noBytesBefore
//		+", noBytesAfter = "+noBytesAfter
		);
	}
	
	private static void testPlusSignEncode(){
		String test;
		try {
			System.out.println(java.net.URLEncoder.encode("Hello World", "UTF-8").replace("+", "%20"));
			
			
			String text = "Hello World";
			String encodeText = java.net.URLEncoder.encode(text, "UTF-8");
			System.out.println(text);
			System.out.println(encodeText);
			
			String text2 = "Hello+World";
			String encodeText2 = java.net.URLEncoder.encode(text2, "UTF-8");
			System.out.println(text2);
			System.out.println(encodeText2);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testHashset() {
		int initialCapacity = 3;
		HashSet<String> refundProcess = new HashSet<String>(initialCapacity);
		System.out.println("refundProcess = " + refundProcess + ",initialCapacity =" + initialCapacity);

		refundProcess.add("1");
		refundProcess.add("2");
		refundProcess.add("3");
		System.out.println("refundProcess = " + refundProcess + ",initialCapacity =" + initialCapacity);

		refundProcess.add("4");
		System.out.println("refundProcess = " + refundProcess + ",initialCapacity =" + initialCapacity);
		refundProcess.remove("5");
		System.out.println("refundProcess = " + refundProcess + ",initialCapacity =" + initialCapacity);
	}
	
	private static void testListString () {
		List<String> ls;
		String s;
		
		ls = new ArrayList();
	}
	private static void testchecksign(){
		int c = 2713;
		int d = 2714;
		int e = 10102;
		//		int f = 237b;
		String sc = Character.toString((char)c);
		String sd = Character.toString((char)d);
		String se = Character.toString((char)e);
		System.out.println("c = "+c + ",s ="+sc);
		System.out.println("d = "+d + ",s ="+sd);
		System.out.println("e = "+e + ",s ="+se);
	}
	
	private static void printascii(){
		   for (int c=0; c<25500; c++) {
			    System.out.println(c + ": " + (char)c);
			   } 
	}
	
	private static void testPhoneModule(){
		String mobileNumber = "85263588242";
		PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
		
		
		PhoneNumber phoneNumber = null;
		try {
			if(mobileNumber!=null && !mobileNumber.startsWith("+"))
			{
				mobileNumber = "+" + mobileNumber;
			}
			phoneNumber = phoneUtil.parse(mobileNumber,"");
		} catch (NumberParseException e1) {
		}
		String countryCode = "";
		if(phoneNumber!=null)
			countryCode = phoneNumber.getCountryCode()+ "";
		
		
		System.out.println("mobileNumber = "+mobileNumber+", phoneNumber = "+phoneNumber+", countryCode = "+countryCode);
	}
	
	private static void testOOMETwice(){
		System.out.println("testOOMETwice aaa");
		try{
			testOOME();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("testOOMETwice bbb");
		try{
			testOOME();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("testOOMETwice ccc");
	}
	
	private static void UserOfIntern() {

        Random random = new Random();
        System.out.println(random.nextLong());
        while (true) {
            String s = String.valueOf(random.nextLong());
            //s = s.intern();
            System.out.println("s="+s);
        }

	}
	
	private static void testOOMEStringBuffer(){
		StringBuffer test = new StringBuffer(" test ");
		while (true) {
			test.append("a");
		    System.out.println("test="+test);
		}
	}
	
	private static void testOOME() throws Exception{
	    Map map = System.getProperties();
	    Random r = new Random();
	    while (true) {
	    	int temp = r.nextInt();
	      map.put(temp, "value");
	      System.out.println(temp);
	    }
	}
	
	/**
	 * without intern
	 */
	private static void testOOME2(){
	    Map map = System.getProperties();
	    Random r = new Random();
	    while (true) {
	    	String temp = String.valueOf(r.nextLong());
			map.put(temp, "value");
			System.out.println(temp);
	    }
	}

	/**
	 * with intern
	 */
	private static void testOOME3(){
	    Map map = System.getProperties();
	    Random r = new Random();
	    while (true) {
	    	String temp = String.valueOf(r.nextLong());
	    	temp = temp.intern();
			map.put(temp, "value");
			System.out.println(temp);
	    }
	}
	
	private static void testRoundDecimalplaces(){
		double test = 0.3999999999999999d;
		int pRoundingDecimalPlaces2 = 2;

		double ret2 = roundatg(test,pRoundingDecimalPlaces2);
		System.out.println("testRoundDecimalplaces()"+", test="+test + ", pRoundingDecimalPlaces2="+pRoundingDecimalPlaces2+ ", ret2="+ret2);

		int pRoundingDecimalPlaces1 = 1;
		double ret1 = roundatg(test,pRoundingDecimalPlaces1);
		System.out.println("testRoundDecimalplaces()"+", test="+test + ", pRoundingDecimalPlaces1="+pRoundingDecimalPlaces1+ ", ret1="+ret1);
		
		int pRoundingDecimalPlaces0 = 0;
		double ret0 = roundatg(test,pRoundingDecimalPlaces0);
		System.out.println("testRoundDecimalplaces()"+", test="+test + ", pRoundingDecimalPlaces0="+pRoundingDecimalPlaces0+ ", ret0="+ret0);
	}

	public static double roundatg(double pNumber, int pRoundingDecimalPlaces) {
		BigDecimal bd = new BigDecimal(Double.toString(pNumber));
		bd = bd.setScale(pRoundingDecimalPlaces, 4);
		return bd.doubleValue();
	}

	private static void testverifyNotifyID(){
		String notifyId = null;
//		String notifyId = "0";
//		String notifyId = "1";
		int maxRetry = 3;
		long retryTimeGap = 3000;
		System.out.println("testverifyNotifyID()"+", notifyId="+notifyId + ", maxRetry="+maxRetry+ ", retryTimeGap="+retryTimeGap);
		boolean ret = verifyNotifyID(notifyId,maxRetry,retryTimeGap);

		System.out.println("testverifyNotifyID()"+", notifyId="+notifyId + ", maxRetry="+maxRetry+ ", retryTimeGap="+retryTimeGap + ", ret="+ret);
	}
	
	private static boolean verifyNotifyID(String notifyId) throws Exception{
		boolean ret = false;
		System.out.println("notifyId="+notifyId);
		if(null == notifyId || notifyId.isEmpty()){
			throw new Exception("null or empty");
		} else if("0".equalsIgnoreCase(notifyId)) {
			ret = true;
		} else if("1".equalsIgnoreCase(notifyId)) {
			ret = false;
		} else {
			
		}
		System.out.println("notifyId="+notifyId + ", ret="+ret);
		return ret;
	}
	
	private  static boolean verifyNotifyID(String notifyId, int maxRetry, long retryMillis){
		boolean ret = false;
		System.out.println("notifyId="+notifyId + ", maxRetry="+maxRetry+ ", retryMillis="+retryMillis);
		for(int index = 1; index <= maxRetry; index++){
			try{
				System.out.println("time="+System.currentTimeMillis() + ", notifyId="+notifyId + ", maxRetry="+maxRetry+ ", retryMillis="+retryMillis+ ", index="+index);
				ret = verifyNotifyID(notifyId);
				
				break;
			} catch (Exception e){
				e.printStackTrace();
				if(index<maxRetry){
					try {
						Thread.sleep(retryMillis * index);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		}

		System.out.println("notifyId="+notifyId + ", maxRetry="+maxRetry+ ", retryMillis="+retryMillis + ", ret="+ret);
		return ret;
	}
	
	private static void testReplacechar(){
		//Reuest.getURI()=https://mapi.alipay.com/gateway.do?_input_charset=utf-8&batch_no=20150902055736407&batch_num=2&detail_data=2015082600001000760060070684%5E1%5EAccepted%20-%20Defective#2015082600001000760060070700%5E1%5EAccepted%20-%20Defective&notify_url=https://secure.uat.lanecrawford.com.cn/checkout/asyncRefundHandlers.jsp&partner=2088711824364505&refund_date=2015-09-02%2005:57:36&service=refund_fastpay_by_platform_nopwd&sign_type=MD5&sign=e8249bf27718cbb97bd84632f96ff667
		
		String url = "https://mapi.alipay.com/gateway.do?_input_charset=utf-8&batch_no=20150902055736407&batch_num=2&detail_data=2015082600001000760060070684%5E1%5EAccepted%20-%20Defective#2015082600001000760060070700%5E1%5EAccepted%20-%20Defective&notify_url=https://secure.uat.lanecrawford.com.cn/checkout/asyncRefundHandlers.jsp&partner=2088711824364505&refund_date=2015-09-02%2005:57:36&service=refund_fastpay_by_platform_nopwd&sign_type=MD5&sign=e8249bf27718cbb97bd84632f96ff667";
		//String url = "asdasd#asdasd";

		String encodedURL = escapeChar(url,"#","%23");
		System.out.println("url="+url);
		System.out.println("encodedURL="+encodedURL);
		
		try {
			URI uriOld = new URI(url);

			System.out.println("uriOld="+uriOld);
	    	System.out.println("uriOld="+uriOld);
	    	System.out.println("uriOld.toString()="+uriOld.toString());
	    	System.out.println("uriOld.toASCIIString()="+uriOld.toASCIIString());
	    	System.out.println("uriOld.getHost()="+uriOld.getHost());
	    	System.out.println("uriOld.getPath()="+uriOld.getPath());
	    	System.out.println("uriOld.getPort()="+uriOld.getPort());
	    	System.out.println("uriOld.getAuthority()="+uriOld.getAuthority());
	    	System.out.println("uriOld.getFragment()="+uriOld.getFragment());
	    	
	    	System.out.println("uriOld.getQuery()="+uriOld.getQuery());
	    	System.out.println("uriOld.getRawAuthority()="+uriOld.getRawAuthority());
	    	System.out.println("uriOld.getRawFragment()="+uriOld.getRawFragment());
	    	System.out.println("uriOld.getRawPath()="+uriOld.getRawPath());
	    	System.out.println("uriOld.getRawQuery()="+uriOld.getRawQuery());
	    	
	    	System.out.println("uriOld.getRawSchemeSpecificPart()="+uriOld.getRawSchemeSpecificPart());
	    	System.out.println("uriOld.getRawUserInfo()="+uriOld.getRawUserInfo());
	    	System.out.println("uriOld.getScheme)="+uriOld.getScheme());
	    	System.out.println("uriOld.getUserInfo()="+uriOld.getUserInfo());
	    	System.out.println("uriOld.getSchemeSpecificPart()="+uriOld.getSchemeSpecificPart());
	    	
			
			URI uriNew = new URI(escapeChar(uriOld.toString(),"#","%23"));
			System.out.println("uriNew="+uriNew);
	    	System.out.println("uriNew.toString()="+uriNew.toString());
	    	System.out.println("uriNew.toASCIIString()="+uriNew.toASCIIString());
	    	System.out.println("uriNew.getHost()="+uriNew.getHost());
	    	System.out.println("uriNew.getPath()="+uriNew.getPath());
	    	System.out.println("uriNew.getPort()="+uriNew.getPort());
	    	System.out.println("uriNew.getAuthority()="+uriNew.getAuthority());
	    	System.out.println("uriNew.getFragment()="+uriNew.getFragment());
	    	
	    	System.out.println("uriNew.getQuery()="+uriNew.getQuery());
	    	System.out.println("uriNew.getRawAuthority()="+uriNew.getRawAuthority());
	    	System.out.println("uriNew.getRawFragment()="+uriNew.getRawFragment());
	    	System.out.println("uriNew.getRawPath()="+uriNew.getRawPath());
	    	System.out.println("uriNew.getRawQuery()="+uriNew.getRawQuery());
	    	
	    	System.out.println("uriNew.getRawSchemeSpecificPart()="+uriNew.getRawSchemeSpecificPart());
	    	System.out.println("uriNew.getRawUserInfo()="+uriNew.getRawUserInfo());
	    	System.out.println("uriNew.getScheme)="+uriNew.getScheme());
	    	System.out.println("uriNew.getUserInfo()="+uriNew.getUserInfo());
	    	System.out.println("uriNew.getSchemeSpecificPart()="+uriNew.getSchemeSpecificPart());
						
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
    private static String escapeChar(String url , String target, String replacement){
    	return url.replaceAll(target, replacement);
    }
	
	private  static void testnullchecking(){
		/*
		final boolean profileMatchesOrderProfile = profileForOrder.getRepositoryId().equals(getProfileForSession().getRepositoryId());
		final boolean profileMatchesOrderProfile = 
				(null != profileForOrder && null != profileForOrder.getRepositoryId() && !profileForOrder.getRepositoryId().isEmpty() 
				&& null != getProfileForSession() && null != getProfileForSession().getRepositoryId() && !getProfileForSession().getRepositoryId().isEmpty())
				? profileForOrder.getRepositoryId().equals(getProfileForSession().getRepositoryId())
				: false;
				*/
		
		User a = null;
		User b = null;
		
		a = new User();
		a.setName("andy banana");
		
		b = new User();
		b.setName("andy banana");
		

		System.out.println("User a="+a.toString() + ", User b="+b.toString());
		
		final boolean profileMatchesOrderProfile = 
				(null != a && null != a.getName() && !a.getName().isEmpty() 
				&& null != b && null != b.getName() && !b.getName().isEmpty())
				? a.getName().equals(b.getName())
				: false;
				
		System.out.println("profileMatchesOrderProfile="+profileMatchesOrderProfile);
	}
	
	private static void testencodeURL(){
//		String test = "https://mapi.alipay.com/gateway.do?_input_charset=utf-8&batch_no=20150826102854862&batch_num=2&detail_data=2015082500001000760060003998^1^Incorrect%20Item#2015082500001000760060003906^1^Incorrect Item&notify_url=https://secure.sit.lanecrawford.com.cn/checkout/asyncRefundHandlers.jsp&partner=2088711824364505&refund_date=2015-08-26 10:28:54&service=refund_fastpay_by_platform_nopwd&sign_type=MD5&sign=a786707f9580f6db08052e3ca9da1dc2";

//		String test = "https://mapi.alipay.com/gateway.do?_input_charset=utf-8&batch_no=20150826104753225&batch_num=2&detail_data=2015082500001000760060003998^1^Incorrect Item#2015082500001000760060003906^1^Incorrect Item&notify_url=https://secure.sit.lanecrawford.com.cn/checkout/asyncRefundHandlers.jsp&partner=2088711824364505&refund_date=2015-08-26 10:47:53&service=refund_fastpay_by_platform_nopwd&sign_type=MD5&sign=e42171e19f32fee303b12186c8251833";
		
		String host = "https://mapi.alipay.com/gateway.do";
		String test = "_input_charset=utf-8&batch_no=20150826105437178&batch_num=2&detail_data=2015082500001000760060003998^1^Incorrect Item#2015082500001000760060003906^1^Incorrect Item&notify_url=https://secure.uat.lanecrawford.com.cn/checkout/asyncRefundHandlers.jsp&partner=2088711824364505&refund_date=2015-08-26 10:54:37&service=refund_fastpay_by_platform_nopwd&sign_type=MD5&sign=c4daf10562818a56d97b310c1351b150";
		
		try {
			/*
			URL url = new URL(test);
			System.out.println("url.toURI()="+url.toURI());
			System.out.println("url.toString()="+url.toString());
			System.out.println("url.toExternalForm()="+url.toExternalForm());
			*/
			String ret = URLEncoder.encode(test,"UTF-8");
			String url = host + "?" + ret;
			System.out.println("host="+host);
			System.out.println("test="+test);
			System.out.println("ret="+ret);
			System.out.println("url="+url);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testReplaceSpecialCharAlipayRefund(){
		String test = "abc^def|ghi$jkl#mno";
		
		String ret = test.replace("^", "").replace("|", "").replace("$", "").replace("#", ""); 

		System.out.println("test="+test);
		System.out.println("ret="+ret);
	}
	
	private static void testCaptureHost(){
/*
		https://secure.uat.lanecrawford.com.cn/checkout/resulthandler.jsp
		http://www.sitneo.lanecrawford.com.cn/checkout/resulthandler.jsp
		http://www.sitneo.lanecrawford.com.cn/checkout/resulthandler.jsp
*/
		String callbackurlUat = "https://secure.uat.lanecrawford.com.cn/checkout/resulthandler.jsp";
		String callbackurlSitNeo = "http://www.sitneo.lanecrawford.com.cn/checkout/resulthandler.jsp";
		String callbackurlci = "http://www.ci.lanecrawford.com.cn/checkout/resulthandler.jsp";
		
		try {
//			printurl(callbackurlUat);
//			printurl(callbackurlSitNeo);
			
/*
			String hostUAT = getDomainName(callbackurlUat);
			String hostSITNEO = getDomainName(callbackurlSitNeo);			
*/

			String hostUAT = getHostWithScheme(callbackurlUat);
			String hostSITNEO = getHostWithScheme(callbackurlSitNeo);
			String hostci = getHostWithScheme(callbackurlci);
			

			System.out.println("callbackurlUat="+callbackurlUat);
			System.out.println("hostUAT="+hostUAT);

			System.out.println("callbackurlSitNeo="+callbackurlSitNeo);
			System.out.println("hostSITNEO="+hostSITNEO);

			System.out.println("callbackurlci="+callbackurlci);
			System.out.println("hostci="+hostci);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String getDomainName(String url) throws URISyntaxException {
	    URI uri = new URI(url);
	    String domain = uri.getHost();
	    return domain.startsWith("www.") ? domain.substring(4) : domain;
	}

	public static String getHostWithScheme(String url) throws URISyntaxException {
	    URI uri = new URI(url);
	    String domain = uri.getHost();
	    String Scheme = uri.getScheme();
	    return Scheme + "://" + domain;
	}
	
	public static void printurl(String url) throws URISyntaxException {
	    URI uri = new URI(url);
	    String getHost = uri.getHost();
	    String getAuthority = uri.getAuthority();
	    String getFragment = uri.getFragment();
	    String getPath = uri.getPath();
	    String getQuery = uri.getQuery();
	    String getRawAuthority = uri.getRawAuthority();
	    String getRawFragment = uri.getRawFragment();
	    String getRawPath = uri.getRawPath();
	    String getRawQuery = uri.getRawQuery();
	    String getRawSchemeSpecificPart = uri.getRawSchemeSpecificPart();
	    String getRawUserInfo = uri.getRawUserInfo();
	    String getScheme = uri.getScheme();
	    String getSchemeSpecificPart = uri.getSchemeSpecificPart();
	    String getUserInfo = uri.getUserInfo();
   	    int getPort = uri.getPort();

   	    System.out.println("Host="+getHost);
		System.out.println("Authority="+getAuthority);
		System.out.println("Fragment="+getFragment);
		System.out.println("Path="+getPath);
		System.out.println("Query="+getQuery);
		System.out.println("RawAuthority="+getRawAuthority);
		System.out.println("RawFragment="+getRawFragment);
		System.out.println("RawPath="+getRawPath);
		System.out.println("RawQuery="+getRawQuery);
		System.out.println("RawSchemeSpecificPart="+getRawSchemeSpecificPart);
		System.out.println("RawSchemeSpecificPart="+getRawSchemeSpecificPart);
		System.out.println("RawUserInfo="+getRawUserInfo);
		System.out.println("Scheme="+getScheme);
		System.out.println("SchemeSpecificPart="+getSchemeSpecificPart);
		System.out.println("UserInfo="+getUserInfo);
		System.out.println("Port="+getPort);

	}
	
	private static void  testcastcollectiontolist(){
		Collection<Fruit> fs = new HashSet();
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70.1); 
		Fruit apple = new Fruit("Apple", "Apple description",100.2); 
		Fruit orange = new Fruit("Orange", "Orange description",80.3); 
		Fruit banana = new Fruit("Banana", "Banana description",90.4); 
		fs.add(pineappale); 
		fs.add(apple); 
		fs.add(orange); 
		fs.add(banana);
//		List list = new ArrayList(coll);
		
		for(Fruit f:fs){
			System.out.println(f.toString());
		}
	
//		aint working
//		List<Fruit> l_fs = (List<Fruit>)fs;
		
		
//		it works
		List<Fruit> l_fs = new ArrayList(fs);

		for(Fruit f:l_fs){
			System.out.println(f.toString());
		}
		
		return;
	}
	
	private static void testFruit(){
		
		
		Fruit[] fruits = new Fruit[4];
		 
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70.1); 
		Fruit apple = new Fruit("Apple", "Apple description",100.2); 
		Fruit orange = new Fruit("Orange", "Orange description",80.3); 
		Fruit banana = new Fruit("Banana", "Banana description",90.4); 
 
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		
		for(Fruit f:fruits){
			System.out.println(f.toString());
		}
		
		Arrays.sort(fruits);

		for(Fruit f:fruits){
			System.out.println(f.toString());
		}
		
	}
	
	private static void testPercent(){
		int testint = 1;
		int ret = testint % 3;
		System.out.println("testint="+testint);
		System.out.println("ret="+ret);
		int testint3 = 3;
		int ret3 = testint3 % 3;
		System.out.println("testint3="+testint3);
		System.out.println("ret3="+ret3);
		
	}
	private static void testClassCheck(){
		Double test = 1.1d;
		boolean checka = checkPaymentType(test,Double.class);
		boolean checkb = checkPaymentType(test,Integer.class);
		System.out.println("checka="+checka);
		System.out.println("checkb="+checkb);
	}
	
	private static boolean checkPaymentType(Double order, Class<?> c) {
		boolean ret = false;

		try {
			if (order.getClass().equals(c)) {
				ret = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}
	private static void testDoubleAsNull(){

		System.out.println("getTestd1()="+getTestd1());
		setTestd1(null);
		System.out.println("getTestd1()="+getTestd1());
		System.out.println("getTestd1()="+getTestd1());
	}
	static Double testd1;
	
	public static Double getTestd1() {
		return testd1;
	}
	public static void setTestd1(Double testd1) {
		LCMerchantToolDemo.testd1 = null==testd1?0d:testd1;
	}

	private static void testbitwise(){
		int ret = 0;
	 ret |= 0x8;
	System.out.println("ret="+ret);
	
	}
	private static void testConvert108(){
		Date today = new Date();
		SimpleDateFormat convertFormat = new SimpleDateFormat("hh:mm:ss");
		String refundBatchNo = convertFormat.format(today);
		System.out.println("refundBatchNo="+refundBatchNo);
		System.out.println("today="+today.toString());
		System.out.println("System.currentTimeMillis()="+System.currentTimeMillis());
	}
	
	private static void testIntToDouble(){
		int testint = 13499;
		double castDouble = (double)testint;

		double testDouble = testint / 100;
		double testCastDouble = castDouble / 100;

		System.out.println("testint="+testint);
		System.out.println("testDouble="+testDouble);
		System.out.println("testCastDouble="+testCastDouble);
		
		
		
		String ret = getTranscationAmountWithFormat(testCastDouble);

		System.out.println("ret="+ret);
		
	}
	
	public static String getTranscationAmountWithFormat(double testCastDouble) {
		String ret = null;
//		String amountFormat = "#.#";
//		String amountFormat = null;
//		String amountFormat = "";
		String amountFormat = "#.##";
		try{
			if(null != amountFormat && !amountFormat.isEmpty()){
				DecimalFormat df = new DecimalFormat(amountFormat);
				ret = df.format(testCastDouble);
			}else{
				ret = String.valueOf(testCastDouble);
			}
		}catch(Exception e){
//			e.printStackTrace();
		}
		return ret;
	}
	
	private static void testgetdomain(){
		String oldurl = "http://www.sitneo.lanecrawford.com.cn/checkout/resulthandler.jsp";
		String domain = null;
		
		
	}
	
	private static void testremoveprefix(){
		String prefix= "UAT";
		String order= "UAT123123123";
		
		String ordernoprefix = order.replaceFirst(prefix, "");
		System.out.println("prefix="+prefix);
		System.out.println("order="+order);
		System.out.println("ordernoprefix="+ordernoprefix);
	}
	private static void testbatchID(){
		Date today = new Date();
		SimpleDateFormat batchFormat = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String refundBatchNo = batchFormat.format(today);
		System.out.println("refundBatchNo="+refundBatchNo);
		System.out.println("today="+today.toString());
		System.out.println("System.currentTimeMillis()="+System.currentTimeMillis());
	}
	private static void convertDoubleToInt(){
		Double d = new Double(1.23);
		Double d100 = d * 100;
		int i = d100.intValue();

		System.out.println("d="+d);
		System.out.println("d100="+d100);
		System.out.println("i="+i);
	}
	
	private static void testStringSplit2(){
		String refundInfoDelimitor = "\\$";
		String resultDetail= "2015042700001000760049110401^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS";
		System.out.println("refundInfoDelimitor="+refundInfoDelimitor);
		System.out.println("resultDetail="+resultDetail);
		
//		boolean iscontaindelimitor = resultDetail.contains(refundInfoDelimitor);
//		System.out.println("iscontaindelimitor="+iscontaindelimitor);
		
		String [] resultInfos = resultDetail.split(refundInfoDelimitor);
		System.out.println("resultInfos.length="+resultInfos.length);
		
		
		for(String resultInfo:resultInfos){
			System.out.println("resultInfo="+resultInfo);
		}
	}
	
	private static void testParseRefundDetail(){
/*		
		2015042700001000760049110401^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS#2015042700001000760049110581^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS
		
		//Split by #
		2015042700001000760049110401^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS
		#
		2015042700001000760049110581^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS
		
		//Split by $
		2015042700001000760049110401^1.00^SUCCESS
		$
		cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS
		
		//Split by ^
		2015042700001000760049110401
		^
		1.00
		^
		SUCCESS
		
		cnonlinegroup@lanecrawford.com
		^
		2088711824364505
		^
		0.01
		^
		SUCCESS
		
*/		
		String test = "2015042700001000760049110401^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS#2015042700001000760049110581^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS";
		System.out.println("test="+test);
		
		List<RefundAsynResponse> results = parseRefundDetail(test);
		System.out.println("results.size()="+results.size());
		
		for(RefundAsynResponse result: results){
			System.out.println("results.toString()="+result.toString());
		}
	}
	
	private static List<RefundAsynResponse> parseRefundDetail(String resultDetailsInBatch){
		List<RefundAsynResponse> ret = null;
		String patchDelimitor = "#";
		String refundInfoDelimitor = "\\$";
		String refundResultDelimitor = "\\^";
		
		try {
			String [] resultDetails = resultDetailsInBatch.split(patchDelimitor);
			
			ret = new ArrayList<RefundAsynResponse>();
			for(String resultDetail: resultDetails){
				String [] resultInfos = resultDetail.split(refundInfoDelimitor);
				String refundResults = resultInfos[0];
				String refundMerResults = resultInfos[1];

				String [] refundResultsArray = refundResults.split(refundResultDelimitor);
				String alipayTraNo = refundResultsArray[0];
				Double refundAmt = Double.valueOf(refundResultsArray[1]);
				String refundState = refundResultsArray[2];
				
				String [] refundMerResultsArray = refundMerResults.split(refundResultDelimitor);
				String alipayMerAcc = refundMerResultsArray[0];
				String alipayMerId = refundMerResultsArray[1];
				Double refundMerFee = Double.valueOf(refundMerResultsArray[2]);
				String refundMerState = refundMerResultsArray[3];
				
				ret.add(new RefundAsynResponse(alipayTraNo, refundAmt, refundState, alipayMerAcc, alipayMerId, refundMerFee, refundMerState));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ret;
	}
	
	private static void testgetpost(){/*
//		HttpServletRequest request = null;
		if ("POST".equalsIgnoreCase(request.getMethod())) {
			
			        System.out.println( "asyncRefundHandler.jsp post");
			    StringBuffer sb = new StringBuffer();
			    BufferedReader bufferedReader = null;
			    String content = "";

			    try {
			        //InputStream inputStream = request.getInputStream();
			        //inputStream.available();
			        //if (inputStream != null) {
			        bufferedReader =  request.getReader() ; //new BufferedReader(new InputStreamReader(inputStream));
			        char[] charBuffer = new char[128];
			        int bytesRead;
			        while ( (bytesRead = bufferedReader.read(charBuffer)) != -1 ) {
			            sb.append(charBuffer, 0, bytesRead);
			        }
			        //} else {
			        //        sb.append("");
			        //}

			    } catch (IOException ex) {
			        throw ex;
			    } finally {
			        if (bufferedReader != null) {
			            try {
			                bufferedReader.close();
			            } catch (IOException ex) {
			                throw ex;
			            }
			        }
			    }

			        String    test = sb.toString();

			        System.out.println( "asyncRefundHandler.jsp" + ", test=" + test);
			}else{
			        System.out.println( "asyncRefundHandler.jsp not post");
			}
*/
	}
	
	private static void numberOnlyCheck(){
		String tradeNo = "2015031124200354";
		String regex = "\\d+";
		
		if (tradeNo.matches(regex)) {
			System.out.println("match");

		} else {
			System.out.println("matchnot");

		}
	}
	
	private static void testBigdecial(){
		double test = 27.56;
		BigDecimal test2 =  new BigDecimal(test, MathContext.DECIMAL64);
		BigDecimal test3 =  new BigDecimal(test, MathContext.DECIMAL32);
		BigDecimal test4 = BigDecimal.valueOf(test);
		System.out.println("test="+test);
		System.out.println("test2="+test2);
		System.out.println("test3="+test3);
		System.out.println("test4="+test4);
		
		test2 = test2.setScale(8, BigDecimal.ROUND_HALF_UP);
		System.out.println("test2="+test2);
		
	}
	private static void testParseAlipayRefundResponse(){
		String xml = null;
		RefundResponse test = null;
		try {
			xml = "<?xml version=\"1.0\" encoding=\"GBK\" ?><alipay><is_success>T</is_success></alipay>";
			System.out.println(xml);
			
			test = (RefundResponse) JABXParser.fromXML(new StringReader(xml), RefundResponse.class);
			System.out.println(test.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	private static void testParseAlipayMobileAsynRes(){
		String xml = null;
		MobileResponse test = null;
		try {
//			xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><notify><payment_type>1</payment_type><subject>901173003</subject><trade_no>2015032500001000760045995663</trade_no><buyer_email>14714348178@163.com</buyer_email><gmt_create>2015-03-25 16:09:36</gmt_create><notify_type>trade_status_sync</notify_type><quantity>1</quantity><out_trade_no>901173003</out_trade_no><notify_time>2015-03-25 16:10:12</notify_time><seller_id>2088711824364505</seller_id><trade_status>TRADE_SUCCESS</trade_status><is_total_fee_adjust>N</is_total_fee_adjust><total_fee>1.00</total_fee><gmt_payment>2015-03-25 16:10:12</gmt_payment><seller_email>cnonlinegroup@lanecrawford.com</seller_email><price>1.00</price><buyer_id>2088812802232761</buyer_id><notify_id>72994e255d64bd37b07adebb43105cc768</notify_id><use_coupon>N</use_coupon></notify>";
			xml = "<notify><payment_type>1</payment_type><subject>901173003</subject><trade_no>2015032500001000760045995663</trade_no><buyer_email>14714348178@163.com</buyer_email><gmt_create>2015-03-25 16:09:36</gmt_create><notify_type>trade_status_sync</notify_type><quantity>1</quantity><out_trade_no>901173003</out_trade_no><notify_time>2015-03-25 16:10:12</notify_time><seller_id>2088711824364505</seller_id><trade_status>TRADE_SUCCESS</trade_status><is_total_fee_adjust>N</is_total_fee_adjust><total_fee>1.00</total_fee><gmt_payment>2015-03-25 16:10:12</gmt_payment><seller_email>cnonlinegroup@lanecrawford.com</seller_email><price>1.00</price><buyer_id>2088812802232761</buyer_id><notify_id>72994e255d64bd37b07adebb43105cc768</notify_id><use_coupon>N</use_coupon></notify>";
			System.out.println(xml);
			
			test = (MobileResponse) JABXParser.fromXML(new StringReader(xml), MobileResponse.class);
			System.out.println(test.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void testXMLInDR(){
		String encodedDR = " suspend=suspend&sec_id=MD5&error=error&errorDrUpdateFailed=errorDrUpdateFailed&authSuccess=authSuccess&vpcPay=vpcPay&sign=9bf599a58de0741ea638e46d63871d1e&v=1.0&authFailed=authFailed&notify_data=%3Cnotify%3E%3Cpayment_type%3E1%3C%2Fpayment_type%3E%3Csubject%3E901173003%3C%2Fsubject%3E%3Ctrade_no%3E2015032500001000760045995663%3C%2Ftrade_no%3E%3Cbuyer_email%3E14714348178%40163.com%3C%2Fbuyer_email%3E%3Cgmt_create%3E2015-03-25+16%3A09%3A36%3C%2Fgmt_create%3E%3Cnotify_type%3Etrade_status_sync%3C%2Fnotify_type%3E%3Cquantity%3E1%3C%2Fquantity%3E%3Cout_trade_no%3E901173003%3C%2Fout_trade_no%3E%3Cnotify_time%3E2015-03-25+16%3A10%3A12%3C%2Fnotify_time%3E%3Cseller_id%3E2088711824364505%3C%2Fseller_id%3E%3Ctrade_status%3ETRADE_SUCCESS%3C%2Ftrade_status%3E%3Cis_total_fee_adjust%3EN%3C%2Fis_total_fee_adjust%3E%3Ctotal_fee%3E1.00%3C%2Ftotal_fee%3E%3Cgmt_payment%3E2015-03-25+16%3A10%3A12%3C%2Fgmt_payment%3E%3Cseller_email%3Ecnonlinegroup%40lanecrawford.com%3C%2Fseller_email%3E%3Cprice%3E1.00%3C%2Fprice%3E%3Cbuyer_id%3E2088812802232761%3C%2Fbuyer_id%3E%3Cnotify_id%3E72994e255d64bd37b07adebb43105cc768%3C%2Fnotify_id%3E%3Cuse_coupon%3EN%3C%2Fuse_coupon%3E%3C%2Fnotify%3E&alreadyAuthSuccess=alreadyAuthSuccess&pending=pending&service=alipay.wap.trade.create.direct&fraudCheck=fraudCheck";
		String dr = null;

		System.out.println("testXMLInDR()"+", encodedDR="+encodedDR);
		Map<String, String> map = createMapFromQueryString(encodedDR);
		
		
		for(@SuppressWarnings("rawtypes") Map.Entry entry : map.entrySet()){
			System.out.println("key="+ entry.getKey() +", value="+ entry.getValue());
		}
		
		if(map.containsKey("service") && "alipay.wap.trade.create.direct".contentEquals((String) map.get("service"))){
			System.out.println("testXMLInDR()"+", fuckin mobile response" );
		}else{
			System.out.println("testXMLInDR()"+", fuckin aint mobile response" );
		}
	}

	private static void testXMLParserSTQ() {
		String xml = null;
		SingleTradeQueryResponse test = null;
		try {
//			xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><alipay><is_success>T</is_success><request><param name=\"trade_no\">2015031124200354</param><param name=\"_input_charset\">utf-8</param><param name=\"service\">single_trade_query</param><param name=\"partner\">2088801766902304</param></request><response><trade><buyer_email>alipay_test@alipay.com</buyer_email><buyer_id>2088102151633543</buyer_id><discount>0.00</discount><flag_trade_locked>0</flag_trade_locked><gmt_create>2015-03-1110:28:41</gmt_create><gmt_last_modified_time>2015-03-1110:28:54</gmt_last_modified_time><gmt_payment>2015-03-1110:28:54</gmt_payment><is_total_fee_adjust>F</is_total_fee_adjust><operator_role>B</operator_role><out_trade_no>150311288690</out_trade_no><payment_type>8</payment_type><price>0.01</price><quantity>1</quantity><seller_email>shuzhi_zsz@126.com</seller_email><seller_id>2088801766902304</seller_id><subject>管理付款编号150311288690</subject><to_buyer_fee>0.00</to_buyer_fee><to_seller_fee>0.01</to_seller_fee><total_fee>0.01</total_fee><trade_no>2015031124200354</trade_no><trade_status>TRADE_SUCCESS</trade_status><use_coupon>F</use_coupon></trade></response><sign>9517107e5ba7df60853f6d347ca3493b</sign><sign_type>MD5</sign_type></alipay>";
			xml = "<alipay><is_success>T</is_success><request><param name=\"trade_no\">2015031124200354</param><param name=\"_input_charset\">utf-8</param><param name=\"service\">single_trade_query</param><param name=\"partner\">2088801766902304</param></request><response><trade><buyer_email>alipay_test@alipay.com</buyer_email><buyer_id>2088102151633543</buyer_id><discount>0.00</discount><flag_trade_locked>0</flag_trade_locked><gmt_create>2015-03-1110:28:41</gmt_create><gmt_last_modified_time>2015-03-1110:28:54</gmt_last_modified_time><gmt_payment>2015-03-1110:28:54</gmt_payment><is_total_fee_adjust>F</is_total_fee_adjust><operator_role>B</operator_role><out_trade_no>150311288690</out_trade_no><payment_type>8</payment_type><price>0.01</price><quantity>1</quantity><seller_email>shuzhi_zsz@126.com</seller_email><seller_id>2088801766902304</seller_id><subject>管理付款编号150311288690</subject><to_buyer_fee>0.00</to_buyer_fee><to_seller_fee>0.01</to_seller_fee><total_fee>0.01</total_fee><trade_no>2015031124200354</trade_no><trade_status>TRADE_SUCCESS</trade_status><use_coupon>F</use_coupon></trade></response><sign>9517107e5ba7df60853f6d347ca3493b</sign><sign_type>MD5</sign_type></alipay>";
			System.out.println(xml);
			
			test = (SingleTradeQueryResponse) JABXParser.fromXML(new StringReader(xml), SingleTradeQueryResponse.class);
			System.out.println(test.toString());
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void testbooleancast(){
		boolean falsebool = Boolean.valueOf("false");
		boolean truebool = Boolean.valueOf("true");
		boolean invalidbool = Boolean.valueOf("invalid");
		boolean nullbool = Boolean.valueOf(null);

		System.out.println("testbooleancast" + ", falsebool="+falsebool);
		System.out.println("testbooleancast" + ", truebool="+truebool);
		System.out.println("testbooleancast" + ", invalidbool="+invalidbool);
		System.out.println("testbooleancast" + ", nullbool="+nullbool);
	}
	private static void testXMLParser2(){
		String res_data = "<?xml version=\"1.0\" encoding=\"utf-8\"?><direct_trade_create_res><request_token>201503231e817a527326405a3c2861228f4b7ca8</request_token></direct_trade_create_res>";
		
		System.out.println("testXMLParser" + ", res_data="+res_data);
		
		String ret = null;
		
		
		Document document;
		try {
			document = DocumentHelper.parseText(res_data);

			System.out.println("generateToken()" +", document="+document.toString());
			System.out.println("generateToken()" +", document.getName()="+document.getName());
			System.out.println("generateToken()" +", document.getStringValue()="+document.getStringValue());
			
	//		System.out.println("generateToken()" +", this.getTokenNode()="+this.getTokenNode());
			
	//		Node node = document.selectSingleNode(this.getTokenNode());
			Node node = document.selectSingleNode( "//direct_trade_create_res/request_token" );
			System.out.println("generateToken()" +", node="+node.toString());
			System.out.println("generateToken()" +", node.getName()="+node.getName());
			System.out.println("generateToken()" +", node.getStringValue()="+node.getStringValue());
			
	
			ret = node.getText();
			System.out.println("generateToken()" +", ret="+ret);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public final static String PARAM_SIGN_TYPE = "sign_type";
	public final static String PARAM_SIGN = "sign";
	private static void testVerifySign(){
		/*

2015-03-20 11:35:30,205 INFO  [STDOUT] (http-172.16.210.20-8180-1) 2015-03-20 11:35:30,205 INFO [c.l.o.o.c.a.AlipayClient] - [updateTransactionDR] - updateTransactionDR()
 , DigitalReceipt=suspend=suspend&subject=901172627&sign_type=MD5&is_total_fee_adjust=N&notify_type=trade_status_sync&out_trade_no=901172627&out_channel_inst=INST_ALIPAY&vpcPay=vpcPay&authFailed=authFailed&buyer_email=14714348178%40163.com&total_fee=1.00&pending=pending&quantity=1&fraudCheck=fraudCheck&buyer_id=2088812802232761&trade_no=2015032000001000760045515773&notify_time=2015-03-20+11%3A35%3A30&use_coupon=N&error=error&errorDrUpdateFailed=errorDrUpdateFailed&authSuccess=authSuccess&trade_status=TRADE_SUCCESS&gmt_payment=2015-03-20+11%3A35%3A12&discount=0.00&sign=08911cc3fabf64844b263a7266dbef0c&gmt_create=2015-03-20+11%3A35%3A01&price=1.00&alreadyAuthSuccess=alreadyAuthSuccess&seller_id=2088711824364505&seller_email=cnonlinegroup%40lanecrawford.com&notify_id=e503f27226444e5384b8998aaddce6c168&payment_type=1
 , isSigned=false

		 */
		String key = "9m2q4kn4uakhh4c7ce354toz5cuzrh3v";
//		String dr = "suspend=suspend&subject=901172627&sign_type=MD5&is_total_fee_adjust=N&notify_type=trade_status_sync&out_trade_no=901172627&out_channel_inst=INST_ALIPAY&vpcPay=vpcPay&authFailed=authFailed&buyer_email=14714348178%40163.com&total_fee=1.00&pending=pending&quantity=1&fraudCheck=fraudCheck&buyer_id=2088812802232761&trade_no=2015032000001000760045515773&notify_time=2015-03-20+11%3A35%3A30&use_coupon=N&error=error&errorDrUpdateFailed=errorDrUpdateFailed&authSuccess=authSuccess&trade_status=TRADE_SUCCESS&gmt_payment=2015-03-20+11%3A35%3A12&discount=0.00&sign=08911cc3fabf64844b263a7266dbef0c&gmt_create=2015-03-20+11%3A35%3A01&price=1.00&alreadyAuthSuccess=alreadyAuthSuccess&seller_id=2088711824364505&seller_email=cnonlinegroup%40lanecrawford.com&notify_id=e503f27226444e5384b8998aaddce6c168&payment_type=1";
//		String sign = "08911cc3fabf64844b263a7266dbef0c";
		String dr = "suspend=suspend&subject=901172630&sign_type=MD5&is_total_fee_adjust=N&notify_type=trade_status_sync&out_trade_no=901172630&out_channel_inst=INST_ALIPAY&vpcPay=vpcPay&authFailed=authFailed&buyer_email=14714348178%40163.com&total_fee=1.00&pending=pending&quantity=1&fraudCheck=fraudCheck&buyer_id=2088812802232761&trade_no=2015032000001000760045536151&notify_time=2015-03-20+15%3A38%3A07&use_coupon=N&error=error&errorDrUpdateFailed=errorDrUpdateFailed&authSuccess=authSuccess&trade_status=TRADE_SUCCESS&gmt_payment=2015-03-20+15%3A24%3A27&discount=0.00&sign=200204d08ec11df13719212e5f552c54&gmt_create=2015-03-20+15%3A24%3A14&price=1.00&alreadyAuthSuccess=alreadyAuthSuccess&seller_id=2088711824364505&seller_email=cnonlinegroup%40lanecrawford.com&notify_id=ed50e3a6e5e741d50ee35dbc869073aa68&payment_type=1";
		String sign = "200204d08ec11df13719212e5f552c54";

		List<String> keyFilters = new ArrayList<String>();
		keyFilters.add(PARAM_SIGN);
		keyFilters.add(PARAM_SIGN_TYPE);
		
		System.out.println("testVerifySign()"+", dr="+dr);		
		System.out.println("testVerifySign()"+", sign="+sign+", key="+key+", keyFilters="+keyFilters);
		
		
		boolean isSigned = false;
		
		
		isSigned = verifyMD5(dr, sign, key, keyFilters);
		System.out.println("testVerifySign()"+", isSigned="+isSigned);
		
		/*
		
		String drDecoded = URLDecoder.decode(dr);
		System.out.println("testVerifySign()"+", drDecoded="+drDecoded);
		
		isSigned = verifyMD5(drDecoded, sign, key, keyFilters);
		System.out.println("testVerifySign() **drDecoded"+", isSigned="+isSigned);
		*/
		
		
		isSigned = getSignVeryfy(createMapFromQueryString(dr),sign);
		System.out.println("testVerifySign() ALIPAY API DEMO"+", isSigned="+isSigned);
	}
	
	private static boolean getSignVeryfy(Map<String, String> params, String sign) {
		

		System.out.println("getSignVeryfy()"+", params="+params.size());
		System.out.println("getSignVeryfy()"+", params containsKey sign ="+params.containsKey("sign"));
		System.out.println("getSignVeryfy()"+", params containsKey sign_type="+params.containsKey("sign_type"));
		
    	//过滤空值、sign与sign_type参数
    	Map<String, String> sParaNew = util.AlipayCore.paraFilter(params);
    	
		System.out.println("getSignVeryfy()"+", sParaNew="+sParaNew.size());
		System.out.println("getSignVeryfy()"+", sParaNew containsKey sign ="+sParaNew.containsKey("sign"));
		System.out.println("getSignVeryfy()"+", sParaNew containsKey sign_type="+sParaNew.containsKey("sign_type"));
		
        //获取待签名字符串
        String preSignStr = util.AlipayCore.createLinkString(sParaNew);
		System.out.println("getSignVeryfy()"+", preSignStr="+preSignStr);
        //获得签名验证结果
        boolean isSign = false;
//        if(AlipayConfig.sign_type.equals("MD5") ) {
        	isSign = util.MD5.verify(preSignStr, sign, "9m2q4kn4uakhh4c7ce354toz5cuzrh3v", "utf-8");
//        }
        return isSign;
    }
	


    public static boolean verifyMD5(String strText, String sign, String key, List<String> keyFilters) {
    	boolean ret = false;
    	try{
    		// create map from query string
    		Map<String, String> params = createMapFromQueryString(strText);
    		System.out.println("verifyMD5()"+", params="+params.size());
    		System.out.println("verifyMD5()"+", params containsKey sign ="+params.containsKey("sign"));
    		System.out.println("verifyMD5()"+", params containsKey sign_type="+params.containsKey("sign_type"));
    		
    		// filer out sigjn related parameters
        	Map<String, String> sParaNew = paraFilter(params,keyFilters);
    		System.out.println("verifyMD5()"+", sParaNew="+sParaNew.size());
    		System.out.println("verifyMD5()"+", sParaNew containsKey sign ="+sParaNew.containsKey("sign"));
    		System.out.println("verifyMD5()"+", sParaNew containsKey sign_type="+sParaNew.containsKey("sign_type"));
        	
            // create query string with filtered query map
            String preSignStr = createLinkString(sParaNew);
    		System.out.println("verifyMD5()"+", preSignStr="+preSignStr);
    		System.out.println("verifyMD5()"+", key="+key);

    		String input = preSignStr + key;
    		System.out.println("verifyMD5()"+", input="+input);
            // create sign with query string
			MD5 md5 = new MD5();
	    	String mysign = md5.getMD5ofStr(input);
    		System.out.println("verifyMD5()"+", mysign="+mysign);
    		System.out.println("verifyMD5()"+", sign="+sign);

            // verify sign
	    	if(mysign.equals(sign)) {
	    		ret = true;
	    	}
    	}catch (Exception e){
    		e.printStackTrace();
    	}
		System.out.println("verifyMD5()"+", ret="+ret);
    	return ret;
    }
	
	public static Map<String, String> createMapFromQueryString(String queryString)
	{
        Map<String, String> map = new HashMap<String, String>();
        StringTokenizer st = new StringTokenizer(queryString, "&");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            int i = token.indexOf('=');
            if (i > 0) {
                try {
                    String key = token.substring(0, i);
                    String value = URLDecoder.decode(token.substring(i + 1, token.length()),"UTF-8");
                    map.put(key, value);
                } catch (Exception ex) {
                    // Do Nothing and keep looping through data
                }
            }
        }
        return map;
    }
	
	
    public static Map<String, String> paraFilter(Map<String, String> sArray, List<String> keyFilters) {
    	
        Map<String, String> result = new HashMap<String, String>();

        if (sArray == null || sArray.size() <= 0) {
            return result;
        }else{
        }
        
        for (String key : sArray.keySet()) {
            String value = sArray.get(key);
            
            
            if (value == null || value.equals("") || key.equalsIgnoreCase("sign")
                || key.equalsIgnoreCase("sign_type")) {
                continue;
            }
             
            /*
            if (value == null || value.equals("")) {
                continue;
            }
            
            if(null == keyFilters || keyFilters.isEmpty()) {
            	continue;
            }
            
            for(String keyFilter:keyFilters){
                if(keyFilter == null || keyFilter.equals("") || key.equalsIgnoreCase(keyFilter)){
                	continue;
                }
            }
            */
            
            
            result.put(key, value);
        }

        return result;
    }

    /** 
     * 把数组所有元素排序，并按照“参数=参数值”的模式用“&”字符拼接成字符串
     * @param params 需要排序并参与字符拼接的参数组
     * @return 拼接后字符串
     */
    public static String createLinkString(Map<String, String> params) {

        List<String> keys = new ArrayList<String>(params.keySet());
        Collections.sort(keys);

        String prestr = "";

        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            String value = params.get(key);

            if (i == keys.size() - 1) {//拼接时，不包括最后一个&字符
                prestr = prestr + key + "=" + value;
            } else {
                prestr = prestr + key + "=" + value + "&";
            }
        }

        return prestr;
    }
	
	private static void testHash(){
		int vipCardfieldLength = 8;
		int mobileNumfieldLength = 7;
		int securityfieldLength = 0;
		int length = 101;
		String text = "a";
		String input = "12345678901234";
		int prefix = vipCardfieldLength+mobileNumfieldLength;
		System.out.println("input length ,hash length,securityfield Length,vipCardfield Length,mobileNumfield Length");
		for(int i =prefix;i<length;i++){
			try {
				input+=text;
				String hash = generateHash(input);
				
				
				securityfieldLength = input.length() - (vipCardfieldLength+mobileNumfieldLength);
				

				System.out.println(input.length()+","+hash.length()+","+securityfieldLength+","+vipCardfieldLength+","+mobileNumfieldLength);
				
				
			} catch (GeneralSecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static String generateHash(String text) throws GeneralSecurityException{
		return new TripleDES(true).encrypt(text);
	}
	
	private static void testParseArray(){
		String payChanTyp = "OPTIMIZED_MOTO|BALANCE";
		String payChanAmt = "90.00|10.00";
		String delimitor = "\\|";

		System.out.println("testParseArray"+", payChanTyp="+payChanTyp+", payChanAmt="+payChanAmt+", delimitor="+delimitor);
		
		
		List<PaymentChannel> list = parsePayChan(payChanTyp,payChanAmt,delimitor);
		
		
		for(PaymentChannel temp:list){
			System.out.println("temp="+temp.toString());
		}
		return;
	}
	
	private static List<PaymentChannel> parsePayChan(String payChanTyp,String payChanAmt,String delimitor){
		List<PaymentChannel> ret = null;
		String [] payChanTypArray = null;
		String [] payChanAmtArray = null;
		
		try{
			//input check
			if(payChanTyp.isEmpty()||payChanAmt.isEmpty()||delimitor.isEmpty()){
				System.out.println("invalid input");
				return ret;
			}
			
			payChanTypArray = payChanTyp.split(delimitor);
			payChanAmtArray = payChanAmt.split(delimitor);
			
			//array check
			if(payChanTypArray.length != payChanAmtArray.length){
				System.out.println("invalid type and ammount array length"+",payChanTypArray.length="+payChanTypArray.length+",payChanAmtArray.length="+payChanAmtArray.length);
				return ret;
			}
			
			ret= new ArrayList<PaymentChannel>();
			for(int index = 0; index < payChanTypArray.length ; index++){
				String type = payChanTypArray[index];
				Double amount = Double.valueOf(payChanAmtArray[index]);

				PaymentChannel temp = new PaymentChannel(type,amount);
				ret.add(temp);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}
	
	private static final String OOPG_WS_URI_LOCAL =  "http://127.0.0.1:8380/oopg/services/Payment";
	private static final String OOPG_WS_URI_UAT_CN =  "http://172.16.210.21:8080/oopg/services/Payment";
	private static final String OOPG_WS_URI_UAT =  "http://172.16.210.22:8080/oopg/services/Payment";
	private static void testOOPGCalls(){
		try {
			oopgStartAuth(OOPG_WS_URI_LOCAL);
//			oopgUpdateDR(OOPG_WS_URI_LOCAL);
//			oopgQueryTransaction(OOPG_WS_URI_LOCAL);
//			oopgGetDoUrl(OOPG_WS_URI_LOCAL);
//			oopgProcessIdleTransaction(OOPG_WS_URI_LOCAL);
//			oopgUpdateRefundDR(OOPG_WS_URI_LOCAL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void oopgUpdateRefundDR(String url) throws MalformedURLException, UnsupportedEncodingException, Exception{

		com.lanecrawford.oto.oopg.client.updateRefundDR.PaymentService ps = new com.lanecrawford.oto.oopg.client.updateRefundDR.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.updateRefundDR.Payment p = null;

		System.out.println("oopgUpdateRefundDR() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		String dr = "";
		try {
			/*
			String dr = "sign=25e737daeefdbeb64cb407ba300a6033"
						+ "&result_details=2015042100001000760048511054^1.00^SUCCESS$cnonlinegroup@lanecrawford.com^2088711824364505^0.01^SUCCESS"
						+ "&notify_time=2015-04-24 14:55:30"
						+ "&sign_type=MD5"
						+ "&notify_type=batch_refund_notify"
						+ "&notify_id=459108eafb61667a3669db8ba24a41em68"
						+ "&batch_no=20150428001"
						+ "&success_num=1";
						*/
			
			dr = "sign=25e737daeefdbeb64cb407ba300a6033"
					+ "&result_details=2015111710001982^1.00^SUCCESS"
					+ "&notify_time=2015-12-14 10:55:30"
					+ "&sign_type=MD5"
					+ "&notify_type=batch_refund_notify"
					+ "&notify_id=459108eafb61667a3669db8ba24a41em68"
					+ "&batch_no=20151214105044277"
					+ "&success_num=1";
			String ct = "alipay";
			System.out.println("oopgUpdateRefundDR()"+", url = "+url+", dr = "+dr+", ct = "+ct);
			
			response = p.updateRefundDR(dr, ct);
			System.out.println("oopgUpdateRefundDR()"+", response = "+response);
			
		} catch (RemoteException e) {
			System.out.println(e.toString());
		}
		
		return;
	}
	public static void oopgProcessIdleTransaction(String url) throws MalformedURLException, UnsupportedEncodingException, Exception{

		com.lanecrawford.oto.oopg.client.processIdleTransaction.PaymentService ps = new com.lanecrawford.oto.oopg.client.processIdleTransaction.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.processIdleTransaction.Payment p = null;
		
		System.out.println("oopgProcessIdleTransaction() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
			String oopgGuid = "BD7BB601-578B-4775-917B-CD61A7CBC47A";
			
			System.out.println("oopgProcessIdleTransaction()" + ", oopgGuid = "+ oopgGuid);
			response = p.processIdleTransaction(oopgGuid);
			System.out.println("oopgProcessIdleTransaction()" + ", oopgGuid = "+ oopgGuid + ", response = "+ response);

		} catch (RemoteException e) {
			System.out.println(e.toString());
		}

		return;
	}

	public static void oopgGetDoUrl(String url) throws MalformedURLException, UnsupportedEncodingException, Exception{

		com.lanecrawford.oto.oopg.client.getDoUrl.PaymentService ps = new com.lanecrawford.oto.oopg.client.getDoUrl.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.getDoUrl.Payment p = null;
		
		System.out.println("oopgQueryTransaction() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
			String oopgGuid = "F1CEA267-6538-457B-9553-D78F77A4B5D3";
			
			System.out.println("oopgGetDoUrl()" + ", oopgGuid = "+ oopgGuid);
			response = p.getDoUrl(oopgGuid);
			System.out.println("oopgGetDoUrl()" + ", oopgGuid = "+ oopgGuid + ", response = "+ response);

		} catch (RemoteException e) {
			System.out.println(e.toString());
		}

		return;
	}

	public static void oopgQueryTransaction(String url) throws MalformedURLException, UnsupportedEncodingException, Exception{

		com.lanecrawford.oto.oopg.client.queryTransaction.PaymentService ps = new com.lanecrawford.oto.oopg.client.queryTransaction.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.queryTransaction.Payment p = null;
		
		System.out.println("oopgQueryTransaction() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
			String cardType="alipay"; 
//			String orderReference = "901173602";
			String orderReference = "901173702";
			
			System.out.println("oopgQueryTransaction()" + ", cardType = "+ cardType + ", orderReference = "+ orderReference);
			response = p.queryTransaction(cardType, orderReference);
			System.out.println("oopgQueryTransaction()" + ", cardType = "+ cardType + ", orderReference = "+ orderReference+ ", response = "+ response);

		} catch (RemoteException e) {
			System.out.println(e.toString());
		}

		return;
	}
	public static void oopgStartAuth(String url) throws MalformedURLException, UnsupportedEncodingException, Exception{

		com.lanecrawford.oto.oopg.client.startauthorise.PaymentService ps = new com.lanecrawford.oto.oopg.client.startauthorise.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.startauthorise.Payment p = null;

		System.out.println("oopgStartAuth() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
// UAT
			String dummyOrderId = "9876543225n";
			String currencyCode="CNY"; 
			int authorizeAmount=1; 
			String cardType="alipay"; 
			String empty = ""; 
			String txnType="online"; 
			String fraudCheckXML=
					"<FRAUD_CHECK_CONTENT> "
						+ "<SHIPPING> "
							+ "<FIRST-NAME><![CDATA[被視為]]></FIRST-NAME> "
							+ "<LAST-NAME><![CDATA[司公布]]></LAST-NAME> "
							+ "<ADDR_1><![CDATA[包括本港在內的大中華區銷情]]></ADDR_1> "
							+ "<ADDR_2/> <ADDR_3/> "
							+ "<ADDR_CITY><![CDATA[手機業人士]]></ADDR_CITY> "
							+ "<ADDR_COUNTRY><![CDATA[CN]]></ADDR_COUNTRY> "
							+ "<ADDR_STATE><![CDATA[銷量大]]></ADDR_STATE> "
							+ "<ADDR_POSTAL><![CDATA[211100]]></ADDR_POSTAL> "
							+ "<ADDR_ZIP><![CDATA[211100]]></ADDR_ZIP> "
						+ "</SHIPPING> "
						+ "<BILLING> "
							+ "<FIRST-NAME><![CDATA[被視為]]></FIRST-NAME> "
							+ "<LAST-NAME><![CDATA[司公布]]></LAST-NAME> "
							+ "<ADDR_1><![CDATA[包括本港在內的大中華區銷情]]></ADDR_1> "
							+ "<ADDR_2/> <ADDR_3/> "
							+ "<ADDR_CITY><![CDATA[手機業人士]]></ADDR_CITY> "
							+ "<ADDR_COUNTRY><![CDATA[CN]]></ADDR_COUNTRY> "
							+ "<ADDR_STATE><![CDATA[銷量大]]></ADDR_STATE> "
							+ "<ADDR_POSTAL><![CDATA[211100]]></ADDR_POSTAL> "
							+ "<ADDR_ZIP><![CDATA[211100]]></ADDR_ZIP> "
						+ "</BILLING> "
						+ "<FIRST-NAME><![CDATA[售神話的蘋]]></FIRST-NAME> <LAST-NAME><![CDATA[公司公布]]></LAST-NAME> "
						+ "<MEMBER_ID><![CDATA[60640207]]></MEMBER_ID> "
						+ "<IP_ADDR><![CDATA[180.98.98.121]]></IP_ADDR> <NUMBER_OF_ITEMS><![CDATA[2]]></NUMBER_OF_ITEMS> "
						+ "<CopyAndPasteDetected><![CDATA[false]]></CopyAndPasteDetected> "
						+ "<GeoIPCountryDetected><![CDATA[CN]]></GeoIPCountryDetected> "
						+ "<HighestQuantityInOrder><![CDATA[1]]></HighestQuantityInOrder> "
						+ "<PCardNumberAwardedDiscount/> "
						+ "<Email><![CDATA[935717760@qq.com]]></Email> "
						+ "<ATG_ORDER_ID><![CDATA["+dummyOrderId+"]]></ATG_ORDER_ID> "
						+ "<ATG_RMS_ID><![CDATA["+dummyOrderId+"]]></ATG_RMS_ID> "
						+ "<STAFF_ID/> <STAFF_DISCOUNT_LEVEL/> <STAFF_DISCOUNT_AMOUNT/> <ALLOW_PAY_BY_EGC>true</ALLOW_PAY_BY_EGC> "
						+ "<PCARD_FIRST_NAME>本港</PCARD_FIRST_NAME> "
						+ "<PCARD_LAST_NAME>在內</PCARD_LAST_NAME> "
					+ "</FRAUD_CHECK_CONTENT> "; 
			String returnURL="https://secure.uat.lanecrawford.com.cn/checkout/orderConf.jsp"; 
			String rmsId=dummyOrderId; 
			int bankId=0; 
			String idCardNumber="123"; 
			String mobilePhoneNumber="123"; 
			boolean zeroAmountWithPromotion=false; 
//			boolean isMobile=false;String expireTime = "10m";
			boolean isMobile=false;
			String expireTime = "10";
			String asynReturnURL="https://secure.uat.lanecrawford.com.cn/checkout/resulthandler.jsp";
			
			System.out.println("oopgQueryTransaction()"+", fraudCheckXML = "+fraudCheckXML);
			
			
			response = p.startAuthorise(
					currencyCode, authorizeAmount, cardType,
					empty, empty, empty, 
					empty, txnType, fraudCheckXML, 
					returnURL, rmsId, bankId, 
					idCardNumber, mobilePhoneNumber, zeroAmountWithPromotion, 
					isMobile, asynReturnURL);
			 
			/*
			response = p.startAuthorise("", 1, "", "", "", "", "", "", "", "", "", 1, "", "", false, false);
			*/
//			response = p.startAuthorise("", 1, "", "", "", "", "", "", "", "", "", 1, "", "", false, false,expireTime,asynReturnURL);
			System.out.println("oopgQueryTransaction()"+", response = "+response);
			
		} catch (RemoteException e) {
			System.out.println(e.toString());
		}
		
		return;
	}
	
	public static void oopgUpdateDR(String url) throws MalformedURLException, UnsupportedEncodingException, Exception{

		com.lanecrawford.oto.oopg.client.updatetransactiondr.PaymentService ps = new com.lanecrawford.oto.oopg.client.updatetransactiondr.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.updatetransactiondr.Payment p = null;

		System.out.println("oopgUpdateDR() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
// SIT
			
			//async
			/*
			String dr = "suspend=suspend&subject=901172613&sign_type=MD5&is_total_fee_adjust=N&"
					+ "notify_type=trade_status_sync&out_trade_no=987654321e&out_channel_inst=INST_ALIPAY&"
					+ "vpcPay=vpcPay&authFailed=authFailed&buyer_email=14714348178%40163.com&total_fee=1.00&"
					+ "pending=pending&quantity=1&fraudCheck=fraudCheck&buyer_id=2088812802232761&"
					+ "trade_no=2015031800001000760045366222&notify_time=2015-03-19+15%3A10%3A00&use_coupon=N&"
					+ "error=error&errorDrUpdateFailed=errorDrUpdateFailed&authSuccess=authSuccess&"
					+ "trade_status=TRADE_SUCCESS&gmt_payment=2015-03-18+14%3A46%3A13&discount=0.00&"
					+ "sign=83763a6f2bb4a94c94e80eeb9e96c382&gmt_create=2015-03-18+14%3A46%3A02&price=1.00&"
					+ "alreadyAuthSuccess=alreadyAuthSuccess&seller_id=2088711824364505&"
					+ "seller_email=cnonlinegroup%40lanecrawford.com&notify_id=d9ae4633585a75f7f00f7c2ed4a057d468&payment_type=1";
			*/		
			
			//mobile alipay api crete payment response(async)
			//String dr = "suspend=suspend&sec_id=MD5&error=error&errorDrUpdateFailed=errorDrUpdateFailed&authSuccess=authSuccess&vpcPay=vpcPay&sign=9bf599a58de0741ea638e46d63871d1e&v=1.0&authFailed=authFailed&notify_data=%3Cnotify%3E%3Cpayment_type%3E1%3C%2Fpayment_type%3E%3Csubject%3E901173003%3C%2Fsubject%3E%3Ctrade_no%3E2015032500001000760045995663%3C%2Ftrade_no%3E%3Cbuyer_email%3E14714348178%40163.com%3C%2Fbuyer_email%3E%3Cgmt_create%3E2015-03-25+16%3A09%3A36%3C%2Fgmt_create%3E%3Cnotify_type%3Etrade_status_sync%3C%2Fnotify_type%3E%3Cquantity%3E1%3C%2Fquantity%3E%3Cout_trade_no%3E901173003%3C%2Fout_trade_no%3E%3Cnotify_time%3E2015-03-25+16%3A10%3A12%3C%2Fnotify_time%3E%3Cseller_id%3E2088711824364505%3C%2Fseller_id%3E%3Ctrade_status%3ETRADE_SUCCESS%3C%2Ftrade_status%3E%3Cis_total_fee_adjust%3EN%3C%2Fis_total_fee_adjust%3E%3Ctotal_fee%3E1.00%3C%2Ftotal_fee%3E%3Cgmt_payment%3E2015-03-25+16%3A10%3A12%3C%2Fgmt_payment%3E%3Cseller_email%3Ecnonlinegroup%40lanecrawford.com%3C%2Fseller_email%3E%3Cprice%3E1.00%3C%2Fprice%3E%3Cbuyer_id%3E2088812802232761%3C%2Fbuyer_id%3E%3Cnotify_id%3E72994e255d64bd37b07adebb43105cc768%3C%2Fnotify_id%3E%3Cuse_coupon%3EN%3C%2Fuse_coupon%3E%3C%2Fnotify%3E&alreadyAuthSuccess=alreadyAuthSuccess&pending=pending&service=alipay.wap.trade.create.direct&fraudCheck=fraudCheck";
			
			//desktop async
//			String dr = "subject=901173304&sign_type=MD5&is_total_fee_adjust=N&notify_type=trade_status_sync&out_trade_no=901173304&out_channel_inst=INST_ALIPAY&vpcPay=vpcPay&buyer_email=14714348178%40163.com&total_fee=1.00&quantity=1&buyer_id=2088812802232761&trade_no=2015033100001000760046499185&notify_time=2015-03-31+20%3A35%3A21&use_coupon=N&out_channel_type=BALANCE&trade_status=TRADE_SUCCESS&gmt_payment=2015-03-31+11%3A11%3A14&discount=0.00&sign=752d958d940b488bcd8a05b4aff86924&gmt_create=2015-03-31+11%3A11%3A06&price=1.00&seller_id=2088711824364505&seller_email=cnonlinegroup%40lanecrawford.com&notify_id=618bff39eaf3f049c8da15d1bb5a128868&payment_type=1";
/*
			String dr = "subject=901173801&sign_type=MD5&is_total_fee_adjust=N&notify_type=trade_status_sync&out_trade_no=901173801&buyer_email=14714348178%40163.com&total_fee=57.00&quantity=1buyer_id=2088812802232761&trade_no=2015040800001000760047225271&notify_time=2015-04-08+10%3A55%3A23&use_coupon=N&trade_status=TRADE_SUCCESS&gmt_payment=2015-04-08+10%3A55%3A23&discount=0.00&sign=44d65184d8cf9f107be9c84cbfaaac9a&gmt_create=2015-04-08+10%3A42%3A43&price=57.00&seller_id=2088711824364505&seller_email=cnonlinegroup%40lanecrawford.com&notify_id=19167f611a50ad84e7c83cf548c1ecb568&payment_type=1"
					+ "&out_channel_amount=28.06%7C28.94%7C10.01" 
					+ "&out_channel_inst=ICBC%7CINST_ALIPAY%7CCARTOON" 
					+ "&out_channel_type=B2C_EBANK%7CBALANCE%7CCARTOON"; 
*/			
			//destop sync , ha proxy
//			String dr = "buyer_email=14714348178%40163.com&buyer_id=2088812802232761&exterface=create_direct_pay_by_user&is_success=T&notify_id=RqPnCoPT3K9%252Fvwbh3InTvaCTzrG9y6193YD1mpaVHkxbCtfLufFmn%252BjzLKT60dKSXzmI&notify_time=2015-03-30+15%3A57%3A57&notify_type=trade_status_sync&out_trade_no=901173201&payment_type=1&seller_email=cnonlinegroup%40lanecrawford.com&seller_id=2088711824364505&subject=901173201&total_fee=1.00&trade_no=2015033000001000760046432118&trade_status=TRADE_SUCCESS&sign=8df72aacb21824e058d06580f348d133&sign_type=MD5";
			
			//manual cancel testing, mobile sync call back
			//http://www.sit.lanecrawford.com.cn/checkout/asyncResultHandlers.jsp?out_trade_no=901174203&request_token=request_token&result=fail&tender_id=&trade_no=unknown&sign_type=MD5&sign=12db31f8837bf686556924df1af2ef9d
			String dr = "out_trade_no=901174203&request_token=request_token&result=fail&tender_id=unknown&trade_no=unknown&sign_type=MD5&sign=7b98692cf92a50eaf7d0b21da3cd2b6e";
			
			response = p.updateTransactionDR(dr);			 
			System.out.println("oopgUpdateDR()"+", response = "+response);
			
		} catch (RemoteException e) {
			System.out.println(e.toString());
		}
		
		return;
	}
	private static void patchnumberwithzeroprefix(){
		int number = 1234;
		//int textLength = 3;
		String textFormat = "%03d";
		String text = String.format(textFormat, number);
		
		System.out.println("patchnumberwithzeroprefix()" + ", number="+number + ", textFormat="+textFormat+ ", text="+text);
	}

	private static void testmd5logicOOPG(){
		//String key = "9m2q4kn4uakhh4c7ce354toz5cuzrh3v";
		/*
https://mapi.alipay.com/gateway.do?
service=create_direct_pay_by_user&sign_type=MD5&partner=2088711824364505&seller_email=cnonlinegroup@lanecrawford.com&_input_charset=utf-8&notify_url=https://secure.sit.lanecrawford.com.cn/checkout/resulthandler.jsp&show_url=http://www.lanecrawford.com.cn/&subject=901172608&total_fee=2820000&out_trade_no=901172608&payment_type=1
&sign=9f9a29ed790f76f74bbbad1957dacbab
		 */
//		String text = "_input_charset=utf-8&notify_url=http://www.uat.lanecrawford.com/create_direct_pay_by_user-JAVA-UTF-8/notify_url.jsp&out_trade_no=o27022015004&partner=2088711824364505&payment_type=1&return_url=http://www.uat.lanecrawford.com/create_direct_pay_by_user-JAVA-UTF-8/return_url.jsp&seller_email=cnonlinegroup@lanecrawford.com&service=create_direct_pay_by_user&show_url=http://www.xxx.com/myorder.html &subject=test_order_04&total_fee=0.01";
//		String mysign= "95c156eddf60340b291f4b07bc10f5e0";
		
		/*
		String text = "_input_charset=utf-8&notify_url=https://secure.sit.lanecrawford.com.cn/checkout/resulthandler.jsp&out_trade_no=901172608&partner=2088711824364505&payment_type=1&seller_email=cnonlinegroup@lanecrawford.com&service=create_direct_pay_by_user&show_url=http://www.lanecrawford.com.cn/&subject=901172608&total_fee=2820000"; 
		String mysign= "f8733e16696a879dc40466c2a36789f0";
		*/
		
//		, returnValue=3E8E4F70A3E7F4C8BFDCE9476BD4C231
		
		 // local tesing
		String text = "service=create_direct_pay_by_user&sign_type=MD5&partner=2088711824364505&seller_email=cnonlinegroup@lanecrawford.com&_input_charset=utf-8&notify_url=https://secure.sit.lanecrawford.com.cn/checkout/resulthandler.jsp&show_url=http://www.lanecrawford.com.cn/&subject=987654321c&total_fee=1&out_trade_no=987654321c&payment_type=1";
		String mysign= "3E8E4F70A3E7F4C8BFDCE9476BD4C231";
		String key = "9m2q4kn4uakhh4c7ce354toz5cuzrh3v";
		
		//API demo alipay
		/*
 prestr=_input_charset=utf-8&notify_url=https://secure.sit.lanecrawford.com.cn/checkout/resulthandler.jsp&out_trade_no=987654321c&partner=2088711824364505&payment_type=1&seller_email=cnonlinegroup@lanecrawford.com&service=create_direct_pay_by_user&show_url=http://www.lanecrawford.com.cn/&subject=987654321c&total_fee=1
 mysign=9b8ed8468078bc8ab9c320b1515a26e0
*/
		String sign = getMD5Info(text+key);
		System.out.println("testmd5logicOOPG()"+", key="+key+", text="+text);
		System.out.println("testmd5logicOOPG()"+", sign="+sign+", sign_lower="+sign.toLowerCase());
				 
		
		boolean isEqualIgnorecase = false;
		boolean isEqual = false;
		isEqualIgnorecase = mysign.equalsIgnoreCase(sign);
		isEqual = mysign.contentEquals(sign.toLowerCase());
		System.out.println("testmd5logicOOPG()"+", isEqualIgnorecase="+isEqualIgnorecase+", isEqual="+isEqual);
	}
	public static String getMD5Info(String strText)
	{
		String returnValue = "";
		
		MD5 md5 = new MD5();
		returnValue = md5.getMD5ofStr(strText);
		System.out.println("getMD5Info()"+", strText="+strText+", returnValue="+returnValue);
		
		return returnValue;
	}
	
	private static void testSpringRestTemplate(){
        Map<String, String> vars = new HashMap<String, String>();
        vars.put("id", "JS01");
		
        RestTemplate rt = new RestTemplate();
        //rt.getMessageConverters().add(new MappingJacksonHttpMessageConverter());
        //rt.getMessageConverters().add(new StringHttpMessageConverter());

        
        String gateway = "http://www.abc.com/gateway.do";
        String url = new String(gateway);
/*
        User u = new User();
        u.setName("Johnathan M Smith");
        u.setUser("JS01");
        User returns = rt.postForObject(uri, u, User.class, vars);
*/
        
        URI uri = rt.postForLocation(url, null, vars);

        try {
			System.out.println("testSpringRestTemplate()"+", gateway=" + gateway+", url=" + url+", uri=" + uri+", uri=" + uri.toURL());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testEncodeDecode2(){
		String shippingState = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.111 Safari/537.36";
		
		String encodeshippingState = "";
		String decodeShippingState = "";
		
		
		//byte[]   bytesEncoded = Base64.encodeBase64(shippingState.getBytes());
		encodeshippingState = new String(org.apache.commons.codec.binary.Base64.encodeBase64(shippingState.getBytes()));
		//System.out.println("ecncoded value is " + new String(bytesEncoded ));
		
		//byte[] valueDecoded= Base64.decodeBase64(encodeshippingState.getBytes());
		decodeShippingState = new String(org.apache.commons.codec.binary.Base64.decodeBase64(encodeshippingState.getBytes()));
		//System.out.println("Decoded value is " + new String(valueDecoded));

		System.out.println(shippingState);
		System.out.println(encodeshippingState);
		System.out.println(decodeShippingState);
		
	}
	private static void testEncodeDecode(){
		String shippingState = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.111 Safari/537.36";
		
		String encodeshippingState = "";
		String decodeShippingState = "";
		
		
		byte[]   bytesEncoded = Base64.encodeBase64(shippingState.getBytes());
		encodeshippingState = new String(bytesEncoded);
		//System.out.println("ecncoded value is " + new String(bytesEncoded ));
		
		byte[] valueDecoded= Base64.decodeBase64(bytesEncoded );
		decodeShippingState = new String(valueDecoded);
		//System.out.println("Decoded value is " + new String(valueDecoded));

		System.out.println(shippingState);
		System.out.println(encodeshippingState);
		System.out.println(decodeShippingState);
		
	}
	/*
	private static void testATGEncodeDecode(){
		
//		String shippingState = "北京市";

		String shippingState = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/40.0.2214.111 Safari/537.36";
//		String shippingState = "TESTING";
		
		String encodeshippingState = "";
		String decodeShippingState = "";
		
		String method = "UTF-8";
		
		System.out.println("000"+", shippingState="+shippingState+", encodeshippingState="+encodeshippingState+", decodeShippingState="+decodeShippingState);
		try {
			encodeshippingState = atg.core.util.Base64.encodeToString(shippingState.getBytes(method));

			System.out.println("aaa"+", shippingState="+shippingState+", encodeshippingState="+encodeshippingState+", decodeShippingState="+decodeShippingState);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			decodeShippingState = new String(atg.core.util.Base64.decodeToByteArray(shippingState.getBytes(method)), method);
			
			System.out.println("bbb"+", shippingState="+shippingState+", encodeshippingState="+encodeshippingState+", decodeShippingState="+decodeShippingState);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ccc"+", shippingState="+shippingState+", encodeshippingState="+encodeshippingState+", decodeShippingState="+decodeShippingState);
	}
	*/
	private static void testSplitTexttoMap(){
		String electronicRmsId = "";
		
		Map<String,List<String>> test = split(electronicRmsId);
	}
	
	private static Map<String,List<String>> split(String electronicRmsId){
		Map<String,List<String>> ret = new HashMap<String,List<String>>();
		
		try {
			String [] electronicItemsGroupAry = electronicRmsId.split(",");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ret;
	}
	
	private static void testMapArray(){
		Map<String,List<String>> test = null;
		
		test = new HashMap<String,List<String>>();

		List<String> l_A = new ArrayList<String>();
		l_A.add("111");
		l_A.add("222");
		List<String> l_B = new ArrayList<String>();
		l_B.add("333");

		test.put("A", l_A);
		test.put("B", l_B);
		
		for(@SuppressWarnings("rawtypes") Map.Entry entry : test.entrySet()){
			System.out.println("key="+ entry.getKey() +", value="+ entry.getValue());
		}
		
		String index0 = l_A.remove(0);
		System.out.println("index0="+index0);
	}
	
	private static void testString() {
		try {
			String region = "123";
			String test = null;

//	if (region.contentEquals(test)) {
		if (test.contentEquals(region)) {
				System.out.println("a");
			} else {
				System.out.println("b");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void stringCompare(){
		String test1 = "00";
		String test2 = "0";
		
		boolean ret = test1.equalsIgnoreCase(test2);
		
		System.out.println("test1 = "+test1 +", test2 = "+test2+", ret = "+ret);
	}
	
	private static void castDoubleToint(){
		double testdouble = -1234.5;
		int testint =(int) testdouble * -1 * 100;
		
		System.out.println("testdouble = "+testdouble +", testint = "+testint);
		int testint2 =(int) (testdouble * -1 * 100);

		System.out.println("testdouble = "+testdouble +", testint = "+testint+", testint2 = "+testint2);
	}
	
	private static void testTransferResult(){
		model.oopg.FileTransferResult test;
		System.out.println("testTransferResult");
		try {
			test = parseTransferResult(null);
			System.out.println(test.toString());
			List<model.oopg.TransferRecord> records = test.getRecords();
			System.out.println("records.size()="+records.size());
			
			for(model.oopg.TransferRecord record : records){
				System.out.println(record.toString());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static model.oopg.FileTransferResult parseTransferResult(MultipartFile file)
			throws Exception {
		model.oopg.FileTransferResult ret = null;
		//0. index
		int sheetNum = 0;
		int startLine = 14;
		int keyCellNum = 1;
		String codPrefix = "SR";
//		String codPrefix = this.getRefundDocGenerationService().getSpFirstPartyReferencePrefix();
		int rowBankReference = 0;
		int rowCustomerReference = 1;
		int rowTrnType = 2;
		int rowValueDate = 3;
		int rowCreditAmount = 4;
		int rowDebitAmount = 5;
		int rowBalance = 6;
		int rowTime = 7;
		int rowAction = 8;
		int rowPostDate = 9;
		String dateFormat = "dd/MM/yyyy";

		//Workbook workbook = new HSSFWorkbook(file.getInputStream());
		
		String path = "C:\\Users\\roychan\\temp\\hsbc samples\\726-003_LCBJ Nov.xls";
		System.out.println("path = " + path);
		//File staticfile = new File(path);
		FileInputStream staticfile = new FileInputStream(new File(path));
		Workbook workbook = new HSSFWorkbook(staticfile);
		Sheet sheet = workbook.getSheetAt(sheetNum);

		Row row = null;
		Cell cell = null;

		ret = new model.oopg.FileTransferResult();
		List<model.oopg.TransferRecord> records = new ArrayList<model.oopg.TransferRecord>();
		for (int rowNum = 0; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
			//1. check starting line
			if (rowNum < startLine) {
				System.out.println("Ignore row " + rowNum + ", startLine = " + startLine);
				continue;
			}
			
			row = sheet.getRow(rowNum);
			//2. check if row exists
			if (null == row) {
				System.out.println("Row " + rowNum + " is null" + ", fileName = " +file.getOriginalFilename());
				continue;
			}

			//3. check if keyCell exists 
			if(null == row.getCell(keyCellNum)){
				System.out.println("Key Cell is empty" + ", rowNum = " + rowNum);
				continue;
			}
			
			//4. check if keyCell has valid prefix
			String reference = row.getCell(keyCellNum).getStringCellValue();
			if(null == reference || reference.isEmpty() || !reference.startsWith(codPrefix)){
				System.out.println("invalid prefix" + ", rowNum = " + rowNum + ", reference = " + reference+ ", prefix = " + codPrefix);
				continue;
			}
			
			model.oopg.TransferRecord record = new model.oopg.TransferRecord();
			for (int columnNum = 0; columnNum < row.getPhysicalNumberOfCells(); columnNum++) {

				cell = row.getCell(columnNum);
				//5.0 check if cell is null or empty
				if(null == cell || cell.getCellType() == Cell.CELL_TYPE_BLANK) continue;

				//5.1 parse each cell
				if(rowBankReference == columnNum){
					record.setBankReference(cell.getStringCellValue());
				}else if(rowCustomerReference == columnNum){
					record.setCustomerReference(cell.getStringCellValue());
				}else if(rowTrnType == columnNum){
					record.setTrnType(cell.getStringCellValue());
				}else if(rowValueDate == columnNum){
					record.setValueDate(convert(cell.getStringCellValue(), dateFormat));
				}else if(rowCreditAmount == columnNum){
					record.setCreditAmount(cell.getNumericCellValue());
				}else if(rowDebitAmount == columnNum){
					record.setDebitAmount(cell.getNumericCellValue());
				}else if(rowBalance == columnNum){
					record.setBalance(cell.getNumericCellValue());
				}else if(rowTime == columnNum){
					record.setTime(cell.getStringCellValue());
				}else if(rowAction == columnNum){
					record.setAction(cell.getStringCellValue());
				}else if(rowPostDate == columnNum){
					record.setPostDate(convert(cell.getStringCellValue(), dateFormat));
				}else{
					System.out.println("columnNum out of range" + ", rowNum = " + rowNum + ", columnNum = " + columnNum);
					continue;
				}
			}
			records.add(record);
		}
		System.out.println("Parse excel success" + ", num of record parsed = " + records.size());
		ret.setRecords(records);
				
		return ret;
	}

	private static Date convert(String dateInString, String format){
		Date ret = null;
		try{
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			ret = sdf.parse(dateInString);
		}catch (Exception e){
			e.printStackTrace();
		}
		return ret;
	}
	private static void testfloat(){
		float a = (float) 0.1;
		float b = (float) 0.2;
		
		System.out.println("float= " +(a+b));
		double c =  0.1;
		double d =  0.2;
		
		System.out.println("double= " +(c+d));
		
	      double x = 2.0;
	      double y = 64000.0;

	      System.out.printf("The value of e is %.4f%n", Math.E);
	      System.out.printf("pow(%.3f, %.3f) is %.3f%n",
	                                         x, y, Math.pow(x, y));
	}
	private static void testexception(){
		try{
		 throwException();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private static void throwException() throws IOException{
		String test = null;
		
		System.out.println(test.toString());
	}
	private static void trimStringByMD5(){
		String test = "abcdefghijklmnopqrstuvwxyz1234567890abcdefghijklmnopqrstuvwxyz";
		System.out.println("test="+test);
		  MessageDigest md;
		try {
			md = MessageDigest.getInstance("MD5");
		  md.update(test.getBytes());
		  byte[] digest = md.digest();
		  StringBuffer sb = new StringBuffer();
		  for (byte b : digest) {
		   sb.append(String.format("%02x", b & 0xff));
		  }
			System.out.println("sb="+sb);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private  static void textDateString(){
		Date date = new Date();
		System.out.println("date="+date);
		System.out.println("date="+date.toString());
		System.out.println("date="+date.toLocaleString());
		System.out.println("date="+date.toGMTString());
	
		DateFormat outputFormat = new SimpleDateFormat("yyyyMMdd");
		//String sDate = outputFormat.format(date);
		String sDate = "20141030";
		System.out.println("sDate="+sDate);
		
		String lnnng = String.valueOf(date.getTime());
		System.out.println("lnnng="+lnnng);
		
		Date string2Date;
		try {
			string2Date = outputFormat.parse(sDate);
			System.out.println("string2Date="+string2Date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void  testchinesecharlength(){
		//String test = "ä¸­å›½å·¥å•†é“¶è¡Œå››å·�æˆ�éƒ½æ²™æ²³ç�†å·¥å¤§å­¦åˆ†ç�†å¤„æ‹›å•†é“¶è¡Œå¤©æ´¥åˆ†è¡Œå�—é—¨å¤–æ”¯è¡Œ";
		String test = "ä¸­å›½å·¥å•†é“¶è¡Œå››å·�æˆ�éƒ½æ²™æ²³ç�†å·¥å¤§å­¦åˆ†ç�†å¤„æ‹›å•†é“¶è¡Œå¤©æ´¥";

		System.out.println("test="+test);
		System.out.println("test="+test.length());
		
		setBeneficiaryBankName(test,11);
	}
	
	public static void setBeneficiaryBankName(String returnBankName,
			int beneficiaryBankNameCharLimit) {
		String beneficiaryBankName = "";
		String beneficiaryBankAddressLine1 = "";
		if(null != returnBankName && !returnBankName.isEmpty()){
			if(returnBankName.length() > beneficiaryBankNameCharLimit){
				beneficiaryBankName = returnBankName.substring(0, beneficiaryBankNameCharLimit);
				beneficiaryBankAddressLine1 = returnBankName.substring(beneficiaryBankNameCharLimit, (returnBankName.length()>=beneficiaryBankNameCharLimit *2)?beneficiaryBankNameCharLimit *2:returnBankName.length());
			}else{
				beneficiaryBankName = returnBankName;
			}
		}
		System.out.println("beneficiaryBankName="+beneficiaryBankName);
		System.out.println("beneficiaryBankAddressLine1="+beneficiaryBankAddressLine1);
	}
	
	private static void  testdoubledefaultvalue(){
		
		testObject test = new testObject();
		
		System.out.println("test="+test);
		
		if(test.getTesting() == 0 ){

			System.out.println("0=");
		}else{

			System.out.println("not 0=");
		}

		if(test.getTesting() == 0.0d ){

			System.out.println("test.getTesting() == 0.0d");
			
		}
		test.setTesting(100);
		System.out.println("test.getTesting()="+test.getTesting());
	}
	
	private static void testRemoveDoubleTailZero(){
		double answer = 5.0;
		   DecimalFormat df = new DecimalFormat("#.#");
		   String trimmedAnswer = df.format(answer);
		  System.out.println(answer);
		  System.out.println(trimmedAnswer);
	}
	
	private static String  getLineSeperatorText(){
		String a = "æ‹›å•†é“¶è¡Œå¤©æ´¥åˆ†è¡Œå�—é—¨å¤–æ”¯è¡Œè¡Œ" + System.getProperty("line.separator");
		String b = "é­�ä¸½é”¦" + System.getProperty("line.separator");
		String c = "6212264402018649529" + System.getProperty("line.separator");
		
		String d = a+b+c;
		//System.out.println(System.getProperty("line.separator") +"aaa" + System.getProperty("line.separator") + "bbb" + System.getProperty("line.separator") + "ccc");
		//System.out.println("d="+d);
		
		return d;
		
	}
	
	private static boolean writeTextToFile(String text, String filePath){
		boolean ret = false;
		PrintWriter out = null;
		try{
			//out = new PrintWriter("C:\\Users\\roychan\\temp\\filename.txt");
			out = new PrintWriter(filePath);
			out.println(text);
			
			ret = true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(null != out) out.close();
		}
		return ret;
	}
	private static boolean writeByteBufferToFile(ByteBuffer buffer, String filePath){
		boolean ret = false;
//	    FileChannel in = null;
	    FileChannel out = null;
		try{
//		    String fromFileName = "C:\\Users\\roychan\\temp\\from.txt";
		    String toFileName = filePath;
//		    in = new FileInputStream(fromFileName).getChannel();
		    out = new FileOutputStream(toFileName).getChannel();

		    //ByteBuffer buff = ByteBuffer.allocateDirect(32 * 1024);

//		    while (in.read(buffer) > 0) {
		    	buffer.flip();
		      out.write(buffer);
		      buffer.clear();
//		    }

//		    in.close();
		    out.close();
			
			ret = true;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
//				if(null != in) in.close();
				if(null != out) out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return ret;
	}
	
	private static void testTextToInputStreamthenfile(){
		System.out.println("testTextToInputStream");
		String text = getLineSeperatorText();
		BufferedReader in = null;
		String filePath = "c:\\Users\\roychan\\Downloads\\est.csv";
		System.out.println("testTextToInputStream" + ",text="+text + ",filePath="+filePath);
		try{
			//InputStream stream = new ByteArrayInputStream(text.getBytes(Charset.defaultCharset()));
			//InputStream stream = new ByteArrayInputStream(text.getBytes(Charsets.UTF_8));
			InputStream stream = new ByteArrayInputStream(text.getBytes("GB2312"));
			
			/*
			in = new BufferedReader(new InputStreamReader(stream));
			String inputLine;
			System.out.println("testTextToInputStream" + ", InputStream=");
			while ((inputLine = in.readLine()) != null){
			    System.out.println(inputLine);
			}
			*/
			if(streamtofile(stream,filePath)) 
				System.out.println("streamtofile success!");
			else 
				System.out.println("streamtofile fail!");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if(null != in) in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    public static boolean streamtofile(InputStream inputStream , String filePath) {
    	 boolean ret = false;
    	 OutputStream outputStream = null;
 
		try {
	 
			// write the inputStream to a FileOutputStream
			outputStream = new FileOutputStream(new File(filePath));
	 
			int read = 0;
			byte[] bytes = new byte[1024];
	 
			while ((read = inputStream.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
	 
			System.out.println("Done!");
			ret = true;
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (outputStream != null) {
				try {
					// outputStream.flush();
					outputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
	 
			}
		}
		return ret;
    }
	public static String utf2gb(String utfStr) {
		byte[] tempStr;
		String gbStr = null;
		try {
			Base64 base64=new Base64();
			System.out.println("utfStr:" + utfStr);
			
			tempStr = utfStr.getBytes("GB2312");
			System.out.println("tempStr:" + tempStr);
			
			gbStr = new String(tempStr);
			System.out.println("gbStr:" + gbStr);
			
		} catch (UnsupportedEncodingException uee) {
			System.out.println("Exception:" + uee);
		}
		return gbStr;
	}
	private static boolean isGB2312(final String s) {
	return java.nio.charset.Charset.forName("GB2312").newEncoder().canEncode(s);
	}
	
	public static ByteBuffer encodeTpGb2312(String utfStr) {
		ByteBuffer ret = null;
		String charset = "GB2312";
		try {
			Charset cs = Charset.forName(charset);
			CharsetEncoder encoder = cs.newEncoder();
			
			
			if(encoder.canEncode(utfStr)){
				System.out.println("can encode str:"+utfStr);
				ret =  encoder.encode(CharBuffer.wrap(utfStr.toCharArray()));
				
			}else{
				System.out.println("can not encode str:"+utfStr);
			}
		} catch (Exception uee) {
			System.out.println("Exception:" + uee);
		}
		return ret;
	}
	
	private static void testutf2gb(){
		String a = "æ‹›å•†é“¶è¡Œå¤©æ´¥åˆ†è¡Œå�—é—¨å¤–æ”¯è¡Œ";
		//String a = "è£…ç®±æ—¶è¯·æ‹�ç…§";
		//String gbStr = utf2gb(a);
		ByteBuffer gbStr = encodeTpGb2312(a);
		System.out.println("testutf2gb()"+"a:" + a);
		System.out.println("testutf2gb()"+"gbStr:" + gbStr);

		//boolean isgbStrGB2312 = isGB2312(gbStr);
		//System.out.println("testutf2gb() ,"+ gbStr + ", isgbStrGB2312:" + isgbStrGB2312);
		boolean isaGB2312 = isGB2312(a);
		System.out.println("testutf2gb() ,"+ a + ", isaGB2312:" + isaGB2312);
		
		writeTextToFile(a,"C:\\Users\\roychan\\temp\\a.txt");
		//writeTextToFile(gbStr,"C:\\Users\\roychan\\temp\\gbStr.txt");
		writeByteBufferToFile(gbStr,"C:\\Users\\roychan\\temp\\gbStr.txt");
	}

	private static void testOOPGWS(String url){
		try {
			/*
			nbaCardHolderNumber(url,"E05A73EB-643F-471A-B18C-A1E7E8EFD816");
			nbaRefundUpdate(url,"E05A73EB-643F-471A-B18C-A1E7E8EFD816" ,"bankarroy" ,"arroy", "12345");
			*/
			//nbaCardHolderNumber(url,"E05A73EB-643F-471A-B18C-A1E7E8EFD816");
			oopgwsTesting(url);
			//codRejectUponDelivery(url, "E05A73EB-643F-471A-B18C-A1E7E8EFD816");

			//uat cn
			//codRejectUponDelivery(url, "35DBF2C6-033B-453F-A71D-7C1CB6AFE44A");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void nbaCardHolderNumber(String url , String oopg_txnId_guid) throws MalformedURLException, UnsupportedEncodingException, Exception{
		com.lanecrawford.oto.oopg.client.getCardHolderNumber.PaymentService ps =new com.lanecrawford.oto.oopg.client.getCardHolderNumber.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.getCardHolderNumber.Payment p = null;

		System.out.println("nbaCardHolderNumber() oopg_txnId_guid = "+oopg_txnId_guid);
		System.out.println("nbaCardHolderNumber() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
			response = p.getCardHolderNumber(oopg_txnId_guid);
			System.out.println("response = "+response);
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return;
	}
	public static boolean nbaRefundUpdate(String url , String oopgTxnIdGuid, String bankName, String cardHolderName, String cardHolderNumber) {
		
		boolean result = false;
		com.lanecrawford.oto.oopg.client.nbaRefundUpdate.PaymentService ps =  new com.lanecrawford.oto.oopg.client.nbaRefundUpdate.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.nbaRefundUpdate.Payment p = null;
		
		System.out.println("nbaRefundUpdate() url = "+url);
		System.out.println("nbaRefundUpdate() oopgTxnIdGuid = "+oopgTxnIdGuid);
		System.out.println("nbaRefundUpdate() bankName = "+bankName);
		System.out.println("nbaRefundUpdate() cardHolderName = "+cardHolderName);
		System.out.println("nbaRefundUpdate() cardHolderNumber = "+cardHolderNumber);

		try {
			p = ps.getPayment(new URL(url));
			
			String encodedCardHolderName = Base64Util.encode(cardHolderName);
			//String encodedCardHolderName = cardHolderName;
			String response = p.nbaRefundUpdate(oopgTxnIdGuid, bankName, encodedCardHolderName, cardHolderNumber);
			System.out.println("response = "+response);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static void oopgwsTesting(String url) throws MalformedURLException, UnsupportedEncodingException, Exception{
		com.lanecrawford.oto.oopg.client.testing.PaymentService ps =new com.lanecrawford.oto.oopg.client.testing.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.testing.Payment p = null;

		System.out.println("oopgwsTesting() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
			response = p.testing("god dammit");
			System.out.println("response = "+response);
			
		} catch (RemoteException e) {
			System.out.println(e.toString());
		}
		
		return;
	}
	public static void codRejectUponDelivery(String url, String oopgTxnIdGuid) throws MalformedURLException, UnsupportedEncodingException, Exception{
		com.lanecrawford.oto.oopg.client.codRejectUponDelivery.PaymentService ps =new com.lanecrawford.oto.oopg.client.codRejectUponDelivery.PaymentServiceLocator();
		com.lanecrawford.oto.oopg.client.codRejectUponDelivery.Payment p = null;

		System.out.println("codRejectUponDelivery() url = "+url);

		p = ps.getPayment(new URL(url));
		
		String response = "";
		try {
			response = p.codRejectUponDelivery("E05A73EB-643F-471A-B18C-A1E7E8EFD816");
			System.out.println("response = "+response);
			
		} catch (RemoteException e) {
			System.out.println(e.toString());
		}
		
		return;
	}
	

	private static void testfilterList() {
		// TODO Auto-generated method stub
		List<ArchiveRecord> test = new ArrayList<ArchiveRecord>();
		ArchiveRecord a = new ArchiveRecord();
		a.setATGOrderId("o123");
		a.setCustomerInvoiceArchived(true);
		ArchiveRecord b = new ArchiveRecord();
		b.setATGOrderId("o124");
		//b.setCustomerInvoiceArchived(true);
		ArchiveRecord c = new ArchiveRecord();
		c.setATGOrderId("o125");
		//c.setCustomerInvoiceArchived(true);

		test.add(a);
		test.add(b);
		test.add(c);
		
		List<ArchiveRecord> testFilter = testfilterList(test);
		System.out.println("filtered");
		for(ArchiveRecord record:testFilter){
			System.out.println(record.toString());
		}

		System.out.println("original");
		for(ArchiveRecord record:test){
			System.out.println(record.toString());
		}
		
	}
	
	private static List<ArchiveRecord> testfilterList(List<ArchiveRecord> reocrds){
		List<ArchiveRecord> ret = null;
		
		ret = new ArrayList<ArchiveRecord>();
		for(ArchiveRecord record:reocrds){
			if(record.isCustomerInvoiceArchived()){
				ret.add(record);
				
			} else{

				record.setOrderGuid("filtered");
			}
		}
		
		return ret;
	}


	private static void testdateparser(){
		String dateFormal = "MM/dd/yyyy"; 
		String inputDate = "08/02/2014";
		
		Date date = null;
		try {
			date = parseDateest(dateFormal,inputDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
	}
	
	public static Date parseDateest(String dateFormal, String inputDate) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormal);
		
		return dateFormat.parse(inputDate);
	}
	
	private static void testXML(){
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("mkyong");
		customer.setAge(29);
		System.out.println("customer="+customer.toString());
		try {
			String path = "C:\\Users\\roychan\\file.xml";			

			File file = new File(path);
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);

			// parse XML
			/*
			Customer test = (Customer) JABXParser.fromXML(new FileReader(path), Customer.class);
			System.out.println("test="+customer.toString());
			//test CN shipping order
			*/
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void testskipxmlprefix(){
		String xml = "<ns2:Person name='John' age='20'/>";
        try {
	        SAXParserFactory spf = SAXParserFactory.newInstance();
	        SAXParser sp = spf.newSAXParser();
	        XMLReader xmlReader = sp.getXMLReader();
	        XMLFilter xmlFilter = new MyXMLFilter(xmlReader);
	
	        JAXBContext context = JAXBContext.newInstance(PersonEntity.class);
	        Unmarshaller um = context.createUnmarshaller();
	        UnmarshallerHandler unmarshallerHandler = um.getUnmarshallerHandler();
	        xmlFilter.setContentHandler(unmarshallerHandler);
	
	        StringReader sr = new StringReader(xml);
			xmlFilter.parse(new InputSource(sr));
	        PersonEntity p = (PersonEntity) unmarshallerHandler.getResult();
	        System.out.println("testskipxmlprefix() "+",PersonEntity="+p);
	        
	        //create xml from the pojo
			String path = "C:\\Users\\roychan\\filePerson.xml";
			File file = new File(path);
			Marshaller jaxbMarshaller = context.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(p, file);
			jaxbMarshaller.marshal(p, System.out);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	private static void testskipxmlprefix2(){
		String xml = "<ns2:Person name='John' age='20'/>";
        try {
        	PersonEntity ret = XMLParser.toPojo(xml, PersonEntity.class);
			System.out.println("testskipxmlprefix2(), ret="+ret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void testAtgOrderXMLParser() {
		//String xml = null;
		AtgOrderXML test = null;
//		String path = "C:\\Users\\roychan\\Desktop\\o177392258b.xml";
//		String path = "C:\\Users\\roychan\\Desktop\\o177392258.xml";
		String path = "C:\\Users\\roychan\\Desktop\\o177386835.xml";
		
		try {
			
			FileReader fr = new FileReader(path);
			
	        SAXParserFactory spf = SAXParserFactory.newInstance();
	        SAXParser sp = spf.newSAXParser();
	        XMLReader xmlReader = sp.getXMLReader();
	        XMLFilter xmlFilter = new PrefixRemovalXMLFilter(xmlReader);
	
	        JAXBContext context = JAXBContext.newInstance(AtgOrderXML.class);
	        Unmarshaller um = context.createUnmarshaller();
	        UnmarshallerHandler unmarshallerHandler = um.getUnmarshallerHandler();
	        xmlFilter.setContentHandler(unmarshallerHandler);
	
	        //StringReader sr = new StringReader(xml);
			//xmlFilter.parse(new InputSource(sr));
			xmlFilter.parse(new InputSource(fr));
			test = (AtgOrderXML) unmarshallerHandler.getResult();
	        System.out.println("testAtgOrderXMLParser() "+",ATG_ORDER_XML="+test);
	        
			
//			xml = "<FRAUD_CHECK_CONTENT> <SHIPPING> <FIRST-NAME><![CDATA[Ching Yee Sarah ]]></FIRST-NAME> <LAST-NAME><![CDATA[Tam ]]></LAST-NAME> <ADDR_1/> <ADDR_2/> <ADDR_3/> <ADDR_CITY/> <ADDR_COUNTRY/> <ADDR_STATE/> <ADDR_POSTAL/> <ADDR_ZIP/> </SHIPPING> <BILLING> <FIRST-NAME><![CDATA[Crystal ]]></FIRST-NAME> <LAST-NAME><![CDATA[chan]]></LAST-NAME> <ADDR_1><![CDATA[68, Boulevard]]></ADDR_1> <ADDR_2/> <ADDR_3><![CDATA[Beverlyhills ]]></ADDR_3> <ADDR_CITY/> <ADDR_COUNTRY><![CDATA[HK]]></ADDR_COUNTRY> <ADDR_STATE><![CDATA[Tai Po - ??]]></ADDR_STATE> <ADDR_POSTAL/> <ADDR_ZIP/> </BILLING> <FIRST-NAME><![CDATA[Sarah ]]></FIRST-NAME> <LAST-NAME><![CDATA[Tam ]]></LAST-NAME> <MEMBER_ID><![CDATA[132641261]]></MEMBER_ID> <IP_ADDR><![CDATA[121.202.251.157]]></IP_ADDR> <NUMBER_OF_ITEMS><![CDATA[3]]></NUMBER_OF_ITEMS> <CopyAndPasteDetected><![CDATA[false]]></CopyAndPasteDetected> <GeoIPCountryDetected><![CDATA[HK]]></GeoIPCountryDetected> <HighestQuantityInOrder><![CDATA[1]]></HighestQuantityInOrder> <PCardNumberAwardedDiscount/> <Email><![CDATA[sarahblehxp@gmail.com]]></Email> <ATG_ORDER_ID><![CDATA[o196857999]]></ATG_ORDER_ID> <ATG_RMS_ID><![CDATA[802357340]]></ATG_RMS_ID> <STAFF_ID/> <STAFF_DISCOUNT_LEVEL/> <STAFF_DISCOUNT_AMOUNT/> <ALLOW_PAY_BY_EGC>true</ALLOW_PAY_BY_EGC> </FRAUD_CHECK_CONTENT>";
//			System.out.println(xml);

	        /*
			test = (ATG_ORDER_XML) JABXParser.fromXML(new FileReader(path), ATG_ORDER_XML.class);
	
			//test CN shipping order
			System.out.println(test.toString());
			*/		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static int giftPerOrder = 33;
	public static int getGiftPerOrder() {
		return giftPerOrder;
	}
	public static void setGiftPerOrder(int giftPerOrder) {
		LCMerchantToolDemo.giftPerOrder = giftPerOrder;
	}
	private static List<ItemGWPRule> getItemGWPRuleTestData(){
		List<ItemGWPRule> ret = null;
		ret = new ArrayList<ItemGWPRule>();
		
		ItemGWPRule temp1 = new ItemGWPRule();
		temp1.setINSTIT_CDE("HK");
		temp1.setGWP_CDE(56);
		temp1.setLOC_CDE("228");
		temp1.setSEQ_NO(1);
		temp1.setATG_SKU_ID("BJW890-46");
		temp1.setSALE_PRICE(11200.00);
		temp1.setCURRENCY_CODE("HKD");
		temp1.setGIFT_MIN_PURCHASE_AMT(200000.00);
		temp1.setMAX_GIFT_QTY_PER_ORDER(10);
		temp1.setGIFT_STYLE("1");

		ItemGWPRule temp2 = new ItemGWPRule();
		temp2.setINSTIT_CDE("HK");
		temp2.setGWP_CDE(56);
		temp2.setLOC_CDE("228");
		temp2.setSEQ_NO(1);
		temp2.setATG_SKU_ID("EAU222-46");
		temp2.setCURRENCY_CODE("HKD");
		temp2.setSALE_PRICE(78500.00);
		temp2.setGIFT_MIN_PURCHASE_AMT(200000.00);
		temp2.setMAX_GIFT_QTY_PER_ORDER(1);
		temp2.setGIFT_STYLE("2");
		
		ret.add(temp1);ret.add(temp1);ret.add(temp1);
		ret.add(temp1);ret.add(temp1);ret.add(temp1);
		ret.add(temp1);ret.add(temp1);ret.add(temp1);
		ret.add(temp1);ret.add(temp1);ret.add(temp1);
		ret.add(temp1);ret.add(temp1);ret.add(temp1);
		ret.add(temp1);ret.add(temp1);ret.add(temp1);
		ret.add(temp1);ret.add(temp1);
		
		ret.add(temp2);
		ret.add(temp2);
		ret.add(temp2);
		
		ItemGWPRule temp3 = new ItemGWPRule();
		temp3.setINSTIT_CDE("HK");
		temp3.setGWP_CDE(56);
		temp3.setLOC_CDE("228");
		temp3.setSEQ_NO(2);
		temp3.setATG_SKU_ID("BJW890-46");
		temp3.setSALE_PRICE(11200.00);
		temp3.setCURRENCY_CODE("HKD");
		temp3.setGIFT_MIN_PURCHASE_AMT(200000.00);
		temp3.setMAX_GIFT_QTY_PER_ORDER(1);
		temp3.setGIFT_STYLE("3");

		ItemGWPRule temp4 = new ItemGWPRule();
		temp4.setINSTIT_CDE("HK");
		temp4.setGWP_CDE(56);
		temp4.setLOC_CDE("228");
		temp4.setSEQ_NO(2);
		temp4.setATG_SKU_ID("EAU222-46");
		temp4.setCURRENCY_CODE("HKD");
		temp4.setSALE_PRICE(78500.00);
		temp4.setGIFT_MIN_PURCHASE_AMT(200000.00);
		temp4.setMAX_GIFT_QTY_PER_ORDER(1);
		temp4.setGIFT_STYLE("4");
		
		ret.add(temp3);ret.add(temp3);ret.add(temp3);
		ret.add(temp3);ret.add(temp3);ret.add(temp3);
		ret.add(temp3);ret.add(temp3);ret.add(temp3);
		ret.add(temp3);ret.add(temp3);ret.add(temp3);
		ret.add(temp3);ret.add(temp3);ret.add(temp3);
		ret.add(temp3);ret.add(temp3);ret.add(temp3);
		ret.add(temp3);ret.add(temp3);
		
		ret.add(temp4);
		ret.add(temp4);
		ret.add(temp4);
		
/*
		ItemGWPRule temp1 = new ItemGWPRule();
		temp1.setINSTIT_CDE("HK");
		temp1.setGWP_CDE(94);
		temp1.setLOC_CDE("228");
		temp1.setSEQ_NO(1);
		temp1.setATG_SKU_ID("BHY143-*");
		temp1.setSALE_PRICE(3600.00);
		temp1.setCURRENCY_CODE("HKD");
		temp1.setGIFT_MIN_PURCHASE_AMT(3000.00);
		temp1.setMAX_GIFT_QTY_PER_ORDER(1);
		temp1.setGIFT_STYLE("1");

		ItemGWPRule temp2 = new ItemGWPRule();
		temp2.setINSTIT_CDE("HK");
		temp2.setGWP_CDE(95);
		temp2.setLOC_CDE("228");
		temp2.setSEQ_NO(1);
		temp2.setATG_SKU_ID("BHY143-*");
		temp2.setCURRENCY_CODE("HKD");
		temp2.setSALE_PRICE(3600.00);
		temp2.setGIFT_MIN_PURCHASE_AMT(2000.00);
		temp2.setMAX_GIFT_QTY_PER_ORDER(2);
		temp2.setGIFT_STYLE("2");
		
		ret.add(temp1);
		ret.add(temp2);
*/
		return ret;
	}
	private static Map<String,PurchasedItem> getPurchasedItemTestData(){
		Map<String,PurchasedItem> ret = null;
		ret = new TreeMap<String,PurchasedItem>();
		
		PurchasedItem temp1 = new PurchasedItem();
		temp1.setATG_SKU_ID("BJW890-46");
		temp1.setUnitPrice(11200.00);
		temp1.setQty(20);
		temp1.setTotalPrice(temp1.getQty() * temp1.getUnitPrice());
		
		PurchasedItem temp2 = new PurchasedItem();
		temp2.setATG_SKU_ID("EAU222-46");
		temp2.setUnitPrice(78500.00);
		temp2.setQty(3);
		temp2.setTotalPrice(temp2.getQty() * temp2.getUnitPrice());

		ret.put(temp1.getATG_SKU_ID(), temp1);
		ret.put(temp2.getATG_SKU_ID(), temp2);
		
		/*
		PurchasedItem temp1 = new PurchasedItem();
		temp1.setATG_SKU_ID("BHY143-*");
		temp1.setUnitPrice(3600.00);
		temp1.setQty(1);
		temp1.setTotalPrice(temp1.getQty() * temp1.getUnitPrice());
		ret.put(temp1.getATG_SKU_ID(), temp1);
		*/
		return ret;
	}
	
	public static void testGetGift(){
		long start = System.currentTimeMillis();
		System.out.println("testGetGift()" +", start=" + start);
		String atgOrderId = "o177386835";
		List<ItemGWPRule> ret = getGWPGift(atgOrderId);
		if(null == ret || ret.size() <= 0) return;
		for(ItemGWPRule temp : ret){
			System.out.println("testGetGift()" +", temp=" + temp);
			
		}
		System.out.println("testGetGift()" +", start=" + start+", elapsedtime=" + (System.currentTimeMillis() - start));
	}
	
	public static List<ItemGWPRule> getGWPGift(String atgOrderId){
		List<ItemGWPRule> ret = null;
//		Map<String,ItemGWPRule> gwpKeyMap = null;
		Map<String,List<ItemGWPRule>> gwpKeyMapList = null;
		System.out.println("getGWPGift()" +", atgOrderId=" + atgOrderId);
		
		// 1. input check
		if(null == atgOrderId || atgOrderId.isEmpty()) return ret;
		
		// 2. match the GWPRules with the GWPdao by the atgOrderID
//		List<ItemGWPRule> matchedRules = this.getGwpDao().matchGWPRules(atgOrderId);
		List<ItemGWPRule> matchedRules = getItemGWPRuleTestData();
		if(null == matchedRules || matchedRules.isEmpty()) return ret;
		System.out.println("getGWPGift()" +", matchedRules.size()=" + matchedRules.size());

		// 2.1 retrieve the purchased items
//		Map<String,PurchasedItem> purchasedItems = this.getGwpDao().getItems(atgOrderId);
		Map<String,PurchasedItem> purchasedItems = getPurchasedItemTestData();
		if(null == purchasedItems || purchasedItems.isEmpty()) return ret;
		System.out.println("getGWPGift()" +", purchasedItems.size()=" + purchasedItems.size());
		
//		gwpKeyMap = new TreeMap<String,ItemGWPRule>();
		gwpKeyMapList = new TreeMap<String,List<ItemGWPRule>>();
		for(ItemGWPRule rule: matchedRules){
			System.out.println("getGWPGift()" +", rule=" + rule.toString());

/*
		// 3.1 match the GWPRule gift currency with the ooms_item currency from step2
			if(null!= rule 
					&& null != rule.getCURRENCY_CODE() && !rule.getCURRENCY_CODE().isEmpty()
					&& null != rule.getGIFT_CURRENCY() && !rule.getGIFT_CURRENCY().isEmpty()
					&& !rule.getCURRENCY_CODE().contentEquals(rule.getGIFT_CURRENCY())){
				
				Double rate = this.currencyManager.getExchangeRate(rule.getGIFT_CURRENCY(), rule.getCURRENCY_CODE()); 
				if(null != rate) {
					if(null != rule.getGIFT_VALUE_MASK() && rule.getGIFT_VALUE_MASK() > 0 ){
						rule.setGIFT_VALUE_MASK(round(rule.getGIFT_VALUE_MASK() * rate ));
					} else {
						rule.setGIFT_VALUE(round(rule.getGIFT_VALUE() * rate));
					}
					rule.setGIFT_MIN_PURCHASE_AMT(round(rule.getGIFT_MIN_PURCHASE_AMT() * rate));
					rule.setGIFT_CURRENCY(rule.getCURRENCY_CODE());
				}
			}
		//3.1 Check the thumbnail with GiftStyle.	
			rule.setThumbnailUrl(this.getThumbnailUrlFormat());	
			System.out.println("getGWPGift() exchange thumbnail" +", rule=" + rule.toString());	
*/

			
		// 4b. MAP the result from step3:
		//group by the GWPRule primary key
			List<ItemGWPRule> testing = gwpKeyMapList.get(rule.getKeyWithSeq());
			if(null == testing){
				testing = new ArrayList<ItemGWPRule>();
				testing.add(rule);
				gwpKeyMapList.put(rule.getKeyWithSeq(), testing);
			}else{
				testing.add(rule);
			}
		}
		// 5b. loop the map from step4 for possible GWP
		// calculate&process the deducedSum on each item.
		ret = getGift(gwpKeyMapList,purchasedItems);
			
		System.out.println("getGWPGift() " +", ret.size()=" + ret.size());	
		
		return ret ;
	}

	private static List<ItemGWPRule> getGift(Map<String,List<ItemGWPRule>> gwpKeyMapList, Map<String,PurchasedItem> purchasedItems){
		List<ItemGWPRule> ret = null;
		try{
			//component check
			System.out.println("getGift() " +", getGiftPerOrder()=" + getGiftPerOrder());
			int giftQuota = getGiftPerOrder();
			if(giftQuota <= 0) return ret;
			
			//input check
			if(null == gwpKeyMapList || gwpKeyMapList.isEmpty()) return ret;
			if(null == purchasedItems || purchasedItems.isEmpty()) return ret;
			System.out.println("getGift() " +", gwpKeyMapList.size()=" + gwpKeyMapList.size());	
			System.out.println("getGift() " +", purchasedItems.size()=" + purchasedItems.size());	
			
			// logic
			ret = new ArrayList<ItemGWPRule>();
			for (@SuppressWarnings("rawtypes") Map.Entry entry : gwpKeyMapList.entrySet()) {
				// 1. check if the purchaseItem is running out, return if so
				if(purchasedItems.isEmpty()) return ret;
				if(giftQuota <= 0) return ret;
				
				// 2. retrieve list of ooms items within the same GWP rule key
				List<ItemGWPRule> ruleList = (List<ItemGWPRule>) entry.getValue();
				if(null == ruleList || ruleList.isEmpty()) continue;
				
//				ItemGWPRule result = loopGiftKEY(ruleList, purchasedItems, giftQuota);
				GiftResult giftResult = loopGiftKEY(ruleList, purchasedItems, giftQuota);
				if(null == giftResult) continue;
				
				
				// update the matchedRule, add it into the return list
				// update the gift quota as well
				ItemGWPRule result = giftResult.getMatchedRule();
				if(null != result){
					System.out.println("getGift() " +", result=" + result.toString());
					ret.add(result);
					giftQuota -= result.getQty();
				}
				
				//update the purchasedItem Map
				purchasedItems = (null==giftResult.getPurchasedItems())?purchasedItems:giftResult.getPurchasedItems();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}
	
	/**
	 * Search for eligible Gifts by loop throughout the provided gwplist, base on the qty of the purchaseItems.
	 * @param ruleList
	 * @param purchasedItems
	 * @param giftQuota
	 * @return
	 */
	private static GiftResult loopGiftKEY(List<ItemGWPRule> ruleList, Map<String,PurchasedItem> purchasedItems, int giftQuota){
		GiftResult ret = null;
		int eligibleGiftQty = 0;
		Double sumSalePrice = 0.0;
		Map<String,PurchasedItem> matchedSkus;
		
		try{
			if(null == ruleList || ruleList.isEmpty()) return ret;
			if(null == purchasedItems || purchasedItems.isEmpty()) return ret;
			System.out.println("loopGiftKEY() " +", ruleList.size()=" + ruleList.size()+", purchasedItems.size()=" + purchasedItems.size()+", giftQuota()=" + giftQuota);
			for(@SuppressWarnings("rawtypes") Map.Entry entry : purchasedItems.entrySet()){

				System.out.print("loopGiftKEY() purchasedItems"+", key,val: ");
				System.out.println("loopGiftKEY() purchasedItems, "+ entry.getKey() + "," + entry.getValue());
			}
			
			ItemGWPRule rule = ruleList.get(0);
			if(null == rule) return ret;
			
			long maxGift = rule.getMAX_GIFT_QTY_PER_ORDER();
			if(maxGift <= 0) return ret;
			Double minPurAmt = rule.getGIFT_MIN_PURCHASE_AMT();
	
			// find out the total sum of matchku as matchedSkus
			matchedSkus = new TreeMap<String,PurchasedItem>();
			for(ItemGWPRule temp:ruleList){
				System.out.println("loopGiftKEY() " +", temp=" + temp.toString());
				String sku = temp.getATG_SKU_ID();
				
				// set the sale price info to the purchase list
				// remove this logic, if unit price after discount could be found over the table ooms_item.
				/*
				PurchasedItem purchasedItem = purchasedItems.get(sku);
				if(null != purchasedItem){
					purchasedItem.setUnitPrice(temp.getSALE_PRICE());
					if(purchasedItem.getQty() > 0) purchasedItem.setTotalPrice(purchasedItem.getQty() * temp.getSALE_PRICE());
					purchasedItems.put(sku, purchasedItem);
				}
				*/
						
				PurchasedItem matchedSku = matchedSkus.get(sku);
				if(null == matchedSku){
					matchedSku = new PurchasedItem();
					matchedSku.setATG_SKU_ID(sku);
					matchedSku.setUnitPrice(temp.getSALE_PRICE());
					matchedSku.setQty(1);
					matchedSku.updateTotalPrice();
				}else{
					matchedSku.incrementQty();
					matchedSku.updateTotalPrice();
				}
				matchedSkus.put(sku, matchedSku);
				
				// add up the total sale price Indiscriminately
				sumSalePrice += temp.getSALE_PRICE();
				
			}	
				
			// check if total sum match the minPurchaseAmount
			// if not, return
//			if(sumSalePrice < minPurAmt){
//				return ret;
//			} else {
			// deduce the purchaseItems base on the matchedSkus
				//eligibleGiftQty = getNumOfGift(matchedSkus, purchasedItems,minPurAmt,(int) maxGift,giftQuota);
				ret = getNumOfGift(matchedSkus, purchasedItems,minPurAmt,(int) maxGift,giftQuota);
				if(null != ret) {
					eligibleGiftQty= ret.getEligibleGiftQty();
					rule.setQty(eligibleGiftQty);
					ret.setMatchedRule(rule);
					System.out.println("loopGiftKEY() " +", eligibleGiftQty=" + eligibleGiftQty+", ret=" + ret.toString());
				}
//			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;		
	}
	
	private static GiftResult getNumOfGift(Map<String,PurchasedItem> matchedSkus, Map<String,PurchasedItem> purchasedItems, Double minPurAmt, int maxGift, int giftQuota){
		//int ret = 0;
		GiftResult ret = null;
		int eligibleGiftQty = 0;
		Map<String,PurchasedItem> matchedPurchasedItems = null;
		Double sumPriceOfAllSku = 0.0;
		Double sumPricePerSku = 0.0;
		Double pendingDeduceAmt = 0.0;
		
		try{
			System.out.println("getNumOfGift() " +", matchedSkus.size()=" + matchedSkus.size()+", purchasedItems.size()=" + purchasedItems.size()+", minPurAmt=" + minPurAmt+", maxGift=" + maxGift+", giftQuota=" + giftQuota);
			// filter the purchasedItems with sku key from matchedSkus
			// sum the filtered list as sumPriceOfAllSku
			matchedPurchasedItems = new TreeMap<String,PurchasedItem>();
			for(@SuppressWarnings("rawtypes") Map.Entry entry : matchedSkus.entrySet()){
				String sku = (String) entry.getKey();
				
				PurchasedItem purchasedItem = purchasedItems.get(sku);
				matchedPurchasedItems.put(sku, purchasedItem);
				sumPricePerSku = purchasedItem.getTotalPrice();
				
				sumPriceOfAllSku += sumPricePerSku;
			}
			System.out.println("getNumOfGift() " +", sumPriceOfAllSku=" + sumPriceOfAllSku+", minPurAmt=" + minPurAmt);
			
			// find out the number of the gift.
			if(sumPriceOfAllSku > minPurAmt){
				// find the factor divide the sumPriceOfAllSku by minPurAmt
				int factor = (int) round(sumPriceOfAllSku/minPurAmt);
				
				// maxGift can not be larger than giftQuota
				// line up the maxGift with the giftQuota
				if(maxGift > giftQuota) maxGift = giftQuota;
				
				// can not give out gift more than maxGift
				// line up the factor with the maxGift
				eligibleGiftQty = (factor > maxGift)?maxGift:factor;
				
				System.out.println("getNumOfGift() " +", factor=" + factor +", maxGift=" + maxGift +", giftQuota=" + giftQuota +", eligibleGiftQty=" + eligibleGiftQty);
			} else {
				return ret;
			}


			//debug log to print out the purchaseItems Map
			for(@SuppressWarnings("rawtypes") Map.Entry entry : purchasedItems.entrySet()){

				System.out.print("getNumOfGift() before deduce purchasedItems"+", key,val: ");
				System.out.println("getNumOfGift() beforw deduce purchasedItems, "+ entry.getKey() + "," + entry.getValue());
			}
			
			//deduce the matchedPurchasedItems map by the giftNum * minPurAmt
			pendingDeduceAmt = eligibleGiftQty * minPurAmt;
	
			for(@SuppressWarnings("rawtypes") Map.Entry entry : matchedPurchasedItems.entrySet()){
				System.out.println("getNumOfGift() deduce" +", pendingDeduceAmt=" + pendingDeduceAmt); 
				if(pendingDeduceAmt == 0.0) break;
				String sku = (String) entry.getKey();
				
				PurchasedItem temp = (PurchasedItem) entry.getValue();
				if(temp.getTotalPrice() > pendingDeduceAmt) {
					temp.setTotalPrice(temp.getTotalPrice() - pendingDeduceAmt);
					pendingDeduceAmt = 0.0;
				}else{
					//subtract the pendingDeduceAmt by the Items TotalPrice
					pendingDeduceAmt -= temp.getTotalPrice();
					// as the total price is used up, set it to zero.
					temp.setTotalPrice(0.0);
				}
				
				// put the matchedPurchasedItems back to the purchasedItems
				purchasedItems.put(sku, temp);
			}
		
			//debug log to print out the purchaseItems Map
			for(@SuppressWarnings("rawtypes") Map.Entry entry : purchasedItems.entrySet()){

				System.out.print("getNumOfGift() after deduce purchasedItems"+", key,val: ");
				System.out.println("getNumOfGift() after deduce purchasedItems, "+ entry.getKey() + "," + entry.getValue());
			}
			
			//prepare result
			ret = new GiftResult(purchasedItems, eligibleGiftQty);
			System.out.print("getNumOfGift() ret="+ret.toString());
						
		}catch(Exception e){
			e.printStackTrace();
		}
		return ret;
	}
	
	
	private static void testdivide(){
		double totalamt = 100.0;
		double minpuramt = 30.0;
		
		double qty = round(totalamt / minpuramt,0);
		System.out.println("qty= "+ qty);
		
		int qtyint = (int)qty;
		System.out.println("qtyint()= "+ qtyint);
	}
	
	private static void testMapValue(){
		Map<String,Integer> purchasedItems = new TreeMap<String,Integer>();
		purchasedItems.put("a", 1);
		purchasedItems.put("b", 2);
		purchasedItems.put("c", 3);

		for (Map.Entry entry : purchasedItems.entrySet()) {
			System.out.print("testMapValue()"+", key,val: ");
			System.out.println("testMapValue(), "+ entry.getKey() + "," + entry.getValue());
		}

		String key = "a";
		Integer test = purchasedItems.get(key);
		System.out.println("test="+test);
		purchasedItems.put(key, --test);
		System.out.println("test--="+test);
		
		for (Map.Entry entry : purchasedItems.entrySet()) {
			System.out.print("testMapValue()"+", key,val: ");
			System.out.println("testMapValue(), "+ entry.getKey() + "," + entry.getValue());
		}
	}
	
	/**
	 * 
	 * @param args
	 * args[0]: boolean - daily order Report Flag
	 * args[1]: boolean - mps Report Flag
	 * args[2]: boolean - csc Report Flag
	 * args[3]: Timestamp - report start Date
	 * args[4]: Timestamp - report end Date
	 * args[5]: String - mps type
	 */
	public static void testMainInput(String [] args){
		
		boolean isDaily = false;
		boolean isMps = false;
		boolean isCsc = false;
		Timestamp start = null;
		Timestamp end = null;
		String mpsType = null;
		
		String format = "ddMMyyyy";
		
		try{
			if(null == args || args.length <= 0){
				System.out.println("error");
			} else {
				if(args.length >= 1 && null != args[0])isDaily = Boolean.valueOf(args[0]);
				if(args.length >= 2 && null != args[1])isMps = Boolean.valueOf(args[1]);
				if(args.length >= 3 && null != args[2])isCsc = Boolean.valueOf(args[2]);
				if(args.length >= 4 && null != args[3])start = parseTimeStamp(format, args[3]);
				if(args.length >= 5 && null != args[4])end = parseTimeStamp(format, args[4]);
				if(args.length >= 6 && null != args[5])mpsType = args[5];
			}
	
			System.out.println("isDaily="+isDaily);
			System.out.println("isMps="+isMps);
			System.out.println("isCsc="+isCsc);
			System.out.println("start="+start);
			System.out.println("end="+end);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static Timestamp parseTimeStamp(String dateFormal, String inputDate) throws ParseException{
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormal);
		
		return new java.sql.Timestamp(dateFormat.parse(inputDate).getTime());
	}

	public static void testround(){
		
		double test = 12.556305615458273;
		int place = 0;
		
		double ret = round(test,place);
		
		System.out.println("testround() " + ", ret = "+ret);
	}
	public static void testFloor(){
		
		double test = 12.556305615458273;
		int place = 0;
		
		double ret = floor(test,place);
		
		System.out.println("testFloor() " + ", ret = "+ret);
	}
	public static double round(double value) {
	    return round(value,0);
	}
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	public static double floor(double value) {
	    return floor(value,0);
	}
	public static double floor(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = new BigDecimal(value);
	    bd = bd.setScale(places, RoundingMode.FLOOR);
	    return bd.doubleValue();
	}
	
	
	
	
	private static void testXMLParser() {
		String xml = null;
		FraudCheckContent test = null;
		String CN = "CN";
		try {
			xml = "<FRAUD_CHECK_CONTENT> <SHIPPING> <FIRST-NAME><![CDATA[Ching Yee Sarah ]]></FIRST-NAME> <LAST-NAME><![CDATA[Tam ]]></LAST-NAME> <ADDR_1/> <ADDR_2/> <ADDR_3/> <ADDR_CITY/> <ADDR_COUNTRY/> <ADDR_STATE/> <ADDR_POSTAL/> <ADDR_ZIP/> </SHIPPING> <BILLING> <FIRST-NAME><![CDATA[Crystal ]]></FIRST-NAME> <LAST-NAME><![CDATA[chan]]></LAST-NAME> <ADDR_1><![CDATA[68, Boulevard]]></ADDR_1> <ADDR_2/> <ADDR_3><![CDATA[Beverlyhills ]]></ADDR_3> <ADDR_CITY/> <ADDR_COUNTRY><![CDATA[HK]]></ADDR_COUNTRY> <ADDR_STATE><![CDATA[Tai Po - ??]]></ADDR_STATE> <ADDR_POSTAL/> <ADDR_ZIP/> </BILLING> <FIRST-NAME><![CDATA[Sarah ]]></FIRST-NAME> <LAST-NAME><![CDATA[Tam ]]></LAST-NAME> <MEMBER_ID><![CDATA[132641261]]></MEMBER_ID> <IP_ADDR><![CDATA[121.202.251.157]]></IP_ADDR> <NUMBER_OF_ITEMS><![CDATA[3]]></NUMBER_OF_ITEMS> <CopyAndPasteDetected><![CDATA[false]]></CopyAndPasteDetected> <GeoIPCountryDetected><![CDATA[HK]]></GeoIPCountryDetected> <HighestQuantityInOrder><![CDATA[1]]></HighestQuantityInOrder> <PCardNumberAwardedDiscount/> <Email><![CDATA[sarahblehxp@gmail.com]]></Email> <ATG_ORDER_ID><![CDATA[o196857999]]></ATG_ORDER_ID> <ATG_RMS_ID><![CDATA[802357340]]></ATG_RMS_ID> <STAFF_ID/> <STAFF_DISCOUNT_LEVEL/> <STAFF_DISCOUNT_AMOUNT/> <ALLOW_PAY_BY_EGC>true</ALLOW_PAY_BY_EGC> </FRAUD_CHECK_CONTENT>";
			System.out.println(xml);
			
			test = (FraudCheckContent) JABXParser.fromXML(new StringReader(xml), FraudCheckContent.class);
			//test CN shipping order
//			test.getShipping().setAddrCountry(CN);
			System.out.println(test.toString());
			
			if(test.getShipping().getAddrCountry().isEmpty()){
				System.out.println("empty");
			}else{
				System.out.println("not empty");
			}
			
			List<String> filterCountryList = new ArrayList<String>();
			filterCountryList.add(CN);
			
			// check the country filter
			if(test.getShipping().getAddrCountry() != null &&
	//				!"".equalsIgnoreCase(test.getShipping().getAddrCountry())  &&
					!filterCountryList.contains((test.getShipping().getAddrCountry())))
			{
				System.out.println("Start CountryFilterChain");
			}
			else
			{
				System.out.println("No Country value in the context"
						+ ", AtgOrderID=" + test.getAtgOrderID());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void testDouble(){
		ItemGWPRule test = new ItemGWPRule();
		System.out.println("Double without initialize, getGIFT_VALUE="+test.getGIFT_VALUE());
		System.out.println("Double without initialize, getGIFT_VALUE_MASK="+test.getGIFT_VALUE_MASK());
		System.out.println(test.toString());
		
	}
	private static void testmaskreqtojson(){
		GWPRuleRequest req = new GWPRuleRequest();
		List <GWPRuleMask> masks = new ArrayList<GWPRuleMask>();
		GWPRuleMask temp1 = new GWPRuleMask();
		temp1.setInstitCde("HK");
		temp1.setGwpCde(56);
		temp1.setLocCde("228");
		temp1.setSeqCde(9);
		temp1.setGiftDescMask("test_gift_desc");
		temp1.setGiftValueMask(1.0);
		temp1.setStatus("ACTIVE");
		temp1.setLastUpdUsrMask("roy");
		
		
		masks.add(temp1);
		req.setGwpRules(masks);
		

		Gson gson = new Gson();
		String json = gson.toJson(req);
		
		System.out.println("json = "+json);

//		List<GWPRuleMask> pojo = null;
//		pojo = gson.fromJson(json, List<GWPRuleMask>.class);
		GWPRuleRequest pojo = null;
		pojo = gson.fromJson(json,GWPRuleRequest.class);
		
//		for(GWPRuleRequest temp: pojo){
			System.out.println("pojo = "+pojo.toString());
//		}
	}
	
	private static void concatMap(){
		List<ItemGWPRule> ret = null;
		List<ItemGWPRule> list = new ArrayList<ItemGWPRule>();
		ItemGWPRule temp1 = new ItemGWPRule(); 
		temp1.setINSTIT_CDE("123");
		temp1.setGWP_CDE(55);
		temp1.setLOC_CDE("222");
		temp1.setSEQ_NO(1);
		temp1.setSALE_PRICE(100.0);
		temp1.setMAX_GIFT_QTY_PER_ORDER(3);
		temp1.setGIFT_MIN_PURCHASE_AMT(10.0);
		temp1.setATG_SKU_ID("aaa111");
		
		ItemGWPRule temp2 = new ItemGWPRule(); 
		temp2.setINSTIT_CDE("123");
		temp2.setGWP_CDE(55);
		temp2.setLOC_CDE("222");
		temp2.setSEQ_NO(1);
		temp2.setSALE_PRICE(20.0);
		temp2.setMAX_GIFT_QTY_PER_ORDER(3);
		temp2.setGIFT_MIN_PURCHASE_AMT(10.0);
		temp2.setATG_SKU_ID("bbb222");

		ItemGWPRule temp3 = new ItemGWPRule(); 
		temp3.setINSTIT_CDE("123");
		temp3.setGWP_CDE(55);
		temp3.setLOC_CDE("222");
		temp3.setSEQ_NO(1);
		temp3.setSALE_PRICE(3.0);
		temp3.setMAX_GIFT_QTY_PER_ORDER(3);
		temp3.setGIFT_MIN_PURCHASE_AMT(10.0);
		temp3.setATG_SKU_ID("ccc333");
		
		ItemGWPRule temp4 = new ItemGWPRule(); 
		temp4.setINSTIT_CDE("123");
		temp4.setGWP_CDE(55);
		temp4.setLOC_CDE("222");
		temp4.setSEQ_NO(3);
		temp4.setSALE_PRICE(100.0);
		temp4.setMAX_GIFT_QTY_PER_ORDER(2);
		temp4.setGIFT_MIN_PURCHASE_AMT(15.0);
		temp4.setATG_SKU_ID("aaa111");

		ItemGWPRule temp5 = new ItemGWPRule(); 
		temp5.setINSTIT_CDE("123");
		temp5.setGWP_CDE(55);
		temp5.setLOC_CDE("222");
		temp5.setSEQ_NO(3);
		temp5.setSALE_PRICE(20.0);
		temp5.setMAX_GIFT_QTY_PER_ORDER(2);
		temp5.setGIFT_MIN_PURCHASE_AMT(15.0);
		temp5.setATG_SKU_ID("bbb222");
		
		ItemGWPRule temp6 = new ItemGWPRule(); 
		temp6.setINSTIT_CDE("123");
		temp6.setGWP_CDE(55);
		temp6.setLOC_CDE("222");
		temp6.setSEQ_NO(3);
		temp6.setSALE_PRICE(3.0);
		temp6.setMAX_GIFT_QTY_PER_ORDER(2);
		temp6.setGIFT_MIN_PURCHASE_AMT(15.0);
		temp6.setATG_SKU_ID("ccc333");

		list.add(temp1);
		list.add(temp2);
		list.add(temp3);
		list.add(temp4);
		list.add(temp5);
		list.add(temp6);

		for(ItemGWPRule test1:list){
			System.out.println("match rule list");
			System.out.println(test1.toString());
		}
		
		Map<String,ItemGWPRule> gwpKeyMap = new TreeMap<String,ItemGWPRule>();
		for(ItemGWPRule rule: list){
			ItemGWPRule temp = gwpKeyMap.get(rule.getKeyWithSeq());
			
			if(null == temp) {
				System.out.println("NOT Found" + ", key="+rule.getKeyWithSeq());
				gwpKeyMap.put(rule.getKeyWithSeq(), rule);
				continue;
			}

			System.out.println("Found" + ", key="+rule.getKeyWithSeq());
			
			temp.setSALE_PRICE(rule.getSALE_PRICE() + temp.getSALE_PRICE());
			System.out.println("concat, " +temp.toString());
		}
		
		
		
		if(null == gwpKeyMap || gwpKeyMap.isEmpty()) return;
		System.out.println("gwpKeyMap.size()="+gwpKeyMap.size());
		

		System.out.println("getGiftPerOrder()="+getGiftPerOrder());
		ret = getGift(gwpKeyMap);
		
		//debug the gift output
		if(null == ret || ret.isEmpty()){
			System.out.println("no gift!");
			return;
		}
		for(ItemGWPRule test1:ret){
			System.out.println("found gift!");
			System.out.println(test1.toString());
			
		}
		
	}
	
	private static List<ItemGWPRule> getGift(Map<String,ItemGWPRule> gwpKeyMap){
		List<ItemGWPRule> ret = null;
		int eligibleGiftqty = 0;
		if(getGiftPerOrder() <= 0) return ret;
		
		if(null == gwpKeyMap || gwpKeyMap.isEmpty()) return ret;
		System.out.println("getGift()"+", gwpKeyMap.size()="+gwpKeyMap.size());
		
		
		ret = new ArrayList<ItemGWPRule>();
		Map<String ,Double> l_deductedSum = new TreeMap<String,Double>();
		for (Map.Entry entry : gwpKeyMap.entrySet()) {
			System.out.print("getGift()"+", key,val: ");
			System.out.println("getGift(), "+ entry.getKey() + "," + entry.getValue());
			System.out.println("");
			
			//loop each rule by the variable MaxGiftQtyPerOrder
			ItemGWPRule temp = (ItemGWPRule) entry.getValue();
			
			// record the deduct sum with GWP key
			Double deductSum = l_deductedSum.get(temp.getKey());
			if(null == deductSum) {
				deductSum = 0.0;
				l_deductedSum.put(temp.getKey(), deductSum);
			}	

			for(int i = 0; i < temp.getMAX_GIFT_QTY_PER_ORDER() ;i++){
				System.out.println("getGift()" +
					", temp.getMAX_GIFT_QTY_PER_ORDER()="+temp.getMAX_GIFT_QTY_PER_ORDER()+
					", temp.getSALE_PRICE()="+temp.getSALE_PRICE()+
					", deductSum="+deductSum+
					", temp.getGIFT_MIN_PURCHASE_AMT()="+temp.getGIFT_MIN_PURCHASE_AMT());
				
				if((temp.getSALE_PRICE() - deductSum) >= temp.getGIFT_MIN_PURCHASE_AMT()) {
					System.out.println("getGift() FOUND GIFT, " +temp.toString());
//					ret.add(temp);
					// 3. increment the qty of eligible gift.
					temp.incrementQty();
					eligibleGiftqty++;
					
					deductSum += temp.getGIFT_MIN_PURCHASE_AMT();
					l_deductedSum.put(temp.getKey(), deductSum);
					
					// check if reached gift limit
					if(eligibleGiftqty >= getGiftPerOrder()) {
						System.out.println("getGift() reached GiftPerOrder, getGiftPerOrder()="+getGiftPerOrder());
						ret.add(temp);
						return ret;
					}
				} else{
					System.out.println("getGift() not enough purchase for gift ");
					System.out.println("");
					break;
				}
				System.out.println("");
			}
			ret.add(temp);	
		}
		
		return ret;
		
	}
	
	private static void testsamdate(){
		Calendar test = getLastMonthBeginning(-7);
		System.out.println("test="+convertCalendar2TimeStamp(test));
	}

	public static Timestamp convertCalendar2TimeStamp(Calendar cal){
		return new java.sql.Timestamp(cal.getTime().getTime());
	}
	public static Calendar getTodayBeginning(int hourVariation){
		Calendar cal = new GregorianCalendar();
		// reset hour, minutes, seconds and millis
		cal.set(Calendar.HOUR_OF_DAY, hourVariation);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal;
	}
	public static Calendar getYesterdayBeginning(){
		Calendar cal = getTodayBeginning();
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return cal;
	}
	public static Calendar getYesterdayBeginning(int hourVariation){
		Calendar cal = getTodayBeginning(hourVariation);
		cal.add(Calendar.DAY_OF_MONTH, -1);
		return cal;
	}
	public static Calendar getDateWithVariation(int dateAmount, int hourVariation){
		Calendar cal = getTodayBeginning(hourVariation);
		cal.add(Calendar.DAY_OF_MONTH, dateAmount);
		return cal;
	}
	public static Calendar getLastMonthBeginning(int dateDelay){
		return getCalendarWithVariation(-1, dateDelay);
	}
	public static Calendar getCurrentMonthBeginning(int dateDelay){
		return getCalendarWithVariation(0, dateDelay);
	}
	public static Calendar getCalendarWithVariation(int monthDelay, int dateDelay){
		Calendar cal = getTodayBeginning();
		//set month delay
		cal.add(Calendar.MONTH, monthDelay);
		
		// goes to the first date of month
		cal.set(Calendar.DAY_OF_MONTH, 1);
		
		// set date delay
		cal.add(Calendar.DATE, dateDelay);
		return cal;
	}
	private static void testTreeMap(){
	      TreeMap tm = new TreeMap();
	    //  TreeMap tm = new TreeMap(Collections.reverseOrder());
	      
	      // Put elements to the map
	      tm.put("Zara", new Double(3434.34));
	      tm.put("Mahnaz", new Double(123.22));
	      tm.put("Ayan", new Double(1378.00));
	      tm.put("Ayan", new Double(2222.00));
	      tm.put("Daisy", new Double(99.22));
	      tm.put("Qadir", new Double(-19.08));
	      tm.put("o123456", new Double(-19.08));
	      tm.put("o234567", new Double(-19.08));
	      tm.put("o34567", new Double(-19.08));
	      tm.put("o23456", new Double(-19.08));
	      
		  // Get a set of the entries
	      Set set = tm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      
	  //    tm.values();
	      System.out.println("Collection view is: "+ tm.values());
	      
	      for(Object temp:tm.values()){
	    	  System.out.println("temp = " +temp);
	      }
	}
	
	private static void textLinesep(){
		System.out.println("line.separator = " +System.getProperty("line.separator"));
		String text = String.format("%s%n%s%n%s%n%s", "line1", "line2", "line3", "line4");

		System.out.println("text = " +text);
	}
	private static void testMorphus(){
		testService service = new testServiceImpl();
		BaseModel object = null;
		service.test(object);
		ColorObject colorObject = null;
		service.test(colorObject);
		

		List<BaseModel> l_object = null;
		service.testList(l_object);
		List<ColorObject> l_colorObject = null;
//		service.testList(l_colorObject);
		
	}
	
	public static void testnulllist(){
		List<String> l_temp = null;
		
		for(String temp : l_temp){
			System.out.println("temp="+temp);
		}
		
		
	}
	
	  public static String right(String str, int len)
	  {
	    if (str == null) {
	      return null;
	    }
	    if (len < 0) {
	      return "";
	    }
	    if (str.length() <= len) {
	      return str;
	    }
	    return str.substring(str.length() - len);
	  }
	
	private static void grapRightMost7digit(){
		
		//String regex = "\d*(\d{7})";
		String regex = "\\d{7}$";
		String input = "1234567890";
		
		String ret = right(input,8);

		//System.out.println("regex="+regex+", input="+input+", ret="+ret);
		System.out.println(", ret="+ret);
	}
	
	private static void testSubfix(){
		String orderID = "o123456";
		String subfix = " (*)";
		
		String temp = removeOrderIdDisplaySubfix(orderID,subfix);
		System.out.println("orderID="+orderID+", subfix="+subfix+", temp="+temp);
		
		String orderIdWithSub = orderID + subfix;
		String tempWithSub = removeOrderIdDisplaySubfix(orderIdWithSub,subfix);
		System.out.println("orderIdWithSub="+orderIdWithSub+", subfix="+subfix+", tempWithSub="+tempWithSub);
		
	}
	
	private static String removeOrderIdDisplaySubfix(String orderId, String subfix){
		if(null==orderId||orderId.isEmpty()) return orderId;
		if(null==subfix||subfix.isEmpty()) return orderId;
		if(!orderId.contains(subfix)) return orderId;
		
		return orderId.replace(subfix, "");
	}
	
	private static void testSet(){
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		set.add("c");
		if(set.contains("a")) System.out.println("has a");
		if(set.contains("b")) System.out.println("has b");
		if(set.contains("c")) System.out.println("has c");
		System.out.println("add 3 ,set.size()="+set.size());
		

		set.add("a");
		if(set.contains("a")) System.out.println("has a");
		System.out.println("add 4th set.size()="+set.size());
		
	}
	
	private static void testprocessNumber(){
		int processors = Runtime.getRuntime().availableProcessors();
		System.out.println("processors=" +processors);
	}
	
	private static void testLCSitemap(){
		/*
http://www.uat.lanecrawford.com/sitemapProduct.xml</loc>
http://www.uat.lanecrawford.com/sitemapProduct2.xml
http://www.uat.lanecrawford.com/sitemapCategory.xml
http://www.uat.lanecrawford.com/sitemapStatic.xml
http://www.uat.lanecrawford.com/sitemapBrand.xml
http://www.uat.lanecrawford.com/sitemapCareerDepartment.xml
http://www.uat.lanecrawford.com/sitemapCareerJob.xml
http://www.uat.lanecrawford.com/sitemapLibraryBlogArticle.xml
http://www.uat.lanecrawford.com/sitemapLibraryEmptyCanvasArticle.xml
http://www.uat.lanecrawford.com/sitemapLibraryImageArticle.xml
http://www.uat.lanecrawford.com/sitemapLibraryTextArticle.xml
http://www.uat.lanecrawford.com/sitemapLibraryVideoArticle.xml
		 */

		 //testSitemap("http://www.uat.lanecrawford.com/sitemapProduct2.xml",true);
		 testSitemap("http://www.uat.lanecrawford.com/sitemapProduct.xml",true);
		/*
		testSitemap("http://www.uat.lanecrawford.com/sitemapCategory.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapStatic.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapBrand.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapCareerDepartment.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapCareerJob.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapLibraryBlogArticle.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapLibraryEmptyCanvasArticle.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapLibraryImageArticle.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapLibraryTextArticle.xml",true);
		testSitemap("http://www.uat.lanecrawford.com/sitemapLibraryVideoArticle.xml",true);
		*/
	}
	
	private static void showLog(String inStr){
//		System.out.println(inStr);
		logger.info(inStr);
	}
	private static void substringBegining(){
		String text = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><urlset xmlns=\"http://www.sitemaps.org/schemas/sitemap/0.9\"><url><loc>http";

		System.out.println("substringBegining before"+text);
		showLog("substringBegining before"+text);
		String target = "<loc>";
		int index = text.indexOf(target);
		//text = text.replaceFirst("^<.*<loc>", "");
		text = text.substring(index + target.length(), text.length());
		System.out.println("substringBegining after"+text);
		showLog("substringBegining after"+text);
	}
	
	private static void substring2(){
		String temp= "http://www.lanecrawford.com/designers/dioniso/</loc><changefreq>weekly</changefreq><priority>0.9</priority></url><url>";
		System.out.println("temp = "+ temp);
		int index = temp.indexOf("</loc>");
		System.out.println("index = "+ index);
		
		temp = temp.substring(0, index);
		System.out.println("temp = "+ temp);
	}

	private static String [] getLinkFromSitemapXML(String sitemapString, String initialTrim, String split, String subfixTrim){
		String [] links = null;
//		System.out.println("sitemapString="+sitemapString);
//		System.out.println("initialTrim="+initialTrim);
//		System.out.println("split="+split);
//		System.out.println("subfixTrim="+subfixTrim);
		
		// trim begining
		int index = sitemapString.indexOf(initialTrim);
		sitemapString = sitemapString.substring(index + initialTrim.length(), sitemapString.length());
//		System.out.println("trim begining , sitemapString="+sitemapString);
		
		links = sitemapString.split(split);
		System.out.println("links.length="+links.length);
		
//		for(String temp : links){

		for(int i = 0; i<links.length; i++){
			String temp = links[i];
			// trim subfix begin with </loc>
			if(temp.contains(subfixTrim)){
				links[i] = temp.substring(0, temp.indexOf(subfixTrim));
			}
		}
		
		
		//debug
		/*
		for(String temp : links){
			System.out.println("temp="+temp);
		}
		*/
		
		return links;
		
	}
	
	private  static void testSitemap(String url,boolean isget){
		String sitemapString = null;
		String [] links = null;

		String initialTrim ="<loc>";
		String split = "<loc>";
		String beginTrim = "</loc>";
        List<FutureTask<Integer>> futureTasklist = null;
		
		//String url = "http://www.uat.lanecrawford.com/sitemapBrand.xml";
        showLog("url="+url);
		//1 download the sitemap
		try {
			sitemapString = getContent(url);
		//	showLog("testSitemap="+sitemapString);
		//2 save it
		
		//3 read it
		
		//4 get link within the sitemap
			//split string
			links = getLinkFromSitemapXML(sitemapString,initialTrim,split,beginTrim);
			showLog("links.length()="+links.length);
			
		//5 for loop
			if(isget){
				
				long start = System.currentTimeMillis();
				showLog("START LOOP"+ ",start="+start);
				showLog("result,http_status,url,index,maxretrycount");
				
				/*
				
				futureTasklist = new ArrayList<FutureTask<Integer>>();
				for(String temp:links){
					//5.1 open connection and get http response code 
					Callable<Integer> work = new linkTestTask(temp,3);
					FutureTask<Integer> futureWork = new FutureTask<Integer>(work);
					ThreadPoolExecutor executorPool = new ThreadPoolExecutor(3, 4, 30, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(Integer.MAX_VALUE));
					executorPool.execute(futureWork);
					futureTasklist.add(futureWork);
				}
	
				//5.2wait until all done
				if(null != futureTasklist){
					while (true) {
						try {
							Thread.sleep(200);
							boolean isDone = false;
							for(FutureTask<Integer> temp: futureTasklist){
								isDone = temp.isDone();
								if(!isDone) break;
							}
							if(!isDone) continue;
		
							//never shut the executor down as it is a bean.
	//				    	this.getTaskExecutor().shutdown();
							break;
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				*/
				
				// single thread
				for(String temp:links){
					int responseCode = getResponseApache(temp);
					
					if(responseCode >= 200 && responseCode < 300){
						showLog("SUCCESS"+","+responseCode+","+temp);
					}else if(responseCode >= 300 && responseCode < 400){
						showLog("REDIRECTION"+","+responseCode+","+temp);
					}else if(responseCode >= 400 && responseCode < 500){
						showLog("Client_Error"+","+responseCode+","+temp);
					}else if(responseCode >= 500 && responseCode < 600){
						showLog("Server_Error"+","+responseCode+","+temp);
					} else{
						showLog("ERROR"+","+responseCode+","+temp);
					}
					
					
				}
				
				
				showLog("END LOOP"+ ",start="+start+ ",end="+(System.currentTimeMillis()-start));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			showLog("THE-END");
		}
	}
	
	
	private  static String getContent(String url) throws Exception {
		String ret = null;
		//String url = "http://www.google.com/search?q=mkyong";

		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		// add request header
		con.setRequestProperty("User-Agent", USER_AGENT);

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(
				con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// print result
		//System.out.println(response.toString());
		ret = response.toString();

		return ret;
	}

	private static void testGetResponse(){
		String url = "http://www.lanecrawford.com/designers/adidas-x-opening-ceremony/";
		int ret;
		System.out.println("testGetResponse() url=" + url);
		try {
			//ret = getResponse(url);
			ret = getResponseApache(url);
			System.out.println("ret=" + ret);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private  static int getResponseApache(String url) throws Exception {
		int ret = -1;
		try{
			HttpClient client = new DefaultHttpClient();
			HttpParams params = new BasicHttpParams();
			params.setParameter("http.protocol.handle-redirects",false);
			params.setParameter("http.connection-manager.timeout", 10000);
			//CoreConnectionPNames.CONNECTION_TIMEOUT
			
			HttpGet request = new HttpGet(url);
			request.setParams(params);
			request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
			HttpResponse response = client.execute(request);
			
			StatusLine status = response.getStatusLine();
			ret = status.getStatusCode();
	//		System.out.println(ret.getStatusCode());
	//		System.out.println(ret.getReasonPhrase());
		}catch (Exception e){
			//e.printStackTrace();
			
		}
		return ret;
		
	}
	
	private  static int getResponse(String url) throws Exception {
		int responseCode = -1;
		//String url = "http://www.google.com/search?q=mkyong";
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			// optional default is GET
			con.setRequestMethod("GET");

			// add request header
			con.setRequestProperty("User-Agent", USER_AGENT);
			con.setConnectTimeout(10000);

			responseCode = con.getResponseCode();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getResponse() ERROR" +",url="+url);
		}
		
		return responseCode;
	}

	private static void testRQL(){
		String temp = "interests INCLUDES ANY { %s }";
		
		int numOfParam = 4;
		
		String rql=prepareIncludeClause(temp,numOfParam);
		

		System.out.println("temp="+temp);
		System.out.println("numOfParam="+numOfParam);
		System.out.println("rql="+rql);
		
	}
	public static String prepareIncludeClause(String sql, int numOfParam){
		if(null == sql || sql.isEmpty()) return null;
		if(numOfParam <= 0) return null;
		
		String parameters = "";
		for(int i = 0; i < numOfParam; i++){
			if(!"".contentEquals(parameters)) parameters += SQL_IN_CLAUSE_DELIMITER;
			
			parameters += SQL_PARAM_SYMBOL + String.valueOf(i);
		}
		
		return String.format(sql, parameters);
	}
	
	private static void testObjectArray(){
		System.out.println("testObjectArray()");
		List<String> atgOrderIds = new ArrayList<String>();
		atgOrderIds.add("a");
		atgOrderIds.add("b");
		atgOrderIds.add("c");
		
		Object [] argu = new Object [atgOrderIds.size()];
		
		for(int index = 0; index < atgOrderIds.size(); index++){
			argu[index] = atgOrderIds.get(index);
		}

		System.out.println("atgOrderIds="+atgOrderIds);
		
		for(Object temp: argu){
			System.out.println("temp="+(String) temp);
		}
	}
	
	private static void testJSON2(){
		List<String> atgOrderIds = new ArrayList<String>();
		atgOrderIds.add("a");
		atgOrderIds.add("b");
		atgOrderIds.add("c");
		RetrieveToLocByAtgOrderIdRequest req = new RetrieveToLocByAtgOrderIdRequest();
		req.setAtgOrderIds(atgOrderIds);
		System.out.println("req = "+req.toString());
		
		String json = convertPOJO2JSON(req);
		System.out.println("json = "+json);
		
		RetrieveToLocByAtgOrderIdRequest convert = convertJson2Pojo(json,RetrieveToLocByAtgOrderIdRequest.class);
		System.out.println("convert = "+convert);
	}
	private static void testJSON3(){
		List<OomsItem> items = new ArrayList<OomsItem>();
		items.add(new OomsItem("o001","229"));
		items.add(new OomsItem("o002","227"));
		items.add(new OomsItem("o003","225"));
		RetrieveToLocByAtgOrderIdResponse res = new RetrieveToLocByAtgOrderIdResponse();
		res.setOomsItems(items);
		System.out.println("res = "+res.toString());
		
		String json = convertPOJO2JSON(res);
		System.out.println("json = "+json);
		
		RetrieveToLocByAtgOrderIdResponse convert = convertJson2Pojo(json,RetrieveToLocByAtgOrderIdResponse.class);
		System.out.println("convert = "+convert);
	}
	
	private static void testSQL(){
		List<String> params = new ArrayList<String>();
		params.add("001");
		params.add("002");
		params.add("003");
		
		String sql = "select * from abc where id IN (%s) ";
		
		String sqlWithParam = putSelectSQLParameter(sql,params.size());
		
		System.out.println("sqlWithParam="+sqlWithParam);
	}
	
	public static final String SQL_IN_CLAUSE_DELIMITER = ",";
	public static final String SQL_PARAM_SYMBOL = "?";
	public static String putSelectSQLParameter(String sql, int numOfParam){
		if(null == sql || sql.isEmpty()) return null;
		if(numOfParam <= 0) return null;
		
		String parameters = "";
		for(int i = 0; i < numOfParam; i++){
			if(!"".contentEquals(parameters)) parameters += SQL_IN_CLAUSE_DELIMITER;
			
			parameters += SQL_PARAM_SYMBOL;
		}
		
		return String.format(sql, parameters);
	}
	
	private static final String TABLE = "COLOR_SWATCH_RELATION";
	private static final String COL_COLOR_SWATCH_ID = "COLOR_SWATCH_ID";
	private static final String COL_COLOR_OBJECT_ID = "COLOR_OBJECT_ID";
	private static final String COL_SEQ_NO = "SEQ_NO";
	
	private static void testStringformat3(){
		List<String> columns = new ArrayList<String>();
		columns.add(COL_COLOR_SWATCH_ID);
		columns.add(COL_COLOR_OBJECT_ID);
		columns.add(COL_SEQ_NO);
		String sql = getProjectLockSQL(TABLE,columns);
		System.out.println("testStringformat3 mulit key list"+", sql="+sql);

		String sql_mulitKeyArray = getProjectLockSQL(TABLE,COL_COLOR_SWATCH_ID,COL_COLOR_OBJECT_ID,COL_SEQ_NO);
		System.out.println("testStringformat3 mulit key array"+", sql_mulitKeyArray="+sql_mulitKeyArray);

		String sql_singleKey = getProjectLockSQL(TABLE,COL_COLOR_SWATCH_ID);
		System.out.println("testStringformat3 single key "+", sql_singleKey="+sql_singleKey);
	}
	public static final String SQL_PROJECT_LOCK =
			"SELECT 1  " + 
		    "FROM  " + 
				"[%s] tableName " + 
			"JOIN  " + 
				"[PROJECT] project " + 
			"ON " + 
				"tableName.PROJECT_ID = project.ID " + 
			"WHERE  " + 
				"%s " + 
			"AND  " + 
				"( " + 
					"project.[STATUS] = 'A' " + 
				"OR " + 
					"project.[STATUS] = 'C' " + 
				"OR	 " + 
					"( " + 
							"project.[STATUS] = 'I' " + 
						"AND " + 
							"tableName.last_upd_usr = ? " + 
						"AND " + 
							"tableName.last_upd_usr = project.LAST_MODIFY " + 
					") " + 
				")	";
	

	public static final String SQL_PROJECT_LOCK_KEY ="tableName.%s = ? ";
	

	public static String getProjectLockSQL(String tableName , String column){
		if(null == column || column.isEmpty()) return null;

		List<String> columns = new ArrayList<String>();
		columns.add(column);
		return getProjectLockSQL(tableName,columns);
	}
    public static String getProjectLockSQL(String tableName, String ... column) {
    	return getProjectLockSQL(tableName, Arrays.asList(column));
    }
	public static String getProjectLockSQL(String tableName , List<String> columns){
		if(null == tableName || tableName.isEmpty()) return null;
		if(null == columns || columns.isEmpty()) return null;
		
		String key = "";
		for(String column: columns){
			if(!"".contentEquals(key)) key += " AND ";
			
			key += String.format(SQL_PROJECT_LOCK_KEY, column);
		}
		
		return String.format(SQL_PROJECT_LOCK, tableName, key);
	}
	/*
	public static final String SQL_PROJECT_LOCK =
			"SELECT 1  " + 
		    "FROM  " + 
				"[%s] table " + 
			"JOIN  " + 
				"[PROJECT] project " + 
			"ON " + 
				"table.PROJECT_ID = project.ID " + 
			"WHERE  " + 
				"table.ID = ? " + 
			"AND  " + 
				"( " + 
					"project.[STATUS] = 'A' " + 
				"OR " + 
					"project.[STATUS] = 'C' " + 
				"OR	 " + 
					"( " + 
							"project.[STATUS] = 'I' " + 
						"AND " + 
							"table.last_upd_usr = ? " + 
						"AND " + 
							"table.last_upd_usr = project.LAST_MODIFY " + 
					") " + 
				")	";
	private static final void testStringformat2(){
		String table = "color_obecjt";
		System.out.println("table="+table);
			
		String sql =  String.format(SQL_PROJECT_LOCK, table);
		System.out.println("sql="+sql);
	}
	*/
	public static final String ERR_MSG_CELL_LOCATION = "file=%s,sheet=%s,row=%s,column=%s";
	private static void testStringFormat(){
		String temp1 = String.format(ERR_MSG_CELL_LOCATION, "%s","1","1","1");
		System.out.println("temp1="+temp1);
		String temp2 = String.format(temp1, "video.xls");
		System.out.println("temp2="+temp2);
	}
	private static void testExpcetion(){
		int row = 0;
		int col = 0;
		
		try{
			for(int i = 0 ; i <= 10 ; i ++){
				if(i == 5) throw new Exception();
				
				if(i % 2 == 0) {
					col++;
				}
				row ++;
			}
		}catch (Exception e){
			System.out.println("expcetion "+", row="+row+", col="+col);
		}
	}
	
	private static void testEndWith(){
		String test = "ATG_Import_Videos_18-Feb-2014_12-23-31.xls";
		String suffix = ".xls";
		if(test.endsWith(suffix)){
			System.out.println("end true");
		}else{
			System.out.println("end flase");
		}
	}
	
	private static void testenum(){
		System.out.println("RoleRight.DML.name()="+RoleRight.DML.name());
		System.out.println("RoleRight.DML.toString()="+RoleRight.DML.toString());
		System.out.println("RoleRight.DML.getFunction()="+RoleRight.DML.getFunction());
		
	}
	
	private static void testListIsContain(){
		List<String> list = new ArrayList<String>();
		list.add("test");
		
		if(list.contains("test"))
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	private static void testIsEmpty(){
		String nullString = null;
		String emptyString = "";
		String testString = "test";

		if(nullString.isEmpty()) System.out.println("nullString="+nullString);
		if(emptyString.isEmpty()) System.out.println("emptyString="+emptyString);
		if(testString.isEmpty()) System.out.println("testString="+testString);
		
	}
	
	private static void testInteger(){
		List<Integer> roleId = new ArrayList<Integer>();
		Integer test = 1;
		roleId.add(test);
		System.out.println("roleId="+roleId);
		
		
			String roleIds = "";
			for(Integer id: roleId){
				if(!roleIds.isEmpty()) roleIds += ",";
				//roleIds += String.valueOf((int)id);
				roleIds += id;
			}
			
		System.out.println("string roleIds="+roleIds);
		
	}
	private static void testRow(){
		int pageIndex = 2;
		int itemPerPage = 10;
		
		int form = getFromRow(pageIndex,itemPerPage);
		int to = getToRow(pageIndex,itemPerPage);
		
		System.out.println("testRow() " + ", pageIndex="+pageIndex
				+ ", itemPerPage="+itemPerPage
				+ ", form="+form
				+ ", to="+to);
	}
	
	public static int getFromRow(int pageIndex, int itemPerPage){
		return ((pageIndex - 1) * itemPerPage) +1;
	}
	public static int getToRow(int pageIndex, int itemPerPage){
		return pageIndex * itemPerPage;
	}
	
	/*
	private  static void  testbasicauth(){
		HttpClient client = new HttpClient();
		UsernamePasswordCredentials credentials =
		new UsernamePasswordCredentials("USERNAME","PASS");
		client.getState().setCredentials(
		  new AuthScope("www.example.com", 9090, AuthScope.ANY_REALM),
		  credentials);
		CommonsClientHttpRequestFactory commons =
		     new CommonsClientHttpRequestFactory(client);

		RestTemplate template = new RestTemplate(commons);
		SomeObject result = template.getForObject(
		     "http://www.example.com:9090/",SomeObject.class
		 );
	}*/
	
	@SuppressWarnings({ "resource", "unused" })
	private static void testexcelParser(String path){
		System.out.println("testexcelParser() " + ", path = "+ path);
		File file = null;
		List<PcLcHtml> videoList = null;
		List<PcMediaExternal> imageList = null;
		List<PcProduct> productList = null;
		List<PcProductTranslation> transList = null;
		
		try {
			// 1. read file
			file = new File(path);
			if(null == file) {
				System.out.println("File not found");
				return;
			}

			// 2. validate file name, extension.
			int type = validate(file);
			
			
			// 3. parse file as pojo	
			if(FILE_FILE_PROD_VIDEO == type){
				videoList = parseProdVideo(file);
			} else if(FILE_FILE_PROD_IMAGE == type){
				imageList = parseProdImage(file);
			} else if(FILE_FILE_PROD == type){
				productList = parseProduct(file);
			} else if(FILE_FILE_PROD_TRANS == type){
				transList = parseProdTrans(file);
			} else {
				System.out.println("Invalid File type");
				return;
			}
			
			//4. print debug log from pojo
			if(videoList != null && !videoList.isEmpty()){
				System.out.println("PRINT videoList " + ", videoList.size()="+videoList.size());
				for(PcLcHtml temp : videoList){
					System.out.println(temp.toString());
				}
			}
			if(imageList != null && !imageList.isEmpty()){
				System.out.println("PRINT imageList " + ", imageList.size()="+imageList.size());
				for(PcMediaExternal temp : imageList){
					System.out.println(temp.toString());
				}
			}
			if(productList != null && !productList.isEmpty()){
				System.out.println("PRINT productList " + ", productList.size()="+productList.size());
				for(PcProduct temp : productList){
					System.out.println(temp.toString());
				}
			}
			if(transList != null && !transList.isEmpty()){
				System.out.println("PRINT productList " + ", transList.size()="+transList.size());
				for(PcProductTranslation temp : transList){
					System.out.println(temp.toString());
				}
			}else{
				System.out.println("PRINT list IS NULL");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
	}
	
	private static final int FILE_TYPE_ERROR = 0;
	private static final int FILE_FILE_PROD = 1;
	private static final int FILE_FILE_PROD_TRANS = 2;
	private static final int FILE_FILE_PROD_IMAGE = 3;
	private static final int FILE_FILE_PROD_VIDEO = 4;
	private static final String FILE_EXT_EXCEL = ".xls";
	private static final String FILE_SUBFIX_PROD = "ATG_Import_Product";
	private static final String FILE_SUBFIX_PROD_TRAN = "ATG_Import_Translations";
	private static final String FILE_SUBFIX_PROD_IMAGE = "ATG_Import_Images";
	private static final String FILE_SUBFIX_PROD_VIDEO = "ATG_Import_Videos";
	
	private static int validate(File file){
		int ret = FILE_TYPE_ERROR;
		if(null == file) return ret;
		
		String name = file.getName();
		System.out.println("validateFile() " + ", name = "+ name);
		
		if(null == name || name.isEmpty() || !name.contains(FILE_EXT_EXCEL)) {
			System.out.println("Invalid File Name");
			return ret;
		}
		
		if(name.contains(FILE_SUBFIX_PROD)){
			ret = FILE_FILE_PROD;
		} else if(name.contains(FILE_SUBFIX_PROD_TRAN)){
			ret = FILE_FILE_PROD_TRANS;
		} else if(name.contains(FILE_SUBFIX_PROD_IMAGE)){
			ret = FILE_FILE_PROD_IMAGE;
		} else if(name.contains(FILE_SUBFIX_PROD_VIDEO)){
			ret = FILE_FILE_PROD_VIDEO;
		} else {
			System.out.println("Unsupported File Type");
		}
		System.out.println("validateFile() " + ", name = "+ name+ ", ret = "+ ret);
		
		return ret;
	}

	private static void testDate(){
		String dateString = "12/11/2013  12:00:00 AM";
		System.out.println("dateString="+dateString);
		Date date = parseDate(dateString);
		
		System.out.println("date="+date);
		
	}
	
	private static Date parseDate(String dateString){
		//SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(dateString);
			System.out.println("date="+date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date;
	}
	/*
	private static Date parserDateCell(Cell cell){
		Date ret = null;
		if(DateUtil.isCellDateFormatted(cell)){
			   try {

				    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				    cellValue = sdf.format(cell.getDateCellValue());

				    } catch (ParseException e) {
				            e.printStackTrace();
				    }
		}
		
		return ret;
	}*/
	
	private static boolean isRowEmpty(Row row) {
		if(null == row) return true;
		
	    for (int c = row.getFirstCellNum(); c <= row.getLastCellNum(); c++) {
	        Cell cell = row.getCell(c);
//	        String cellString = cell.getStringCellValue();
	        if (cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK && (Cell.CELL_TYPE_STRING == cell.getCellType() && null != cell.getStringCellValue() && !cell.getStringCellValue().isEmpty())){
		        System.out.println("ROW IS NOT EMPTY, cell.getCellType()="+cell.getCellType()+ ", cellString="+cell.getStringCellValue());
	            return false;
	        }
	    }
	    return true;
	}
	
/*
	private static String getStringValue(Cell cell) {
		String ret = null;
		if (null == cell) return ret;
		
		ret = cell.getStringCellValue();
		if(null == ret || ret.isEmpty()) return ret;
		
		return ret.trim();
	}
*/	

	public static String getStringValue(Row row, int column) {
		String ret = null;
		if (null == row) return ret;
		
		Cell cell = row.getCell(column);
		if (null == cell) return ret;
		
		ret = cell.getStringCellValue();
		if(null == ret || ret.isEmpty()) return ret;
		
		return ret.trim();
	}
	/*
	private static Date getDateValue(Cell cell) {
		Date ret = null;
		if (null == cell) return ret;
		if( Cell.CELL_TYPE_STRING !=  cell.getCellType()) return ret;
		String dateString = cell.getStringCellValue();
		if(null == dateString || dateString.isEmpty()) return ret;
		
		ret = parseDate(dateString);
		return ret;
	}
*/
	public static Date getDateValue(Row row, int column) {
		Date ret = null;
		if (null == row) return ret;
		
		Cell cell = row.getCell(column);
		if(null == cell) return ret;
		if(Cell.CELL_TYPE_STRING != cell.getCellType()) return ret;
		
		String dateString = cell.getStringCellValue();
		if(null == dateString || dateString.isEmpty()) return ret;
		
		ret = parseDate(dateString);
		return ret;
	}
	private static List<PcProductTranslation> parseProdTrans(File file){
		List<PcProductTranslation> ret = null;
		int initRowNum = 2;
		int startColumn = 0;
		int currentColumn = 0;
		int sheetNum = 0;
		String projectId = "pj001";
		
		FileInputStream fileIS = null;
		Row row = null;
	    Cell cell = null;
		
		try {
		    fileIS = new FileInputStream(file);
		 
		    HSSFWorkbook workbook = new HSSFWorkbook(fileIS);
		    HSSFSheet sheet = workbook.getSheetAt(sheetNum);
		    if(sheet == null) {
				System.out.println("parseProdTrans()  NO SHEET FOUND");
		    } else {
				System.out.println("parseProdTrans()  SHEET FOUND" + ", sheet.getLastRowNum()="+sheet.getLastRowNum()+ ", sheet.getPhysicalNumberOfRows()="+sheet.getPhysicalNumberOfRows());
		    	ret = new ArrayList<PcProductTranslation>();
			    for(int rowNum = initRowNum; rowNum <= sheet.getLastRowNum() ; rowNum++){
			    	//retrieve row
			    	currentColumn = startColumn;
				    row = sheet.getRow(rowNum);
				    if(isRowEmpty(row)){
				    	System.out.println("row is null or empty"+", rowNum = "+rowNum);
				    	continue;
				    }
				    	
				    System.out.println("row.getFirstCellNum() ="+row.getFirstCellNum()+", row.getPhysicalNumberOfCells() ="+row.getPhysicalNumberOfCells());
				    
				    //retrieve the cell content from column
				    PcProductTranslation object = new PcProductTranslation();
				    object.setStatus(projectId);
			    	
				    object.setId(getStringValue(row,currentColumn));
				    object.setDisplayName(getStringValue(row,++currentColumn));
				    object.setDescription(getStringValue(row,++currentColumn));
				    object.setDetailsAndCareText(getStringValue(row,++currentColumn));
				    object.setKeywords(getStringValue(row,++currentColumn));
				    object.setLongDescription(getStringValue(row,++currentColumn));
				    object.setSizeAndFit(getStringValue(row,++currentColumn));
				    
				    ret.add(object);
			    }
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
			try {
				if (null != fileIS)
					fileIS.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ret;
	}
	
	private static List<PcProduct> parseProduct(File file){
		List<PcProduct> ret = null;
		int initRowNum = 2;
		int startColumn = 0;
		int currentColumn = 0;
		int sheetNum = 0;
//		String projectId = "pj001";
		
		FileInputStream fileIS = null;
		Row row = null;
	    Cell cell = null;
		
		try {
		    fileIS = new FileInputStream(file);
		 
		    HSSFWorkbook workbook = new HSSFWorkbook(fileIS);
		    HSSFSheet sheet = workbook.getSheetAt(sheetNum);
		    if(sheet == null) {
				System.out.println("PcProduct()  NO SHEET FOUND");
		    } else {
				System.out.println("PcProduct()  SHEET FOUND" + ", sheet.getLastRowNum()="+sheet.getLastRowNum()+ ", sheet.getPhysicalNumberOfRows()="+sheet.getPhysicalNumberOfRows());
		    	ret = new ArrayList<PcProduct>();
			    for(int rowNum = initRowNum; rowNum <= sheet.getLastRowNum() ; rowNum++){			    
			    	//retrieve row
			    	currentColumn = startColumn;
				    row = sheet.getRow(rowNum);
				    
				   // if(null == row || 0 == row.getPhysicalNumberOfCells()) {
				    
				    if(isRowEmpty(row)){
				    	System.out.println("row is null or empty"+", rowNum = "+rowNum);
				    	continue;
				    }
				    	
				    System.out.println("rowNum = "+rowNum+
				    		", row.getFirstCellNum() ="+row.getFirstCellNum()+
				    		", row.getPhysicalNumberOfCells() ="+row.getPhysicalNumberOfCells()+
				    		", row.getLastCellNum()="+row.getLastCellNum());
				    
				    //retrieve the cell content from column
				    PcProduct object = new PcProduct();
//				    object.setStatus(projectId);

				    object.setId(getStringValue(row,currentColumn));
				    object.setDisplayNameDefault(getStringValue(row,++currentColumn));
				    object.setLongDescriptionDefault(getStringValue(row,++currentColumn));
				    object.setSizeAndFitDefault(getStringValue(row,++currentColumn));
				    object.setLargeImage(getStringValue(row,++currentColumn));
				    object.setFixedRelatedProducts(getStringValue(row,++currentColumn));
				    object.setThumbnailImage(getStringValue(row,++currentColumn));
				    object.setUpsellProductGroup(getStringValue(row,++currentColumn));
				    object.setBackImage(getStringValue(row,++currentColumn));
				    object.setDetail1Image(getStringValue(row,++currentColumn));
				    object.setDetail2Image(getStringValue(row,++currentColumn));
				    object.setDetail3Image(getStringValue(row,++currentColumn));
				    object.setDetail4Image(getStringValue(row,++currentColumn));
				    object.setFrontImage(getStringValue(row,++currentColumn));
				    object.setIndexImage(getStringValue(row,++currentColumn));
				    object.setSideImage(getStringValue(row,++currentColumn));
				    object.setOnFigureImage(getStringValue(row,++currentColumn));
				    object.setLcHtml(getStringValue(row,++currentColumn));
				    object.setPublicationStatusCN(getStringValue(row,++currentColumn));
				    object.setPublicationStatusHK(getStringValue(row,++currentColumn));
				    object.setTranslations(getStringValue(row,++currentColumn));
				    object.setStartDateCN(getDateValue(row,++currentColumn));
				    object.setStartDateHK(getDateValue(row,++currentColumn));
				    object.setDetailsAndCareTextDefault(getStringValue(row,++currentColumn));
				    object.setLcFacetColor1(getStringValue(row,++currentColumn));
				    object.setLcFacetColor2(getStringValue(row,++currentColumn));
				    object.setSide2Image(getStringValue(row,++currentColumn));

				    ret.add(object);
			    }
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
			try {
				if (null != fileIS)
					fileIS.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ret;
	}
	
	private static List<PcMediaExternal> parseProdImage(File file){
		List<PcMediaExternal> ret = null;
		int initRowNum = 2;
		int startColumn = 0;
		int currentColumn = 0;
		int sheetNum = 0;
		String projectId = "pj001";
		
		FileInputStream fileIS = null;
		Row row = null;
	    Cell cell = null;
		
		try {
		    fileIS = new FileInputStream(file);
		 
		    HSSFWorkbook workbook = new HSSFWorkbook(fileIS);
		    HSSFSheet sheet = workbook.getSheetAt(sheetNum);
		    if(sheet == null) {
				System.out.println("parseProdImage()  NO SHEET FOUND");
		    } else {
				System.out.println("parseProdImage()  SHEET FOUND" + ", sheet.getLastRowNum()="+sheet.getLastRowNum()+ ", sheet.getPhysicalNumberOfRows()="+sheet.getPhysicalNumberOfRows());
		    	ret = new ArrayList<PcMediaExternal>();
			    for(int rowNum = initRowNum; rowNum <= sheet.getLastRowNum() ; rowNum++){
			    	//retrieve row
			    	currentColumn = startColumn;
				    row = sheet.getRow(rowNum);
				    
				   // if(null == row || 0 == row.getPhysicalNumberOfCells()) {
				    
				    if(isRowEmpty(row)){
				    	System.out.println("row is null or empty"+", rowNum = "+rowNum);
				    	continue;
				    }
				    	
				    System.out.println("rowNum = "+rowNum+
				    		", row.getFirstCellNum() ="+row.getFirstCellNum()+
				    		", row.getPhysicalNumberOfCells() ="+row.getPhysicalNumberOfCells()+
				    		", row.getLastCellNum()="+row.getLastCellNum());
				    
				    //retrieve the cell content from column
				    PcMediaExternal object = new PcMediaExternal();
				    object.setStatus(projectId);
				    object.setId(getStringValue(row,currentColumn));
				    object.setDescription(getStringValue(row,++currentColumn));
				    object.setEndDate(getDateValue(row,++currentColumn));
				    object.setName(getStringValue(row,++currentColumn));
				    object.setParentFolder(getStringValue(row,++currentColumn));
				    object.setStartDate(getDateValue(row,++currentColumn));
				    object.setUrl(getStringValue(row,++currentColumn));
				    
				    ret.add(object);
			    }
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
			try {
				if (null != fileIS)
					fileIS.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ret;
	}
	private static List<PcLcHtml> parseProdVideo(File file){
		List<PcLcHtml> ret = null;
		int initRowNum = 2;
		int startColumn = 0;
		int currentColumn = 0;
		int sheetNum = 0;
		String projectId = "pj001";
		
		FileInputStream fileIS = null;
		Row row = null;
	    Cell cell = null;
		
		try {
		    fileIS = new FileInputStream(file);
		 
		    HSSFWorkbook workbook = new HSSFWorkbook(fileIS);
		    HSSFSheet sheet = workbook.getSheetAt(sheetNum);
		    if(sheet == null) {
				System.out.println("parseProdVideo()  NO SHEET FOUND");
		    } else {
				System.out.println("parseProdVideo()  SHEET FOUND" + ", sheet.getLastRowNum()="+sheet.getLastRowNum()+ ", sheet.getPhysicalNumberOfRows()="+sheet.getPhysicalNumberOfRows());
		    	ret = new ArrayList<PcLcHtml>();
			    for(int rowNum = initRowNum; rowNum <= sheet.getLastRowNum() ; rowNum++){
			    	//retrieve row
			    	currentColumn = startColumn;
				    row = sheet.getRow(rowNum);
				    if(isRowEmpty(row)){
				    	System.out.println("row is null or empty"+", rowNum = "+rowNum);
				    	continue;
				    }
				    	
				    System.out.println("row.getFirstCellNum() ="+row.getFirstCellNum()+", row.getPhysicalNumberOfCells() ="+row.getPhysicalNumberOfCells());
				    
				    //retrieve the cell content from column
				    PcLcHtml object = new PcLcHtml();
				    object.setStatus(projectId);
				    object.setId(getStringValue(row,currentColumn));
				    object.setDisplayName(getStringValue(row,++currentColumn));
				    object.setHtml(getStringValue(row,++currentColumn));
				    
				    ret.add(object);
			    }
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
			try {
				if (null != fileIS)
					fileIS.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ret;
	}
	
	private static void parseColorArray(){
		
		String json = "{\"id\":\"001\",\"displayName\":null,\"locale\":null,\"status\":null,\"remarks\":null,\"colorValue\":null,\"imagePath\":null,\"rmsColorCode\":null,\"createDate\":null,\"lastUpdDate\":null,\"lastUpdUser\":null}";
		System.out.println("json = "+json);
		
		Gson gson = new Gson();
		ColorObject co =  gson.fromJson(json, ColorObject.class);
		
		System.out.println("ColorObject = "+co.toString());
		
		
		String jsonarray = "[{\"id\":\"001\",\"displayName\":null,\"locale\":null,\"status\":null,\"remarks\":null,\"colorValue\":null,\"imagePath\":null,\"rmsColorCode\":null,\"createDate\":null,\"lastUpdDate\":null,\"lastUpdUser\":null},{\"id\":\"002\",\"displayName\":null,\"locale\":null,\"status\":null,\"remarks\":null,\"colorValue\":null,\"imagePath\":null,\"rmsColorCode\":null,\"createDate\":null,\"lastUpdDate\":null,\"lastUpdUser\":null}]";
		System.out.println("jsonarray = "+jsonarray);

		ColorObject [] cos =  gson.fromJson(jsonarray, ColorObject[].class);
		
		for(ColorObject temp: cos){
			System.out.println(" array ColorObject = "+temp.toString());
			
		}
	}
	private static void testlistofint(){
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		
		for(int temp: ints){
			System.out.println(temp);
		}
	}
	
	private static void testmapat(){
		/*
		String key = "key";
		String value = "value";
		Map<String, String> authRoleMap = new HashMap<String, String>();
		authRoleMap.put(key, value);
		String ret = authRoleMap.get(key + "@" + value);
		
		//System.out.println("key= "+ key+",value= "+ value+",ret= "+ ret);
		*/
		
		Map<String,Object> vehicles = new HashMap<String,Object>();
		vehicles.put("BMW",null);
		vehicles.put("Mercedes",null);
		vehicles.put("Audi",null);
		
		for(String key: vehicles.keySet()){
			System.out.println(key + " - " + vehicles.get(key));
		}
		System.out.println();
		
		String searchKey = "Audi";
		if (vehicles.containsKey(searchKey))
			System.out.println("Found total " + vehicles.get(searchKey) + " "
					+ searchKey + " cars!\n");
	}
	
	private static void testtrim(){
		Sheet_Fraud_By_Order o1 = new Sheet_Fraud_By_Order();
		Sheet_Fraud_By_Order o2 = new Sheet_Fraud_By_Order();
		o1.setORDER_ID("1");
		o2.setORDER_ID("1");
				
		List<Sheet_Fraud_By_Order> list = new ArrayList<Sheet_Fraud_By_Order>();
		list.add(o1);
		list.add(o2);
		
		List<Sheet_Fraud_By_Order> result = trimOrder(list);
		if(null!=result && !result.isEmpty()){
			for(Sheet_Fraud_By_Order temp : result){
				System.out.println("testtrim, temp="+temp.toString());
			}
		}else{
			System.out.println("testtrim, null=");
		}
	}
	private static List<Sheet_Fraud_By_Order> trimOrder(List<Sheet_Fraud_By_Order> orderList){
		System.out.println("trimOrder orderList.size()="+orderList.size());
		List<Sheet_Fraud_By_Order> ret = null;
		if(null == orderList || orderList.isEmpty()) return ret;
		
		Map<String, Sheet_Fraud_By_Order> map = new HashMap<String, Sheet_Fraud_By_Order>();
		for(Sheet_Fraud_By_Order order:orderList){
			System.out.println("trimOrder, order="+order.toString());
			if(!map.containsKey(order.getORDER_ID())){
				map.put(order.getORDER_ID(), order);
			}
		}
		
		Collection<Sheet_Fraud_By_Order> collections = map.values();
		ret = new ArrayList<Sheet_Fraud_By_Order>(collections);
		
//		ret= (List<Sheet_Fraud_By_Order>) map.values();
		
		return ret;
	}
	private static void testcastmaptolist(){
		testModel test1 = new testModel();
		testModel test2 = new testModel();

		test1.setNumber(1);
		test2.setNumber(2);

		test1.setText("one");
		test2.setText("two");
		
		List<testModel> testList = new ArrayList<testModel>();
		testList.add(test1);
		testList.add(test2);
		
		Map<String,testModel> map = new HashMap<String,testModel>();
		
		for(testModel test:testList){
			System.out.println("test="+test.toString());
			if(!map.containsKey(test.getText())){
				map.put(test.getText(), test);
			}
		}
		
		Collection<testModel> c_ret = map.values();
		List<testModel> list = new ArrayList<testModel>(c_ret);
		
		for(testModel temp : list){
			System.out.println("temp="+temp.toString());
		}
	}
	
	private static void testdate2(){
		Calendar c = getLastMonthBeginning();
		Calendar currentC = getCurrentMonthBeginning();
		Calendar lastweekC = getLastWeekBeginning();
		Calendar TodayC = getTodayBeginning();
		Date d = c.getTime();
		Date currentd = currentC.getTime();
		Date lastweekd = lastweekC.getTime();
		Date Todayd = TodayC.getTime();

//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		String date = format.format(d);
		String cureentDate = format.format(currentd);
		String lastweekDate = format.format(lastweekd);
		String TodayDate = format.format(Todayd);
		System.out.println("last month begining, date="+date);
		System.out.println("current month begining, cureentDate="+cureentDate);
		System.out.println("last week begining, lastweekDate="+lastweekDate);
		System.out.println("today begining, TodayDate="+TodayDate);
		
		try {
			Date parsedDate = format.parse(TodayDate);
			System.out.println("TodayDate !! parsedDate="+parsedDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Calendar getTodayBeginning(){
		return getTodayBeginning(0);
	}/*
	public static Calendar getTodayBeginning(int hourVariation){
		Calendar cal = new GregorianCalendar();
		// reset hour, minutes, seconds and millis
		cal.set(Calendar.HOUR_OF_DAY, hourVariation);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal;
	}*/
	public static Calendar getLastMonthBeginning(){
		return getMonthBeginning(-1);
	}
	public static Calendar getCurrentMonthBeginning(){
		return getMonthBeginning(0);
	}
	public static Calendar getMonthBeginning(int monthVariation){
		Calendar cal = getTodayBeginning();
		cal.add(Calendar.MONTH, monthVariation);
		cal.set(Calendar.DAY_OF_MONTH, 1);
		return cal;
	}


	public static Calendar getLastWeekBeginning(){
		return getDateWithVariation(-7);
	}
	
	public static Calendar getDateWithVariation(int ammount){
		Calendar cal = getTodayBeginning();
		cal.add(Calendar.DAY_OF_MONTH, ammount);
		return cal;
	}
	
	private static void testJson(){
		testModel test1 = new testModel();
		test1.setNumber(1);
		test1.setText("1");
		testModel test2 = new testModel();
		test2.setNumber(2);
		test2.setText("2");
		
		List<testModel> testList = new ArrayList<testModel>();
		testList.add(test1);
		testList.add(test2);
		
		testRequest req = new testRequest();
		req.setCallerReferenceNo("ref");
		req.setTests(testList);
		
		
		String text = convertPOJO2JSON(req);
		System.out.println("JSON String, text="+text);
		
		
		Product product = new Product();

		String textproduct = convertPOJO2JSON(product);
		System.out.println("JSON String, textproduct="+textproduct);
	}
	
	private static void stringTest() {
		String transportTo = "229";
		String toLocation = "";

		System.out.println("transportTo=" + transportTo);
		System.out.println("toLocation=" + toLocation);

		if (!(toLocation == null || toLocation.isEmpty())
				&& !transportTo.contentEquals(toLocation)) {
			// if(!transportTo.contentEquals(toLocation)){
			System.out.println("remove");
		} else {
			System.out.println("add");
		}
	}

	private static void testChinese(boolean isISO){
		String ruleDescChi = "testå¯Œæ�±åº—å„·å»Šå’–å®¤é¾�";
		String temp = null;
		try {

			if(isISO){
				//proc.setString(9, new String(fraudCheckContent.getBytes("ISO-8859-1"),"UTF-8"));
				temp = new String(ruleDescChi.getBytes("ISO-8859-1"),"UTF-8");
			}else{
				temp = new String(ruleDescChi.getBytes("UTF-8"),"UTF-8");
			}
			System.out.println("testChinese() " +", ruleDescChi="+ruleDescChi+", temp="+temp);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	private static void testunicode() {
		boolean isISO = true;
		insertUnicode(isISO);
		selectUnicode();
	}

	private static int insertUnicode(boolean isISO) {
		int ret = -1;

		PreparedStatement pstmt = null;
		Connection dbConnection = null;
		String sql = "  insert into [CN_UAT_OOPGCORE].[dbo].[FRAUD_CHECK_INFO_20110826] values (?,?,?)";
		System.out.println("sql = " + sql);

		String ruleId = "testing4";
		String ruleDesc = "testing_true";
		String ruleDescChi = "testå¯Œæ�±åº—å„·å»Šå’–å®¤é¾�";
		String temp = null;
		try {
			dbConnection = getDBConnection();
			pstmt = dbConnection.prepareStatement(sql);
			pstmt.setNString(1, ruleId);
			pstmt.setNString(2, ruleDesc);
			//pstmt.setNString(3, ruleDescChi);

			if(isISO){
				//proc.setString(9, new String(fraudCheckContent.getBytes("ISO-8859-1"),"UTF-8"));
				temp = new String(ruleDescChi.getBytes("ISO-8859-1"),"UTF-8");
			}else{
				temp = ruleDescChi;
			}
			pstmt.setNString(3, temp);

			System.out.println("insertUnicode() " +", ruleDescChi="+ruleDescChi+", temp="+temp);
			ret = pstmt.executeUpdate();

			System.out.println("insertUnicode() ret: " + ret);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (dbConnection != null)
				try {
					dbConnection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return ret;
	}

	private static void selectUnicode() {

		PreparedStatement pstmt = null;
		Connection dbConnection = null;
		ResultSet rs = null;
		int rowCount = 0;
		String sql = "SELECT * FROM [CN_UAT_OOPGCORE].[dbo].[FRAUD_CHECK_INFO_20110826]";
		System.out.println("sql = " + sql);

		String ruleId = null;
		String ruleDesc = null;
		String ruleDescChi = null;
		try {
			dbConnection = getDBConnection();
			pstmt = dbConnection.prepareStatement(sql);
			// pstmt.setTimestamp(1, startDate_Fraud2);
			// pstmt.setTimestamp(2, endDate_Fraud2);
			// showLog(Miscellaneous.SQL_fraud_by_order_level);
			rs = pstmt.executeQuery();

			if (null != rs) {
				while (rs.next()) {
					ruleId = rs.getString("RULE_ID");
					ruleDesc = rs.getString("RULE_DESC");
					ruleDescChi = rs.getString("RULE_DESC_CHI");
					System.out.println("ruleId = " + ruleId + ", ruleDesc = "
							+ ruleDesc + ", ruleDescChi = " + ruleDescChi);
					rowCount++;
				}
			}
			System.out.println("rowCount = " + rowCount);
		} catch (SQLException e) {
			System.out.println("getFraudByOrderOracleSQL , SQLException: " + e);
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (dbConnection != null)
				try {
					dbConnection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	private static Connection getDBConnection() {
		Connection conn = null;
		String strServerIPAddress = "172.16.201.11";
		String strServerPort = "1433";
		String strDatabaseName = "CN_UAT_OOPGCORE";
		String strDatabaseUsername = "oto";
		String strDatabasePassword = "oto";
		boolean isUnicode = false;
		try {
			// Step 1: Load the JDBC driver.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Class.forName(properties.getProperty("jdbcDriver"));
			// showLog("JDBC Driver: " + properties.getProperty("jdbcDriver"));

			// Step 2: Establish the connection to the database.
			String url = "jdbc:sqlserver://" + strServerIPAddress + ":"
					+ strServerPort + ";" + "DatabaseName=" + strDatabaseName
					+ ";" + "sendStringParametersAsUnicode=" + isUnicode;

			conn = DriverManager.getConnection(url, strDatabaseUsername,
					strDatabasePassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	private static void testcc() {
		String card_jcb = "3530111333300000";
		String cardRegexJCB = "REGEX_VALIDATOR_JCB";

		String card_visa1 = "4111111111111111";
		String card_visa2 = "4012888888881881";
		String card_visa3 = "4222222222222";
		String card_visa_qa = "4005550000000001";
		String cardRegexVisa = "REGEX_VALIDATOR_VISA";

		String card_master1 = "5555555555554444";
		String card_master2 = "5105105105105100";
		String cardRegexMaster = "REGEX_VALIDATOR_MASTER";

		boolean result = false;

		result = validateCreditCardFormat(card_visa_qa, cardRegexVisa);
		System.out
				.println("testcc()" + ", card_visa_qa = " + card_visa_qa
						+ ", cardRegexVisa = " + cardRegexVisa + ", result = "
						+ result);

		/*
		 * //Valid cases System.out.println("testcc()" + "VALID CASES!"); result
		 * = validateCreditCardFormat(card_jcb,cardRegexJCB);
		 * System.out.println("testcc()"
		 * +", card_jcb = "+card_jcb+", cardRegexJCB = "
		 * +cardRegexJCB+", result = "+result);
		 * 
		 * result = validateCreditCardFormat(card_visa1,cardRegexVisa);
		 * System.out.println("testcc()"
		 * +", card_visa1 = "+card_visa1+", cardRegexVisa = "
		 * +cardRegexVisa+", result = "+result); result =
		 * validateCreditCardFormat(card_visa2,cardRegexVisa);
		 * System.out.println("testcc()"
		 * +", card_visa2 = "+card_visa2+", cardRegexVisa = "
		 * +cardRegexVisa+", result = "+result); result =
		 * validateCreditCardFormat(card_visa3,cardRegexVisa);
		 * System.out.println("testcc()"
		 * +", card_visa3 = "+card_visa3+", cardRegexVisa = "
		 * +cardRegexVisa+", result = "+result);
		 * 
		 * result = validateCreditCardFormat(card_master1,cardRegexMaster);
		 * System.out.println("testcc()"
		 * +", card_master1 = "+card_master1+", cardRegexMaster = "
		 * +cardRegexMaster+", result = "+result); result =
		 * validateCreditCardFormat(card_master2,cardRegexMaster);
		 * System.out.println("testcc()"
		 * +", card_master2 = "+card_master2+", cardRegexMaster = "
		 * +cardRegexMaster+", result = "+result);
		 * 
		 * 
		 * System.out.println("testcc()" + "INVALID CASES!"); result =
		 * validateCreditCardFormat(card_visa1,cardRegexJCB);
		 * System.out.println("testcc()"
		 * +", card_visa1 = "+card_visa1+", cardRegexJCB = "
		 * +cardRegexJCB+", result = "+result); result =
		 * validateCreditCardFormat(card_master1,cardRegexVisa);
		 * System.out.println("testcc()"
		 * +", card_master1 = "+card_master1+", cardRegexVisa = "
		 * +cardRegexVisa+", result = "+result); result =
		 * validateCreditCardFormat(card_jcb,cardRegexMaster);
		 * System.out.println("testcc()"
		 * +", card_jcb = "+card_jcb+", cardRegexMaster = "
		 * +cardRegexMaster+", result = "+result);
		 */
	}

	private static boolean validateCreditCardFormat(String card,
			String cardRegex) {
		boolean ret = false;
		try {
			PropertiesManager pm = new PropertiesManager();
			String jcbRegex = pm.get(cardRegex);
			if (null == jcbRegex || jcbRegex.isEmpty())
				return ret;

			ret = isMatch(card, jcbRegex);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	private static void printThemAll() {

		Properties prop = new Properties();
		InputStream input = null;

		try {

			// String filename =
			// "C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\oopg.properties";
			String filename = "oopg.properties";
			input = LCMerchantToolDemo.class.getClassLoader()
					.getResourceAsStream(filename);
			if (input == null) {
				System.out.println("Sorry, unable to find " + filename);
				return;
			}

			prop.load(input);

			Enumeration<?> e = prop.propertyNames();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				String value = prop.getProperty(key);
				System.out.println("Key : " + key + ", Value : " + value);
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	private static boolean isMatch(String target, String regex) {
		boolean ret = false;
		if (null == target || target.isEmpty())
			return ret;
		if (null == regex || regex.isEmpty())
			return ret;
		System.out.println("isMatch(), target : " + target + ", regex : "
				+ regex);

		try {
			Matcher m = Pattern.compile(regex).matcher(target);
			ret = m.find();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}

	private static void testgetFacetComponent() {
		String facetTrail = "3014:700029:3002:MenJackets:3012:Black";
		String facetComponentKey = "3002";

		String ret = getFacetComponent(facetTrail, facetComponentKey);
		System.out.println("facetTrail = " + facetTrail
				+ ", facetComponentKey = " + facetComponentKey + ", ret = "
				+ ret);

	}

	private static String getFacetComponent(String facetTrail,
			String facetComponentKey) {
		String ret = null;
		if (null == facetTrail || facetTrail.isEmpty())
			return ret;
		if (null == facetComponentKey || facetComponentKey.isEmpty())
			return ret;

		// 0. translate facetComponentKey to facetId
		String id = facetComponentKey;
		if (null == facetTrail || facetTrail.isEmpty())
			return ret;

		// 1. check if the facetTrail contain the facetId
		if (!facetTrail.contains(id))
			return ret;

		// 2. get component with facetId and Delimiter
		int lastIndex = facetTrail.lastIndexOf(id + ":");
		ret = facetTrail.substring(lastIndex + id.length() + ":".length());
		// 3. trim out subfix
		if (ret.contains(":")) {
			ret = (String) ret.subSequence(0, ret.indexOf(":"));
		}

		return ret;
	}

	private static void oopglibtest() {

		System.out.println("Going to call getEGCHoldAuditByOrderId Start");
		String xml = "";
		try {
			System.out.println("Going to call getEGCHoldAuditByOrderId");
			System.out.println("Going to call getEGCHoldAuditByOrderId 1");
			System.out.println("Going to call getEGCHoldAuditByOrderId 2");
			PaymentServiceLocator ps = null;
			System.out.println("Going to call getEGCHoldAuditByOrderId 3");
			ps = new PaymentServiceLocator();
			System.out.println("Going to call getEGCHoldAuditByOrderId 4");
			com.lanecrawford.oto.oopg.client.getegcholdaudit.Payment p = null;
			System.out.println("Going to call getEGCHoldAuditByOrderId 5");
			p = ps.getPayment(new URL(""));
			System.out.println("Going to call getEGCHoldAuditByOrderId 6");
			xml = p.getEGCHoldAudit("0123123123");

			if (!xml.isEmpty()) {
				System.out.println("xml=" + xml);
				xml = xml.replaceAll("<!\\[CDATA\\[", "").replaceAll("\\]\\]>",
						"");
				System.out.println("xml=" + xml);
			}
		} catch (Exception e) {
			System.out.println("e:" + e);
			e.printStackTrace();
		}

		System.out.println("Going to call getEGCHoldAuditByOrderId END");
		// return xml;

	}

	private static void testStringaray() {
		String[] abc = new String[] { "a", "b", "c", "d", "e", "f" };
		System.out.println("abc.size()" + abc.length);
		for (String temp : abc) {
			System.out.println("temp=" + temp);
		}

		// test array removal
		String removalTarget = "c";
		for (int i = 0; i < abc.length; i++) {
			if (removalTarget.contentEquals(abc[i])) {
				abc[i] = null;
			}
		}

		for (String content : abc) {
			System.out.println("content=" + content);
		}

		/*
		 * int batchSize = 5; String [] after = new String [batchSize];
		 * 
		 * for(int i = 0; i< batchSize; i ++ ){ after[i] = abc[i];
		 * System.out.println("after["+ i +"]="+after[i]); }
		 */
		/*
		 * // Test: Arrays.copyOf(...);
		 * System.out.println("batchSize="+batchSize); String[] after =
		 * Arrays.copyOf(abc,batchSize); for(String temp:after){
		 * System.out.println("after temp="+temp); }
		 * 
		 * batchSize = 10; System.out.println("batchSize="+batchSize);
		 * 
		 * String[] over = null; if(abc.length > batchSize ){ over =
		 * Arrays.copyOf(abc,batchSize); } else{ over = abc; }
		 * 
		 * for(String temp:over){ System.out.println("after temp="+temp); }
		 */
	}

	private static void testproxyobj() {
		System.out.println("testproxyobj()");
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(
				"127.0.0.1", 81));
		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(
					"http://127.0.0.1:8080/ooms/GetDocFromExtStorageServlet?orderId=800000754&docType=PackNote")
					.openConnection(proxy);
			System.out.println(connection.getResponseCode() + " : "
					+ connection.getResponseMessage());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testdate() {
		Date now = new Date();
		// System.out.println("now="+now);
		// String datetimeStr = now.toString();
		String datetimeStr = "2011-07-04";
		System.out.println("datetimeStr=" + datetimeStr);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("format=" + format);
		try {
			Date targetDate = format.parse(datetimeStr);
			System.out.println("targetDate=" + targetDate);
			int diffInDays = (int) ((now.getTime() - targetDate.getTime()) / (1000 * 60 * 60 * 24));
			System.out.println("diffInDays=" + diffInDays);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void testdatediff() {
		String datetimeStr = "2011-07-04";
		String format = "yyyy-MM-dd";
		Date old = parseDate(datetimeStr, format);
		int datediff = dateDiff(old);
		System.out.println("testdatediff() , datediff=" + datediff);
	}

	public static Date parseDate(String dateString, String format) {
		Date ret = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat(format);
			ret = dateFormat.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static int dataDiff(Date newDate, Date oldDate) {
		int ret = -1;
		try {
			ret = (int) ((newDate.getTime() - oldDate.getTime()) / (1000 * 60 * 60 * 24));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	public static int dateDiff(Date oldDate) {
		return dataDiff(new Date(), oldDate);
	}
	private static void convertArrayToList(){
		 String[] words = {"ace", "boom", "crew", "dog", "eon"};  

	      List<String> wordList = Arrays.asList(words);  

	      for (String e : wordList)  
	      {  
	         System.out.println(e);  
	      }  
	      
	      String zero = wordList.get(0);
	         System.out.println("zero="+zero);  
	}
	
	private static void testCSVSplitwithDoubleQuote(){
		String s = "Sachin,,M,\"Maths,Science,English\",Need to improve in these subjects.";
		String regex = ",(?=([^\"]*\"[^\"]*\")*[^\"]*$)";
		String[] splitted = s.split(regex);
		//System.out.println(Arrays.toString(splitted));

		System.out.println("s="+s);
		System.out.println("regex="+regex);
		for(String temp : splitted){
			System.out.println("temp="+temp);
		}
	}
	
	private static void convertlisttoarray() {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");

		for (String temp : list) {
			System.out.println("temp=" + temp);
		}

		String[] array = list.toArray(new String[list.size()]);

		for (String test : array) {
			System.out.println("test=" + test);
		}
	}
	
	
	private static void testhashmap2() {
		
		HashMap<String, String> uniqueRecord = new HashMap<String, String>();
		uniqueRecord.put("1", "test1");
		uniqueRecord.put("2", "test2");
		uniqueRecord.put("3", "test3");
		uniqueRecord.put("1", "test11");
		
		for (Map.Entry entry : uniqueRecord.entrySet()) {
			System.out.print("key,val: ");
			System.out.println(entry.getKey() + "," + entry.getValue());
		}

		Set<String> ss = uniqueRecord.keySet();
//		List<String> ss = (List<String>) uniqueRecord.keySet();
		
		for(String temp:ss){
			System.out.println("temp="+temp);
		}
	}
	private static void testhashmap() {
		List<ArchiveRecord> ret = null;

		HashMap<String, ArchiveRecord> uniqueRecord = new HashMap<String, ArchiveRecord>();
		uniqueRecord.put("1", new ArchiveRecord());
		uniqueRecord.put("2", new ArchiveRecord());
		uniqueRecord.put("3", new ArchiveRecord());

		for (Map.Entry entry : uniqueRecord.entrySet()) {
			System.out.print("key,val: ");
			System.out.println(entry.getKey() + "," + entry.getValue());
		}

		ArchiveRecord record1 = uniqueRecord.get("1");
		record1.setATGOrderId("1");
		ArchiveRecord record2 = uniqueRecord.get("2");
		record2.setATGOrderId("2");
		ArchiveRecord record3 = uniqueRecord.get("3");
		record3.setATGOrderId("3");

		for (Map.Entry entry : uniqueRecord.entrySet()) {
			System.out.print("key,val: ");
			System.out.println(entry.getKey() + "," + entry.getValue());
		}

		uniqueRecord.put("2", record2);

		for (Map.Entry entry : uniqueRecord.entrySet()) {
			System.out.print("key,val: ");
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
		try {
			ret = new ArrayList(uniqueRecord.values());

			for (ArchiveRecord temp : ret) {

				System.out.println("temp=" + temp.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void testConstructor() {
		ArchiveRecord record = new ArchiveRecord();
		System.out.println("record=" + record.toString());
	}

	private static void testStringSplit() {
		String fileNames = "abc.pdf,bcd.pdf,def.pdf";
		System.out.println("fileNames=" + fileNames);
		String[] fileName = fileNames.split(",");
		System.out.println("filename.length=" + fileName.length);
		for (String name : fileName) {
			System.out.println("name=" + name);
		}
	}

	// check sum START
	public static final String CHECKSUM_ALGORITHM_MD2 = "MD2";
	public static final String CHECKSUM_ALGORITHM_MD5 = "MD5";
	public static final String CHECKSUM_ALGORITHM_SHA1 = "SHA-1";
	public static final String CHECKSUM_ALGORITHM_SHA256 = "SHA-256";
	public static final String CHECKSUM_ALGORITHM_SHA384 = "SHA-384";
	public static final String CHECKSUM_ALGORITHM_SHA512 = "SHA-512";

	public static byte[] createChecksum(File file, String algorithm)
			throws Exception {
		InputStream fis = new FileInputStream(file);

		byte[] buffer = new byte[1024];
		MessageDigest complete = MessageDigest.getInstance(algorithm);
		int numRead;

		do {
			numRead = fis.read(buffer);
			if (numRead > 0) {
				complete.update(buffer, 0, numRead);
			}
		} while (numRead != -1);

		fis.close();
		return complete.digest();
	}

	// see this How-to for a faster way to convert
	// a byte array to a HEX string
	public static String getChecksum(File file, String algorithm)
			throws Exception {
		String result = "";
		System.out.println("getCheckSum(), file.length()=" + file.length());
		byte[] b = createChecksum(file, algorithm);
		System.out.println("getCheckSum(), b.length()=" + b.length);

		for (int i = 0; i < b.length; i++) {
			result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
			System.out.println("getCheckSum(), result=" + result);
		}
		return result;
	}

	public static byte[] createChecksum(byte[] file, String algorithm)
			throws Exception {

		MessageDigest complete = MessageDigest.getInstance(algorithm);
		complete.update(file, 0, file.length);

		return complete.digest();
	}

	/*
	 * public static byte[] createChecksum(byte[] file, String algorithm) throws
	 * Exception { byte[] ret = null; if(null == file || file.length <= 0)
	 * return ret; if(algorithm == null ||
	 * (!CHECKSUM_ALGORITHM_MD2.contentEquals(algorithm) &&
	 * !CHECKSUM_ALGORITHM_MD5.contentEquals(algorithm) &&
	 * !CHECKSUM_ALGORITHM_SHA1.contentEquals(algorithm) &&
	 * !CHECKSUM_ALGORITHM_SHA256.contentEquals(algorithm) &&
	 * !CHECKSUM_ALGORITHM_SHA384.contentEquals(algorithm) &&
	 * !CHECKSUM_ALGORITHM_SHA512.contentEquals(algorithm)) ) return ret;
	 * 
	 * MessageDigest complete = MessageDigest.getInstance(algorithm); int
	 * fragmentLength = 1024; int fileLength = file.length;
	 * 
	 * for(int index = 0; index < fileLength; index+= fragmentLength){
	 * //complete.update(file, 0, file.length); }
	 * 
	 * ret = complete.digest();
	 * 
	 * return ret; }
	 */
	public static String getChecksum(byte[] file, String algorithm)
			throws Exception {
		String result = "";
		System.out.println("getCheckSum(b), file.length()=" + file.length);
		byte[] b = createChecksum(file, algorithm);
		System.out.println("getCheckSum(b), b.length()=" + b.length);

		for (int i = 0; i < b.length; i++) {
			result += Integer.toString((b[i] & 0xff) + 0x100, 16).substring(1);
			System.out.println("getCheckSum(b), result=" + result);
		}
		return result;
	}

	// check sum END

	private static void testunzip() {
		String unzipOutputFolder = "C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\temp\\ooms_unzip";
		String zipfullpath = "C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\temp\\ooms_archive.zip";
		unZip(zipfullpath, unzipOutputFolder);
	}

	public static boolean delete(File file) {
		boolean ret = false;
		if (null == file || !file.exists())
			return ret;
		// Check if file is directory/folder
		try {
			if (file.isDirectory()) {
				// Get all files in the folder
				File[] files = file.listFiles();

				for (int i = 0; i < files.length; i++) {
					// Delete each file in the folder
					delete(files[i]);
				}
				// Delete the folder
				ret = file.delete();
			} else {
				// Delete the file if it is not a folder
				ret = file.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}

	private static final int BYTE_SIZE = 1024;

	private static void testzipFileFullPath() {
		String path = "C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\temp";
		String unzipOutputFolder = "C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\temp\\unzip";
		String zipfullpath = "C:\\Users\\roychan\\workspace_ATG\\LCMerChantToolDemo\\temp\\temp.zip";
		File directory = new File(path);
		String[] files = directory.list();
		byte[] ret;
		try {
			ret = zipFileFullPaths(directory, files);
			if (null == ret) {
				System.out.println("null");
			} else {
				System.out.println("not null");
				if (writeBytes(ret, zipfullpath)) {
					System.out.println("writeBytes Success=");

					try {
						String checkSum = getChecksum(new File(zipfullpath),
								CHECKSUM_ALGORITHM_MD5);
						System.out.println("checkSum=" + checkSum);

						String checksum2 = getChecksum(ret,
								CHECKSUM_ALGORITHM_MD5);
						System.out.println("checksum2=" + checksum2);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					unZip(zipfullpath, unzipOutputFolder);
				} else {

					System.out.println("writeBytes FAIL");
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Compress the given directory with all its files.
	 */
	public static byte[] zipFileFullPaths(File directory, String[] files)
			throws IOException {
		byte[] ret = null;
		ByteArrayOutputStream baos = null;
		ZipOutputStream zos = null;
		try {
			baos = new ByteArrayOutputStream();
			zos = new ZipOutputStream(baos);
			byte bytes[] = new byte[BYTE_SIZE];

			for (String fileName : files) {
				FileInputStream fis = new FileInputStream(directory.getPath()
						+ File.separator + fileName);
				BufferedInputStream bis = new BufferedInputStream(fis);
				zos.putNextEntry(new ZipEntry(fileName));

				int bytesRead;
				while ((bytesRead = bis.read(bytes)) != -1) {
					zos.write(bytes, 0, bytesRead);
				}
				// zos.closeEntry();
				bis.close();
				fis.close();
			}

			zos.closeEntry();
			zos.flush();
			baos.flush();

			ret = baos.toByteArray();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != zos)
				zos.close();
			if (null != baos)
				baos.close();
		}

		return ret;
	}

	private static boolean writeBytes(byte[] bFile, String fileFullPath) {
		boolean ret = false;
		try {

			// convert array of bytes into file
			FileOutputStream fileOuputStream = new FileOutputStream(
					fileFullPath);
			fileOuputStream.write(bFile);
			fileOuputStream.close();

			System.out.println("write zip Done");
			ret = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ret;
	}

	/**
	 * Unzip
	 * 
	 * @param zipFileFullPath
	 *            input zip file
	 * @param output
	 *            zip file output folder
	 */
	public static boolean unZip(String zipFileFullPath, String outputFolder) {
		boolean ret = false;
		byte[] buffer = new byte[BYTE_SIZE];

		try {

			// create output directory is not exists
			File folder = new File(outputFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}

			// get the zip file content
			ZipInputStream zis = new ZipInputStream(new FileInputStream(
					zipFileFullPath));
			// get the zipped file list entry
			ZipEntry ze = zis.getNextEntry();

			while (ze != null) {

				String fileName = ze.getName();
				File newFile = new File(outputFolder + File.separator
						+ fileName);
				System.out.println("file unzip : " + newFile.getAbsoluteFile());

				// create all non exists folders
				// else you will hit FileNotFoundException for compressed folder
				new File(newFile.getParent()).mkdirs();

				FileOutputStream fos = new FileOutputStream(newFile);

				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}

				fos.close();
				ze = zis.getNextEntry();
			}

			zis.closeEntry();
			zis.close();

			System.out.println("unZip Done");
			ret = true;
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return ret;
	}

	private static void substring() {
		String test = "Ã¦Å Â½Ã¥Ë†Â°Ã¤Â½Â¢Ã¥Å“Â°Ã§Å“Å¸Ã¤Â¿â€šu";
		System.out.println("test=" + test);
		int limit = 3;
		List<String> ret = null;

		ret = new ArrayList<String>();
		String temp = "";
		int endindex = 0;
		for (int i = 0; i < test.length(); i += limit) {
			endindex = ((i + limit > test.length()) ? test.length() : i + limit);
			temp = test.substring(i, endindex);
			ret.add(temp);
			System.out.println("temp=" + temp);
		}
	}

	private static void testgetaddress() {
		String street1 = "1234567890";
		String street2 = "";
		String street3 = "";
		int index = 0;
		int charLimit = 15;
		for (int i = 0; i < 4; i++) {
			System.out.println("i=" + i);
			String ret = getAddress(
					new ArrayList(Arrays.asList(new String[] { street1,
							street2, street3 })), i, charLimit);

			System.out.println("ret=" + ret);

		}
	}

	private static String getAddress(List<String> list, int index, int charLimit) {
		return subString(combineStrings(list), index, charLimit);
	}

	/*
	 * private static String getAddress(List<String> list, int index, int
	 * charLimit){ String ret = null; if(null == list || list.size()<=0) return
	 * ret;
	 * 
	 * String concatenate = ""; for(String temp:list){ concatenate+=(null ==
	 * temp?"":temp); }
	 * 
	 * int start = index*charLimit; int end = index*charLimit+charLimit >
	 * concatenate.length() ? concatenate.length() : index*charLimit+charLimit;
	 * 
	 * ret = concatenate.substring(start, end);
	 * 
	 * return ret; }
	 */
	/**
	 * Combine list of string into one.<br>
	 * Note: null content would be replaced by empty string.
	 * 
	 * @param list
	 * @return
	 */
	public static String combineStrings(List<String> list) {
		String ret = null;
		if (null == list || list.size() <= 0)
			return ret;

		ret = "";
		for (String temp : list) {
			ret += (null == temp ? "" : temp);
		}

		return ret;
	}

	/**
	 * Substring with desire index and string-length-per-index
	 * 
	 * @param target
	 * @param index
	 * @param lengthPerString
	 * @return
	 */
	public static String subString(String target, int index, int strLenPerIndex) {
		String ret = null;
		if (index < 0 || strLenPerIndex <= 0)
			return ret;
		if (null == target || target.length() <= 0)
			return ret;

		int start = index * strLenPerIndex;
		int end = index * strLenPerIndex + strLenPerIndex > target.length() ? target
				.length() : index * strLenPerIndex + strLenPerIndex;
		if (start >= target.length())
			return ret;

		ret = target.substring(start, end);

		return ret;
	}

	private static void testEncoding() {
		/*
		 * if(fraudCheckContent.isEmpty()==false){ proc.setString(9, new
		 * String(fraudCheckContent.getBytes("ISO-8859-1"),"UTF-8")); }else{
		 * proc.setString(9, fraudCheckContent); }
		 */
		// String test =
		// "Ã¦Å Â½Ã¥Ë†Â°Ã¤Â½Â¢Ã¥Å“Â°Ã§Å“Å¸Ã¤Â¿â€šunluckyÃ¯Â¼Å’Ã§Å“Å¸Ã¤Â¿â€šÃ¦â€œÂºÃ¥â€¡ÂºÃ¥Å¡Å¸Ã¥ï¿½Ë†Ã¨â€šâ€°Ã©â€¦Â¸Ã¯Â¼Å’Ã¦Å½â€°Ã¥â€™â€”Ã¤Â½Â¢Ã¥Å“Â°Ã¥ï¿½Ë†Ã¦ÂµÂªÃ¨Â²Â»Ã¯Â¼Å’Ã¤Â½Â Ã¦â€¢â„¢Ã¦Ë†â€˜Ã©Â»Å¾Ã¨â„¢â€¢Ã§Â½Â®";
		String test = "Ã¦Å Â½Ã¥Ë†Â°Ã¤Â½Â¢Ã¥Å“Â°Ã§Å“Å¸Ã¤Â¿â€šu";
		System.out.println("test=" + test);
		System.out.println("test.length()=" + test.length());
		try {
			String iso = new String(test.getBytes("ISO-8859-1"));
			System.out.println("iso=" + iso);
			System.out.println("iso.length()=" + iso.length());
			String iso2utf = new String(iso.getBytes("UTF-8"));
			System.out.println("iso2utf=" + iso2utf);

			String utf8 = new String(test.getBytes("UTF-8"));
			System.out.println("utf8=" + utf8);
			String utf82iso = new String(utf8.getBytes("ISO-8859-1"));
			System.out.println("utf82iso=" + utf82iso);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * "productID=OWY447, ancestorCategories=[MenBlazers, MenClothing, MenJackets, MenSuitJackets, MenSuits, cat50016], startDate=2013-07-05 01:17:00.0, lcFacetColor1=Black, displayPrice=11300.0"
	 * , MenJackets,MenSuits,Black,OWY447 "productID=GIG328,
	 * ancestorCategories=[MenClothing, MenGiletsAndVests, MenJackets,
	 * MenSuitJackets, MenSuits, cat50016], startDate=2013-07-19 00:52:00.0,
	 * lcFacetColor1=Blue MenJackets,MenSuits,BlueandGreen,GIG328
	 * 
	 * MenJackets,Red,BXK823
	 * 
	 * collationKey =
	 * <MenCoats<MenJackets<MenJeans<MenKnitwear<MenPantsAndShorts
	 * <MenPolos<MenPulloversAndHoodies
	 * <MenShirts<MenSuits<MenSwimwear<MenTShirts
	 * <Red<White<Grey<NeutralandBrown<
	 * Black<Pink<Purple<BlueandGreen<YellowandOrange
	 * <Multicolour<Metallic<AnimalPrint<NONE
	 */
	private static void testCollation() {
		// String collationKey =
		// "<MenCoats<MenJackets<MenJeans<MenKnitwear<MenPantsAndShorts<MenPolos<MenPulloversAndHoodies<MenShirts<MenSuits<MenSwimwear<MenTShirts<Red<White<Grey<NeutralandBrown<Black<Pink<Purple<BlueandGreen<YellowandOrange<Multicolour<Metallic<AnimalPrint<NONE";
		// String collationKey =
		// "<MenCoats<MenJackets<MenJeans<MenKnitwear<MenPantsAndShorts<MenPolos<MenPulloversAndHoodies<MenShirts<MenSuits<MenSwimwear<MenTShirts;Red;White;Grey;NeutralandBrown;Black;Pink;Purple;BlueandGreen;YellowandOrange;Multicolour;Metallic;AnimalPrint;NONE";

		// String a = "MenJackets,Red,BXK823";
		// String b = "MenJackets,MenSuits,Black,OWY447";
		// String c = "MenJackets,MenSuits,BlueandGreen,GIG328";
		/*
		 * String a = "MenJackets,Red,BXK823"; String b =
		 * "MenJackets,Black,OWY447"; String c =
		 * "MenJackets,BlueandGreen,GIG328";
		 */
		/*
		 * String a = "MenJackets,Red"; String b = "MenJackets,Black"; String c
		 * = "MenJackets,BlueandGreen";
		 */

		String d = "catd000128,Black,100000010011110101000000000000000000000000000000000000000000000,EGO757";
		String e = "catd000128,Black,100000011010100011010010000000000000000000000000000000000000000,GGH856";
		String collationKeyde = "<catd000128<catd000120<Grey<Black<Multicolour";

		String f = "MenClothing,Grey,100000111011111111111111111100101000011000000000000000000000000,AIR969";
		String g = "MenClothing,Grey,100000111011111111111111010000101011111000000000000000000000000,ALL999";
		String collationKey = "<MenClothing<MenGiletsAndVests<MenCasualJackets<MenJackets<MenBlazers<Grey<Black<Multicolour";

		try {
			RuleBasedCollator keyde = new RuleBasedCollator(collationKeyde);
			RuleBasedCollator key = new RuleBasedCollator(collationKey);
			/*
			 * int result = key.compare(a, b);
			 * System.out.println("retsult a b = " + result); result =
			 * key.compare(a, c); System.out.println("retsult a c  = " +
			 * result); result = key.compare(b, c);
			 * System.out.println("retsult b c= " + result);
			 */

			System.out.println("EGO757 = " + d);
			System.out.println("GGH856 = " + e);
			keyde.setStrength(java.text.Collator.IDENTICAL);
			int result = keyde.compare(d, e);
			System.out.println("keyde.getRules() = " + keyde.getRules());
			System.out.println("keyde.getStrength() = " + keyde.getStrength());
			System.out.println("result d e= " + result);

			System.out.println("ALL999 = " + g);
			System.out.println("AIR969 = " + f);
			result = key.compare(g, f);
			System.out.println("key.getRules() = " + key.getRules());
			System.out.println("key.getStrength() = " + key.getStrength());
			System.out.println("result g f= " + result);

		} catch (ParseException parseException) {
			// TODO Auto-generated catch block
			parseException.printStackTrace();
		}
	}

	private static void merchandiseToolTest() {
		long start = System.currentTimeMillis();
		try {
			// String s_response = PostSortRequest(portContent);
			MerchToolSortRequest merchToolSortRequest = getMerchToolSortRequest();
			System.out.println("merchandiseToolTest() getSortLevel = "
					+ merchToolSortRequest.getSortLevel());
			System.out.println("merchandiseToolTest() getSubCategory = "
					+ merchToolSortRequest.getSubCategory());
			System.out.println("merchandiseToolTest() getColour = "
					+ merchToolSortRequest.getColour());
			System.out.println("merchandiseToolTest() getPricePoint = "
					+ merchToolSortRequest.getPricePoint());
			System.out.println("merchandiseToolTest() getNewestIn = "
					+ merchToolSortRequest.getNewestIn());

			String postcontentFromReq = convertPOJO2JSON(merchToolSortRequest);
			System.out.println("postcontentFromReq = " + postcontentFromReq);
			String s_response = PostSortRequest(postcontentFromReq);
			MerchToolSortResponse j_response = parseResponse(s_response);

			if (null != j_response)
				System.out.println("merchandiseToolTest() j_response = "
						+ j_response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("merchandiseToolTest() elapsedtime = "
					+ (System.currentTimeMillis() - start));
		}
	}

	private static final String USER_AGENT = "Mozilla/5.0";
	private static final String url = "http://192.168.42.129:8080/rest/bean/lc/rest/LCMerchandiseToolRest/sort";
	private static final String portContent = "{\"SearchMethod\": \"Category\","
			+ "\"TargetCategory_ID\":\"Grooming\","
			+ "\"PurgeCache\":false,\"Cache\":true,"
			+ "\"Region\":\"HK\","
			+ "\"SortLevel\": [\"SubCategory\",\"PricePoint\",\"NewestIn\"],"
			+ "\"Colour\": [\"Red\",\"White\",\"Grey\",\"Neutral and Brown\",\"Black\",\"Pink\",\"Purple\",\"Blue and Green\",\"Yellow and Orange\",\"Multi-colour\",\"Metallic\",\"Animal Print\"],"
			+ "\"SubCategory\": [\'MenFragrances\',\'MenFragrancesBathAndBody\',\'MenPerfumes\',\'MenSkincare\',\'MenFace\',\'MenSunCare\'],"
			+ "\"PricePoint\":\"HighToLow\","
			+ "\"NewestIn\": \"LowToHigh\","
			+ "\"CallerReferenceNo\":\"ROY_TEST_12\"," + "\"testMode\":true}";

	private static String PostSortRequest(String portContent) {
		HttpClient client = new DefaultHttpClient();
		HttpPost post = new HttpPost(url);
		String ret = "";
		try {
			List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>(1);
			nameValuePairs.add(new BasicNameValuePair("arg1", portContent));
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

	static private MerchToolSortRequest getMerchToolSortRequestOLD() {
		MerchToolSortRequest ret = new MerchToolSortRequest();
		ret.setTargetCategory_ID("MenClothing");
		ret.setSortLevel(new ArrayList<String>() {
			{
				add(SORT_PRI_SUBCATE);
				add(SORT_PRI_COLOUR);
				add(SORT_PRI_PRICE);
			}
		});

		ret.setColour(new ArrayList<String>() {
			{
				add("Grey");
				add("Black");
				add("Multicolour");
			}
		});

		// ret.setNewestIn(LVL_ASC);
		ret.setNewestIn(LVL_DESC);
		// ret.setPricePoint(LVL_ASC);
		ret.setPricePoint(LVL_DESC);
		// ret.setStockLevel(LVL_ASC);

		ret.setSubCategory(new ArrayList<String>() {
			{
				add("MenClothing");
				add("MenGiletsAndVests");
				add("MenCasualJackets");
				add("MenJackets");
				add("MenBlazers");
			}
		});

		ret.setTestMode(true);
		ret.setRegion("HK");
		ret.setSearchMethod("Category");
		ret.setCallerReferenceNo(String.valueOf(System.currentTimeMillis()));
		return ret;
	}

	static private MerchToolSortRequest getMerchToolSortRequest() {
		MerchToolSortRequest ret = new MerchToolSortRequest();
		ret.setTargetCategory_ID("catd000129");
		ret.setSortLevel(new ArrayList<String>() {
			{
				add(SORT_PRI_SUBCATE);
				add(SORT_PRI_COLOUR);
				add(SORT_PRI_PRICE);
				// add(SORT_PRI_NEWESTIN);
				// add(SORT_PRI_STOCK);
			}
		});

		ret.setColour(new ArrayList<String>() {
			{
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
			}
		});

		// ret.setNewestIn(LVL_ASC);
		ret.setNewestIn(LVL_DESC);
		// ret.setPricePoint(LVL_ASC);
		ret.setPricePoint(LVL_DESC);
		// ret.setStockLevel(LVL_ASC);
		// catd000128","catd000120","catd000116","catd000110","catd000104","catd000098","catd000090","catd000082","catd010020","catd010010
		ret.setSubCategory(new ArrayList<String>() {
			{
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
			}
		});

		ret.setTestMode(true);
		ret.setRegion("HK");
		ret.setSearchMethod("Category");
		ret.setCallerReferenceNo(String.valueOf(System.currentTimeMillis()));
		ret.setCache(true);
		return ret;
	}

	private static String createJSONRequest() {
		MerchToolSortRequest merchToolSortRequest = getMerchToolSortRequest();
		return convertPOJO2JSON(merchToolSortRequest);

	}

	private static String createJSONResponse() {
		return null;

	}

	/*
	 * public static MerchToolSortRequest parseRequest(String input) throws
	 * JsonSyntaxException{ if(null == input) return null; Gson gson = new
	 * Gson(); return gson.fromJson(input, MerchToolSortRequest.class); }
	 */
	public static String convertPOJO2JSON(Object input) {
		Gson gson = new Gson();
		return gson.toJson(input);
	}

	public static <T> T convertJson2Pojo(String input, Class<T> classOfT) {
		Gson gson = new Gson();
		return gson.fromJson(input, classOfT);
	}
	
	public static MerchToolSortResponse parseResponse(String input)
			throws JsonSyntaxException {
		if (null == input)
			return null;
		Gson gson = new Gson();
		return gson.fromJson(input, MerchToolSortResponse.class);
	}

	private static void testObject2JSON(MerchToolSortRequest object) {
		// MerchToolSortRequest object = getMerchToolSortRequest();
		String test = convertMerTool2JSON(object);
		System.out.println("test = " + test);
	}

	public static String convertMerTool2JSON(Object input) {
		Gson gson = new Gson();
		return gson.toJson(input);
	}

	private static void testListMap() {

		MerchToolSortRequest test = getMerchToolSortRequest();
		tsetCache(test.getCacheKey());
		MerchToolSortRequest test2 = getMerchToolSortRequest();
		tsetCache(test2.getCacheKey());
		MerchToolSortRequest test3 = getMerchToolSortRequest();

		List<MerchToolSortRequest> testList = new ArrayList<MerchToolSortRequest>();
		testList.add(test);
		testList.add(test2);
		testList.add(test3);

		List<String> NewestIn_list = new ArrayList<String>();
		for (MerchToolSortRequest temp : testList) {
			if (temp.getNewestIn() != null)
				NewestIn_list.add(temp.getNewestIn());
		}

		System.out.println("testList() test = " + test);
		System.out.println("testList() test2 = " + test2);
		System.out.println("testList() test3 = " + test3);
		System.out.println("testList() NewestIn_list = " + NewestIn_list);

		LinkedHashMap<String, MerchToolSortRequest> map = new LinkedHashMap<String, MerchToolSortRequest>();
		map.put("test1", test);
		map.put("test2", test2);
		map.put("test3", test3);

		System.out.println("testList() map.size() = " + map.size());

		for (Map.Entry entry : map.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("val: " + entry.getValue());
		}

		List<MerchToolSortRequest> mapValue = Lists.newArrayList(map.values());

		System.out.println("testList() mapValue.size() = " + mapValue.size());
		for (MerchToolSortRequest temp : mapValue) {

			System.out.println("testList() temp = " + temp);
		}
	}

	public static void testObjectKey() {
		MerchToolSortRequest test = getMerchToolSortRequest();
		tsetCache(test.getCacheKey());
		MerchToolSortRequest test2 = getMerchToolSortRequest();
		tsetCache(test2.getCacheKey());
		MerchToolSortRequest test3 = getMerchToolSortRequest();
		tsetCache(test3.getCacheKey());
		tsetCache(test.getCacheKey());
	}

	/*
	 * public static void testCacheEviction(){ String test1 = "test1"; String
	 * test2 = "test2"; String test3 = "test3"; String test4 = "test4";
	 * tsetCache(test1); tsetCache(test2); tsetCache(test3); tsetCache(test1);
	 * tsetCache(test1); tsetCache(test1); tsetCache(test4); tsetCache(test1); }
	 */
	public static void tsetCache(String key) {
		System.out.println("tsetCache() key = " + key);
		List<String> ret = getProductIDList(key);
		System.out.println("tsetCache() ret = " + ret + "\n");
	}

	/* *******************
	 * CACHE********************
	 */
	static LoadingCache<String, List<String>> productIdCache = CacheBuilder
			.newBuilder().maximumSize(3)
			.build(new CacheLoader<String, List<String>>() {
				public List<String> load(String key) {
					System.out.println("load() key = " + key.toString());
					return createStringlisttemp(key);
				}
			});

	public LoadingCache<String, List<String>> getProductIdCache() {
		return productIdCache;
	}

	public void invalidateProductIdCache() {
		productIdCache.invalidateAll();
	}

	public static List<String> getProductIDList(String key) {
		System.out.println("getProductIDList() key = " + key);
		if (null == key)
			return Lists.newArrayList();
		try {
			List<String> ret = productIdCache.get(key);
			System.out.println("getProductIDList() success " + ", key = " + key
					+ ", ret = " + ret);
			return ret;
		} catch (ExecutionException e) {
			System.out.println("error happen getting Product ID list of Key = "
					+ key);

			return Lists.newArrayList();
		}
	}

	private static List<String> createStringlisttemp(String key) {
		List<String> ret = null;
		System.out.println("tempcreateStringlist() key = " + key);
		/*
		 * DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
		 * DynamoHttpServletResponse pResponse =
		 * ServletUtil.getCurrentResponse(); if (null != pRequest)
		 * System.out.println("tempcreateStringlist() pRequest = " + pRequest);
		 * if (null != pResponse)
		 * System.out.println("tempcreateStringlist() pResponse = " +
		 * pResponse);
		 */
		ret = new ArrayList<String>();
		ret.add(key + String.valueOf(System.currentTimeMillis()));
		ret.add(key + String.valueOf(System.currentTimeMillis()));
		ret.add(key + String.valueOf(System.currentTimeMillis()));

		return ret;
	}

	private static void testUUID() {
		MerchToolSortRequest test = getMerchToolSortRequest();
		UUID idOne = UUID.randomUUID();
		UUID idTwo = UUID.randomUUID();

		System.out.println("UUID One: " + idOne);
		System.out.println("UUID Two: " + idTwo);
		System.out.println(" MerchToolSortRequest: " + test.toString());
		System.out.println(" MerchToolSortRequest: trimForUUID = "
				+ trimForUUID(test.toString()));
		// UUID id3 = UUID.fromString(trimForUUID(test.toString()));
		// System.out.println("UUID MerchToolSortRequest: " + id3);
		/*
		 * UUID id4 = UUID.fromString(test.toString()); UUID id5 =
		 * UUID.fromString(test.toString()); UUID id6 =
		 * UUID.fromString(test.toString()); UUID id7 =
		 * UUID.fromString(test.toString()); UUID id8 =
		 * UUID.fromString(test.toString());
		 * System.out.println("UUID MerchToolSortRequest: " + id4);
		 * System.out.println("UUID MerchToolSortRequest: " + id5);
		 * System.out.println("UUID MerchToolSortRequest: " + id6);
		 * System.out.println("UUID MerchToolSortRequest: " + id7);
		 * System.out.println("UUID MerchToolSortRequest: " + id8);
		 */
	}

	public static String trimForUUID(String input) {
		String ret = null;
		if (null == input)
			return ret;
		ret = removeSpecialCharacter(input, "-", "");
		ret = removeSpecialCharacter(ret, " ", "");
		ret = removeSpecialCharacter(ret, "[", "");
		ret = removeSpecialCharacter(ret, "]", "");
		ret = removeSpecialCharacter(ret, ",", "");
		ret = removeSpecialCharacter(ret, "=", "");
		return ret;
	}

	/*
	 * private static void testreqsearchbooleanfunction(){ MerchToolSortRequest
	 * test = getMerchToolSortRequest();
	 * System.out.println("isOneDimensionSort = "+test.isOneDimensionSort());
	 * System.out.println("isSortbyNewestIn = "+test.isSortbyNewestIn());
	 * System.out.println("isSortbyPricePoint = "+test.isSortbyPricePoint()); }
	 */
	private static void testintcomparable() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(1);
		Collections.sort(list, new MyIntComparable());
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}

	private static void testByte() {
		System.out.println("testByte");
		byte test = 0;
		for (int i = 100; i <= 200; i++) {
			System.out.println("i = " + i);
		}
	}

	private static void testFloat() {
		double test = 1.0;
	}

	// **********************
	// Sorting Merchant Tool*
	// **********************
	private static List<ProductSortContent> sortbyColour(Collator collator,
			List<ProductSortContent> models) {
		ProductSortContent tmp;

		for (int i = 0; i < models.size(); i++) {
			for (int j = i + 1; j < models.size(); j++) {
				// Compare elements of the words array
				if (collator.compare(models.get(i).getLcFacetColor1(), models
						.get(j).getLcFacetColor1()) > 0) {
					tmp = models.get(i);
					models.set(i, models.get(j));
					models.set(j, tmp);
				}
			}
		}
		return models;
	}

	private static List<ProductSortContent> sortbySubCate(Collator collator,
			List<ProductSortContent> models) {
		ProductSortContent tmp;

		for (int i = 0; i < models.size(); i++) {
			for (int j = i + 1; j < models.size(); j++) {
				// Compare elements of the words array
				if (collator.compare(models.get(i).getAncestorCategories()
						.toString(), models.get(j).getAncestorCategories()
						.toString()) > 0) {
					// if(
					// collator.compare(models.get(i).getStr_ancestorCategories(),
					// models.get(j).getStr_ancestorCategories() ) > 0 ) {
					tmp = models.get(i);
					models.set(i, models.get(j));
					models.set(j, tmp);
				}
			}
		}
		return models;
	}

	private static List<ProductSortContent> sortbyPrice(boolean order,
			List<ProductSortContent> models) {
		ProductSortContent tmp;

		for (int i = 0; i < models.size(); i++) {
			for (int j = i + 1; j < models.size(); j++) {
				// Compare elements of the words array
				if (order) {
					if (models.get(i).getDisplayPrice() > models.get(j)
							.getDisplayPrice()) {
						tmp = models.get(i);
						models.set(i, models.get(j));
						models.set(j, tmp);
					}
				} else {
					if (models.get(i).getDisplayPrice() < models.get(j)
							.getDisplayPrice()) {
						tmp = models.get(i);
						models.set(i, models.get(j));
						models.set(j, tmp);
					}
				}
			}
		}
		return models;
	}

	private static List<ProductSortContent> sortbyNewestIn(boolean order,
			List<ProductSortContent> models) {
		ProductSortContent tmp;

		for (int i = 0; i < models.size(); i++) {
			for (int j = i + 1; j < models.size(); j++) {
				// Compare elements of the words array
				if (order) {
					if (models.get(i).getStartDate().getNanos() > models.get(j)
							.getStartDate().getNanos()) {
						tmp = models.get(i);
						models.set(i, models.get(j));
						models.set(j, tmp);
					}
				} else {
					if (models.get(i).getStartDate().getNanos() < models.get(j)
							.getStartDate().getNanos()) {
						tmp = models.get(i);
						models.set(i, models.get(j));
						models.set(j, tmp);
					}
				}
			}
		}
		return models;
	}

	private static LinkedHashMap<String, List<ProductSortContent>> sortbyColourAsMap(
			List<ProductSortContent> models, List<String> keys) {
		LinkedHashMap<String, List<ProductSortContent>> ret = null;
		if (null == models || models.size() <= 0 || null == keys
				|| keys.size() <= 0)
			return ret;

		// get key
		RuleBasedCollator collator = null;
		try {
			collator = getCollator(getKey(keys));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (null == collator)
			return ret;

		// Sort Colour by collation key
		models = sortbyColour(collator, models);

		// fill the sorted model into a map with colour as key
		ret = new LinkedHashMap<String, List<ProductSortContent>>();
		for (String key : keys) {
			if (null == key)
				continue;

			List<ProductSortContent> temp = new ArrayList<ProductSortContent>();

			for (ProductSortContent model : models) {
				if (null == model)
					continue;

				if (key.contentEquals(model.getLcFacetColor1())) {
					temp.add(model);
				}
			}

			ret.put(key, temp);
		}

		return ret;
	}

	private static LinkedHashMap<String, List<ProductSortContent>> sortbySubCateAsMap(
			List<ProductSortContent> models, List<String> keys) {
		LinkedHashMap<String, List<ProductSortContent>> ret = null;
		if (null == models || models.size() <= 0 || null == keys
				|| keys.size() <= 0)
			return ret;

		// get key
		RuleBasedCollator collator = null;
		try {
			collator = getCollator(getKey(keys));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (null == collator)
			return ret;

		// Sort Colour by collation key
		models = sortbySubCate(collator, models);

		// fill the sorted model into a map with Subcate as key
		ret = new LinkedHashMap<String, List<ProductSortContent>>();
		for (String key : keys) {
			if (null == key)
				continue;
			List<ProductSortContent> temp = new ArrayList<ProductSortContent>();

			for (int i = 0; i < models.size(); i++) {
				ProductSortContent model = models.get(i);
				if (null == model)
					continue;

				if (model.getAncestorCategories().toString().contains(key)) {
					temp.add(models.remove(i));
				}
			}

			ret.put(key, temp);
		}

		return ret;
	}

	private static void printProductSortContentMap(
			LinkedHashMap<String, List<ProductSortContent>> map) {
		if (null == map)
			return;
		for (Map.Entry entry : map.entrySet()) {
			List<ProductSortContent> models = (List<ProductSortContent>) entry
					.getValue();
			if (null == models)
				continue;
			for (int i = 0; i < models.size(); i++)
				System.out.println("key,val: " + entry.getKey() + ","
						+ models.get(i).toString());
		}
	}

	private static void printProductSortContents(List<ProductSortContent> models) {
		for (int i = 0; i < models.size(); i++)
			System.out.println(models.get(i).toString());
	}

	private static void printProductSortContentsProductKey(
			List<ProductSortContent> models) {
		for (int i = 0; i < models.size(); i++)
			System.out.println(models.get(i).getProductKey());
	}

	/*
	 * private static void printProductSortContent_Str(List<ProductSortContent>
	 * models) { for (int i = 0; i < models.size(); i++)
	 * System.out.println(models.get(i).getStr_ancestorCategories()); }
	 */
	private static void printProductSortContentsAC(
			List<ProductSortContent> models) {
		for (int i = 0; i < models.size(); i++)
			System.out
					.println(models.get(i).getAncestorCategories().toString());
	}

	private static void printStringList(List<String> strings) {
		if (null != strings) {
			for (String s : strings)
				System.out.println(s);
		}
	}

	static private String sortSubCateAsKey(MerchToolSortRequest req,
			ProductSortContent content) {
		String ret = null;
		// System.out.println("START sortSubCateAsKey");
		if (null == req || null == content)
			return ret;
		// List<String> subCates = content.getAncestorCategories();
		List<String> subCates = new ArrayList<String>(
				content.getAncestorCategories());
		if (null == subCates || subCates.size() <= 0)
			return ret;
		// System.out.println("sortSubCateAsKey , subCates ="+subCates.toString());
		List<String> lvls = req.getSubCategory();
		if (null == lvls || lvls.size() <= 0)
			return ret;
		// System.out.println("sortSubCateAsKey , lvls ="+lvls.toString());

		for (String lvl : lvls) {
			if (null == lvl)
				continue;
			for (int i = 0; i < subCates.size(); i++) {
				String subCate = subCates.get(i);
				if (lvl.contentEquals(subCate)) {
					// System.out.println("lvl = "+ lvl+
					// ", subCate = "+subCate);
					/*
					 * if(null==ret){ ret = subCates.remove(i); }else{ // ret +=
					 * subCates.remove(i); ret += ","+subCates.remove(i); }
					 */
					ret = subCate;
					return ret;
				}
			}
		}
		// System.out.println(" END sortSubCateAsKey"+ ", ret = "+ret);
		return ret;
	}

	static private String sortSubCateAsKey(MerchToolSortRequest req,
			ProductSortContent content, HashMap<String, String> collationMap) {
		String ret = null;
		// System.out.println("START sortSubCateAsKey");
		if (null == req || null == content)
			return ret;
		if (null == collationMap || collationMap.size() <= 0)
			return ret;
		List<String> subCates = content.getAncestorCategories();
		if (null == subCates || subCates.size() <= 0)
			return ret;
		// System.out.println("sortSubCateAsKey , subCates ="+subCates.toString());
		List<String> lvls = req.getSubCategory();
		if (null == lvls || lvls.size() <= 0)
			return ret;
		// System.out.println("sortSubCateAsKey , lvls ="+lvls.toString());

		for (String lvl : lvls) {
			if (null == lvl)
				continue;
			for (int i = 0; i < subCates.size(); i++) {
				String subCate = subCates.get(i);
				if (lvl.contentEquals(subCate)) {
					// System.out.println("lvl = "+ lvl+
					// ", subCate = "+subCate);
					if (null == ret) {
						ret = collationMap.get(subCates.remove(i));
					} else {
						// ret += subCates.remove(i);
						ret += "," + collationMap.get(subCates.remove(i));
					}
					break;
				}
			}
		}
		// System.out.println(" END sortSubCateAsKey"+ ", ret = "+ret);
		return ret;
	}

	static final private int SORT_LVL_LIMIT = 4;
	static final private Double DOUBLE_MAX = 2147483648.0;
	static final private Long LONG_MAX = Long.MAX_VALUE;

	// static private LinkedHashMap<String,String>
	// generateProductKey(MerchToolSortRequest req, List<ProductSortContent>
	// contents){
	// LinkedHashMap<String,String> ret = null;

	static private List<ProductSortContent> generateProductKey(
			MerchToolSortRequest req, List<ProductSortContent> contents) {
		List<ProductSortContent> ret = null;
		if (null == req || null == contents || contents.size() <= 0)
			return ret;
		List<String> sortLvl = req.getSortLevel();
		if (null == sortLvl || sortLvl.size() <= 0
				|| sortLvl.size() > SORT_LVL_LIMIT)
			return ret;

		ret = new ArrayList<ProductSortContent>();

		for (int j = 0; j < contents.size(); j++) {
			ProductSortContent content = contents.get(j);
			if (null == content) {
				System.out.println("generateProductKey()"
						+ ", contents is NULL ");
				continue;
			}
			// System.out.println("content = "+content);

			String key = "";
			for (int i = 0; i < sortLvl.size(); i++) {
				if (key.length() != 0)
					key += ",";
				String lvl = sortLvl.get(i);
				// loop from the Product Content list
				if (null == content)
					continue;
				// System.out.println("lvl = "+lvl);

				// check each sort lvl potion
				if (SORT_PRI_COLOUR.contentEquals(lvl)) {
					// locate the related key
					key += trimForCollation(content.getLcFacetColor1());
					// System.out.println("SORT_PRI_COLOUR key = "+key);
				} else if (SORT_PRI_SUBCATE.contentEquals(lvl)) {
					// key =
					// trimForCollation(content.getAncestorCategories().toString());
					key += sortSubCateAsKey(req, content);
					// System.out.println("SORT_PRI_SUBCATE key = "+key);
				} else if (SORT_PRI_NEWESTIN.contentEquals(lvl)) {
					if (LVL_ASC.contentEquals(req.getNewestIn())) {// ASC
						key += Long.toBinaryString(content.getStartDate()
								.getTime());
					} else {// DESC
						key += Long.toBinaryString(LONG_MAX
								- content.getStartDate().getTime());
					}
				} else if (SORT_PRI_PRICE.contentEquals(lvl)) {
					if (LVL_ASC.contentEquals(req.getPricePoint())) {// ASC
						key += Long
								.toBinaryString(Double
										.doubleToRawLongBits(content
												.getDisplayPrice()));
					} else {// DESC
						key += Long.toBinaryString(Double
								.doubleToRawLongBits(DOUBLE_MAX
										- content.getDisplayPrice()));
					}
				}
				// else if(SORT_PRI_STOCK.contentEquals(lvl)){}
				else {
					continue;
				}

			}
			// System.out.println("key = "+key);
			key += "," + content.getProductID();

			content.setProductKey(key);
			ret.add(content);
		}
		return ret;
	}

	private static final String COLATION_COMPONENT_COLOUR_PREFIX = "C";// C for
																		// colour?
	private static final String COLATION_COMPONENT_SUBCATEGORY_PREFIX = "G";// G
																			// for
																			// Genre?

	/**
	 * Generate a Collation component map , for the product content list and
	 * collation key creation.<br>
	 * which could replace the related lengthy ID/Name to increasing the sorting
	 * efficiency.
	 * 
	 * @param req
	 * @return
	 */
	private static HashMap<String, String> generateCollationComponentMap(
			MerchToolSortRequest req) {
		HashMap<String, String> ret = null;
		if (null == req)
			return ret;
		List<String> colours = req.getColour();
		List<String> subCategories = req.getSubCategory();
		if (null == colours || colours.size() <= 0 || null == subCategories
				|| subCategories.size() <= 0)
			return ret;

		// count number of variation, includes
		ret = new HashMap<String, String>();
		int count = colours.size() + subCategories.size();

		HashMap<String, String> colourMap = new HashMap<String, String>();
		HashMap<String, String> subCategoryMap = new HashMap<String, String>();

		for (int i = 0; i < colours.size(); i++) {
			String colour = colours.get(i);
			colourMap.put(colour,
					COLATION_COMPONENT_COLOUR_PREFIX + Integer.valueOf(i));
		}
		for (int i = 0; i < subCategories.size(); i++) {
			String subCategorie = subCategories.get(i);
			colourMap.put(subCategorie, COLATION_COMPONENT_SUBCATEGORY_PREFIX
					+ Integer.valueOf(i));
		}

		ret.putAll(colourMap);
		ret.putAll(subCategoryMap);

		return ret;
	}

	/**
	 * Generate a ProductKey string for Callation sorting,<br>
	 * which such String includes the product information, <br>
	 * organized following the order of input component:
	 * "MerchToolSortRequest.sortingPriorityLevel"
	 */
	static private List<String> generateProductKeyNEW(MerchToolSortRequest req,
			List<ProductSortContent> contents,
			HashMap<String, String> collationMap) {
		List<String> ret = null;
		if (null == req || null == contents || contents.size() <= 0)
			return ret;
		if (null == collationMap || collationMap.size() <= 0)
			return ret;
		List<String> sortLvl = req.getSortLevel();
		List<String> subCateSortLvl = req.getSortLevel();
		if (null == sortLvl || sortLvl.size() <= 0
				|| sortLvl.size() > SORT_LVL_LIMIT)
			return ret;
		System.out.println("generateProductKeyNEW" + ", req = " + req
				+ ", contents = " + contents);

		ret = new ArrayList<String>();
		// loop from the Product Content list
		for (int j = 0; j < contents.size(); j++) {
			ProductSortContent content = contents.get(j);
			if (null == content) {
				System.out.println("generateProductKeyNEW" + "content is NULL "
						+ ret);
				continue;
			}
			String field = "";

			for (int i = 0; i < sortLvl.size(); i++) {
				if (field.length() != 0)
					field += ",";
				String lvl = sortLvl.get(i);
				// check each sort lvl potion
				if (SORT_PRI_COLOUR.contentEquals(lvl)) {
					// locate the related field
					// field += trimForCollation(content.getLcFacetColor1());
					field += collationMap.get(content.getLcFacetColor1());
				} else if (SORT_PRI_SUBCATE.contentEquals(lvl)) {
					// field =
					// trimForCollation(content.getAncestorCategories().toString());
					// field += sortSubCateAsKey(req,content);
					field += sortSubCateAsKey(req, content, collationMap);
				} else if (SORT_PRI_NEWESTIN.contentEquals(lvl)) {
					if (LVL_ASC.contentEquals(req.getNewestIn())) {// ASC
						field += Long.toBinaryString(content.getStartDate()
								.getTime());
					} else {// DESC
						field += Long.toBinaryString(LONG_MAX
								- content.getStartDate().getTime());
					}
				} else if (SORT_PRI_PRICE.contentEquals(lvl)) {
					if (LVL_ASC.contentEquals(req.getPricePoint())) {// ASC
						field += Long
								.toBinaryString(Double
										.doubleToRawLongBits(content
												.getDisplayPrice()));
					} else {// DESC
						field += Long.toBinaryString(Double
								.doubleToRawLongBits(DOUBLE_MAX
										- content.getDisplayPrice()));
					}
				}
				// else if(SORT_PRI_STOCK.contentEquals(lvl)){}
				else {
					continue;
				}

			}
			field += "," + content.getProductID();
			ret.add(field);
		}

		return ret;
	}

	static final private String COLLATION_SYMBOL = "<";
	static final private int COLLATION_LVL_LIMIT = 2;

	/**
	 * Generate Collation Key base on the
	 * component:MerchToolSortRequest.sortingPriorityLevel<br>
	 * including the co-responding field SORT_PRI_COLOUR and SORT_PRI_SUBCATE,
	 * which has a list of priority level
	 * 
	 * @param req
	 * @return
	 */
	static private RuleBasedCollator generateCollationKeyOLD(
			MerchToolSortRequest req) {
		RuleBasedCollator ret = null;
		if (null == req)
			return ret;
		List<String> sortLvl = req.getSortLevel();
		if (null == sortLvl || sortLvl.size() <= 0
				|| sortLvl.size() > SORT_LVL_LIMIT)
			return ret;

		String str_Collation = "";
		int keyLvl = 1;
		List<String> colours = req.getColour();
		List<String> subCates = req.getSubCategory();

		for (int i = 0; i < sortLvl.size(); i++) {
			if (keyLvl > COLLATION_LVL_LIMIT)
				break;

			String lvl = sortLvl.get(i);
			if (SORT_PRI_COLOUR.contentEquals(lvl)) {
				if (null == colours || colours.size() <= 0)
					continue;
				for (String colour : colours) {
					str_Collation += COLLATION_SYMBOL
							+ trimForCollation(colour);
				}

				keyLvl++;
			} else if (SORT_PRI_SUBCATE.contentEquals(lvl)) {
				if (null == subCates || subCates.size() <= 0)
					continue;
				for (String subCate : subCates) {
					str_Collation += COLLATION_SYMBOL
							+ trimForCollation(subCate);
				}

				keyLvl++;
			} else {
				continue;
			}
		}

		System.out.println("str_Collation=" + str_Collation);

		try {
			if (null == str_Collation || str_Collation.length() == 0) {
				ret = new RuleBasedCollator(" ");
			} else {
				ret = new RuleBasedCollator(str_Collation);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret;
	}

	/**
	 * Generate Collation Key base on the
	 * component:MerchToolSortRequest.sortingPriorityLevel<br>
	 * including the co-responding field SORT_PRI_COLOUR and SORT_PRI_SUBCATE,
	 * which has a list of priority level
	 * 
	 * @param req
	 * @return
	 */
	static private RuleBasedCollator generateCollationKey(
			MerchToolSortRequest req, HashMap<String, String> collationMap) {
		RuleBasedCollator ret = null;
		if (null == req)
			return ret;
		if (null == collationMap || collationMap.size() <= 0)
			return ret;
		List<String> sortLvl = req.getSortLevel();
		if (null == sortLvl || sortLvl.size() <= 0
				|| sortLvl.size() > SORT_LVL_LIMIT)
			return ret;

		String str_Collation = "";
		int keyLvl = 1;
		List<String> colours = req.getColour();
		List<String> subCates = req.getSubCategory();

		for (int i = 0; i < sortLvl.size(); i++) {
			if (keyLvl > COLLATION_LVL_LIMIT)
				break;

			String lvl = sortLvl.get(i);
			if (SORT_PRI_COLOUR.contentEquals(lvl)) {
				if (null == colours || colours.size() <= 0)
					continue;
				for (String colour : colours) {
					// str_Collation += COLLATION_SYMBOL +
					// trimForCollation(colour);
					str_Collation += COLLATION_SYMBOL
							+ collationMap.get(colour);
				}

				keyLvl++;
			} else if (SORT_PRI_SUBCATE.contentEquals(lvl)) {
				if (null == subCates || subCates.size() <= 0)
					continue;
				for (String subCate : subCates) {
					// str_Collation += COLLATION_SYMBOL +
					// trimForCollation(subCate);
					str_Collation += COLLATION_SYMBOL
							+ collationMap.get(subCate);
				}

				keyLvl++;
			} else {
				continue;
			}
		}

		System.out.println("str_Collation=" + str_Collation);

		try {
			if (null == str_Collation || str_Collation.length() == 0) {
				ret = new RuleBasedCollator(" ");
			} else {
				ret = new RuleBasedCollator(str_Collation);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ret;
	}

	static private List<String> sortCollation(RuleBasedCollator collationKey,
			List<String> productKeys) {
		List<String> ret = null;
		if (null == collationKey || null == productKeys
				|| productKeys.size() <= 0)
			return ret;
		int counter = 0;
		String temp;
		for (int i = 0; i < productKeys.size(); i++) {
			for (int j = i + 1; j < productKeys.size(); j++) {
				counter++;
				// Compare elements of the Key array
				if (collationKey
						.compare(productKeys.get(i), productKeys.get(j)) > 0) {
					temp = productKeys.get(i);
					productKeys.set(i, productKeys.get(j));
					productKeys.set(j, temp);
				}
			}
		}

		// ret = productKeys;

		ret = new ArrayList<String>();
		for (String s : productKeys) {
			int beginIndex = s.length() - 6;
			int endIndex = s.length();
			ret.add(s.substring(beginIndex, endIndex));
		}

		System.out.println("counter = " + counter);
		return ret;
	}

	static private List<ProductSortContent> comparatorSortCollation(
			RuleBasedCollator collationKey, List<ProductSortContent> productKeys) {
		List<ProductSortContent> ret = null;
		if (null == collationKey || null == productKeys
				|| productKeys.size() <= 0)
			return ret;

		Collections
				.sort(productKeys, new ProductStringComparable(collationKey));
		return productKeys;
	}

	static private List<String> quickSortCollation(
			RuleBasedCollator collationKey, List<String> productKeys) {
		List<String> ret = null;
		if (null == collationKey || null == productKeys
				|| productKeys.size() <= 0)
			return ret;

		Quicksort sorter = new Quicksort();
		ret = sorter.sort(productKeys, collationKey);

		// ret = productKeys;

		ret = new ArrayList<String>();
		for (String s : productKeys) {
			int beginIndex = s.length() - 6;
			int endIndex = s.length();
			ret.add(s.substring(beginIndex, endIndex));
		}

		return ret;
	}

	static private List<String> mergeSortCollation(
			RuleBasedCollator collationKey, List<String> productKeys) {
		List<String> ret = null;
		if (null == collationKey || null == productKeys
				|| productKeys.size() <= 0)
			return ret;

		Mergesort sorter = new Mergesort();
		ret = sorter.sort(productKeys, collationKey);

		// ret = productKeys;

		ret = new ArrayList<String>();
		for (String s : productKeys) {
			int beginIndex = s.length() - 6;
			int endIndex = s.length();
			ret.add(s.substring(beginIndex, endIndex));
		}

		return ret;
	}

	static private List<String> insertionSort(RuleBasedCollator collationKey,
			List<String> productKeys) {
		List<String> ret = null;
		if (null == collationKey || null == productKeys
				|| productKeys.size() <= 0)
			return ret;
		int counter = 0;
		for (int i = 1; i < productKeys.size(); i++) {
			int j = i;
			String toInsert = productKeys.get(i);
			while ((j > 0)
					&& (collationKey.compare(productKeys.get(j - 1), toInsert) > 0)) {
				counter++;
				productKeys.set(j, productKeys.get(j - 1));
				j--;
			}
			productKeys.set(j, toInsert);

		}

		// ret = productKeys;

		ret = new ArrayList<String>();
		for (String s : productKeys) {
			int beginIndex = s.length() - 6;
			int endIndex = s.length();
			ret.add(s.substring(beginIndex, endIndex));
		}

		System.out.println("counter = " + counter);
		return ret;
	}

	static private List<String> testProductSort() {
		List<String> productId = null;
		try {
			// gather intel
			MerchToolSortRequest merchToolSortRequest = getMerchToolSortRequestOLD();
			// RuleBasedCollator collator =
			// getCollator(getKey(merchToolSortRequest.getColour()));
			// RuleBasedCollator subCatecollator =
			// getCollator(getKey(merchToolSortRequest.getSubCategory()));
			List<ProductSortContent> productSortContents = getSampleProduct();

			System.out.println("Before");
			printProductSortContents(productSortContents);

			// generate the colation map
			// HashMap<String,String> collationMap =
			// generateCollationComponentMap(merchToolSortRequest);

			// generate every inidividual product key
			// LinkedHashMap<String,String> productKeys =
			// generateProductKey(merchToolSortRequest, productSortContents);
			// List<String> productKeysNew =
			// generateProductKeyNEW(merchToolSortRequest, productSortContents,
			// collationMap);
			productSortContents = generateProductKey(merchToolSortRequest,
					productSortContents);
			// LinkedHashMap<String, String> productKeysMap =
			// generateProductKeyMap(merchToolSortRequest, productSortContents);

			System.out.println("generateProductKey ");
			printProductSortContentsProductKey(productSortContents);
			// printStringList(productKeysNew);
			// generate combine key
			RuleBasedCollator collationKey = generateCollationKeyOLD(merchToolSortRequest);
			// RuleBasedCollator collationKey =
			// generateCollationKey(merchToolSortRequest, collationMap);

			// sort the combined key
			// List<String> ret = sortCollation(collationKey,productKeysNew);
			// List<String> ret = insertionSort(collationKey,productKeysNew);
			// List<String> ret =
			// quickSortCollation(collationKey,productKeysNew);//best avg
			// efficient
			// List<String> ret =
			// mergeSortCollation(collationKey,productKeysNew);
			// List<String> ret =
			// comparatorSortCollation(collationKey,productKeysNew);
			productSortContents = comparatorSortCollation(collationKey,
					productSortContents);

			System.out.println("AFTER Sort");
			// printStringList(ret);
			printProductSortContents(productSortContents);

			// Sort by Colour , single sorting
			/*
			 * System.out.println("Before");
			 * printProductSortContents(productSortContents);
			 * sortbyColour(collator,productSortContents);
			 * System.out.println("After");
			 * System.out.println("colourRule = "+getKey
			 * (merchToolSortRequest.getColour()));
			 * printProductSortContents(productSortContents);
			 */
			// Sort by Colour as map
			/*
			 * System.out.println("After");
			 * System.out.println("colourRule = "+getKey
			 * (merchToolSortRequest.getColour()));
			 * LinkedHashMap<String,List<ProductSortContent>> map =
			 * sortbyColourAsMap
			 * (productSortContents,merchToolSortRequest.getColour());
			 * printProductSortContentMap(map);
			 */

			// Sort by subCate ,single sorting
			/*
			 * System.out.println("Before");
			 * printProductSortContents(productSortContents);
			 * 
			 * List<ProductSortContent> sorted =
			 * sortbySubCate(getCollator(getKey
			 * (merchToolSortRequest.getSubCategory())),productSortContents);
			 * System.out.println("After");
			 * System.out.println("SubCateRule = "+getKey
			 * (merchToolSortRequest.getSubCategory()));
			 * printProductSortContents(sorted);
			 */
			/*
			 * //Sort by subCate as map System.out.println("After");
			 * System.out.println
			 * ("subCateRule = "+getKey(merchToolSortRequest.getSubCategory()));
			 * LinkedHashMap<String,List<ProductSortContent>> map =
			 * sortbySubCateAsMap
			 * (productSortContents,merchToolSortRequest.getSubCategory());
			 * printProductSortContentMap(map);
			 */
			/*
			 * //sort by price/newestIn, single sortings
			 * System.out.println("Before");
			 * printProductSortContents(productSortContents); //
			 * sortbyPrice(false,productSortContents);
			 * sortbyNewestIn(false,productSortContents);
			 * System.out.println("After");
			 * printProductSortContents(productSortContents);
			 */
			// sort by the priority level
			/*
			 * int numOfSortLevel =
			 * merchToolSortRequest.getSortingPriorityLevel().size(); for(int i
			 * = 0; i < numOfSortLevel; i++){
			 * 
			 * }
			 */

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productId;
	}

	static final private String COLOR_GREY = "Grey";
	static final private String COLOR_BLACK = "Black";
	// static final private String COLOR_MULTI = "Multi-colour";throw exception
	static final private String COLOR_MULTI = "Multicolour";

	static final private String CATEGORY_MEN_CLOTHING = "MenClothing";
	static final private String CATEGORY_MEN_GILETANDVESTS = "MenGiletsAndVests";
	static final private String CATEGORY_MEN_CASUALJACKETS = "MenCasualJackets";
	static final private String CATEGORY_MEN_JACKETS = "MenJackets";
	static final private String CATEGORY_MEN_BLAZERS = "MenBlazers";

	static final private String LVL_ASC = "LowToHigh";
	static final private String LVL_DESC = "HighToLow";

	static final private String SORT_PRI_COLOUR = "Colour";
	static final private String SORT_PRI_SUBCATE = "SubCategory";
	static final private String SORT_PRI_NEWESTIN = "NewestIn";
	static final private String SORT_PRI_PRICE = "PricePoint";
	static final private String SORT_PRI_STOCK = "StockLevel";

	static private List<ProductSortContent> getSampleProduct() {
		List<ProductSortContent> ret = new ArrayList<ProductSortContent>();
		long now = System.currentTimeMillis();
		ret.add(new ProductSortContent("AIR969", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CLOTHING);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_GREY, 6900.0));
		ret.add(new ProductSortContent("AIR968", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CLOTHING);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_GREY, 6800.0));
		ret.add(new ProductSortContent("AIR967", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CLOTHING);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_GREY, 6700.0));
		ret.add(new ProductSortContent("AIB969", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CLOTHING);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_BLACK, 6900.0));
		ret.add(new ProductSortContent("AIB968", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CLOTHING);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_BLACK, 6800.0));
		ret.add(new ProductSortContent("AIB967", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CLOTHING);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_BLACK, 6700.0));
		ret.add(new ProductSortContent("ALL999", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CLOTHING);
				add(CATEGORY_MEN_GILETANDVESTS);
				add(CATEGORY_MEN_CASUALJACKETS);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 90000), COLOR_GREY, 96900.0));
		ret.add(new ProductSortContent("JIB969", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_JACKETS);
				add(CATEGORY_MEN_CASUALJACKETS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_BLACK, 6900.0));
		// ret.add(new ProductSortContent("JIB968",new
		// ArrayList<String>(){{add(CATEGORY_MEN_JACKETS);add(CATEGORY_MEN_GILETANDVESTS);}},new
		// java.sql.Timestamp(now+10000),COLOR_BLACK,6800.0));
		ret.add(new ProductSortContent("JIR967", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CASUALJACKETS);
				add(CATEGORY_MEN_GILETANDVESTS);
			}
		}, new java.sql.Timestamp(now + 10000), COLOR_BLACK, 6700.0));
		ret.add(new ProductSortContent("AJO194", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_GILETANDVESTS);
				add(CATEGORY_MEN_CASUALJACKETS);
			}
		}, new java.sql.Timestamp(now + 20000), COLOR_BLACK, 14700.0));
		ret.add(new ProductSortContent("AWH161", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_CASUALJACKETS);
				add(CATEGORY_MEN_JACKETS);
			}
		}, new java.sql.Timestamp(now + 30000), COLOR_MULTI, 5500.0));
		ret.add(new ProductSortContent("BLU393", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_JACKETS);
				add(CATEGORY_MEN_BLAZERS);
			}
		}, new java.sql.Timestamp(now + 40000), COLOR_GREY, 17300.0));
		ret.add(new ProductSortContent("BLY147", new ArrayList<String>() {
			{
				add(CATEGORY_MEN_BLAZERS);
				add(CATEGORY_MEN_CLOTHING);
			}
		}, new java.sql.Timestamp(now + 50000), COLOR_BLACK, 7000.0));
		return ret;
	}

	static private RuleBasedCollator getCollator(String rule)
			throws ParseException {
		return new RuleBasedCollator(rule);
	}

	static private String getKey(List<String> inputs) {
		String ret = "";
		if (null == inputs || inputs.size() <= 0)
			return ret;

		// body
		for (String input : inputs) {
			ret += "< " + input;
		}

		return ret;
	}

	/*
	 * static private String getColourKey(List<String> colours){ String ret =
	 * ""; if(null == colours || colours.size() <= 0) return ret;
	 * 
	 * //body for(String colour:colours) { ret += "< " + colour; }
	 * 
	 * return ret; } static private String getSubCateKey(List<String>
	 * categories){ String ret = ""; if(null == categories || categories.size()
	 * <= 0) return ret;
	 * 
	 * //body for(String cate:categories) { ret += "< " + cate; } return ret; }
	 */
	static private String trimForCollation(String input) {
		String ret = null;
		if (null == input)
			return ret;
		ret = removeSpecialCharacter(input, "-", "");
		ret = removeSpecialCharacter(ret, " ", "");
		return ret;
	}

	static private String removeSpecialCharacter(String string, String target,
			String replacement) {
		return string.replace(target, replacement);
	}
}
