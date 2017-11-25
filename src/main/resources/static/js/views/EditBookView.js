define([
    "jquery", 
    "underscore", 
    "backbone",
    "text!template/EditBookTemplate.html",
    "views/BaseView"
], function($, _, Backbone, editBookTemplate, BaseView) {
    
    var EditBookView = BaseView.extend({
        events:{
        	'click #testButton':'testFun',
        	'submit #upload-button':'fileUpload'
        },
        initialize: function (options) {
        	var view = this;
        	view.bookData = options.data;
        	view.$el.html(editBookTemplate);
        	view.$el.find('#bookCoverImage1').attr("src","css/customImages/one.jpg");
        },
        render: function () {
        	var view = this;
        	view.$el.find('#bookTitle').text(view.bookData.bookName);
        	view.$el.find('#bookAutherName').text(view.bookData.bookAuthor);
        },
        fileUpload: function() {
			var view = this;
			
		}
    });
    return EditBookView;
    
});