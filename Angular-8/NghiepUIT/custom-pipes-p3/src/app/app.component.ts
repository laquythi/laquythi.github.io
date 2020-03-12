import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'custom-pipes-p3';
  public sortBy : string = 'name';
  public sortValue : number = 1;
  public products : any[] = [
    {
      id : 1,
      name : 'Cohiba siglo VI',
      price : 100.8392
    },
    {
      id : 2,
      name : 'Canyon vanilla',
      price : 1
    },
    {
      id : 3,
      name : 'Winston',
      price : 1.5342
    },
    {
      id : 4,
      name : 'Gurkhar',
      price : 10.0382
    },
    {
      id : 5,
      name : 'Black Captan',
      price : 2.5
    }
  ];

  onSort(col){
    this.sortBy = col;
    this.sortValue = -this.sortValue;
  }
}
