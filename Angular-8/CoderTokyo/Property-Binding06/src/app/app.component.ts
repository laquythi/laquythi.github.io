import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  // templateUrl: './app.component.html',
  template : `
  <h2>content inside app component ts</h2>
  <app-hello></app-hello>
  <app-hi></app-hi>
  <h4>title of this page is ( {{title}} ) </h4>
  <h1>I come from {{country}},and this is picture about my hometown,first way to bind picture <br/> <img src={{imageSrc}}/> </h1>
  <h1>the second way to bind picture <br/> <img [src]='imageSrc' /> </h1>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   title = 'Property-Binding06';
   country = 'Thai Binh';
   imageSrc='https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRPW8_6bGVBu62KyQDSdmtwQo8XwnwxoDs3EZHNY8ActvntyoZm';
  fontSize=30;
}




