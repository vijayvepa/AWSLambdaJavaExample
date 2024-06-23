package com.vijayvepa;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaMethodHandler implements RequestHandler<String, String> {
  @Override
  public String handleRequest(final String input, final Context context) {
    context.getLogger().log("Input: " + input);
    return "Hello World! - " + input;
  }
}
