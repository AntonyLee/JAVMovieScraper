package moviescraper.doctord.controller;

import com.cedarsoftware.util.io.JsonReader;
import com.cedarsoftware.util.io.JsonWriter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilityFunctions {
	
	/**
	 * Returns a deep copy of the object by serializing it and then deserializing it
	 * @param root - the object to clone
	 * @return a deep copy of the object
	 */
	public static Object cloneObject(Object root)
	{
	    return JsonReader.jsonToJava(JsonWriter.objectToJson(root));    
	}

	public static String findIDTagFromFileName(String fileName) {
		Pattern r = Pattern.compile("[A-Za-z]{2,4}-[0-9]{3,5}");
		Matcher m = r.matcher(fileName);
		m.find();
		String idTag = m.group();

		return idTag;
	}

}
