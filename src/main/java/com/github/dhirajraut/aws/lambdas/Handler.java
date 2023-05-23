package com.github.dhirajraut.aws.lambdas;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<String, String> {

    @Override
    public String handleRequest(String input, Context context) {
        
        String output = "Input = " + input;
        double randomNumber = Math.random();
        if ((Math.round(randomNumber * 100)) % 2 != 0) {
            printMessage(context, "Error...!!!");
            throw new RuntimeException ("Intermittent Exception");
        }
        printMessage(context, "You are safe this time...");
        return output;
    }
    
    public void printMessage(Context context, String message) {
        if (context != null && context.getLogger() != null) {
            context.getLogger().log(message);
        }
        else {
            System.out.println(message);
        }
    }
}
