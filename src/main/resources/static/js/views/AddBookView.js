define([
    "jquery", 
    "underscore", 
    "backbone",
    "views/BaseView",
    "text!template/AddBookTemplate.html"
], function($, _, Backbone, BaseView, addBookTemplate) {
    
    var AddBookView = BaseView.extend({
        events:{

        },
        initialize: function () {
        	var view = this;
        	view.$el.empty();
            view.$el.html(addBookTemplate);
        },
        render: function () {
            var view = this;
        }
    });
    return AddBookView;
    
});