/*jslint browser:true, devel:true*/
/*eslint-env browser, es6*/
/*eslint no-console: "off"*/
/*global $*/

var url = "http://localhost:3000/clientes/"

$('table').on('click', '.editar', function (e) {
		var cli = $(this).closest('tr');
		$.ajax({
			url: url + cli.children(":first").text(),
			method: 'PUT',
			data: { nombre: cli.children().eq(1).text(), apellido: cli.children().eq(2).text() }
		}).done(function (dato) {
			console.log('Editado', dato);
		})
	});
	
	$('table').on('click', '.borrar', function (e) {
		var cli = $(this).closest('tr');
		$.ajax({
			url: url + cli.children(":first").text(),
			method: 'DELETE'
		}).done(function (dato) {
			console.log('Borrado', dato);
			cli.remove();
		})
	});

$(document).ready(function () {
    $.getJSON(url,
    function (json) {
        var tr;
        for (var i = 0; i < json.length; i++) {
            tr = $('<tr/>');
            tr.append("<td>" + json[i].id + "</td>");
            tr.append("<td>" + json[i].nombre + "</td>");
            tr.append("<td>" + json[i].apellido + "</td>");
            tr.append('<td><input type="button" class="editar" value="Editar" /> <input type="button" class="borrar" value="Eliminar" /></td>');
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
