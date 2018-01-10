package rso.project.orders.api.v1.configuration;
import com.kumuluz.ee.configuration.cdi.ConfigBundle;
import javax.enterprise.context.ApplicationScoped;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Amra on 4.1.2018..
 */
@ConfigBundle("rest-properties")
@ApplicationScoped
public class RestProperties {

    @JsonProperty("healthy")
    private boolean healthy;

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
}
