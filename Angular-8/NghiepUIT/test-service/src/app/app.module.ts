import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { MovieAddEditComponent } from './components/movie-add-edit/movie-add-edit.component';

//import service
import {MovieService} from './services/movie.service';
@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    MovieAddEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    MovieService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
