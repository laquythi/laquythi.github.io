import { Injectable } from '@angular/core';
import {Movie} from '../models/movie.class';

@Injectable({
  providedIn: 'root'
})
export class MovieService {

  public movies : Movie[] = [
    new Movie(1,'The Social Network','https://vi.wikipedia.org/wiki/The_Social_Network','Lincoln Burrows'),
    new Movie(2,'Prison Break','https://vi.wikipedia.org/wiki/V%C6%B0%E1%BB%A3t_ng%E1%BB%A5c_(phim_truy%E1%BB%81n_h%C3%ACnh)','Poseidon')
  ];
  constructor() { }
  getAllMovie(){
    return this.movies;
  }
  addMovie(movie : Movie){
    movie.id = this.getLastID(this.movies);
    this.movies.push(movie);
  }
  getLastID(movies){
    let lastID = movies.length > 0 ? movies.sort((a,b) => {
      if(a.id > b.id) return -1;
      else if(a.id < b.id) return 1;
      else return 0;
    })[0].id + 1 : 1;
    return lastID;
  }
}
