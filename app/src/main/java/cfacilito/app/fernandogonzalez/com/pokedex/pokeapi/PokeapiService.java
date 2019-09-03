package cfacilito.app.fernandogonzalez.com.pokedex.pokeapi;

import retrofit2.Call;
import cfacilito.app.fernandogonzalez.com.pokedex.models.PokemonRespuesta;
import retrofit2.http.GET;

public interface PokeapiService {

    @GET("pokemon")
    Call<PokemonRespuesta> obtenerListaPokemon();

}
