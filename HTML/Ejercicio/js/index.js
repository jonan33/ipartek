/*jslint browser:true, devel:true*/
/*eslint-env browser, es6*/
/*eslint no-console: "off"*/
/*global $*/

var url = "http://localhost:3000/clientes/"

$(document).ready(function () {
    $.getJSON(url,
    function (json) {
        var tr;
        for (var i = 0; i < json.length; i++) {
            tr = $('<tr/>');
            tr.append("<td>" + json[i].id + "</td>");
            tr.append("<td>" + json[i].nombre + "</td>");
            tr.append("<td>" + json[i].apellido + "</td>");
            $('table').append(tr);
        }
    });
});

/*
function porCadaDato() {
    'use strict';
    
    console.log('Dentro de porCadaDato');
    
    $('ul').append('<li>' + this.nombre + '</li>');
}

function recepcionJSON(datos) {
    'use strict';
    
    console.log('Dentro de recepcionJSON');
    
    $(datos).each(porCadaDato);
}

$(function () {
    'use strict';

    console.log('Antes de getJSON');
    
    $.getJSON('datos.json', recepcionJSON);
    
    console.log('Después de getJSON');
});

*/
