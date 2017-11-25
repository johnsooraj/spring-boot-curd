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
    app_router.on("route:Welcome", function(actions) {
      var welcomeView = new WelcomeView();
      welcomeView.render()
    });
    app_router.on("route:Home", function(actions) {
      var booksView = new BooksView();
      booksView.render();
    });
    app_router.on("route:AddBook", function(actions) {
        var addBookView = new AddBookView();
        addBookView.render();
    });
    Backbone.history.start();
  };

  return {
    initialize: initialize
  };
});
