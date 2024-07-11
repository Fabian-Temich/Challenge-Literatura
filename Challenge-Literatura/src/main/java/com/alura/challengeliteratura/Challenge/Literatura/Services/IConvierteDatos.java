package com.alura.challengeliteratura.Challenge.Literatura.Services;



public interface IConvierteDatos {

    <T> T convertirDatosJsonAJava(String json , Class<T> clase);

}