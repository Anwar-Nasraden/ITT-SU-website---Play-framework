package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }

     public Result home() {
            return ok(home.render());
        }
    public Result clubs() {
            return ok(clubs.render());
        }

    public Result whatson() {
            return ok(whatson.render());
        }
       
     public Result about() {
            return ok(about.render());
        }

      public Result contact() {
            return ok(contact.render());
        }

	
      public Result soccer() {
            return ok(soccer.render());
        }
	
      public Result basket() {
            return ok(basket.render());
        }
	
      public Result join() {
            return ok(join.render());
        }
}
