package JSONCreator;

import com.github.underscore.lodash.U;

public class ClientRequest {

    String idNum = "147621";
    String idSeries = "4438";
    String idType = "21";

    String FirstName = "МАКАР";
    String LastName = "КАСИЛКИН";
    String MiddleName = "СВЯТОСЛАВОВИЧ";

    public String requestToJson() {
        U.Builder builder = U.objectBuilder()
                .add("PersonInfo", U.arrayBuilder()
                        .add(U.objectBuilder()
                                .add("Birthday", "1978-10-24")
                                .add("IdentityCard", U.arrayBuilder()
                                        .add(U.objectBuilder()
                                                .add("IdNum", idNum)
                                                .add("IdSeries", idSeries)
                                                .add("IdType", idType)))
                                .add("PersonName", U.arrayBuilder()
                                        .add(U.objectBuilder()
                                                .add("FirstName", FirstName)
                                                .add("LastName", LastName)
                                                .add("MiddleName", MiddleName)))))


                .add("ReportPeriod", 2020)
                .add("RqTm", "2019-02-25 13:37:54")
                .add("RqUID", "string")
                .add("SPName", "string")
                .add("SystemId", "string");

        return builder.toJson().replaceAll("[\\[\\]]", "");
    }
}
