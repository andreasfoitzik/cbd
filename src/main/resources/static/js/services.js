/**
 * Created by Andreas on 17.05.2015.
 */
'use strict';

angular.module('app.services', ['ngResource']);

    app.service('dashboard', ['$resource', function($resource){
        return $resource('/dashboard', {}, {
            query:  {method:'GET', isArray:true},
            save:   {method:'POST', isArray:true},
            update: {method:'PUT', isArray:true},
            remove: {method:'DELETE', isArray:true}
        });
    }]);

    app.service('user', ['$resource', function($resource){
        return $resource('/user', {}, {
            query:  {method:'GET', isArray:true},
            save:   {method:'POST', isArray:true},
            update: {method:'PUT', isArray:true},
            remove: {method:'DELETE', isArray:true}
        });
    }]);

    app.service('login', ['$resource', function($resource){
        return $resource('/login', {}, {
            query:  {method:'GET', isArray:true},
            save:   {method:'POST', isArray:true},
            update: {method:'PUT', isArray:true},
            remove: {method:'DELETE', isArray:true}
        });
    }]);

    app.service('logout', ['$resource', function($resource){
        return $resource('/logout', {}, {
            query:  {method:'GET', isArray:true},
            save:   {method:'POST', isArray:true},
            update: {method:'PUT', isArray:true},
            remove: {method:'DELETE', isArray:true}
        });
    }]);

    app.service('sales', ['$resource', function($resource){
        return $resource('/sales', {}, {
            query:  {method:'GET', isArray:true},
            save:   {method:'POST', isArray:true},
            update: {method:'PUT', isArray:true},
            remove: {method:'DELETE', isArray:true}
        });
    }]);

    app.service('setting', ['$resource', function($resource){
        return $resource('/settings', {}, {
            query:  {method:'GET', isArray:true},
            save:   {method:'POST', isArray:true},
            update: {method:'PUT', isArray:true},
            remove: {method:'DELETE', isArray:true}
        });
    }]);

    app.service('statistic', ['$resource', function($resource){
        return $resource('/statistic', {}, {
            query:  {method:'GET', isArray:true},
            save:   {method:'POST', isArray:true},
            update: {method:'PUT', isArray:true},
            remove: {method:'DELETE', isArray:true}
        });
    }]);