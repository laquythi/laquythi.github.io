import { Injectable } from '@angular/core';
import {HEROES} from './mock-heroes';
import {Observable,of} from 'rxjs';
import {MessageService} from './message.service';
import {Hero} from './hero';

@Injectable({
  providedIn: 'root'
})
export class HeroService {
  // getHeroes() : Hero[] {
  //   return HEROES;
  // }
  constructor(private messageService : MessageService) { }
  getHeroes() : Observable<Hero[]>{
    this.messageService.add('HeroService : fetched heroes');
    return of(HEROES);
  }
}
