package com.example.javier.apppokedex.interfaz;

import com.example.javier.apppokedex.models.PokemonRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Javier on 04/03/2018.
 */

public interface PokeapiService {
    public static final String BASE_URL = "https://pokeapi.co/api/v2/";


    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon(@Query("limit")int limit, @Query("offset") int offset);
}
