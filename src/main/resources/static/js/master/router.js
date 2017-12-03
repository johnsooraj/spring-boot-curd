define([
	"jquery", 
	"underscore", 
	"backbone", 
	"views/WelcomeView", 
	"views/BooksView",
	"views/AddBookView"
], function( $,  _, Backbone, WelcomeView, BooksView, AddBookView) {

  var AppRouter = Backbone.Router.extend({
    routes: {
      "": "Welcome",
      "books": "Home",
      "newbook": "AddBook"
    }
  });

  var initialize = function() {
    var app_router = new AppRouter();
    
    var saveUnSaveEdit = function(_this) {
    		  var status = {
        	    unsavedEdits: false
        	  };
        	 
        	  Backbone.trigger('myapp:navigate', status);
        	  if (status.unsavedEdits) {
        		  var confirmed = window.confirm(status.msg || "There are unsaved edits. Continuing will discard these edits.");
        		  if(confirmed){
        			  Backbone.trigger('changeFlag', status);
        			  return true;
        		  }
        		  else{
        			  _this.navigate(status.url, { trigger: false, replace: true });
        			  return false;
        		  }
        	  }else{
        		  return true;
        	  }
	}
    
    app_router.on("route:Welcome", function(actions) {
      var welcomeView = new WelcomeView();
      welcomeView.render()
    });
    app_router.on("route:Home", function(actions) {
      var booksView = new BooksView();
      booksView.render();
    });
    app_router.on("route:AddBook", function(actions) {
    	if(saveUnSaveEdit(this)){
    		var addBookView = new AddBookView();
            addBookView.render();
    	}
    });
    Backbone.history.start();
  };

  return {
    initialize: initialize
  };
});
