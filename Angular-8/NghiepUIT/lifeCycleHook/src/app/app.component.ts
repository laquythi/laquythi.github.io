import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public  title : string = 'lifeCycleHook';
  public isShowing : boolean = true;
  public a:number;
  public b:number;
  public total : number = 0;
  onToggle(){
    this.isShowing = !this.isShowing;
  }

  amount(){
    this.total = this.a + this.b;
    console.log(this.total);
  }
}
