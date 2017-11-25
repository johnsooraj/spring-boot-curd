define([
    "jquery", 
    "underscore", 
    "backbone",
    "text!template/BooksTemplate.html",
    "models/BooksModel",
    "collections/BookCollection",
    "views/BaseView",
    "views/EditBookView",
    "sources/bookSources",
    "jqxall"
], function($, _, Backbone, booksTemplate, BooksCollection, BooksModel, BaseView, EditBookView, BookSources, jqxall) {
    
    var BooksView = BaseView.extend({
        events:{

        },
        initialize: function () {
            var view = this;
            view.$el.empty();
            view.$el.html(booksTemplate);
            view.bookCollection = new BooksCollection();
            view.listenTo(view.bookCollection, 'change update', view.render);
            view._loadBookGrid();
        },
        render: function () {
            var view = this;
            view.bookCollection.fetch({
            	success: function(collection, response) {
            		view.sources.localdata = response;
                	view.$el.find('#bookGrid').jqxGrid('updatebounddata');
				},
				error: function(collection, response) {
					
				}
            });
        },
        _loadBookGrid: function() {
			var view = this;
			view.sources = BookSources;
            var dataAdapter = new $.jqx.dataAdapter(view.sources, {});
			$("#bookGrid").jqxGrid({
                source: dataAdapter,
                width: '100%',
                height: 500,
                columns: [
                { text: 'Book Id', datafield: 'id', width: '20%' }, 
                { text: 'Book Name', datafield: 'bookName', width: '40%'}, 
                { text: 'Book Author', datafield: 'bookAuthor', width: '40%' }
                ]
            });
            $('#bookGrid').on('rowselect', function (event) 
            		{
            		    var args = event.args;
            		    var rowBoundIndex = args.rowindex;
            		    var rowData = args.row;
            		    editBookView = new EditBookView({ el: $('#bookEditWinddow').get(0), data: rowData, parentView: view });
            		    editBookView.render();
            		});
			
		}
    });
    return BooksView;
    
});