package de.ostfale.todoappclient.todo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Bean which hold url and basepath and reads information from properties
 * Created :  23.09.2019
 *
 * @author : Uwe Sauerbrei
 */
@Component
@ConfigurationProperties(prefix = "todo")
public class ToDoRestClientProperties {

    private String url;
    private String basePath;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
}
