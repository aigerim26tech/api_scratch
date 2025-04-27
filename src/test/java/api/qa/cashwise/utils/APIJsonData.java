package api.qa.cashwise.utils;

public class APIJsonData {
    public static String createClient(String companyName, String email){
        return "{\n" +
                "  \"company_name\": \"" + companyName +"\",\n" +
                "  \"client_name\": \"IT\",\n" +
                "  \"email\": \"" + email+"\",\n" +
                "  \"phone_number\": \"1234567890\",\n" +
                "  \"address\": \"cox road\",\n" +
                "  \"tags_id\": [\n" +
                "    15\n" +
                "  ]\n" +
                "}";
    }
}
