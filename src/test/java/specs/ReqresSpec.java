package specs;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static helpers.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.JSON;

public class ReqresSpec {

    public static RequestSpecification reqresRequestSpec = with()
            .filter(withCustomTemplates())
            .contentType(JSON)
            .log().all();

    public static ResponseSpecification reqresResponseSpec200 = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .log(LogDetail.ALL)
            .build();

    public static ResponseSpecification reqresResponseSpec404 = new ResponseSpecBuilder()
            .expectStatusCode(404)
            .log(LogDetail.ALL)
            .build();

    public static ResponseSpecification reqresResponseSpec204 = new ResponseSpecBuilder()
            .expectStatusCode(204)
            .log(LogDetail.ALL)
            .build();
}
