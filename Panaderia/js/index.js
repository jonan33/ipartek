/*jslint browser:true, devel:true*/
/*eslint-env browser, es6*/
/*eslint no-console: "off"*/
/*global $*/


$("#portada").show();
$("#quienes").hide();
$("#servicios").hide();
$("#productos").hide();
$("#noticias").hide();
$("#contacto").hide();


$("#quienes").click(function(){
    $("#quienes").show();
    $("#portada").hide();
    $("#servicios").hide();
    $("#productos").hide();
    $("#noticias").hide();
    $("#contacto").hide();
})
    
$("#servicios").click(function(){
    $("#servicios").show();
    $("#portada").hide();
    $("#quienes").hide();
    $("#productos").hide();
    $("#noticias").hide();
    $("#contacto").hide();
})
    
$("#productos").click(function(){
    $("#productos").show();
    $("#portada").hide();
    $("#servicios").hide();
    $("#quienes").hide();
    $("#noticias").hide();
    $("#contacto").hide();
})
    
$("#noticias").click(function(){
    $("#noticias").show();
    $("#portada").hide();
    $("#servicios").hide();
    $("#quienes").hide();
    $("#productos").hide();
    $("#contacto").hide();
})
    
$("#contacto").click(function(){
    $("#contacto").show();
    $("#portada").hide();
    $("#servicios").hide(;)
    $("#quienes").hide();
    $("#noticias").hide();
    $("#productos").hide();
})