import { Component, OnInit } from '@angular/core';
import {products} from '../products';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {
  products = products;
  constructor() { }

  ngOnInit(): void {
  }
  share(){
    alert('your product has been shared');
  }
  onNotify(){
    window.alert('you will be notified when the product goes on sale');
  }
}
