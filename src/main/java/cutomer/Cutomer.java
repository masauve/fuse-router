
package cutomer;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "customer",
    "account",
    "city"
})
public class Cutomer {

    @JsonProperty("customer")
    private String customer;
    @JsonProperty("account")
    private String account;
    @JsonProperty("city")
    private String city;

    /**
     * 
     * @return
     *     The customer
     */
    @JsonProperty("customer")
    public String getCustomer() {
        return customer;
    }

    /**
     * 
     * @param customer
     *     The customer
     */
    @JsonProperty("customer")
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * 
     * @return
     *     The account
     */
    @JsonProperty("account")
    public String getAccount() {
        return account;
    }

    /**
     * 
     * @param account
     *     The account
     */
    @JsonProperty("account")
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

}
