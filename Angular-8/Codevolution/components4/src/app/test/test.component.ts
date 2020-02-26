import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template : `
  <div>{{name}}</div>
  <div>{{name | uppercase}}</div>
  `,
  styles: [``]
})
export class TestComponent implements OnInit {
  public name = 'thi la quy';

  constructor() {
   }
  ngOnInit(): void {
  }
}
