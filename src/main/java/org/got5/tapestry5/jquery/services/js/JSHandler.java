package org.got5.tapestry5.jquery.services.js;

import org.apache.tapestry5.http.services.Response;

import java.io.IOException;


public interface JSHandler {
    public boolean handleRequest(String path, Response response) throws IOException;
}
