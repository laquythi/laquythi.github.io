import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  // templateUrl: './app.component.html',
  template : `
  <app-top-bar></app-top-bar>
<app-product-list></app-product-list>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'My-First-App';
  name = '[Dell,Sony,Vaio]';
}
