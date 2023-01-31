package com.example.exam.controller;

import com.example.exam.model.Actor;
import com.example.exam.model.Movie;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@SwaggerDefinition
@RestController
public class MovieActorController {

    List<Movie> movieList = new ArrayList<Movie>();
    {
        Movie film1 = new Movie("Princesse Mononoke","Hayao MIYAZAKI",new Actor(),"2000");
        Movie film2 = new Movie("Le voyage de Chihiro","Hayao MIYAZAKI",new Actor(),"2002");
        Movie film3 = new Movie("Man of Steel","Zack SNYDER",new Actor(),"2013");
        Movie film4 = new Movie("Justice League","Zack SNYDER",new Actor(),"2017");
        Movie film5 = new Movie("AGENTS TRÈS SPÉCIAUX - CODE U.N.C.L.E","Guy RITCHIE",new Actor(),"2015");

        movieList.add(film1);
        movieList.add(film2);
        movieList.add(film3);
        movieList.add(film4);
        movieList.add(film5);
    }

    List<Actor> actorList = new ArrayList<Actor>();
    {
        Actor actor1 = new Actor("CAVILL","Henri","5/05/1983", new Movie());
        Actor actor2 = new Actor("MIYAZAKI","Chihiro","17/08/2000", new Movie());
        Actor actor3 = new Actor("MIYAZAKI","Mononoke","09/06/1996", new Movie());
        actorList.add(actor1);
        actorList.add(actor2);
        actorList.add(actor3);
    }

    @ApiOperation(value = "Get the Actors and Movie from the System",response = Iterable.class, tags = "getActor&Movie")
    @ApiResponses(value = {
            @ApiResponse(code=200,message="Success"),
            @ApiResponse(code=401,message="Not Authorized !"),
            @ApiResponse(code=403,message="Forbidden !"),
            @ApiResponse(code=404,message="Not Found !")
    })


    @RequestMapping("/ActorList")
    public List<Actor> getActors() {
        return actorList;
    }
    //film4.setActeurPrincipal(actor1);

    @RequestMapping("/MovieList")
    public List<Movie> getMovies(){
        return movieList;
    }

    @ApiOperation(value = "Get specific Actor in the System ", response = Actor.class, tags = "getActor")
    @RequestMapping(value = "/ActorList/{nom}")
    public Actor getActorByName(@PathVariable(value = "nom") String nom) {
        return actorList.stream().filter(x -> x.getNom().equalsIgnoreCase(nom)).collect(Collectors.toList()).get(0);
    }

    @ApiOperation(value = "Get specific Movie in the System ", response = Movie.class, tags = "getMovie")
    @RequestMapping(value = "/MovieList/{titre}")
    public List<Movie> getMobvieByTitle(@PathVariable(value = "titre") String titre) {
        return movieList.stream().filter(x -> x.getTitre().equalsIgnoreCase(titre)).collect(Collectors.toList());
    }

    @ApiOperation(value = "Get specific Actors in a Movie in the System ", response = Actor.class, tags = "getActorInMovie")
    @RequestMapping(value = "/ActorList/{titre}")
    public List<Actor> getActorByMovie(@PathVariable(value = "titre") String titre) {
        return actorList.stream().filter(x -> x.getFilmographie().getTitre().equalsIgnoreCase(titre)).collect(Collectors.toList());
    }

    @ApiOperation(value = "Get specific Movies by Year in the System ", response = Movie.class, tags = "getMovieByYear")
    @RequestMapping(value = "/MovieList/{dateSortie}")
    public List<Movie> getMovieByYear(@PathVariable(value = "dateSortie") String dateSortie) {
        if(dateSortie==null){
            movieList = new ArrayList<Movie>();
            Movie student = new Movie("Not Found","N/A",new Actor(),"N/A");
            movieList.add(student);
            return movieList;
        }
        return movieList.stream().filter(x -> x.getDateSortie().equalsIgnoreCase(dateSortie)).collect(Collectors.toList());
    }

    //@GetMapping("/")
    //public String sayHello(@RequestParam(value = "name", defaultValue = "Guest") String name) {
    //    return "Hello " + name + "!!";
    //}
//
    //@GetMapping("/slowApi")
    //public String timeConsumingAPI(@RequestParam(value = "delay", defaultValue = "0") Integer delay) throws InterruptedException {
    //    if (delay == 0) {
    //        Random random = new Random();
    //        delay = random.nextInt(10);
    //    }
    //    TimeUnit.SECONDS.sleep(delay);
    //    return "Result";
    //}

}
