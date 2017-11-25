define([
    'jquery', 
    'underscore', 
    'backbone', 
    'router'
], function($, _, Backbone, Router) {
  var initialize = function() {
    //It is a function that Backbone calls every time to
    //read or save the model to the server. It represents the state of the model.
	  var sync = Backbone.sync;
	  Backbone.sync = function (method, model, options) {
	      var success = options.success;
	      options.success = function (resp, status, xhr) {
	          //Your logic goes here
	          console.log('succeed');
	          if (success) success(resp, status, xhr);
	      };
	      options.error = function (xhr, ajaxOptions, thrownError) {
	          console.log('failed');
	      }
	      sync(method, model, options);
	  };

    Router.initialize();

  };

  return {
    initialize: initialize
  };
});
