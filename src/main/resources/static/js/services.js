/**
 * Created by Andreas on 17.05.2015.
 */
'use strict';

angular.module('app.services', ['ngResource']);

    app.service('login', ['$resource', function($resource){
        return $resource('/login', {}, {
            'query' :   {method:'GET'     },
            'save'  :   {method:'POST'    },
            'update':   {method:'PUT'     },
            'remove':   {method:'DELETE'  }
        });
    }]);

    app.service('logout', ['$resource', function($resource){
        return $resource('/logout', {}, {
            'query' :   {method:'GET'     },
            'save'  :   {method:'POST'    },
            'update':   {method:'PUT'     },
            'remove':   {method:'DELETE'  }
        });
    }]);

    app.service('Applications', ['$resource', function($resource){
        return $resource('api/rest/applications', {}, {
            'query' :   {method:'GET'     },
            'save'  :   {method:'POST'    },
            'update':   {method:'PUT'     },
            'remove':   {method:'DELETE'  }
        });
    }]);

    app.service('Inquirers', ['$resource', function($resource){
        return $resource('api/rest/inquirers', {}, {
            'query' :   {method:'GET'     },
            'save'  :   {method:'POST'    },
            'update':   {method:'PUT'     },
            'remove':   {method:'DELETE'  }
        });
    }]);

    app.service('Vendors', ['$resource', function($resource){
        return $resource('api/rest/vendors', {}, {
            'query' :   {method:'GET'     },
            'save'  :   {method:'POST'    },
            'update':   {method:'PUT'     },
            'remove':   {method:'DELETE'  }
        });
    }]);

    app.service('Containers', ['$resource', function($resource){
        return $resource('api/rest/containers', {}, {
            'query' :   {method:'GET'     },
            'save'  :   {method:'POST'    },
            'update':   {method:'PUT'     },
            'remove':   {method:'DELETE'  }
        });
    }]);

    app.service('Users', ['$resource', function($resource){
        return $resource('api/rest/users', {}, {
            'query' :   {method:'GET'     },
            'save'  :   {method:'POST'    },
            'update':   {method:'PUT'     },
            'remove':   {method:'DELETE'  }
        });
    }]);