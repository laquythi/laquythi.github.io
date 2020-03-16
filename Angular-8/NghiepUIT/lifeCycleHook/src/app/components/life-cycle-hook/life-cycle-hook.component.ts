import { Component, OnInit ,OnChanges ,OnDestroy ,Input} from '@angular/core';

@Component({
  selector: 'app-life-cycle-hook',
  templateUrl: './life-cycle-hook.component.html',
  styleUrls: ['./life-cycle-hook.component.css']
})
export class LifeCycleHookComponent implements OnInit ,OnChanges ,OnDestroy{
  @Input('total') total : number;
  public products : any[] = [];
  constructor() {
    console.log('constructor : lifecycle hook component');
  }

  ngOnInit(){
    console.log('ngOnInit : lifecycle hook component');
    this.products = [
      {
        id : 1,
        name : 'canyon vanilla',
        status : true
      }
    ];
  }

  ngOnChanges(){
    console.log('ngOnChanges : lifecycle hook component');
  }

  ngOnDestroy(){
    console.log('ngOnDestroy : lifecycle hook component');
  }
}
