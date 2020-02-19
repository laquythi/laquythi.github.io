import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  template : `
    <h1>I coding inside app components</h1>
    <app-hello></app-hello>
    <app-hi></app-hi>
  `,
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Setup-Instal03';
}
