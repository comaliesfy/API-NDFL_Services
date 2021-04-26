import API.API_NDFL;
import io.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;

public class CurrentTests {
    API_NDFL api = new API_NDFL();
    public static final String fileNameFirst = "src/main/resources/NO_NDFL2_7708_6908_7707083893692032001_20200911_845B6A95-9FBB-4903-B354-23743C65E337.xml";
    public static final String fileNameSecond = "111";

    @Before
    public void setUp() {
        RestAssured.useRelaxedHTTPSValidation();
        //api.uploadFile(fileNameFirst);
        //api.uploadFile(fileNameSecond);

    }

    @Test
    public void searchExactQuery() {
        api.returnClient();
    }
    @Test
    public void searchNullifyingQuery() {
        api.returnClient();
    }
    @Test
    public void searchClarifyingQuery() {
        api.returnClient();
    }

}
