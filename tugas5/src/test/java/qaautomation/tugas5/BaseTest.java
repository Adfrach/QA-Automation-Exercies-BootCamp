package qaautomation.tugas5;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.given;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

//public class BaseTest {
//	RequestSpecification commonJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com").setContentType(ContentType.JSON).build().log().all();
//	RequestSpecification registerJsonSpec;
//	String token;
//	Faker faker = new Faker();
//	String username = faker.name().firstName();
//	String password = "akuadalahlelaki";
//	String email = faker.internet().emailAddress();
//	String phone = faker.phoneNumber().cellPhone();
//	
//	@BeforeMethod
//	public void register() {
//		String registerPayLoad = String.format("{\"username\":\"%s\",\"password\":\"%s\",\"email\":\"%s\",\"phonenumber\":\"%s\"}",username,password,email,phone);
//		Response response = given().spec(commonJsonSpec).body(registerPayLoad).when().post("/register");
//		assertEquals(response.getStatusCode(),201);
//		registerJsonSpec = new RequestSpecBuilder().setBaseUri("https://kolakproject.herokuapp.com").setContentType(ContentType.JSON).build().log().all();
//		
//	}
//}
