define([
    "jquery", 
    "underscore", 
    "backbone",
    "views/BaseView",
    "text!template/welcomeTemplate.html"
], function($, _, Backbone, BaseView, welcomeTemplate) {
    
    var WelcomeView = BaseView.extend({
        events:{

        },
        initialize: function () {
        	var view = this;
        	view.$el.empty();
            view.$el.html(welcomeTemplate);
        },
        render: function () {
            var view = this;
        }
    });
    return WelcomeView;
    
});