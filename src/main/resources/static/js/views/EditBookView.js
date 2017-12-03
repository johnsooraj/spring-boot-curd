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
        	'submit #upload-button':'fileUpload',
        	'click #unsaveEditInput':'changeUnsaveEdit',
        	'click #unsaveEditInputFalse': 'makeItFalse'
        },
        initialize: function (options) {
        	var view = this;
        	var url = (window.location.href).split("#");
        	this.listenTo(Backbone, "myapp:navigate", function(status){
        		  if (this.unsavedEdits){
        		    status.unsavedEdits = true;
        		    status.msg = "There are unsaved edits to Edit Book. Continuing will discard these edits.";
        		    status.url = url[1];
        		  }
        	});
        	this.listenTo(Backbone, "changeFlag", function(status) {
                this.unsavedEdits = false;
            });
        	view.bookData = options.data;
        	view.$el.html(editBookTemplate);
        	view.$el.find('#bookCoverImage1').attr("src","css/customImages/one.jpg");
        },
        render: function () {
        	var view = this;
        	view.unsavedEdits = false;
        	view.$el.find('#bookTitle').text(view.bookData.bookName);
        	view.$el.find('#bookAutherName').text(view.bookData.bookAuthor);
        },
        changeUnsaveEdit: function() {
			var view = this;
			view.unsavedEdits = true;
		},
		makeItFalse: function() {
			var view = this;
        	view.unsavedEdits = false;
		}
    });
    return EditBookView;
    
});