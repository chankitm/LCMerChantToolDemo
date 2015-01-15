package task;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.log4j.Logger;

public class linkTestTask implements Callable<Integer>{
	String url;
	private int retryCount;
	private static final String USER_AGENT = "Mozilla/5.0";
	private static Logger logger = Logger.getLogger(linkTestTask.class);
	
	public linkTestTask(String url, int retryCount) {
		super();
//		logger.info("linkTestTask()"+","+"url="+url);
		this.url = url;
		this.retryCount = retryCount;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getRetryCount() {
		return retryCount;
	}
	public void setRetryCount(int retryCount) {
		this.retryCount = retryCount;
	}
	

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		int ret = -1;
//		logger.info("linkTestTask.call()"+","+"url="+this.getUrl());
		
		for(int i = 1; i <= this.retryCount; i++){
			ret = -1;
			try {
				ret = getResponseApache(this.url);
				Thread.sleep(300);
			} catch (Exception e) {
			//	e.printStackTrace();
			//	logger.info("EXCEPTION"+",url="+this.getUrl());
			} 
			
			if(ret >= 200 && ret < 300) {
				logger.info("SUCCESS"+","+ret+","+this.getUrl()+","+i+","+retryCount);
				break;
			} else if(ret >= 300 && ret < 400){
				logger.info("REDIRECT"+","+ret+","+this.getUrl()+","+i+","+retryCount);
				break;
			} else if (ret >= 400 && ret < 500) {
				logger.info("Client_Error" + "," + ret + "," + this.getUrl() + "," + i + "," + retryCount);
				break;
			} else if (ret >= 500 && ret < 600) {
				logger.info("Server_Error" + "," + ret + "," + this.getUrl() + "," + i + "," + retryCount);
				break;
			} else {
				if (retryCount == i) {
					logger.info("RETRY_FAILS" + "," + ret + "," + this.getUrl() + "," + i + "," + retryCount);
				}
			}
		}
		
		return ret;
	}

	private int getResponseApache(String url) throws Exception {
		HttpClient client = new DefaultHttpClient();
		
		HttpParams params = new BasicHttpParams();
		params.setParameter("http.protocol.handle-redirects",false);
		params.setParameter("http.connection-manager.timeout", 10000);
		
		HttpGet request = new HttpGet(url);
		request.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:29.0) Gecko/20100101 Firefox/29.0");
		request.setParams(params);
		
		HttpResponse response = client.execute(request);
		
		StatusLine ret = response.getStatusLine();
		//logger.info(ret.getStatusCode());
		return ret.getStatusCode();
		
	}
}
