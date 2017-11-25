require.config({
  paths: {
    text: "/webjars/requirejs-text/2.0.15/text",
    backbone: "/webjars/backbonejs/1.3.3/backbone-min",
    jquery: "/webjars/jquery/3.2.1/jquery.min",
    underscore: "/webjars/underscorejs/1.8.3/underscore-min",
    router: "router",
    views: "../views",
    models: "../models",
    collections: "../collections",
    template: "../template",
    sources: "../sources",
    jqxall: "../libs/jqx-all"
  },
  shim: {
    jquery: {
      exports: "$"
    },
    underscore: {
      exports: "_"
    },
    backbone: {
      deps: ["underscore", "jquery"],
      exports: "Backbone"
    },
    collections: {
      export: "$",
      deps: ["jquery", "jqxcore"]
    },
    models: {
      export: "$",
      deps: ["jquery"]
    },
    sources: {
      export: "$",
      deps: ["jquery"]
    },
    views: {
      export: "$",
      deps: ["jquery"]
    },
    jqxall: {
      export: "$",
      deps: ["jquery"]
    }
  }
});

require(["app"], function(App) {
  App.initialize();
});
