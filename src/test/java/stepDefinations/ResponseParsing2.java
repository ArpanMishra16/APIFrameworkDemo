package stepDefinations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import org.json.JSONObject;

import static io.restassured.RestAssured.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ResponseParsing2 {

	public static void main(String[] args) throws FileNotFoundException {
	
		PrintStream ps = new PrintStream(new FileOutputStream("Response.txt"));
		
		RequestSpecification reqSpec =	new RequestSpecBuilder().setContentType(ContentType.JSON)
				.setBaseUri("https://reqres.in")
				.addFilter(RequestLoggingFilter.logRequestTo(ps))
				.addFilter(ResponseLoggingFilter.logResponseTo(ps)).build();
		
	ResponseSpecification res =	new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
//Response response =		given().spec(reqSpec).when().get("/api/users/2").then().assertThat().statusCode(200)
		//.extract().response();
	
	Response response =given().spec(reqSpec).when().get("/api/users/2").then().spec(res).extract().response();
System.out.println(response.getHeader("Content-Type"));

String response_str = response.asString();
JsonPath js = new JsonPath(response_str);
System.out.println(js.get("data.email").toString());

JSONObject jo = new JSONObject(response_str);
System.out.println(jo.getJSONObject("data").get("email"));
		
		

	}

}
