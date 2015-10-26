'use strict';

angular.module('app.dashboard', ['ngResource'])
    .controller('DashboardCtrl', DashboardCtrl);

function DashboardCtrl(Applications) {

    var application = Applications.query();
    console.log(application);
  this.space                      = "7";
  this.application_amount         = "50";
  this.application_amount_follow  = "20";
  this.application_amount_open    = "30";
  this.profit                     = "10.000";
  this.revenue                    = "100.000";  
  this.convertionrate             = "10"
}

DashboardCtrl.prototype.changeSpace = function(space) {
  alert(space);
};

DashboardCtrl.prototype.addContact = function() {
  this.contacts.push({type: 'email', value: 'yourname@example.org'});
};

DashboardCtrl.prototype.removeContact = function(contactToRemove) {
 var index = this.contacts.indexOf(contactToRemove);
  this.contacts.splice(index, 1);
};

DashboardCtrl.prototype.clearContact = function(contact) {
  contact.type = 'phone';
  contact.value = '';
};