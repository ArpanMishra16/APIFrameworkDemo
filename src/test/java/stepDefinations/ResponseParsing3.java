package stepDefinations;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import resources.CreateUSer;
import resources.CreateUserResponse;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

import org.junit.Assert;

public class ResponseParsing3 {

	public static void main(String[] args) {
		
		CreateUSer cu = new CreateUSer();
		//CreateUserResponse cr = new CreateUserResponse();
		cu.setName("Arpan");
		cu.setJob("Developer");
		RestAssured.baseURI = "https://reqres.in";
		
//		Response response =		given().log().all().contentType(ContentType.JSON).body(cu)
//	.when().log().all().post("/api/users").then().log().all().assertThat().statusCode(201).extract().response();
//		
//		JsonPath js = new JsonPath(response.asString());
//		System.out.println(js.getInt("id"));
//		String name = js.get("name").toString();
//		Assert.assertEquals("Arpan", name);
		
		CreateUserResponse response =		given().log().all().contentType(ContentType.JSON).body(cu)
		.when().log().all().post("/api/users").as(CreateUserResponse.class);
		
		
		
		System.out.println(response.getJob());
		System.out.println(response.getName());
		System.out.println(response.getId());
		System.out.println(response.getCreatedAt());
		
		

	}

}
