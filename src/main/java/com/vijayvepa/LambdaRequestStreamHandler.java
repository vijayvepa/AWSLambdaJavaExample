package com.vijayvepa;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;


public class LambdaRequestStreamHandler implements RequestStreamHandler {
  @Override
  public void handleRequest(final InputStream inputStream, final OutputStream outputStream, final Context context) throws IOException {
    String input = IOUtils.toString(inputStream, "UTF-8");
    outputStream.write(("Hello World!\n" + input).getBytes());
  }
}
