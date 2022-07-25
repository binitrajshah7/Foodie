package com.gmail.foody

import com.gmail.foody.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

/** we will define all our GET request from API in this interface*/
interface FoodRecipesApi {

    /** QueryMap will help us to create hashmap to add all our queries at once
     * - FoodRecipe is return type wrapped inside response class
     * - Response class is part of retrofit library for HTTP response
     * - suspend to use kotlin coroutine (to run in background thread)*/
    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String, String>,
    ): Response<FoodRecipe>

}