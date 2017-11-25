define([
    'underscore',
    'backbone',
    'models/BooksModel'
], function(_, Backbone, BookModel) {

    var BooksModel = Backbone.Model.extend({
    	model: BookModel,
    	url: '/books',
    	initialize: function() {
            console.log('BooksModel Created')
        }
    });
    return BooksModel;
});