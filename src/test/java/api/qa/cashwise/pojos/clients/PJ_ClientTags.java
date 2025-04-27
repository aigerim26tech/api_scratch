package api.qa.cashwise.pojos.clients;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @JsonIgnoreProperties(ignoreUnknown = true)
public class PJ_ClientTags {

    private String nameTag;
    private PJ_ClientCompany company;

}
