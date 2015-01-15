package util;

import java.io.UnsupportedEncodingException;

import com.google.common.base.Charsets;
import com.google.common.io.BaseEncoding;

public class Base64Util {

	public static String encode(String input) {
		return BaseEncoding.base64().encode(input.getBytes(Charsets.UTF_8));
	}

	public static String decode(CharSequence input) throws UnsupportedEncodingException {
		byte[] result = BaseEncoding.base64().decode(input);
		return new String(result,"UTF-8");
	}

	public static void main(String[] args) throws UnsupportedEncodingException {
		//String x =Base64Util.encode("hhhaah");
		//System.out.println(Base64Util.decode(x));
		
	}
}
