import { Component, OnInit } from '@angular/core';
import { products } from '../products';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products = products;
  constructor() { 
  }

  ngOnInit(): void {
  }
  share(){
    alert('You clicked a button share');
  }
  onNotify(){
    alert('you will be  notify when the product goes on sale');
  }
}
