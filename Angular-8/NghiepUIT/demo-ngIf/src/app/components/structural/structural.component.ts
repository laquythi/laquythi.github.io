import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-structural',
  templateUrl: './structural.component.html',
  styleUrls: ['./structural.component.css']
})
export class StructuralComponent implements OnInit {
  public isShow : boolean = true;
  public username : string = 'thi la quy';
  public isChecked : boolean = true;
  public list : object = [
    {
      name : 'hanoi',
      describe : 'haloi dem phai gio'
    },
    {
      name : 'haiphong',
      describe : 'thanh pho cang hai phong'
    },
    {
      name : 'quangninh',
      describe : 'dat mo quang ninh'
    },
    {
      name : 'thaibinh',
      describe : 'que lua thai binh'
    }
  ];
  constructor() { }

  ngOnInit(): void {
  }
  onClick(){
  //   if(this.isShow){
  //     this.isShow = false;
  //   }else{
  //     this.isShow = true;
  //   }
  // }
  this.isShow = !this.isShow;
  }
  onChange(value){
    this.isChecked = value;
  }
}
