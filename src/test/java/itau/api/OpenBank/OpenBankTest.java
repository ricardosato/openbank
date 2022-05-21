package itau.api.OpenBank;

import org.apache.http.HttpStatus;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class OpenBankTest {
    @Test
    public void testListaAgencia() {
        baseURI = "https://api.itau/open-banking/products-services/v1/personal-accounts";
        when().
            get(baseURI).
        then().
                statusCode(HttpStatus.SC_OK)
                .body("data.brand.companies.cnpjNumber[0]", is( "60701190000104"));

    }
}
