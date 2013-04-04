package controllers;

import play.Logger;
import play.mvc.Controller;

public class ApiHelpController extends Controller {
	
  public static void catchAll() {
    Logger.info("ApiHelpController.catchAll got called. This should not happen;" +
    		"SwaggerPlugin.rawInvocation should be intercepting and processing this call");
  }
  
}