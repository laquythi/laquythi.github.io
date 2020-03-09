import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'custom-pipes';
  name : string = 'la quy thi';
  describe : string = `cố gắng xong pipe trước trưa mai 10-03.
  chiều mai và sáng ngày kia 11-03 hoàn thành lifecycle và Service .`;
  public idFilter : string = '';
  public nameFilter : string = '';
  public statusFilter : string = '';
  public products : any = [
    {
      id : 1,
      name : 'Canyon vanilla',
      status : true
    },
    {
      id : 2,
      name : 'Winston',
      status : true
    },
    {
      id : 3,
      name : 'Vinataba',
      status : false
    },
    {
      id : 4,
      name : 'Marulla',
      status : true
    },
    {
      id : 5,
      name : 'thang long',
      status : false
    },
    {
      id : 6,
      name : 'Cohiba',
      status : true
    },
    {
      id : 12,
      name : 'Captain black',
      status : true
    }
  ];
}
