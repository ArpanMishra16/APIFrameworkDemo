package resources;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

public class ResponseParsingPractice {

	public static void main(String[] args) {
		  
		
		RestAssured.baseURI = "https://reqres.in";
		
	Response response =	given().log().all().contentType(ContentType.JSON)
		.when().log().all().get("/api/users?page=2")
		.then().log().all().assertThat().statusCode(200).extract().response();
	
	String getResponse = response.asString();
	
	JsonPath js = new JsonPath(getResponse);
	System.out.println(js.getString("data"));
	
int size =	js.get("data.size()");
	for(int i=0;i<size;i++) {
		if(js.get("data["+i+"].avatar").toString().contains("8")) {
			System.out.println(js.get("data["+i+"].avatar").toString());
		}
	}
	System.out.println("********************************");
	
JSONObject jo = new JSONObject(getResponse);
for(int i=0;i<jo.getJSONArray("data").length();i++) 
          {
	 System.out.println(jo.getJSONArray("data").getJSONObject(i).get("avatar"));
	
          }

	}

}
