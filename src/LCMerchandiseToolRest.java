/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Lists;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.lanecrawford.commerce.shippingdelivery.LCDeliveryPromiseManager;
import com.lanecrawford.merchandisetool.MerchandiseToolConstants;
import com.lanecrawford.merchandisetool.MerchandiseToolException;
import com.lanecrawford.merchandisetool.MerchandiseToolUtil;
import com.lanecrawford.search.formhandlers.LCQueryFormHandler;
import com.lanecrawford.search.request.LCQueryRequest;
import com.lanecrawford.merchandisetool.LCMerchandiseToolManager;


import com.orion.commerce.search.refinement.OrionCustomCatalogFacetSearchTools;

import atg.commerce.pricing.priceLists.PriceListException;
import atg.commerce.pricing.priceLists.PriceListManager;
import atg.commerce.search.refinement.custom.CustomCatalogFacetSearchTools;
import atg.repository.QueryBuilder;
import atg.repository.Repository;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.repository.RepositoryView;
import atg.repository.rql.RqlStatement;
import atg.repository.search.refinement.FacetSearchTools;
import atg.search.client.SearchClient;
///atg/commerce/search/catalog/QueryFormHandler
import atg.search.formhandlers.QueryFormHandler;
import atg.search.routing.command.SearchEngineResponse;
import atg.search.routing.command.search.AnswerGroup;
import atg.search.routing.command.search.DocSortCommon;
import atg.search.routing.command.search.Document;
import atg.search.routing.command.search.QueryRequest;
import atg.search.routing.command.search.Result;
import atg.search.routing.command.search.SearchRequest;
import atg.search.routing.command.search.SearchResponse;
import atg.search.routing.command.search.SearchResultsResponse;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;
import atg.servlet.ServletUtil;
import atg.ui.document.model.DocumentSortOrder;
import atg.userprofiling.Profile;

public class LCMerchandiseToolRest extends DynamoServlet {
	public List<Map<String, String>> testRest(String country, String state, String city, String district, String shippingMethod, String paymentType, String skuId, String siteId, String orderId) throws ServletException, IOException 
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("testKey", "testValue");

		logDebug("try to retrieve the Shipping Time, country="+country+", state="+state+", city="+city+", district="+district+", shippingMethod="+shippingMethod + ",paymentType:"+ paymentType + ", skuId:"+ skuId +", siteId:" + siteId + ", orderId:" + orderId);
		String testCountry = (String) this.getParameter("country");
		if(testCountry != null) logDebug("try to retrieve the Shipping Time, testCountry="+testCountry);
		String arg1 = (String) this.getParameter("arg1");
		if(null != arg1) logDebug("try to retrieve the Shipping Time, arg1="+arg1);


		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}
	public List<Map<String, String>> testRest2() throws ServletException, IOException 
	{
		Map<String,String> map = new HashMap<String,String>();

		DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
		String jsonData = request.getParameter("jsonData");
		map.put("jsonData", jsonData);

		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}


	public List<Map<String, String>> testRest3() throws ServletException, IOException 
	{
		Map<String,String> map = new HashMap<String,String>();

		DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
		String jsonData = request.getParameter("arg1");
		map.put("arg1", jsonData);

		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}
	public class ProductSortContent{
		String productID;
		List<String> ancestorCategories;
		java.sql.Timestamp startDate;
		String lcFacetColor1;
 		Double displayPrice;
 	
		public String getProductID() {
			return productID;
		}
		public void setProductID(String productID) {
			this.productID = productID;
		}
		public List<String> getAncestorCategories() {
			return ancestorCategories;
		}
		public void setAncestorCategories(List<String> ancestorCategories) {
			this.ancestorCategories = ancestorCategories;
		}
		public java.sql.Timestamp getStartDate() {
			return startDate;
		}
		public void setStartDate(java.sql.Timestamp startDate) {
			this.startDate = startDate;
		}
		public String getLcFacetColor1() {
			return lcFacetColor1;
		}
		public void setLcFacetColor1(String lcFacetColor1) {
			this.lcFacetColor1 = lcFacetColor1;
		}
		public Double getDisplayPrice() {
			return displayPrice;
		}
		public void setDisplayPrice(Double displayPrice) {
			this.displayPrice = displayPrice;
		}
		@Override
		public String toString() {
			String s_ancestorCategory= "";
			for(Object ancestorCategory:getAncestorCategories()){
				if(null != ancestorCategory){
					if(ancestorCategory instanceof String){
						if("".contentEquals(s_ancestorCategory)){
							s_ancestorCategory += (String)ancestorCategory;
						}else{
							s_ancestorCategory += (", "+ (String)ancestorCategory);
						}
					}
				}
			}
			return "ProductSortContent [productID=" + productID
					+ ", ancestorCategories=" + s_ancestorCategory
					+ ", startDate=" + startDate + ", lcFacetColor1="
					+ lcFacetColor1  + ", displayPrice="
					+ displayPrice + "]";
		}
	}
	public class MerchToolSortRequest {
		private List<String> Colour;
		private List<String> SubCategory;
		private String NewestIn;
		private String PricePoint;
		private String StockLevel;
		private List<String> SortingPriorityLevel;
		
		public String getPricePoint() {
			return PricePoint;
		}
		public void setPricePoint(String pricePoint) {
			PricePoint = pricePoint;
		}
		public String getNewestIn() {
			return NewestIn;
		}
		public void setNewestIn(String newestIn) {
			NewestIn = newestIn;
		}
		public String getStockLevel() {
			return StockLevel;
		}
		public void setStockLevel(String stockLevel) {
			StockLevel = stockLevel;
		}
		public List<String> getSortingPriorityLevel() {
			return SortingPriorityLevel;
		}
		public void setSortingPriorityLevel(List<String> sortingPriorityLevel) {
			SortingPriorityLevel = sortingPriorityLevel;
		}
		public List<String> getColour() {
			return Colour;
		}
		public void setColour(List<String> colour) {
			Colour = colour;
		}
		public List<String> getSubCategory() {
			return SubCategory;
		}
		public void setSubCategory(List<String> subCategory) {
			SubCategory = subCategory;
		}

		@Override
		public String toString() {
			return "MerchToolSortRequest [PricePoint=" + PricePoint + ", NewestIn="
					+ NewestIn + ", StockLevel=" + StockLevel
					+ ", SortingPriorityLevel=" + SortingPriorityLevel
					+ ", Colour=" + Colour + ", SubCategory=" + SubCategory
					+ "]";
		}
	}
	
	private MerchToolSortRequest parseMerTool(String input){
		MerchToolSortRequest ret = null;
		if(null == input) return ret;
		
		Gson gson = new Gson();
		return gson.fromJson(input, MerchToolSortRequest.class);
	}
	private String convertMerTool2JSON(MerchToolSortRequest input){
		Gson gson = new Gson();
		return gson.toJson(input);
	}
	
	public List<Map<String, String>> testRest3b() throws ServletException, IOException 
	{
		Map<String,String> map = new HashMap<String,String>();

		DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
		logDebug("testRest3b(), request = "+request);
		String jsonData = request.getParameter("arg1");
		
		//parse string into POJO
		MerchToolSortRequest obj = parseMerTool(jsonData);
		logDebug("testRest3b(), MerchToolSortRequest = "+obj);
		
		map.put("arg1", jsonData);

		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}

	public List<Map<String, String>> testRest3d() throws ServletException, IOException 
	{
		Map<String,String> map = new HashMap<String,String>();

		DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
		String jsonData = request.getParameter("arg1");
		
		//parse string into POJO
		MerchToolSortRequest obj = parseMerTool(jsonData);
		logDebug("testRest3d(), MerchToolSortRequest = "+obj);
		logDebug("testRest3d(), convertMerTool2JSON MerchToolSortRequest = "+convertMerTool2JSON(obj));
		
		map.put("arg1", convertMerTool2JSON(obj));

		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}

	public List<String> testResponse() throws ServletException, IOException 
	{
		DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
		logDebug("testResponse(), request = "+request);
		String jsonData = request.getParameter("arg1");
		
		//parse string into POJO
		MerchToolSortRequest obj = parseMerTool(jsonData);
		logDebug("testResponse(), MerchToolSortRequest = "+obj);
		logDebug("testResponse(), convertMerTool2JSON MerchToolSortRequest = "+convertMerTool2JSON(obj));
		

		
		List<String> list = new ArrayList<String>();
		list.add("String 1");
		list.add("String 2");
		list.add("String 3");
			

		return list;
	}
	

	
	public Map<String, Object> testResponseDetail(){
		Map<String, Object> ret = new HashMap<String,Object>();
		long startTime = System.currentTimeMillis();
		
		List<String> sortedIDs = new ArrayList<String>();
		sortedIDs.add("String 1");
		sortedIDs.add("String 2");
		sortedIDs.add("String 3");
		
		long endTime = System.currentTimeMillis();
				
		ret.put(MerchandiseToolConstants.JSON_RESPONSE_RESPONSE_CODE, "success");
		ret.put(MerchandiseToolConstants.JSON_RESPONSE_CALLER_REFERENCE_NO, "ANY_POSSIBLE_STRING");
		ret.put(MerchandiseToolConstants.JSON_RESPONSE_SERVER_REFERENCE_NO, String.valueOf(System.currentTimeMillis()));
		ret.put(MerchandiseToolConstants.JSON_RESPONSE_ELAPSED_TIME, String.valueOf(endTime-startTime));
		ret.put(MerchandiseToolConstants.JSON_RESPONSE_SORTED_PRODUCT_ID, sortedIDs);
		
		return ret;
	}

	public List<Map<String, String>> testRest3c() throws ServletException, IOException 
	{
		Map<String,String> map = new HashMap<String,String>();

		DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
		String jsonData = request.getParameter("arg1");
		
		//parse string into POJO
		MerchToolSortRequest MerObj = null;
		try {
			JSONObject obj = new JSONObject(jsonData);
			MerObj = new MerchToolSortRequest();
			
			String PricePoint = obj.getString("PricePoint");

			logDebug("testRest3b(), PricePoint = "+PricePoint);
			MerObj.setPricePoint(PricePoint);

			map.put("arg1", MerObj.getPricePoint());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			map.put("arg1", "");
		}
		

		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}
	public List<Map<String, String>> testParam() throws ServletException, IOException 
	{
		Map<String,String> map = new HashMap<String,String>();
		logDebug("testParam(), param = "+getParameters());
		map.put("arg1", getParameters().toString());
		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}

	
	private String convertStreamToString(java.io.InputStream is) {
	    java.util.Scanner s = new java.util.Scanner(is, "UTF-8").useDelimiter("\\A");
	    
	    return s.hasNext() ? s.next() : "";
	}
	
	public List<Map<String, String>> testJSON() throws ServletException, IOException 
	{

		Map<String,String> map = new HashMap<String,String>();
		StringBuffer jb = new StringBuffer();
		String line = null;
		
		// read input stream as String{"arg1":"GB1"}
//		try {
			DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
			logDebug("testJSON(), getCharacterEncoding = "+request.getCharacterEncoding());
			logDebug("testJSON(), getContentLength = "+request.getContentLength());
			logDebug("testJSON(), getContentType = "+request.getContentType());
			
			HttpServletRequest req = request.getRequest();
			logDebug("testJSON(),HttpServletRequest getCharacterEncoding = "+req.getCharacterEncoding());
			logDebug("testJSON(),HttpServletRequest getContentLength = "+req.getContentLength());
			logDebug("testJSON(),HttpServletRequest getContextPath = "+req.getContextPath());

			BufferedReader reader = req.getReader();
			String queryString = request.getQueryString();
			logDebug("testJSON(), queryString = "+queryString);
			while ((line = reader.readLine()) != null){
				jb.append(line);
			}
			logDebug("testJSON(), parsed JSON Buffer = "+jb.toString());

			ServletInputStream stream = req.getInputStream();
			line = convertStreamToString(stream);

			map.put("line", line);
			logDebug("testJSON(), line = "+line);
			
		} catch (Exception e) { 
			logDebug("testJSON(), Exception = "+e.getMessage());
		} finally {
			logDebug("testJSON(), parsed JSON Buffer = "+jb.toString());
		}

		//parse string as json object
		try {
			JSONObject jsonObject = JSONObject.fromObject(jb.toString());
		} catch (ParseException e) {
			// crash and burn
			throw new IOException("Error parsing JSON request string");
		}
		
		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}
	public List<Map<String, String>> testJSON2() throws ServletException, IOException 
	{

		Map<String,String> map = new HashMap<String,String>();
		StringBuffer jb = new StringBuffer();
		String line = null;
		
		// read input stream as String{"arg1":"GB1"}
//		try {
			DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
			logDebug("testJSON(), getCharacterEncoding = "+request.getCharacterEncoding());
			logDebug("testJSON(), getContentLength = "+request.getContentLength());
			logDebug("testJSON(), getContentType = "+request.getContentType());
			
			HttpServletRequest req = request.getRequest();
			logDebug("testJSON(),HttpServletRequest getCharacterEncoding = "+req.getCharacterEncoding());
			logDebug("testJSON(),HttpServletRequest getContentLength = "+req.getContentLength());
			logDebug("testJSON(),HttpServletRequest getContextPath = "+req.getContextPath());


			ServletInputStream stream = req.getInputStream();
//			line = convertStreamToString(stream);
		    java.util.Scanner s = new java.util.Scanner(stream, "UTF-8").useDelimiter("\\A");
		    line =  s.hasNext() ? s.next() : "";

			map.put("line", line);
			logDebug("testJSON(), line = "+line);
		
		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}
	
	private String slurp(final InputStream is, final int bufferSize)
	{
		final char[] buffer = new char[bufferSize];
		final StringBuilder out = new StringBuilder();
		try {
			final Reader in = new InputStreamReader(is, "UTF-8");
			try {
				for (;;) {
					int rsz = in.read(buffer, 0, buffer.length);
					if (rsz < 0)
						break;
					out.append(buffer, 0, rsz);
				}
			}
			finally {
				in.close();
			}
		}
		catch (UnsupportedEncodingException ex) {
			logDebug("slurp(), UnsupportedEncodingException = "+ex.getMessage());
		}
		catch (IOException ex) {
			logDebug("slurp(), IOException = "+ex.getMessage());
		}
		return out.toString();
	}
	
	public List<Map<String, String>> testJSON3() throws ServletException, IOException 
	{

		Map<String,String> map = new HashMap<String,String>();
		StringBuffer jb = new StringBuffer();
		String line = null;
		
		// read input stream as String{"arg1":"GB1"}
//		try {
			DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
			logDebug("testJSON3(), getCharacterEncoding = "+request.getCharacterEncoding());
			logDebug("testJSON3(), getContentLength = "+request.getContentLength());
			logDebug("testJSON3(), getContentType = "+request.getContentType());
			logDebug("testJSON3(), getAttributeNames = "+request.getAttributeNames().toString());
			logDebug("testJSON3(), getCookieParameterNames = "+request.getCookieParameterNames().toString());
			logDebug("testJSON3(), getHeaderNames = "+request.getHeaderNames().toString());
			logDebug("testJSON3(), getParameterNames = "+request.getParameterNames());
			logDebug("testJSON3(), getParameterNames().toString = "+request.getParameterNames().toString());
			logDebug("testJSON3(), getParameterNamesInStack = "+request.getParameterNamesInStack());
			logDebug("testJSON3(), getQueryParameterNames = "+request.getQueryParameterNames().toString());
			logDebug("testJSON3(), getScheme = "+request.getScheme());
			logDebug("testJSON3(), getURLParameterNames = "+request.getURLParameterNames().toString());
			logDebug("testJSON3(), getContentType = "+request.getContentType());

			
			HttpServletRequest req = request.getRequest();
			logDebug("testJSON3(),HttpServletRequest getCharacterEncoding = "+req.getCharacterEncoding());
			logDebug("testJSON3(),HttpServletRequest getContentLength = "+req.getContentLength());
			logDebug("testJSON3(),HttpServletRequest getContextPath = "+req.getContextPath());
			logDebug("testJSON3(),HttpServletRequest getAttributeNames = "+req.getAttributeNames());
			logDebug("testJSON3(),HttpServletRequest getHeaderNames = "+req.getHeaderNames());
			logDebug("testJSON3(),HttpServletRequest getParameterNames = "+req.getParameterNames());
			logDebug("testJSON3(),HttpServletRequest getParameterNames.toString() = "+req.getParameterNames().toString());
			logDebug("testJSON3(),HttpServletRequest getContextPath = "+req.getContextPath());
			logDebug("testJSON3(),HttpServletRequest getContextPath = "+req.getContextPath());

			ServletInputStream stream = req.getInputStream();
		    line =  slurp(stream,128);
			map.put("line", line);
			logDebug("testJSON3(), line = "+line);
		
		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}
	

	
	public List<Map<String, String>> testATGJSON() throws ServletException, IOException 
	{

		Map<String,String> map = new HashMap<String,String>();

		
		// read input stream as String
			DynamoHttpServletRequest request = ServletUtil.getCurrentRequest();
			String abc = request.getQueryParameter("abc");

			map.put("abc", abc);
	
		List<Map<String, String>> ret = new ArrayList<Map<String, String>>();
		ret.add(map);
		return ret;
	}
	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {
		String storename = request.getParameter("storename");
		if (storename == null)
			storename = "No-Name's";

		javax.servlet.ServletOutputStream out = response.getOutputStream();
		out.println("<h1>Welcome to " + storename + "</h1>");
	}


	OrionCustomCatalogFacetSearchTools orionCustomCatalogFacetSearchTools;
	LCQueryFormHandler lcQueryFormHandler;
	public OrionCustomCatalogFacetSearchTools getOrionCustomCatalogFacetSearchTools() {
		return orionCustomCatalogFacetSearchTools;
	}
	public void setOrionCustomCatalogFacetSearchTools(
			OrionCustomCatalogFacetSearchTools orionCustomCatalogFacetSearchTools) {
		this.orionCustomCatalogFacetSearchTools = orionCustomCatalogFacetSearchTools;
	}
	public LCQueryFormHandler getLcQueryFormHandler() {
		return lcQueryFormHandler;
	}
	public void setLcQueryFormHandler(LCQueryFormHandler lcQueryFormHandler) {
		this.lcQueryFormHandler = lcQueryFormHandler;
	}
	
	public void testSearchnewin(String searchmode,String date) throws IOException, ServletException{
		long start = System.currentTimeMillis();
		logDebug("testSearchnewin()"+", searchmode = "+searchmode+", date = "+date);

		Map<String, ProductSortContent> productSortContents = null;
		DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
		DynamoHttpServletResponse pResponse = ServletUtil.getCurrentResponse();
		logDebug("testSearchnewin() pRequest = "+pRequest);
		logDebug("testSearchnewin() pResponse = "+pResponse);
		
		//set quert parameter
		SearchRequest searchRequest = lcQueryFormHandler.getSearchRequest();
		
		if (searchRequest instanceof LCQueryRequest) {
			LCQueryRequest queryRequest = (LCQueryRequest) searchRequest;
			// subcat setting
			queryRequest.setSearchMode(searchmode);
			queryRequest.setStartCategory("/Solutions");
			queryRequest.setDate(date);
			queryRequest.setPageSize(5000);//number of item returned per search request.
			queryRequest.setDocSort(DocSortCommon.PREDICATE);
			queryRequest.setDocSortOrder(QueryRequest.DocSortOrder.ASCENDING);
		}

		orionCustomCatalogFacetSearchTools.setCategoryId(null);
		boolean ret = lcQueryFormHandler.handleSearch(pRequest, pResponse);
		SearchResponse searchResponse = lcQueryFormHandler.getSearchResponse();
		logDebug("testSearchnewin() searchResponse.toString() = "+searchResponse.toString());
		
		//cast the searchResponse to the SearchResultsResponse,
		// so as to retrieve the parsed xml results
		if(searchResponse instanceof SearchResultsResponse){
			logDebug("testSearchnewin() cast searchResponse to SearchResultsResponse ");
			SearchResultsResponse searchResultsResponse = ((SearchResultsResponse)searchResponse);
		
			List<Result> results = searchResultsResponse.getResults();
//			List<String> ids = null;
			String [] ids = null;
			if(null != results){
				logDebug("testSearchnewin() results.size() = "+results.size());
//				ids = new ArrayList<String>();
				ids = new String[results.size()];
//				for(Result result:results){
//				logDebug("testSearch() result = "+result.toString());
				for(int i= 0 ; i < results.size();i++){
					Result result = results.get(i);

					Document document = result.getDocument();
					String url = document.getUrl();
					Map<String,String> properties = document.getProperties();
	
					String key_repositoryId = "$repositoryId";
					String value_repositoryId = properties.get(key_repositoryId);
					
//					ids.add(value_repositoryId);
					ids[i]=value_repositoryId;
				}
			}

//			print the ids
//			logDebug("testSearch() ids.size() = "+ids.size());
			int count=0;
			for(String id:ids){
				logDebug("testSearchnewin() id = "+id);
				count++;
			}
			logDebug("testSearchnewin() ids count = "+count);

			

		}else{
			logDebug("testSearchnewin() cast searchResponse to SearchResultsResponse FAIL");
		}
	}
	
	public void testSearchBrand(String brand,String bu) throws IOException, ServletException{
		long start = System.currentTimeMillis();
		logDebug("testSearchBrand()"+", brand = "+brand+", bu = "+bu);

		Map<String, ProductSortContent> productSortContents = null;
		DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
		DynamoHttpServletResponse pResponse = ServletUtil.getCurrentResponse();
		logDebug("testSearchBrand() pRequest = "+pRequest);
		logDebug("testSearchBrand() pResponse = "+pResponse);
		
		//set quert parameter
		SearchRequest searchRequest = lcQueryFormHandler.getSearchRequest();
		
		if (searchRequest instanceof LCQueryRequest) {
			LCQueryRequest queryRequest = (LCQueryRequest) searchRequest;
			// subcat setting
			queryRequest.setStartCategory("/Solutions");
			queryRequest.setBrand(brand);
			queryRequest.setBu(bu);
			queryRequest.setPageSize(5000);//number of item returned per search request.
			queryRequest.setDocSort(DocSortCommon.PREDICATE);
			queryRequest.setDocSortOrder(QueryRequest.DocSortOrder.ASCENDING);
		}

		orionCustomCatalogFacetSearchTools.setCategoryId(null);
		boolean ret = lcQueryFormHandler.handleSearch(pRequest, pResponse);
		SearchResponse searchResponse = lcQueryFormHandler.getSearchResponse();
		logDebug("testSearchBrand() searchResponse.toString() = "+searchResponse.toString());
		
		//cast the searchResponse to the SearchResultsResponse,
		// so as to retrieve the parsed xml results
		if(searchResponse instanceof SearchResultsResponse){
			logDebug("testSearchBrand() cast searchResponse to SearchResultsResponse ");
			SearchResultsResponse searchResultsResponse = ((SearchResultsResponse)searchResponse);
		
			List<Result> results = searchResultsResponse.getResults();
//			List<String> ids = null;
			String [] ids = null;
			if(null != results){
				logDebug("testSearchBrand() results.size() = "+results.size());
//				ids = new ArrayList<String>();
				ids = new String[results.size()];
//				for(Result result:results){
//				logDebug("testSearch() result = "+result.toString());
				for(int i= 0 ; i < results.size();i++){
					Result result = results.get(i);

					Document document = result.getDocument();
					String url = document.getUrl();
					Map<String,String> properties = document.getProperties();
	
					String key_repositoryId = "$repositoryId";
					String value_repositoryId = properties.get(key_repositoryId);
					
//					ids.add(value_repositoryId);
					ids[i]=value_repositoryId;
				}
			}

//			print the ids
//			logDebug("testSearch() ids.size() = "+ids.size());
			int count=0;
			for(String id:ids){
				logDebug("testSearchBrand() id = "+id);
				count++;
			}
			logDebug("testSearchBrand() ids count = "+count);

			

		}else{
			logDebug("testSearchBrand() cast searchResponse to SearchResultsResponse FAIL");
		}
		

	}
	
	public void testSearch(String categoryId,String region) throws IOException, ServletException{
		logDebug("testSearch() ");
		//String categoryId = "MenJackets";
		long start = System.currentTimeMillis();
		logDebug("testSearch()"+", categoryId = "+categoryId+", region = "+region);

		Map<String, ProductSortContent> productSortContents = null;
		DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
		DynamoHttpServletResponse pResponse = ServletUtil.getCurrentResponse();
		logDebug("testSearch() pRequest = "+pRequest);
		logDebug("testSearch() pRequest.getHeaderNames().toString() = "+pRequest.getHeaderNames().toString());
		logDebug("testSearch() pResponse = "+pResponse);
		
		//set quert parameter
		SearchRequest searchRequest = lcQueryFormHandler.getSearchRequest();
		
		if (searchRequest instanceof LCQueryRequest) {
			LCQueryRequest queryRequest = (LCQueryRequest) searchRequest;
			// subcat setting
			queryRequest.setSearchMode(null);
			queryRequest.setQuestion("");
			queryRequest.setStartCategory(null);
			queryRequest.setPageSize(1000);//number of item returned per search request.
			queryRequest.setDocSort(DocSortCommon.PREDICATE);
			queryRequest.setDocSortOrder(QueryRequest.DocSortOrder.ASCENDING);
			String docSortPred = "strprop:ascending:stockAvailabilityStatus|numprop:ascending:normalPLPSortingOrderMap.MenJackets|numprop:ascending:newInSortingOrderMap.newInMW|numprop:ascending:plpColorSortingOrder|numprop:descending:startDate";
			queryRequest.setDocSortPred(docSortPred);
			queryRequest.setDocSortProp(null);
			
			logDebug("testSearch() LCQueryRequest queryRequest.toString() = "+queryRequest.toString());
			logDebug("testSearch() LCQueryRequest queryRequest.getQuestion() = "+queryRequest.getQuestion());
			logDebug("testSearch() LCQueryRequest queryRequest.getStartCategory() = "+queryRequest.getStartCategory());
			logDebug("testSearch() LCQueryRequest queryRequest.getDocSortPred() = "+queryRequest.getDocSortPred());
			logDebug("testSearch() LCQueryRequest queryRequest.getRequestId() = "+queryRequest.getRequestId());
			
		}

		orionCustomCatalogFacetSearchTools.setCategoryId(categoryId);
		
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getCategoryId() = "+orionCustomCatalogFacetSearchTools.getCategoryId());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getCatalogId() = "+orionCustomCatalogFacetSearchTools.getCatalogId());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getAbsoluteName() = "+orionCustomCatalogFacetSearchTools.getAbsoluteName());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getCatalogConstraintFormat() = "+orionCustomCatalogFacetSearchTools.getCatalogConstraintFormat());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getCategoryIdPropertyName() = "+orionCustomCatalogFacetSearchTools.getCategoryIdPropertyName());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getDefaultFacetPriority() = "+orionCustomCatalogFacetSearchTools.getDefaultFacetPriority());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getDocSetPathFormat() = "+orionCustomCatalogFacetSearchTools.getDocSetPathFormat());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getFacetTrail() = "+orionCustomCatalogFacetSearchTools.getFacetTrail());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getGlobalRefineConfigName() = "+orionCustomCatalogFacetSearchTools.getGlobalRefineConfigName());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getName() = "+orionCustomCatalogFacetSearchTools.getName());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getRefineConfig() = "+orionCustomCatalogFacetSearchTools.getRefineConfig());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getServiceInfo() = "+orionCustomCatalogFacetSearchTools.getServiceInfo());
		logDebug("testSearch() orionCustomCatalogFacetSearchTools.getQueryByCatalog() = "+orionCustomCatalogFacetSearchTools.getQueryByCatalog());
		
		boolean ret = lcQueryFormHandler.handleSearch(pRequest, pResponse);

		logDebug("testSearch() ret = "+ret);
		logDebug("testSearch() pResponse = "+pResponse);

		//loop http response

		logDebug("testSearch() pResponse.getBufferSize() = "+pResponse.getBufferSize());
		logDebug("testSearch() pResponse.getCharacterEncoding() = "+pResponse.getCharacterEncoding());
		logDebug("testSearch() pResponse.getContentType() = "+pResponse.getContentType());
		logDebug("testSearch() pResponse.getStatus() = "+pResponse.getStatus());
		logDebug("testSearch() pResponse.getContentTypeSet() = "+pResponse.getContentTypeSet());
		logDebug("testSearch() pResponse.getDoExitTracking() = "+pResponse.getDoExitTracking());
		logDebug("testSearch() pResponse.getLocale() = "+pResponse.getLocale().toString());
		logDebug("testSearch() pResponse.getResponse() = "+pResponse.getResponse());
		logDebug("testSearch() pResponse.getWrapper() = "+pResponse.getWrapper());
		
		//loop out the response from lcQueryFormHandler
		SearchResponse searchResponse = lcQueryFormHandler.getSearchResponse();
		logDebug("testSearch() searchResponse.toString() = "+searchResponse.toString()); // the XML output
		
		logDebug("testSearch() searchResponse.getRequestIdentifier() = "+searchResponse.getRequestIdentifier());
		logDebug("testSearch() searchResponse.getSearchTargetNames() = "+searchResponse.getSearchTargetNames());
		logDebug("testSearch() searchResponse.getContentId() = "+searchResponse.getContentId());
		logDebug("testSearch() searchResponse.getDefaultXmlBytes() = "+searchResponse.getDefaultXmlBytes());
		logDebug("testSearch() searchResponse.getMergeTimeMs() = "+searchResponse.getMergeTimeMs());
		logDebug("testSearch() searchResponse.getParseTimeMs() = "+searchResponse.getParseTimeMs());
		logDebug("testSearch() searchResponse.getRequestChainToken() = "+searchResponse.getRequestChainToken());
		logDebug("testSearch() searchResponse.getRequestTag() = "+searchResponse.getRequestTag());
		logDebug("testSearch() searchResponse.getRequestTime() = "+searchResponse.getRequestTime());
		logDebug("testSearch() searchResponse.getPartitionResponses() = "+searchResponse.getPartitionResponses());
		logDebug("testSearch() searchResponse.getListableProperties() = "+searchResponse.getListableProperties());
		List<String> listPro = searchResponse.getListableProperties();
		if(null != listPro){
			for(String pro:listPro){
				logDebug("testSearch() searchResponse.getListableProperties().pro = "+pro);
			}
		}

		SearchEngineResponse searchEngineResponse = searchResponse.getSearchEngineResponse();
		logDebug("testSearch() searchEngineResponse.getXmlResponse() = "+searchEngineResponse.getXmlResponse());
		logDebug("testSearch() searchEngineResponse.getXmlResponseDecoded() = "+searchEngineResponse.getXmlResponseDecoded());
		List<String> listPro2 = searchEngineResponse.getListableProperties();
		if(null != listPro2){
			for(String pro2:listPro){
				logDebug("testSearch() searchEngineResponse.getListableProperties().Pro2 = "+pro2);
			}
		}

		//search response processer
		atg.search.formhandlers.SearchResponseProcessor resPro[] = lcQueryFormHandler.getSearchResponseProcessors();
		for (atg.search.formhandlers.SearchResponseProcessor temp : resPro){
			if(temp instanceof FacetSearchTools){
			//	SearchClient searchClient = ((CustomCatalogFacetSearchTools)temp).getSearchClient();
				logDebug("testSearch() SearchResponseProcessor temp = "+temp);
				
			}
		}

		
		
		//cast the searchResponse to the SearchResultsResponse,
		// so as to retrieve the parsed xml results
		if(searchResponse instanceof SearchResultsResponse){
			logDebug("testSearch() cast searchResponse to SearchResultsResponse ");
			SearchResultsResponse searchResultsResponse = ((SearchResultsResponse)searchResponse);
			
			logDebug("testSearch() SearchResultsResponse.toString = "+searchResultsResponse.toString());
			logDebug("testSearch() SearchResultsResponse.getGroupCount = "+searchResultsResponse.getGroupCount());
			logDebug("testSearch() SearchResultsResponse.getPageNum = "+searchResultsResponse.getPageNum());
			logDebug("testSearch() SearchResultsResponse.getPageSize = "+searchResultsResponse.getPageSize());
			logDebug("testSearch() SearchResultsResponse.getRequestTag = "+searchResultsResponse.getRequestTag());
			logDebug("testSearch() SearchResultsResponse.getRequestIdentifier = "+searchResultsResponse.getRequestIdentifier());
			
			
			List<AnswerGroup> answerGroups = searchResultsResponse.getGroups();
			if(null != answerGroups){
				for(AnswerGroup answerGroup:answerGroups){
					logDebug("testSearch() answerGroup = "+answerGroup.toString());
					logDebug("testSearch() answerGroup.getId = "+answerGroup.getId());
					logDebug("testSearch() answerGroup.getResult = "+answerGroup.getResult());
					
				}
			}
			
			List<Result> results = searchResultsResponse.getResults();
//			List<String> ids = null;
			String [] ids = null;
			if(null != results){
				logDebug("testSearch() results.size() = "+results.size());
//				ids = new ArrayList<String>();
				ids = new String[results.size()];
//				for(Result result:results){
//				logDebug("testSearch() result = "+result.toString());
				for(int i= 0 ; i < results.size();i++){
					Result result = results.get(i);
					
					logDebug("testSearch() result.getAnswerGroup = "+result.getAnswerGroup());
					logDebug("testSearch() result.getFeatures = "+result.getFeatures());
					logDebug("testSearch() result.getField = "+result.getField());
					logDebug("testSearch() result.getId = "+result.getId());
					logDebug("testSearch() result.getMoveRule = "+result.getMoveRule());
					logDebug("testSearch() result.getMoveRuleId = "+result.getMoveRuleId());
					logDebug("testSearch() result.getMoveRuleName = "+result.getMoveRuleName());
					logDebug("testSearch() result.getRequestTag = "+result.getRequestTag());
					logDebug("testSearch() result.getText = "+result.getText());
					logDebug("testSearch() result.getType = "+result.getType());
					
					Document document = result.getDocument();
					String url = document.getUrl();
//					Map<Object,Object> properties = document.getProperties();
					Map<String,String> properties = document.getProperties();
					
					String key_itemDescriptorName = "$itemDescriptor.itemDescriptorName";
					String value_itemDescriptorName = properties.get(key_itemDescriptorName);
					String key_repositoryName = "$repository.repositoryName";
					String value_repositoryName = properties.get(key_repositoryName);
					logDebug("testSearch() document.properties.value_itemDescriptorName = "+value_itemDescriptorName);
					logDebug("testSearch() document.properties.value_repositoryName = "+value_repositoryName);
					logDebug("testSearch() document.url = "+url);
					
					String key_repositoryId = "$repositoryId";
					String value_repositoryId = properties.get(key_repositoryId);
//					logDebug("testSearch() document.properties.value_repositoryId = "+value_repositoryId);
					
//					ids.add(value_repositoryId);
					ids[i]=value_repositoryId;
				}
			}

//			print the ids
//			logDebug("testSearch() ids.size() = "+ids.size());
			int count=0;
			for(String id:ids){
				logDebug("testSearch() id = "+id);
				count++;
			}
			logDebug("testSearch() ids count = "+count);

			
			// retrieve the information from productcatalog
			try {
				productSortContents = getProductSortContentMap(ids, region);
				logDebug("testSearch(), productSortContents.size() = "+productSortContents.size());
				// loop the map

				for (Map.Entry entry : productSortContents.entrySet()) {
					logDebug("testSearch(), productSortContents, key,val: " + entry.getKey() + "," + entry.getValue().toString());
				}
				
			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			logDebug("testSearch() cast searchResponse to SearchResultsResponse FAIL");
		}

		long end = System.currentTimeMillis();
		logDebug("testSearch()"+", categoryId = "+categoryId+", region = "+region+", elapsedTime(ms) = "+(end - start));
	}
	private SearchResponse searchProduct(String categoryId,String region) throws IOException, ServletException{
		logDebug("searchProduct()"+", categoryId = "+categoryId+", region = "+region);
		
		DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
		DynamoHttpServletResponse pResponse = ServletUtil.getCurrentResponse();
		logDebug("testSearchMap() pRequest = "+pRequest);
		logDebug("testSearchMap() pRequest.getHeaderNames().toString() = "+pRequest.getHeaderNames().toString());
		logDebug("testSearchMap() pResponse = "+pResponse);
		
		//set quert parameter
		SearchRequest searchRequest = lcQueryFormHandler.getSearchRequest();
		
		if (searchRequest instanceof LCQueryRequest) {
			LCQueryRequest queryRequest = (LCQueryRequest) searchRequest;
			// subcat setting
			queryRequest.setSearchMode(null);
			queryRequest.setQuestion("");
			queryRequest.setStartCategory(null);
			queryRequest.setPageSize(1000);//number of item returned per search request.
			queryRequest.setDocSort(DocSortCommon.PREDICATE);
			queryRequest.setDocSortOrder(QueryRequest.DocSortOrder.ASCENDING);
			String docSortPred = "strprop:ascending:stockAvailabilityStatus|numprop:ascending:normalPLPSortingOrderMap.MenJackets|numprop:ascending:newInSortingOrderMap.newInMW|numprop:ascending:plpColorSortingOrder|numprop:descending:startDate";
			queryRequest.setDocSortPred(docSortPred);
			queryRequest.setDocSortProp(null);
		
		}

		orionCustomCatalogFacetSearchTools.setCategoryId(categoryId);

		boolean ret = lcQueryFormHandler.handleSearch(pRequest, pResponse);
		
		return lcQueryFormHandler.getSearchResponse();
	}
	private Map<String, ProductSortContent> digestSearchProductResponse(SearchResponse searchResponse, String region){
		Map<String, ProductSortContent> productSortContents = null;
		if(null == searchResponse || null == region) return productSortContents;
		if(searchResponse instanceof SearchResultsResponse){
			logDebug("digestSearchProductResponse() cast searchResponse to SearchResultsResponse ");
			SearchResultsResponse searchResultsResponse = ((SearchResultsResponse)searchResponse);
			
			List<Result> results = searchResultsResponse.getResults();
			String [] ids = null;
			if(null != results){
				logDebug("digestSearchProductResponse() results.size() = "+results.size());
				ids = new String[results.size()];
				for(int i= 0 ; i < results.size();i++){
					Result result = results.get(i);

					Document document = result.getDocument();
					String url = document.getUrl();
					Map<String,String> properties = document.getProperties();

					String key_repositoryId = "$repositoryId";
					String value_repositoryId = properties.get(key_repositoryId);

					ids[i]=value_repositoryId;
				}
			}

			// retrieve the information from productcatalog
			try {
				productSortContents = getProductSortContentMap(ids, region);
				logDebug("digestSearchProductResponse(), productSortContents.size() = "+productSortContents.size());

			} catch (RepositoryException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			logDebug("digestSearchProductResponse() cast searchResponse to SearchResultsResponse FAIL");
		}
		return productSortContents;
	}
	public Map<String, ProductSortContent> testSearchMap(String categoryId,String region) throws IOException, ServletException{
		logDebug("testSearchMap() ");
		//String categoryId = "MenJackets";
		long start = System.currentTimeMillis();
		logDebug("testSearchMap()"+", categoryId = "+categoryId+", region = "+region);

		Map<String, ProductSortContent> productSortContents = null;
		SearchResponse searchResponse = searchProduct(categoryId,region);
		//cast the searchResponse to the SearchResultsResponse,
		// so as to retrieve the parsed xml results
		productSortContents = digestSearchProductResponse(searchResponse, region);
		if(null != productSortContents) logDebug("testSearchMap()"+", productSortContents.size() = "+productSortContents.size());
		
		long end = System.currentTimeMillis();
		logDebug("testSearchMap()"+", categoryId = "+categoryId+", region = "+region+", elapsedTime(ms) = "+(end - start));
		return productSortContents;
	}

	private Repository mProductCatalog;
	
	public Repository getProductCatalog() {
		return mProductCatalog;
	}
	public void setProductCatalog(Repository pProductCatalog) {
		this.mProductCatalog = pProductCatalog;
	}

	public void testSingleProductRepository(String pProductId, String region) throws RepositoryException{
		//if(null == pProductId || "".contentEquals(pProductId)) pProductId = "KBW021";
		logDebug("testSingleProductRepository()"+", pProductId = "+pProductId+", region = "+region);

		RepositoryView view = getProductCatalog().getView("product");
		RqlStatement statement = RqlStatement.parseRqlStatement("id = ?0");
		Object params[] = new Object[1];
		params[0] = pProductId;
		RepositoryItem [] items =statement.executeQuery (view, params);
		

		if (items != null && items.length > 0) {
			logDebug("testSingleProductRepository() items.length = "+items.length);
			for (RepositoryItem item : items) {
				logDebug("testSingleProductRepository() item.getRepositoryId() = "+item.getRepositoryId());
				logDebug("testSingleProductRepository() item.getRepositoryId().ancestorCategories = "+item.getPropertyValue("ancestorCategories"));
				logDebug("testSingleProductRepository() item.getRepositoryId().startDateHK = "+item.getPropertyValue("startDateHK"));
				logDebug("testSingleProductRepository() item.getRepositoryId().startDateCN = "+item.getPropertyValue("startDateCN"));
				logDebug("testSingleProductRepository() item.getRepositoryId().lcFacetColor1 = "+item.getPropertyValue("lcFacetColor1"));
				
			}	
		}
	}
	
	private Map<String, ProductSortContent> getProductSortContentMap(String [] ProductIds,String region) throws RepositoryException{
		//if(null == pProductId || "".contentEquals(pProductId)) pProductId = "KBW021";
		long start = System.currentTimeMillis();
		logDebug("getProductSortContentMap()"+", ProductIds = "+ProductIds+", region = "+region);
		
		Map<String, ProductSortContent> ret = null;

		RepositoryItem [] items = getProductCatalog().getItems(ProductIds, "product");
		
		if (items != null && items.length > 0) {
			ret = new HashMap<String, ProductSortContent>();
			logDebug("getProductSortContentMap() items.length = "+items.length);
			for (RepositoryItem item : items) {
				ProductSortContent productSortContent = new ProductSortContent();
				productSortContent.setProductID(item.getRepositoryId());
				productSortContent.setLcFacetColor1((String)item.getPropertyValue("lcFacetColor1"));
				productSortContent.setStartDate((null!=region && "CN".contentEquals(region))?(java.sql.Timestamp)item.getPropertyValue("startDateCN"):(java.sql.Timestamp)item.getPropertyValue("startDateHK"));
				productSortContent.setDisplayPrice(getDisplayPrice(item.getRepositoryId()));
//				logDebug("getProductSortContentMap() item.getPropertyValue(ancestorCategories) = "+item.getPropertyValue("ancestorCategories"));
				//loop ac
				List<Object> acs = (List) item.getPropertyValue("ancestorCategories");
				List<String> categories = null;
				if(null!= acs){
					categories = new ArrayList<String>();
					for(Object ac:acs){
						if(ac instanceof atg.adapter.gsa.GSAItem){
//							logDebug("getProductSortContentMap() (atg.adapter.gsa.GSAItem)ac).getFolderId  = "+((atg.adapter.gsa.GSAItem)ac).getFolderId());
							String category = ((atg.adapter.gsa.GSAItem)ac).getFolderId();
							categories.add(category);
						}
					}
				}
				productSortContent.setAncestorCategories(categories);

				
				ret.put(productSortContent.getProductID(), productSortContent);
//				logDebug("getProductSortContentMap() productSortContent = "+productSortContent.toString());
//				logDebug("getProductSortContentMap() productSortContent.getAncestorCategories().toString() = "+productSortContent.getAncestorCategories().toString());
			}	
			logDebug("getProductSortContentMap() Map<String, ProductSortContent>.size() = "+ret.size());
		}
		long end = System.currentTimeMillis();
		logDebug("getProductSortContentMap()"+", ProductIds = "+ProductIds+", region = "+region+", elapsedTime(ms) = "+(end-start));
		
		return ret;
	}
	
	private PriceListManager mPriceListManager;
	private Repository userProfile;
	private Profile profile;
	
	public Repository getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(Repository userProfile) {
		this.userProfile = userProfile;
	}
	public void setPriceListManager(PriceListManager pPriceListManager) {
		this.mPriceListManager = pPriceListManager;
	}
	public PriceListManager getPriceListManager() {
		return this.mPriceListManager;
	}
	public Profile getProfile() {
		return profile;
	}
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	private Double getDisplayPrice(String pProductId){
		Double displayPrice = 0.0;
		Double listPrice = 0.0;
		Double salePrice = 0.0;
		if(null == pProductId || "".contentEquals(pProductId)) return displayPrice;
//		logDebug("getDisplayPrice()"+", pProductId = "+pProductId);
		
		String userID = getProfile().getRepositoryId();
//		logDebug("getDisplayPrice() userID = "+userID);

		RepositoryItem item_profile;
		try {
			item_profile = getUserProfile().getItem(userID, "user");

			if (null != item_profile){
				//get user price lists
				RepositoryItem rep_priceList =  (RepositoryItem) item_profile.getPropertyValue("priceList");
				RepositoryItem rep_salePriceList =  (RepositoryItem) item_profile.getPropertyValue("salePriceList");
					
				//retrieve the list price and sale price from pricelistmanager
				RepositoryItem priceList_rep = getPriceListManager().getPrice(rep_priceList, pProductId, null);
				RepositoryItem salePriceList_rep = getPriceListManager().getPrice(rep_salePriceList,  pProductId, null);
				listPrice = (Double) priceList_rep.getPropertyValue("listPrice");
				salePrice = (Double) salePriceList_rep.getPropertyValue("listPrice");
				
				//found out the displayPrice based on the logic from getPrice.jsp
				displayPrice = (salePrice > 0.0 && salePrice < listPrice)?salePrice:listPrice;
			}
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PriceListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		logDebug("getDisplayPrice()"+", pProductId = "+pProductId+", listPrice = "+listPrice+", salePrice = "+salePrice+", displayPrice = "+displayPrice);
		return displayPrice;
	}
	public void testPrice(String pProductId, String priceList, String salePriceList) throws RepositoryException, PriceListException{

		logDebug("testPrice()"+", pProductId = "+pProductId+", priceList = "+priceList+", salePriceList = "+salePriceList);

		Double listPrice = 0.0;
		Double salePrice = 0.0;
		
		if(null == priceList || "".contentEquals(priceList) ||null == salePriceList || "".contentEquals(salePriceList)){

			String userID = getProfile().getRepositoryId();
			logDebug("testPrice() userID = "+userID);

			RepositoryItem item_profile = getUserProfile().getItem(userID, "user");
			if (null != item_profile){
				RepositoryItem rep_priceList =  (RepositoryItem) item_profile.getPropertyValue("priceList");
				RepositoryItem rep_salePriceList =  (RepositoryItem) item_profile.getPropertyValue("salePriceList");
				logDebug("testPrice()"+", pProductId = "+pProductId+", rep_priceList = "+rep_priceList+", rep_salePriceList = "+rep_salePriceList);

				//retrieve the list price and sale price from pricelistmanager
				RepositoryItem priceList_rep = getPriceListManager().getPrice(rep_priceList, pProductId, null);
				RepositoryItem salePriceList_rep = getPriceListManager().getPrice(rep_salePriceList,  pProductId, null);
				Object obj_listPrice = priceList_rep.getPropertyValue("listPrice");
				Object obj_salePrice = salePriceList_rep.getPropertyValue("listPrice");
				if(null!=obj_listPrice) listPrice = (Double) obj_listPrice;
				if(null!=obj_salePrice) salePrice = (Double) obj_salePrice;
				logDebug("testPrice() listPrice = "+listPrice);
				logDebug("testPrice() salePrice = "+salePrice);
			}
		}else{

			//retrieve the list price and sale price from pricelistmanager
			RepositoryItem priceList_rep = getPriceListManager().getPrice(priceList,  pProductId, null);
			RepositoryItem salePriceList_rep = getPriceListManager().getPrice(salePriceList,  pProductId, null);
			Object obj_listPrice = priceList_rep.getPropertyValue("listPrice");
			Object obj_salePrice = salePriceList_rep.getPropertyValue("listPrice");
			if(null!=obj_listPrice) listPrice = (Double) obj_listPrice;
			if(null!=obj_salePrice) salePrice = (Double) obj_salePrice;
			logDebug("testPrice() listPrice = "+listPrice);
			logDebug("testPrice() salePrice = "+salePrice);
		}
	}
	
	public void testPriceB(String pProductId, String priceList, String salePriceList) throws RepositoryException, PriceListException{

		logDebug("testPrice()"+", pProductId = "+pProductId+", priceList = "+priceList+", salePriceList = "+salePriceList);

		Double listPrice = 0.0;
		Double salePrice = 0.0;
//		String priceList = null;
//		String salePriceList = null;

		
		//String [] ids = null;
		//RepositoryItem [] item_profiles = getProfile().getRepository().getItems(ids, user_ItemDesc);
		
		if(null == priceList || "".contentEquals(priceList) ||null == salePriceList || "".contentEquals(salePriceList)){

			String userID = getProfile().getRepositoryId();
			logDebug("testPrice() userID = "+userID);
			String user_ItemDesc = "user";
			logDebug("testPrice() userID = "+userID);

			RepositoryItem item_profile = getProfile().getRepository().getItem(userID, user_ItemDesc);
			if (null != item_profile){
				RepositoryItem rep_priceList =  (RepositoryItem) item_profile.getPropertyValue("priceList");
				RepositoryItem rep_salePriceList =  (RepositoryItem) item_profile.getPropertyValue("salePriceList");
				logDebug("testPrice()"+", pProductId = "+pProductId+", rep_priceList = "+rep_priceList+", rep_salePriceList = "+rep_salePriceList);

				//retrieve the list price and sale price from pricelistmanager
				RepositoryItem priceList_rep = getPriceListManager().getPrice(rep_priceList, pProductId, null);
				RepositoryItem salePriceList_rep = getPriceListManager().getPrice(rep_salePriceList,  pProductId, null);
				Object obj_listPrice = priceList_rep.getPropertyValue("listPrice");
				Object obj_salePrice = salePriceList_rep.getPropertyValue("listPrice");
				if(null!=obj_listPrice) listPrice = (Double) obj_listPrice;
				if(null!=obj_salePrice) salePrice = (Double) obj_salePrice;
				logDebug("testPrice() listPrice = "+listPrice);
				logDebug("testPrice() salePrice = "+salePrice);
			}
		}else{

			//retrieve the list price and sale price from pricelistmanager
			RepositoryItem priceList_rep = getPriceListManager().getPrice(priceList,  pProductId, null);
			RepositoryItem salePriceList_rep = getPriceListManager().getPrice(salePriceList,  pProductId, null);
			Object obj_listPrice = priceList_rep.getPropertyValue("listPrice");
			Object obj_salePrice = salePriceList_rep.getPropertyValue("listPrice");
			if(null!=obj_listPrice) listPrice = (Double) obj_listPrice;
			if(null!=obj_salePrice) salePrice = (Double) obj_salePrice;
			logDebug("testPrice() listPrice = "+listPrice);
			logDebug("testPrice() salePrice = "+salePrice);
		}			
	}
	
	



//	THE REAL API CALL
	public LCMerchandiseToolManager LCMerchandiseToolManager;
	public LCMerchandiseToolManager getLCMerchandiseToolManager() {
		return LCMerchandiseToolManager;
	}
	public void setLCMerchandiseToolManager(
			LCMerchandiseToolManager lCMerchandiseToolManager) {
		LCMerchandiseToolManager = lCMerchandiseToolManager;
	}
	
	private void checkInputs(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse, com.lanecrawford.merchandisetool.model.MerchToolSortRequest req) throws MerchandiseToolException{
		// check input
		if(null == pRequest || null == pResponse)
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_INTERNAL_ERROR);
		
		if(null == req || null == req.getSearchMethod() || "".contentEquals(req.getSearchMethod()) ||
				null == req.getRegion() || "".contentEquals(req.getRegion()) || 
				null == req.getSortLevel() || req.getSortLevel().size() <= 0) 
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_MISSING_INPUT);

		if(!MerchandiseToolConstants.SEARCH_METHOD_CATEGORY.contentEquals(req.getSearchMethod()) &&
				!MerchandiseToolConstants.SEARCH_METHOD_NEWIN.contentEquals(req.getSearchMethod()) && 
				!MerchandiseToolConstants.SEARCH_METHOD_BRAND.contentEquals(req.getSearchMethod()))
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_INVALID_INPUT);

		if(MerchandiseToolConstants.SEARCH_METHOD_CATEGORY.contentEquals(req.getSearchMethod()) &&
				(null == req.getTargetCategory_ID() || "".contentEquals(req.getTargetCategory_ID())))
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_MISSING_INPUT);

		if(MerchandiseToolConstants.SEARCH_METHOD_NEWIN.contentEquals(req.getSearchMethod()) &&
				(null == req.getTargetNewIn_SearchMode() || "".contentEquals(req.getTargetNewIn_SearchMode()) ||
				null == req.getTargetNewIn_Date() || "".contentEquals(req.getTargetNewIn_Date())))
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_MISSING_INPUT);

		if(MerchandiseToolConstants.SEARCH_METHOD_BRAND.contentEquals(req.getSearchMethod()) &&
				(null == req.getTargetBrand_BU() || "".contentEquals(req.getTargetBrand_BU()) ||
				null == req.getTargetBrand_ID() || "".contentEquals(req.getTargetBrand_ID())))
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_MISSING_INPUT);
		
		if(MerchandiseToolConstants.SEARCH_METHOD_NEWIN.contentEquals(req.getSearchMethod()) &&
			(!MerchandiseToolConstants.NEWIN_SEARCH_MODE_MEN.contentEquals(req.getTargetNewIn_SearchMode()) &&
			!MerchandiseToolConstants.NEWIN_SEARCH_MODE_WOMEN.contentEquals(req.getTargetNewIn_SearchMode())))
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_INVALID_INPUT);
			

		if(MerchandiseToolConstants.SEARCH_METHOD_NEWIN.contentEquals(req.getSearchMethod()) &&
			(!MerchandiseToolConstants.NEWIN_DATE_ONEWEEK.contentEquals(req.getTargetNewIn_Date()) &&
			!MerchandiseToolConstants.NEWIN_DATE_TWOWEEK.contentEquals(req.getTargetNewIn_Date()) &&
			!MerchandiseToolConstants.NEWIN_DATE_ONEMONTH.contentEquals(req.getTargetNewIn_Date())))
			throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_INVALID_INPUT);
		
		for(String sortLvl:req.getSortLevel()){
			if(!MerchandiseToolConstants.SORT_PRI_COLOUR.contentEquals(sortLvl) && 
				!MerchandiseToolConstants.SORT_PRI_SUBCATE.contentEquals(sortLvl) &&
				!MerchandiseToolConstants.SORT_PRI_NEWESTIN.contentEquals(sortLvl) &&
				!MerchandiseToolConstants.SORT_PRI_PRICE.contentEquals(sortLvl) )
				throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_INVALID_INPUT);
		}

		if(req.isSortbyNewestIn()){
			if(null != req.getNewestIn() && 
				(!MerchandiseToolConstants.LVL_ASC.contentEquals(req.getNewestIn()) && 
				  !MerchandiseToolConstants.LVL_DESC.contentEquals(req.getNewestIn()))){
				throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_INVALID_INPUT);
			}
		}
		
		if(req.isSortbyPricePoint()){
			if(null != req.getPricePoint() && 
				(!MerchandiseToolConstants.LVL_ASC.contentEquals(req.getPricePoint()) && 
				  !MerchandiseToolConstants.LVL_DESC.contentEquals(req.getPricePoint()))){
				throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_INVALID_INPUT);
			}
		}
	}
	public Map<String, Object> sort() {
		long startTime = System.currentTimeMillis();
		List<String> sortedID = null;
		int sortedIDSize = 0;
		String clientReferenceNumber = null;
		String serverReferenceNumber = String.valueOf(startTime);
		String responseCode = MerchandiseToolConstants.RESPONSE_CODE_SUCCESS;
		Map<String, Object> ret = null;
		try {
			// parse input
			DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
			DynamoHttpServletResponse pResponse = ServletUtil.getCurrentResponse();
			String jsonData = pRequest.getParameter(MerchandiseToolConstants.REQUEST_PARAMETER_KEY);
			com.lanecrawford.merchandisetool.model.MerchToolSortRequest req = MerchandiseToolUtil.parseMerTool(jsonData);
			
			// check for input errors
			checkInputs(pRequest,pResponse,req);
			clientReferenceNumber = req.getCallerReferenceNo();
			
			// pass input to Manager
			logDebug("sort START , MerchToolSortRequest = " + req);
			sortedID = getLCMerchandiseToolManager().getProductIDList(pRequest,pResponse,req);
			if(null == sortedID || sortedID.size() <= 0)
				throw new MerchandiseToolException(MerchandiseToolConstants.RESPONSE_CODE_RESULT_NOT_FOUND); 
			sortedIDSize = sortedID.size();
		} catch (MerchandiseToolException e) {
			logDebug("MerchandiseToolException = " + e.getMessage());
			e.printStackTrace();
			responseCode = e.getMessage();
		} catch (JsonSyntaxException e) {
			logDebug("JsonSyntaxException = " + e.getMessage());
			e.printStackTrace();
			responseCode = MerchandiseToolConstants.RESPONSE_CODE_INVALID_JSON;
		} catch (RepositoryException e) {
			logDebug("RepositoryException = " + e.getMessage());
			e.printStackTrace();
			responseCode = MerchandiseToolConstants.RESPONSE_CODE_REPOSITORY_ERROR;
		} catch (Exception e) {
			logDebug("Exception = " + e.toString());
			e.printStackTrace();
			responseCode = MerchandiseToolConstants.RESPONSE_CODE_INTERNAL_ERROR;
		} finally {
			// construct response
			ret = new HashMap<String, Object>();
			long endTime = System.currentTimeMillis();
			ret.put(MerchandiseToolConstants.JSON_RESPONSE_RESPONSE_CODE, responseCode);
			ret.put(MerchandiseToolConstants.JSON_RESPONSE_CALLER_REFERENCE_NO, clientReferenceNumber);
			ret.put(MerchandiseToolConstants.JSON_RESPONSE_SERVER_REFERENCE_NO, serverReferenceNumber);
			if(null != sortedID || sortedIDSize > 0){
				ret.put(MerchandiseToolConstants.JSON_RESPONSE_SORTED_PRODUCT_ID, sortedID);
				ret.put(MerchandiseToolConstants.JSON_RESPONSE_SORTED_PRODUCT_ID_SIZE, sortedIDSize);
			}
			ret.put(MerchandiseToolConstants.JSON_RESPONSE_ELAPSED_TIME,(endTime-startTime));
			logDebug("sort END"  + ", elapsedTime (ms) = " + String.valueOf(endTime-startTime));
		}
		return ret;
	}

}
*/