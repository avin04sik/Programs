package jsonread;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class UpdateJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 JSONParser parser = new JSONParser();
		 JSONObject jsonObject;
		 
	        try {
	 
	               jsonObject = (JSONObject) parser.parse(new FileReader(
	                    "C:/Users/10050725/Desktop/session.json"));
	 
	         //   JSONObject jsonObject = (JSONObject) obj;
	 
	            

		         System.out.println("OBj from JSON File from system  :--- " +jsonObject.toString());
	     
	         System.out.println("\nJSONOBJECT From Obj :--- " +jsonObject.toString());
	         
	         //json path for featureName
	         String jsonPath="$.fingerprint";
	         jsonPath="$.fingerprint.criteria.item.hashValue";
	         String value=2134+"";
	         //  jsonPath=null;
	         
	        // if(jsonPath!=null)
	          // updateJSON(jsonObject,jsonPath,value);

//
	         
	         String UpdatedJSONString;//=    updateJSON(jsonObject,jsonPath,value);
//	         
//	 //      String UpdatedJSONString=    updateJson3(jsonObject,jsonPath,value);
//	        System.out.println("UpdatedJSONString:--- "+UpdatedJSONString);
//	        if(UpdatedJSONString.equals(jsonObject.toString()))
//	        	System.out.println("trueee");
	         
	         //for simple jsonpath
	        System.out.println("\n\n\n\n******for simple jsonpath");
	        jsonPath="$.featureName";
	          value="testfEature";
	          
	          UpdatedJSONString=    updateJSON(jsonObject,jsonPath,value);
	          
	          System.out.println("UpdatedJSONString:--- "+UpdatedJSONString);
		        if(UpdatedJSONString.equals(jsonObject.toString()))
		        	System.out.println("trueee");
	         
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        
	}
	

	
	private static String updateJSON(JSONObject jsonObject,String jsonPath,String value) throws FileNotFoundException, IOException, ParseException {
		
	//	 JSONParser parser = new JSONParser();
		 JSONObject childJsonObject[];
		 JSONObject parentField;;
		parentField=jsonObject;
	
		System.out.println("*********"+parentField);
		
		 String[] keys;
			
		System.out.println("\n******inside updatejson method**** "+jsonPath.toString());
		//split the jsonPath
		 keys=jsonPath.split("\\.");//splits the string based on dot character.  
	       //using java foreach loop to print elements of string array  
	       for(String w:keys){  
	       System.out.println(w);  
	       }  
		
		System.out.println(keys.length);
	
//	System.out.println(keys);
	
	//JSONArray subchildJsonArray=new JSONArray(); 
	childJsonObject = new JSONObject[keys.length-1];
	String str;
		 
	int i=1;

	
            if(keys.length<2){
	             System.out.println("jsonPath is too short");
            }
           else if(keys.length==2){
	          jsonObject.remove(keys[i]);
            	jsonObject.put(keys[i], value);	
           }
	
	     else if(keys.length>2){
	    for(int k=1;k<keys.length;k++){
	    	if(k<childJsonObject.length){
	    	System.out.println(k);
	    	 childJsonObject[k-1]=(JSONObject) jsonObject.get(keys[k]);
	    	 System.out.println("childJsonObject"+(k-1)+":--- "+childJsonObject[k-1]);
	    	 jsonObject=childJsonObject[k-1];
	    	 System.out.println("jsonObject:--- "+jsonObject);
	    	 }
	    	else if (k==childJsonObject.length){
	    		System.out.println(k);
	    		str=(String) jsonObject.get(keys[k]);
	    		System.out.println(str);
	    		  jsonObject.remove(keys[k]);
	            	jsonObject.put(keys[k], value);	
	            	System.out.println("after deleting  old value:--- "+jsonObject);
	    		
	            	//creating json object after updating the value
	            	
	    	}
	    }
System.out.println("********* parentField :---" +parentField);
	    }
		
	    
//jsonObject=parentField;
System.out.println("\n\njsonObject value after update is :--- "+parentField);

return parentField.toString();
 }
}