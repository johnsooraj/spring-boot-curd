define([
    "jquery", 
    "underscore", 
    "backbone"
], function($, _, Backbone) {
  Books = {
    datatype: "json",
    datafields: [
      { name: "id", type: "number" },
      { name: "bookName", type: "string" },
      { name: "bookAuthor", type: "string" },
    ],
    id: "adCopyID"
  };

  return Books;
});
