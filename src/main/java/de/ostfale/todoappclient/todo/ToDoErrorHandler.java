package de.ostfale.todoappclient.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;
import java.nio.charset.Charset;


/**
 * Error handler takes care of any responses coming from the server
 * Created :  23.09.2019
 *
 * @author : Uwe Sauerbrei
 */
public class ToDoErrorHandler extends DefaultResponseErrorHandler {

    private Logger log = LoggerFactory.getLogger(ToDoErrorHandler.class);

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        log.error(response.getStatusCode().toString());
        log.error(StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
    }
}
