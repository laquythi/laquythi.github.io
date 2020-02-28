import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { JwPaginationComponent } from 'jw-angular-pagination';

import { AppComponent } from './app.component';

@NgModule({
    imports: [
        BrowserModule
    ],
    declarations: [
        AppComponent,
        JwPaginationComponent
    ],
    bootstrap: [AppComponent]
})
export class AppModule { }
