/**
 * Created by Andreas on 16.05.2015.
 */

'use strict';

angular.module('app', [
    'app.services',
    'app.dashboard',
    'app.data',
    'app.login',
    'app.logout',
    'app.sales',
    'app.settings',
    'app.statistiken',
    'ngNewRouter',
    'ngResource'
])
    .controller('AppController', ['$router', AppController]);

function AppController($router) {
    $router.config([
        { path: "/dashboard",               component: "dashboard"      },
        { path: "/data",                    component: "data"           },
        { path: "/login",                   component: "login"          },
        { path: "/",                        component: "login"          },
        { path: "/logout",                  component: "logout"         },
        { path: "/sales",                   component: "sales"          },
        { path: "/settings",                component: "settings"       },
        { path: "/statistiken",             component: "statistiken"    }
    ]);
}
