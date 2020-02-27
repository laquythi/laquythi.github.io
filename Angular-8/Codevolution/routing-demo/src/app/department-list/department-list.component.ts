import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-department-list',
  template: `
  <h3>
  Department List
  </h3>
  <ul class="items">
    <li *ngFor="let department of departments" (click)="onSelect(department)">
      <span class="badge">{{department.id}} </span><a>{{department.name}}</a>
    </li>
  </ul>
  `,
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit {
  departments = [
    {"id":1 ,"name":"angular"},
    {"id":2,"name":"java"},
    {"id":3,"name":"mongoDB"},
    {"id":4,"name":"python"},
    {"id":5,"name":"ruby"}
  ];
  constructor(private router : Router) { }

  ngOnInit(): void {
  }
  onSelect(department){
    this.router.navigate(['/departments',department.id]);
  }
}
