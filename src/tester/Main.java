package tester;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class Main {

	public static void main(String[] args) throws Exception{
		
		JSONArray jsonArray = new JSONArray();
		
		JSONObject jsonObject = new JSONObject();
		
//		jsonObject.put("name", "bahar");
//		jsonObject.put("family", "sadeghi");
//		jsonObject.put("age", 12);
//		
//		JSONArray lang = new JSONArray ();
//		lang.add("c#");
//		lang.add("java");
//		
//		jsonObject.put("lang", lang);
//		
//		
//		
//		JSONObject jsonObject1 = new JSONObject();
//		
//		jsonObject1.put("name", "bahar");
//		jsonObject1.put("family", "sadeghi");
//		jsonObject1.put("age", 12);
//		
//		JSONArray lang1 = new JSONArray ();
//		lang1.add("c#");
//		lang1.add("java");
//		
//		jsonObject1.put("lang", lang);
//		
//		jsonArray.add(jsonObject);
//		jsonArray.add(jsonObject1);
//		
//		System.out.println(jsonArray.toJSONString());
//		
		
		String str = "[{\"name\":\"bahar\",\"family\":\"sadeghi\",\"lang\":[\"c#\",\"java\"],\"age\":12},{\"name\":\"bahar\",\"family\":\"sadeghi\",\"lang\":[\"c#\",\"java\"],\"age\":12}]";
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonAraay = (JSONArray) jsonParser.parse(str);
		for(Object o: jsonArray){
			JSONObject jsonObject1 = (JSONObject) o;
			
			System.out.println(jsonObject1.get("name"));
			System.out.println(jsonObject1.get("famoly"));
			System.out.println(jsonObject1.get("age"));
			
			JSONArray jsonArray1 = (JSONArray) jsonObject1.get("lang");
			for(Object o1: jsonArray1){
				System.out.println(o1);
			}
			
			
		}
	}

}
