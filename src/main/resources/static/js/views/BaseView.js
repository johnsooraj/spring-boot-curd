define([
    "jquery", 
    "underscore", 
    "backbone"
], function($, _, Backbone) {
    
    var BaseView = Backbone.View.extend({
        el: $("#webAppContainer"),
        events:{

        },
        initialize: function () {
        	var view = this;
        },
        render: function () {
            var view = this;
        }
    });
    return BaseView;
    
});